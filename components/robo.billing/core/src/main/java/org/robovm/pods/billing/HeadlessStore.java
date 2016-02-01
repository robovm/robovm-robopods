package org.robovm.pods.billing;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.robovm.pods.Util;

public class HeadlessStore implements Store {
    private List<BillingObserver> observers;
    private ProductCatalog catalog;
    private boolean available;

    private HeadlessStore(Store.Builder builder) {
        observers = builder.billingObservers;
        catalog = builder.productCatalog;
    }

    @Override
    public void setup(StoreSetupListener listener) {
        Util.requireNonNull(listener, "listener");
        available = true;
        listener.onSuccess();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public ProductCatalog getProductCatalog() {
        return catalog;
    }

    @Override
    public void requestProductData() {
        for (Product product : catalog.getProducts()) {
            product.setAvailable(true);
        }
        for (BillingObserver observer : observers) {
            observer.onProductsRequestSuccess(catalog.getProducts());
        }
    }

    @Override
    public void restoreTransactions() {
        for (BillingObserver observer : observers) {
            observer.onRestoreSuccess(new ArrayList<>());
        }
    }

    @Override
    public void purchaseProduct(Product product) {
        for (BillingObserver observer : observers) {
            observer.onPurchaseSuccess(new HeadlessTransaction(product));
        }
    }

    @Override
    public void dispose() {}

    @Override
    public StoreType getType() {
        return StoreType.HEADLESS;
    }

    private static class HeadlessTransaction implements Transaction {
        private Product product;
        private Date date;

        private HeadlessTransaction(Product product) {
            this.product = product;
            this.date = new Date();
        }

        @Override
        public Product getProduct() {
            return product;
        }

        @Override
        public String getTransactionIdentifier() {
            return "";
        }

        @Override
        public Date getTransactionDate() {
            return date;
        }

        @Override
        public String getReceipt() {
            return "";
        }

        @Override
        public String getSignature() {
            return null;
        }

        @Override
        public void finish() {}

        @Override
        public void verify(VerificationCallback callback) {
            callback.onResult(this, true, null);
        }
    }
}
