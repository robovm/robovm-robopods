package org.robovm.pods.billing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.*;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.vending.billing.IInAppBillingService;
import org.json.JSONException;
import org.json.JSONObject;
import org.robovm.pods.Log;
import org.robovm.pods.Util;
import org.robovm.pods.android.AndroidConfig;
import org.robovm.pods.billing.BillingError.ErrorType;
import org.robovm.pods.billing.googleplay.AsyncExecutor;
import org.robovm.pods.billing.googleplay.GoogleBillingConstants;
import org.robovm.pods.billing.googleplay.NewThreadSleepAsyncExecutor;
import org.robovm.pods.billing.googleplay.ResponseCode;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class GooglePlayStore extends AndroidStoreImpl {
    private static final String TAG = "GooglePlayStore";
    public static final int BILLING_API_VERSION = 3;
    public static final String PURCHASE_TYPE_IN_APP = "inapp";
    public static final long RETRY_PURCHASE_DELAY_IN_MS = 3000L;
    public static final String DEFAULT_DEVELOPER_PAYLOAD = "JustRandomStringTooHardToRememberTralala";

    private ServiceConnection billingServiceConnection;
    private IInAppBillingService billingService;
    private String installerPackageName;

    private AsyncExecutor asyncExecutor = new NewThreadSleepAsyncExecutor();

    private StoreSetupListener setupListener;

    private boolean requestingProducts;
    private boolean restoringTransactions;

    private PurchaseRequestCallback purchaseRequestCallback;

    GooglePlayStore(Builder builder) {
        super(builder);
        ResponseConverters.store = this;
    }

    @Override
    public void setActivity(Activity activity) {
        super.setActivity(activity);
        installerPackageName = activity.getPackageName();
    }

    @Override
    public void setup(StoreSetupListener listener) {
        Util.requireNonNull(activity, "activity");
        if (isAvailable()) {
            disconnect();
        }
        setupListener = listener;
        ResponseConverters.store = this;

        billingServiceConnection = new BillingServiceInitializingServiceConnection();
        AndroidConfig.registerActivityLifecycleListener(this::handleActivityResult);

        bindBillingService();
    }

    private void bindBillingService() {
        try {
            if (!activity.bindService(createBindBillingServiceIntent(), billingServiceConnection,
                    Context.BIND_AUTO_CREATE)) {
                setupListener.onError(new BillingError("bindService() returned false."));
            }
        } catch (BillingError e) {
            throw e;
        } catch (Throwable e) {
            setupListener.onError(new BillingError("requestConnect() failed.", e));
        }
    }

    private void unbindBillingService() {
        if (billingServiceConnection != null) {
            try {
                activity.unbindService(billingServiceConnection);
            } catch (Throwable e) {
                // Android reuses JVM instances sometimes. If your app uses statics it could lead to this catch block when restarting.
                Log.err(TAG, "Unexpected exception in unbindService()", e);
            }
        }
    }

    private Intent createBindBillingServiceIntent() {
        Intent serviceIntent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        serviceIntent.setPackage("com.android.vending");
        return serviceIntent;
    }

    @Override
    public boolean isAvailable() {
        return setupListener != null;
    }

    @Override
    public void requestProductData() {
        if (isRequestingProductData()) {
            BillingError error = new BillingError(ErrorType.ALREADY_REQUESTING_PRODUCTS,
                    "Already requesting product data!");

            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestError(error);
            }
            return;
        }
        requestingProducts = true;

        List<Product> products = productCatalog.getProducts();
        List<String> productIds = new ArrayList<>();
        List<String> subscriptionIds = new ArrayList<>();

        for (Product product : products) {
            String id = product.getIdentifier(getType());
            if (id != null) {
                if (product.getType() == ProductType.SUBSCRIPTION) {
                    subscriptionIds.add(id);
                } else {
                    productIds.add(id);
                }
            } else {
                Log.err("Product identifier not found for product: " + product);
            }
        }

        asyncExecutor.executeAsync(() -> internalRequestProductData(productIds, subscriptionIds, true));
    }

    @Override
    public boolean isRequestingProductData() {
        return requestingProducts;
    }

    private void internalRequestProductData(List<String> productIds, List<String> subscriptionIds,
            boolean retryOnError) {
        // FIXME subscription support
        try {
            updateProductCatalog(productIds);

            requestingProducts = false;
            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestSuccess(productCatalog.getProducts());
            }
        } catch (Throwable e) {
            if (retryOnError) {
                Runnable runnable = () -> internalRequestProductData(productIds, subscriptionIds, false);
                asyncExecutor.executeAsync(runnable, RETRY_PURCHASE_DELAY_IN_MS);
            } else {
                requestingProducts = false;
                BillingError error = new BillingError("requestProductData failed", e);
                for (BillingObserver observer : billingObservers) {
                    observer.onProductsRequestError(error);
                }
            }
        }
    }

    private void updateProductCatalog(List<String> productIds) {
        Bundle skusRequest = ResponseConverters.convertProductIdsToItemIdList(productIds);
        Bundle skuDetailsResponse = getSkuDetails(skusRequest);
        ResponseConverters.updateProductCatalogFromSkuDetailsResponse(skuDetailsResponse);
    }

    private Bundle getSkuDetails(Bundle skusRequest) {
        try {
            return billingService().getSkuDetails(BILLING_API_VERSION, installerPackageName,
                    PURCHASE_TYPE_IN_APP, skusRequest);
        } catch (Throwable e) {
            throw new BillingError("requestProductData failed for bundle:" + skusRequest, e);
        }
    }

    @Override
    public void restoreTransactions() {
        if (isRestoringTransactions()) {
            BillingError error = new BillingError(ErrorType.ALREADY_RESTORING, "Already restoring transactions!");
            for (BillingObserver observer : billingObservers) {
                observer.onRestoreError(error);
            }
            return;
        }
        restoringTransactions = true;

        asyncExecutor.executeAsync(() -> {
            try {
                Bundle purchases = billingService()
                        .getPurchases(BILLING_API_VERSION, installerPackageName, PURCHASE_TYPE_IN_APP, null);

                List<Transaction> transactions = ResponseConverters.convertPurchasesResponseToTransactions(purchases);

                if (autoFinishTransactions) {
                    for (Transaction transaction : transactions) {
                        if (transaction.getProduct().getType() == ProductType.CONSUMABLE) {
                            transaction.finish();
                        }
                    }
                }

                restoringTransactions = false;
                for (BillingObserver observer : billingObservers) {
                    observer.onRestoreSuccess(transactions);
                }
            } catch (Throwable e) {
                restoringTransactions = false;
                for (BillingObserver observer : billingObservers) {
                    observer.onRestoreError(new BillingError("Unexpected exception in getPurchases()", e));
                }
            }
        });
    }

    @Override
    public boolean isRestoringTransactions() {
        return restoringTransactions;
    }

    @Override
    public void purchaseProduct(Product product) {
        if (!isAvailable()) {
            BillingError error = new BillingError(ErrorType.UNAVAILABLE);
            for (BillingObserver observer : billingObservers) {
                observer.onPurchaseError(new AndroidTransaction(product, verificator, GooglePlayStore.this), error);
            }
            return;
        }

        purchaseRequestCallback = new PurchaseRequestCallback() {
            @Override
            public void purchaseSuccess(Transaction transaction) {
                if (autoVerifyTransactions && !TestProducts.isTestProduct(product)) {
                    transaction.verify((t, isValid, error) -> {
                        if (error == null && isValid) {
                            if (autoFinishTransactions
                                    && transaction.getProduct().getType() == ProductType.CONSUMABLE) {
                                transaction.finish();
                            }
                            for (BillingObserver observer : billingObservers) {
                                observer.onPurchaseSuccess(t);
                            }
                        } else {
                            BillingError e = error;
                            if (e == null) {
                                e = new BillingError(ErrorType.TRANSACTION_VERIFICATION_FAILED,
                                        "Transaction could not be verified!");
                            }

                            for (BillingObserver observer : billingObservers) {
                                observer.onPurchaseError(transaction, e);
                            }
                        }
                    });
                } else {
                    if (autoFinishTransactions && product.getType() == ProductType.CONSUMABLE) {
                        transaction.finish();
                    }
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseSuccess(transaction);
                    }
                }
                purchaseRequestCallback = null;
            }

            @Override
            public void purchaseError(BillingError error) {
                for (BillingObserver observer : billingObservers) {
                    observer.onPurchaseError(new AndroidTransaction(product, verificator, GooglePlayStore.this), error);
                }
                purchaseRequestCallback = null;
            }

            @Override
            public void purchaseCancelled() {
                for (BillingObserver observer : billingObservers) {
                    observer.onPurchaseCancel();
                }
                purchaseRequestCallback = null;
            }
        };

        asyncExecutor.executeAsync(() -> {
            if (product.getType() == ProductType.SUBSCRIPTION) {
                // FIXME subscription support
            } else {
                internalStartPurchaseRequest(product, purchaseRequestCallback, true);
            }
        });
    }

    private void internalStartPurchaseRequest(Product product, PurchaseRequestCallback listener,
            boolean retryOnError) {
        PendingIntent pendingIntent;
        try {
            pendingIntent = getPendingBuyIntent(product);
        } catch (Throwable e) {
            if (retryOnError) {
                reconnectToHandleDeadObjectExceptions();
                schedulePurchaseRetry(product, listener);
                return;
            }

            listener.purchaseError(
                    new BillingError("startPurchaseRequest failed at getBuyIntentResponseData() for product: " + product
                            .getIdentifier(getType()), e));
            return;
        }
        startPurchaseIntentSenderForResult(product, pendingIntent, listener);
    }

    private void startPurchaseIntentSenderForResult(Product product, PendingIntent pendingIntent,
            PurchaseRequestCallback listener) {
        try {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), requestCode, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            listener.purchaseError(new BillingError(
                    "startIntentSenderForResult failed for product: " + product.getIdentifier(getType()), e));
        }
    }

    private void schedulePurchaseRetry(Product product, PurchaseRequestCallback listener) {
        Runnable runnable = () -> internalStartPurchaseRequest(product, listener, false);
        asyncExecutor.executeAsync(runnable, RETRY_PURCHASE_DELAY_IN_MS);
    }

    private void reconnectToHandleDeadObjectExceptions() {
        unbindBillingService();
        bindBillingService();
    }

    private PendingIntent getPendingBuyIntent(Product product) throws RemoteException {
        Bundle intent = getBuyIntentResponseData(product);
        return fetchPendingIntentFromGetBuyIntentResponse(product, intent);
    }

    private Bundle getBuyIntentResponseData(Product product) throws RemoteException {
        String productId = product.getIdentifier(getType());
        return billingService()
                .getBuyIntent(BILLING_API_VERSION, installerPackageName, productId, PURCHASE_TYPE_IN_APP,
                        DEFAULT_DEVELOPER_PAYLOAD);
    }

    private PendingIntent fetchPendingIntentFromGetBuyIntentResponse(Product product, Bundle responseData) {
        ResponseCode responseCode = ResponseCode.findByCode(responseData.getInt(GoogleBillingConstants.RESPONSE_CODE));

        if (responseCode == ResponseCode.BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED) {
            if (product.getType() == ProductType.CONSUMABLE) {
                // Consumables need to be consumed before they can be purchased again.

                try {
                    // Try to consume all consumable purchases.
                    Bundle purchases = billingService()
                            .getPurchases(BILLING_API_VERSION, installerPackageName, PURCHASE_TYPE_IN_APP, null);

                    List<Transaction> transactions = ResponseConverters
                            .convertPurchasesResponseToTransactions(purchases);

                    String productId = product.getIdentifier(getType());

                    for (Transaction transaction : transactions) {
                        Product p = transaction.getProduct();
                        if (p.getType() == ProductType.CONSUMABLE &&
                                productId.equalsIgnoreCase(p.getIdentifier(getType()))) {
                            consumeTransaction((AndroidTransaction) transaction, true);
                        }
                    }

                    responseData = getBuyIntentResponseData(product);
                    responseCode = ResponseCode.findByCode(responseData.getInt(GoogleBillingConstants.RESPONSE_CODE));
                } catch (Throwable e) {
                    throw new BillingError(ErrorType.PRODUCT_ALREADY_OWNED, e);
                }
            } else {
                throw new BillingError(ErrorType.PRODUCT_ALREADY_OWNED, "Non-consumable cannot be purchased twice!");
            }
        }

        if (responseCode != ResponseCode.BILLING_RESPONSE_RESULT_OK) {
            throw new BillingError(
                    "Unexpected getBuyIntent() responseCode: " + responseCode + " with response data: " + responseData);
        }

        PendingIntent pendingIntent = responseData.getParcelable(GoogleBillingConstants.BUY_INTENT);

        if (pendingIntent == null) {
            throw new BillingError(
                    "Missing value for key: " + GoogleBillingConstants.BUY_INTENT + "in getBuyIntent() response: "
                            + responseData);
        }
        return pendingIntent;
    }

    @Override
    public void dispose() {
        disconnect();
    }

    private void disconnect() {
        billingService = null;
        unbindBillingService();
        setupListener = null;
    }

    @Override
    public void finishTransaction(AndroidTransaction transaction) {
        asyncExecutor.executeAsync(() -> consumeTransaction(transaction, true));
    }

    private void consumeTransaction(AndroidTransaction transaction, boolean retryOnError) {
        try {
            String token = transaction.getToken();
            if (token == null || token.isEmpty()) {
                throw new BillingError("Can't consume " + transaction.getIdentifier() + ". Token is empty!");
            }

            if (!isAvailable()) {
                throw new BillingError(ErrorType.UNAVAILABLE);
            }

            int response = billingService()
                    .consumePurchase(BILLING_API_VERSION, installerPackageName, token);
            ResponseCode responseCode = ResponseCode.findByCode(response);

            if (responseCode != ResponseCode.BILLING_RESPONSE_RESULT_OK) {
                if (retryOnError) {
                    reconnectToHandleDeadObjectExceptions();
                    Runnable runnable = () -> consumeTransaction(transaction, false);
                    asyncExecutor.executeAsync(runnable, RETRY_PURCHASE_DELAY_IN_MS);
                } else {
                    throw new BillingError(
                            "Unexpected consumeTransaction() responseCode: " + responseCode);
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private void handleActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.requestCode == requestCode && purchaseRequestCallback != null) {
            if (resultCode == Activity.RESULT_OK) {
                try {
                    Transaction transaction = ResponseConverters.convertPurchaseResponseToTransaction(data);
                    purchaseRequestCallback.purchaseSuccess(transaction);
                } catch (Throwable e) {
                    purchaseRequestCallback
                            .purchaseError(new BillingError("Error converting purchase success response: " + data, e));
                }
            } else if (resultCode == Activity.RESULT_CANCELED) {
                purchaseRequestCallback.purchaseCancelled();
            } else {
                purchaseRequestCallback
                        .purchaseError(new BillingError("Unexpected resultCode:" + resultCode + "with data:" + data));
            }
        }
    }

    @Override
    public StoreType getType() {
        return StoreType.ANDROID_GOOGLE_PLAY;
    }

    boolean isConnected() {
        return billingService != null;
    }

    private IInAppBillingService billingService() {
        if (!isConnected()) {
            throw new BillingError("Not connected to Google In-app Billing service");
        }
        return billingService;
    }

    private class BillingServiceInitializingServiceConnection implements ServiceConnection {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.log(TAG, "start onServiceConnected(), isConnected() is: " + isConnected());
            if (isConnected()) {
                return;
            }
            billingService = IInAppBillingService.Stub.asInterface(service);

            if (setupListener != null) {
                setupListener.onSuccess();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            unbindBillingService();
            billingService = null;

            if (setupListener != null) {
                setupListener.onError(new BillingError("onServiceDisconnected() received."));
            }
        }
    }

    interface PurchaseRequestCallback {
        void purchaseSuccess(Transaction transaction);

        void purchaseError(BillingError error);

        void purchaseCancelled();
    }

    public static class ResponseConverters {
        private static GooglePlayStore store;

        public static void updateProductCatalogFromSkuDetailsResponse(Bundle skuDetailsResponse) {
            assertResponseOk(skuDetailsResponse);

            ArrayList<String> skuDetailsList = skuDetailsResponse
                    .getStringArrayList(GoogleBillingConstants.DETAILS_LIST);
            assertStringListNotEmpty(skuDetailsList, "skuDetailsList");

            try {
                for (String thisResponse : skuDetailsList) {
                    JSONObject details = new JSONObject(thisResponse);
                    String id = details.getString(GoogleBillingConstants.PRODUCT_ID);

                    Product product = store.productCatalog.getProduct(StoreType.ANDROID_GOOGLE_PLAY, id);
                    if (product == null) {
                        product = store.productCatalog.getProduct(id);
                    }
                    if (product != null) {
                        product.setAvailable(true);

                        product.setTitle(details.optString(GoogleBillingConstants.SKU_TITLE));
                        product.setDescription(details.optString(GoogleBillingConstants.SKU_DESCRIPTION));

                        String formattedPrice = details.optString(GoogleBillingConstants.SKU_PRICE);
                        double price = details.optLong(GoogleBillingConstants.PRICE_AMOUNT_MICROS, 0) / 1000000.0;
                        String currency = details.optString(GoogleBillingConstants.PRICE_CURRENCY_CODE);

                        if (price == 0) {
                            try {
                                Number p = NumberFormat.getCurrencyInstance().parse(formattedPrice);
                                price = p.floatValue();
                            } catch (ParseException ignored) {
                                price = Float.valueOf(formattedPrice.replaceAll("[^\\d.]", "")) / 100;
                            }
                        }
                        if (currency == null || currency.length() == 0) {
                            try {
                                currency = Currency.getInstance(Locale.getDefault()).getCurrencyCode();
                            } catch (Exception ignored) {}
                        }

                        product.setPrice(price, currency);
                        product.setFormattedPrice(formattedPrice);
                    }
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException("Failed to parse : " + skuDetailsResponse, e);
            }
        }

        public static Bundle convertProductIdsToItemIdList(List<String> productIds) {
            ArrayList<String> skuList = new ArrayList<>();

            skuList.addAll(productIds);

            Bundle querySkus = new Bundle();
            querySkus.putStringArrayList(GoogleBillingConstants.ITEM_ID_LIST, skuList);
            return querySkus;
        }

        public static List<Transaction> convertPurchasesResponseToTransactions(Bundle purchasesResponseBundle) {
            assertResponseOk(purchasesResponseBundle);

            ArrayList<String> purchaseDataList = purchasesResponseBundle
                    .getStringArrayList(GoogleBillingConstants.INAPP_PURCHASE_DATA_LIST);
            if (purchaseDataList == null) {
                throw new IllegalArgumentException("null string data: purchaseDataList");
            }
            ArrayList<String> signatureList = purchasesResponseBundle
                    .getStringArrayList(GoogleBillingConstants.INAPP_DATA_SIGNATURE_LIST);
            if (signatureList == null) {
                throw new IllegalArgumentException("null string data: signatureList");
            }

            return convertPurchasesToTransactions(purchaseDataList, signatureList);
        }

        private static List<Transaction> convertPurchasesToTransactions(ArrayList<String> purchaseDataList,
                ArrayList<String> signatureList) {
            List<Transaction> transactions = new ArrayList<>();

            for (int i = 0; i < purchaseDataList.size(); i++) {
                String purchaseData = purchaseDataList.get(i);
                String signature = signatureList.get(i);
                try {
                    transactions.add(convertJSONPurchaseToTransaction(purchaseData, signature));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("JSON operation failed for json: " + purchaseData, e);
                }
            }

            return transactions;
        }

        // See http://developer.android.com/google/play/billing/billing_reference.html#purchase-data-table
        public static Transaction convertJSONPurchaseToTransaction(String jsonPurchase, String signature)
                throws JSONException {
            JSONObject purchase = new JSONObject(jsonPurchase);

            String id = purchase.getString(GoogleBillingConstants.PRODUCT_ID);
            Product product = store.productCatalog.getProduct(StoreType.ANDROID_GOOGLE_PLAY, id);
            if (product == null) {
                product = store.productCatalog.getProduct(id);
            }
            AndroidTransaction transaction = new AndroidTransaction(product, store.verificator, store);
            transaction.setIdentifier(purchase.optString(GoogleBillingConstants.ORDER_ID));
            transaction.setDate(new Date(purchase.optLong(GoogleBillingConstants.PURCHASE_TIME)));
            transaction.setReceipt(jsonPurchase);
            transaction.setSignature(signature);
            transaction.setToken(purchase.optString("token", purchase.optString("purchaseToken")));

            return transaction;
        }

        public static Transaction convertPurchaseResponseToTransaction(Intent responseData) {
            String purchaseData = responseData.getStringExtra(GoogleBillingConstants.INAPP_PURCHASE_DATA);
            assertStringNotEmpty(purchaseData, "purchaseData");
            String dataSignature = responseData.getStringExtra(GoogleBillingConstants.INAPP_DATA_SIGNATURE);
            assertStringNotEmpty(dataSignature, "dataSignature");
            try {
                return convertJSONPurchaseToTransaction(purchaseData, dataSignature);
            } catch (JSONException e) {
                throw new BillingError("JSON Exception while parsing: " + purchaseData, e);
            }
        }

        private static void assertStringListNotEmpty(ArrayList<String> stringList, String errorName) {
            if (stringList == null || stringList.isEmpty()) {
                throw new IllegalArgumentException("Empty string data: " + errorName);
            }
        }

        private static void assertStringNotEmpty(String string, String errorName) {
            if (string == null || string.isEmpty()) {
                throw new IllegalArgumentException("Empty string data: " + errorName);
            }
        }

        private static void assertResponseOk(Bundle skuDetailsResponse) {
            int response = skuDetailsResponse.getInt(GoogleBillingConstants.RESPONSE_CODE, -1);

            ResponseCode responseCode = ResponseCode.findByCode(response);

            if (responseCode == null) {
                throw new IllegalArgumentException("Bundle is missing key: " + GoogleBillingConstants.RESPONSE_CODE);
            }

            if (responseCode != ResponseCode.BILLING_RESPONSE_RESULT_OK) {
                throw new IllegalArgumentException(
                        "Unexpected response code: " + responseCode + ", response: " + skuDetailsResponse);
            }
        }
    }
}
