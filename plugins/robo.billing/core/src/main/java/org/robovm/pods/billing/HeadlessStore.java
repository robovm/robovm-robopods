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

import org.robovm.pods.Util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public boolean isRequestingProductData() {
        return false;
    }

    @Override
    public void restoreTransactions() {
        for (BillingObserver observer : observers) {
            observer.onRestoreSuccess(new ArrayList<>());
        }
    }

    @Override
    public boolean isRestoringTransactions() {
        return false;
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

    private static class HeadlessTransaction extends Transaction {
        private HeadlessTransaction(Product product) {
            super(product, null);
            this.identifier = "";
            this.date = new Date();
            this.receipt = "";
        }

        @Override
        public void finish() {}

        @Override
        public void verify(VerificationCallback callback) {
            callback.onResult(this, true, null);
        }
    }
}
