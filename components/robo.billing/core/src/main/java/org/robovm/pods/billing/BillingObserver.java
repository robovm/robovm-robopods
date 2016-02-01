package org.robovm.pods.billing;

import java.util.List;

public interface BillingObserver {
    void onPurchaseSuccess(Transaction transaction);

    void onPurchaseCancel();

    void onPurchaseError(Transaction transaction, BillingError error);

    void onProductsRequestSuccess(List<Product> products);

    void onProductsRequestCancel();

    void onProductsRequestError(BillingError error);

    void onRestoreSuccess(List<Transaction> restoredTransactions);

    void onRestoreCancel();

    void onRestoreError(BillingError error);
}
