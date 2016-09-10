package org.robovm.pods.billing;

import android.app.Activity;
import org.robovm.pods.android.ActivityConfigurable;

import java.util.List;

abstract class AndroidStoreImpl implements Store, ActivityConfigurable {
    Activity activity;
    int requestCode = AndroidStore.DEFAULT_REQUEST_CODE;

    final ProductCatalog productCatalog;
    final List<BillingObserver> billingObservers;
    final boolean autoFinishTransactions;
    final TransactionVerificator verificator;
    final boolean autoVerifyTransactions;

    AndroidStoreImpl(Store.Builder builder) {
        this.productCatalog = builder.productCatalog;
        this.billingObservers = builder.billingObservers;
        this.autoFinishTransactions = builder.autoFinishTransactions;
        this.verificator = builder.verificator;
        this.autoVerifyTransactions = builder.autoVerifyTransactions;
    }

    public abstract void finishTransaction(AndroidTransaction transaction);

    @Override
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }
}
