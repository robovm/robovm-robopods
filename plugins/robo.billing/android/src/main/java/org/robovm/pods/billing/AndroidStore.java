/*
 * Copyright (C) 2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.billing;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;
import org.onepf.oms.OpenIabHelper;
import org.onepf.oms.OpenIabHelper.Options;
import org.onepf.oms.appstore.googleUtils.IabHelper;
import org.onepf.oms.appstore.googleUtils.IabHelper.OnIabPurchaseFinishedListener;
import org.onepf.oms.appstore.googleUtils.Inventory;
import org.onepf.oms.appstore.googleUtils.Purchase;
import org.onepf.oms.appstore.googleUtils.SkuDetails;
import org.robovm.pods.ActivityLifecycleListener;
import org.robovm.pods.Log;
import org.robovm.pods.Platform;
import org.robovm.pods.Util;
import org.robovm.pods.android.ActivityConfigurable;
import org.robovm.pods.android.AndroidConfig;
import org.robovm.pods.billing.BillingError.ErrorType;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class AndroidStore implements Store, ActivityConfigurable {
    private static final int REQUEST_CODE = 15864252; // FIXME
    private final ProductCatalog productCatalog;

    private final List<BillingObserver> billingObservers;
    private final boolean autoFinishTransactions;
    private final TransactionVerificator verificator;
    private final boolean autoVerifyTransactions;

    private StoreType storeType;

    private final OpenIabHelper.Options openIabOptions;
    private OpenIabHelper iabHelper;
    private Inventory inventory;

    private Activity activity;
    private int requestCode = REQUEST_CODE;

    private volatile boolean available = true;

    private volatile boolean requestingProducts;
    private volatile boolean restoringTransactions;

    private AndroidStore(Store.Builder builder) {
        this.productCatalog = builder.productCatalog;
        this.billingObservers = builder.billingObservers;
        this.autoFinishTransactions = builder.autoFinishTransactions;
        this.verificator = builder.verificator;
        this.autoVerifyTransactions = builder.autoVerifyTransactions;

        Map<String, String> storeKeys = new HashMap<>();
        Map<StoreType, String> keys = builder.storeKeys;
        for (Map.Entry<StoreType, String> entry : keys.entrySet()) {
            String storeName = getStoreNameFromType(entry.getKey());
            if (storeName != null) {
                storeKeys.put(storeName, entry.getValue());
            }
        }

        final OpenIabHelper.Options.Builder openIABBuilder = new OpenIabHelper.Options.Builder();
        openIABBuilder.setVerifyMode(Options.VERIFY_SKIP);
        openIABBuilder.setStoreSearchStrategy(OpenIabHelper.Options.SEARCH_STRATEGY_INSTALLER_THEN_BEST_FIT);
        openIABBuilder.addStoreKeys(storeKeys);
        openIabOptions = openIABBuilder.build();

        setActivity(AndroidConfig.getActivity(this));
    }

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setRequestCode(int requestCode) { // TODO should also be configurable via AndroidConfig ???
        this.requestCode = requestCode;
    }

    @Override
    public void setup(StoreSetupListener listener) {
        Util.requireNonNull(activity, "activity");
        Util.requireNonNull(listener, "listener");

        AndroidConfig.registerActivityLifecycleListener(new ActivityLifecycleListener() {
            @Override
            public void onActivityResult(int requestCode, int resultCode, Intent data) {
                iabHelper.handleActivityResult(requestCode, resultCode, data);
            }
        });

        Platform.getPlatform().runOnUIThread(() -> {
            iabHelper = new OpenIabHelper(activity, openIabOptions);
            iabHelper.startSetup((result) -> {
                if (!result.isSuccess()) {
                    available = false;
                    listener.onError(new BillingError(result.getMessage()));
                } else {
                    storeType = getStoreTypeFromName(iabHelper.getConnectedAppstoreName());
                    available = true;
                    listener.onSuccess();
                }
            });
        });
    }

    @Override
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void requestProductData() {
        if (iabHelper == null) {
            BillingError error = new BillingError(ErrorType.UNAVAILABLE,
                    "IABHelper not available!");

            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestError(error);
            }
            return;
        }
        if (requestingProducts) {
            BillingError error = new BillingError(ErrorType.ALREADY_REQUESTING_PRODUCTS,
                    "Already requesting product data!");

            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestError(error);
            }
            return;
        }
        requestingProducts = true;

        List<Product> products = productCatalog.getProducts();

        List<String> iaps = new ArrayList<>();
        List<String> subs = new ArrayList<>();

        for (Product product : products) {
            String id = product.getIdentifier(getType());
            if (id != null) {
                if (product.getType() == ProductType.SUBSCRIPTION) {
                    subs.add(id);
                } else {
                    iaps.add(id);
                }
            } else {
                Log.err("Product identifier not found for product: " + product);
            }
        }

        iabHelper.queryInventoryAsync(true, iaps, subs,
                (result, inventory) -> {
                    if (!result.isSuccess()) {
                        BillingError billingError = new BillingError(ErrorType.UNKNOWN,
                                "Error requesting product data: "
                                        + (result.getMessage() != null ? result.getMessage() : "unknown"));

                        for (BillingObserver observer : billingObservers) {
                            observer.onProductsRequestError(billingError);
                        }
                    } else {
                        if (inventory != null) {
                            this.inventory = inventory;
                            updateProductCatalog(inventory);
                        }

                        requestingProducts = false;
                        for (BillingObserver observer : billingObservers) {
                            observer.onProductsRequestSuccess(productCatalog.getProducts());
                        }
                    }
                });
    }

    private void updateProductCatalog(Inventory inventory) {
        Map<String, SkuDetails> skuMap = inventory.getSkuMap();
        for (Map.Entry<String, SkuDetails> entry : skuMap.entrySet()) {
            String id = entry.getKey();

            Product product = productCatalog.getProduct(getType(), id);
            if (product == null) {
                product = productCatalog.getProduct(id);
            }
            if (product != null) {
                product.setAvailable(true);

                SkuDetails details = entry.getValue();
                product.setTitle(details.getTitle());
                product.setDescription(details.getDescription());

                String formattedPrice = details.getPrice();
                double price = 0;
                String currency = null;

                String json = details.getJson();
                if (json != null) {
                    try {
                        JSONObject o = new JSONObject(json);
                        price = o.optLong("price_amount_micros", 0) / 1000000.0;
                        currency = o.optString("price_currency_code");
                    } catch (JSONException ignored) {}
                }
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
    }

    @Override
    public void restoreTransactions() {
        if (iabHelper == null) {
            BillingError error = new BillingError(ErrorType.UNAVAILABLE,
                    "IABHelper not available!");

            for (BillingObserver observer : billingObservers) {
                observer.onRestoreError(error);
            }
            return;
        }
        if (inventory == null) {
            BillingError error = new BillingError(ErrorType.PRODUCTS_NOT_REQUESTED,
                    "Product data not requested! Need to call requestProductData() first.");
            for (BillingObserver observer : billingObservers) {
                observer.onRestoreError(error);
            }
            return;
        }
        if (restoringTransactions) {
            BillingError error = new BillingError(ErrorType.ALREADY_RESTORING, "Already restoring transactions!");
            for (BillingObserver observer : billingObservers) {
                observer.onRestoreError(error);
            }
            return;
        }
        restoringTransactions = true;

        List<Purchase> purchases = inventory.getAllPurchases();
        List<Transaction> transactions = new ArrayList<>(purchases.size());
        for (Purchase purchase : purchases) {
            Transaction transaction = transactionFromPurchase(purchase);
            transactions.add(transaction);

            if (autoFinishTransactions && transaction.getProduct().getType() == ProductType.CONSUMABLE) {
                transaction.finish();
            }
        }

        restoringTransactions = false;
        for (BillingObserver observer : billingObservers) {
            observer.onRestoreSuccess(transactions);
        }
    }

    private Transaction transactionFromPurchase(Purchase purchase) {
        if (purchase == null) {
            return null;
        }
        String id = purchase.getSku();
        Product product = productCatalog.getProduct(getType(), id);
        if (product == null) {
            product = productCatalog.getProduct(id);
        }
        return new AndroidTransaction(iabHelper, purchase, product, verificator);
    }

    @Override
    public void purchaseProduct(Product product) {
        Util.requireNonNull(product, "product");
        if (iabHelper == null) {
            BillingError error = new BillingError(ErrorType.UNAVAILABLE,
                    "IABHelper not available!");

            for (BillingObserver observer : billingObservers) {
                observer.onPurchaseError(null, error);
            }
            return;
        }

        OnIabPurchaseFinishedListener listener = (result, purchase) -> {
            Transaction transaction = transactionFromPurchase(purchase);

            if (result.isFailure()) {
                if (result.getResponse() == IabHelper.IABHELPER_USER_CANCELLED) {
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseCancel();
                    }
                } else {
                    BillingError billingError = new BillingError(ErrorType.UNKNOWN, "Error purchasing product: "
                            + (result.getMessage() != null ? result.getMessage() : "unknown"));
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseError(transaction, billingError);
                    }
                }
            } else {
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
            }
        };

        String id = product.getIdentifier(getType());
        if (product.getType() == ProductType.SUBSCRIPTION) {
            iabHelper.launchSubscriptionPurchaseFlow(activity, id, requestCode, listener, null);
        } else {
            iabHelper.launchPurchaseFlow(activity, id, requestCode, listener, null);
        }
    }

    @Override
    public void dispose() {
        if (iabHelper != null) {
            iabHelper.dispose();
        }
    }

    @Override
    public StoreType getType() {
        return storeType;
    }

    private StoreType getStoreTypeFromName(String name) {
        switch (name) {
        case OpenIabHelper.NAME_GOOGLE:
            return StoreType.ANDROID_GOOGLE_PLAY;
        case OpenIabHelper.NAME_AMAZON:
            return StoreType.ANDROID_AMAZON;
        case OpenIabHelper.NAME_SAMSUNG:
            return StoreType.ANDROID_SAMSUNG;
        case OpenIabHelper.NAME_NOKIA:
            return StoreType.ANDROID_NOKIA;
        case OpenIabHelper.NAME_SLIDEME:
            return StoreType.ANDROID_SLIDEME;
        case OpenIabHelper.NAME_APTOIDE:
            return StoreType.ANDROID_APTOIDE;
        case OpenIabHelper.NAME_APPLAND:
            return StoreType.ANDROID_APPLAND;
        case OpenIabHelper.NAME_YANDEX:
            return StoreType.ANDROID_YANDEX;
        default:
            return null;
        }
    }

    private String getStoreNameFromType(StoreType type) {
        switch (type) {
        case ANDROID_GOOGLE_PLAY:
            return OpenIabHelper.NAME_GOOGLE;
        case ANDROID_AMAZON:
            return OpenIabHelper.NAME_AMAZON;
        case ANDROID_SAMSUNG:
            return OpenIabHelper.NAME_SAMSUNG;
        case ANDROID_NOKIA:
            return OpenIabHelper.NAME_NOKIA;
        case ANDROID_SLIDEME:
            return OpenIabHelper.NAME_SLIDEME;
        case ANDROID_APTOIDE:
            return OpenIabHelper.NAME_APTOIDE;
        case ANDROID_APPLAND:
            return OpenIabHelper.NAME_APPLAND;
        case ANDROID_YANDEX:
            return OpenIabHelper.NAME_YANDEX;
        default:
            return null;
        }
    }
}
