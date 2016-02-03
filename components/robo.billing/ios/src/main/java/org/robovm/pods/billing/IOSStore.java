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

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.storekit.*;
import org.robovm.pods.Log;
import org.robovm.pods.Util;
import org.robovm.pods.billing.BillingError.ErrorType;

import java.util.*;

class IOSStore implements Store {
    private final ProductCatalog productCatalog;
    private final List<BillingObserver> billingObservers;
    private final boolean autoFinishTransactions;

    private final TransactionVerificator transactionVerificator;
    private final boolean autoVerifyTransactions;

    private final CustomTransactionObserver paymentObserver;

    private SKProductsRequest productsRequest;
    private Map<String, SKProduct> requestedProducts;

    private volatile boolean restoringTransactions;
    private List<Transaction> restoredTransactions = new ArrayList<>();

    private IOSStore(Store.Builder builder) {
        this.productCatalog = builder.productCatalog;
        this.billingObservers = builder.billingObservers;
        this.autoFinishTransactions = builder.autoFinishTransactions;
        this.transactionVerificator = builder.verificator;
        this.autoVerifyTransactions = builder.autoVerifyTransactions;

        paymentObserver = new CustomTransactionObserver(new TransactionObserverListener() {
            @Override
            public void transactionRestored(SKPaymentTransaction skTransaction) {
                Transaction transaction = transactionFromSKPaymentTransaction(skTransaction);

                if (autoFinishTransactions) {
                    transaction.finish();
                }
                restoredTransactions.add(transaction);
            }

            @Override
            public void restoreCompleted(SKPaymentQueue queue) {
                List<Transaction> transactions = new ArrayList<>(restoredTransactions);
                for (BillingObserver observer : billingObservers) {
                    observer.onRestoreSuccess(transactions);
                }
                restoredTransactions.clear();
                restoringTransactions = false;
            }

            @Override
            public void restoreFailed(SKPaymentQueue queue, NSError error) {
                restoredTransactions.clear();

                if (error != null && error.getCode() == 2) {
                    for (BillingObserver observer : billingObservers) {
                        observer.onRestoreCancel();
                    }
                } else {
                    BillingError billingError = new BillingError(ErrorType.UNKNOWN,
                            "Error restoring transactions: " + (error != null ? error.toString() : "unknown"));
                    for (BillingObserver observer : billingObservers) {
                        observer.onRestoreError(billingError);
                    }
                }
                restoringTransactions = false;
            }

            @Override
            public void transactionCompleted(SKPaymentTransaction skTransaction) {
                Transaction transaction = transactionFromSKPaymentTransaction(skTransaction);

                if (autoVerifyTransactions) {
                    transaction.verify((t, isValid, error) -> {
                        if (autoFinishTransactions) {
                            transaction.finish();
                        }

                        if (error == null && isValid) {
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
                    if (autoFinishTransactions) {
                        transaction.finish();
                    }
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseSuccess(transaction);
                    }
                }
            }

            @Override
            public void transactionFailed(SKPaymentTransaction skTransaction, NSError error) {
                if (error != null && error.getCode() == 2) {
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseCancel();
                    }
                } else {
                    Transaction transaction = transactionFromSKPaymentTransaction(skTransaction);

                    if (autoFinishTransactions) {
                        transaction.finish();
                    }

                    BillingError billingError = new BillingError(ErrorType.UNKNOWN,
                            "Error purchasing product: " + (error != null ? error.toString() : "unknown"));
                    for (BillingObserver observer : billingObservers) {
                        observer.onPurchaseError(transaction, billingError);
                    }
                }
            }

            @Override
            public void transactionDeferred(SKPaymentTransaction skTransaction) {
                Transaction transaction = transactionFromSKPaymentTransaction(skTransaction);

                BillingError billingError = new BillingError(ErrorType.TRANSACTION_DEFERRED,
                        "Transaction deferred! Will be completed in the future.");
                for (BillingObserver observer : billingObservers) {
                    observer.onPurchaseError(transaction, billingError);
                }
            }
        });
    }

    @Override
    public void setup(StoreSetupListener listener) {
        Objects.requireNonNull(listener, "listener");

        SKPaymentQueue.getDefaultQueue().addTransactionObserver(paymentObserver);

        listener.onSuccess();
    }

    private Transaction transactionFromSKPaymentTransaction(SKPaymentTransaction skTransaction) {
        String id = skTransaction.getPayment().getProductIdentifier();
        Product product = productCatalog.getProduct(getType(), id);
        if (product == null) {
            product = productCatalog.getProduct(id);
        }
        return new IOSTransaction(skTransaction, product, transactionVerificator);
    }

    @Override
    public boolean isAvailable() {
        return SKPaymentQueue.canMakePayments();
    }

    @Override
    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    @Override
    public void requestProductData() {
        if (productsRequest != null) {
            BillingError error = new BillingError(ErrorType.ALREADY_REQUESTING_PRODUCTS,
                    "Already requesting product data!");

            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestError(error);
            }
            return;
        }

        List<Product> products = productCatalog.getProducts();

        Set<String> productIds = new HashSet<>();
        for (Product product : products) {
            String id = product.getIdentifier(getType());
            if (id != null) {
                productIds.add(id);
            } else {
                Log.err("Product identifier not found for product: " + product);
            }
        }

        productsRequest = new SKProductsRequest(productIds);
        productsRequest.setDelegate(new ProductsRequestDelegate());
        productsRequest.start();
    }

    private class ProductsRequestDelegate extends SKProductsRequestDelegateAdapter {
        @Override
        public void didReceiveResponse(SKProductsRequest request, SKProductsResponse response) {
            List<SKProduct> products = response.getProducts();

            requestedProducts = new HashMap<>();

            for (SKProduct skProduct : products) {
                String id = skProduct.getProductIdentifier();
                requestedProducts.put(id, skProduct);

                Product product = productCatalog.getProduct(getType(), id);
                if (product == null) {
                    product = productCatalog.getProduct(id);
                }
                if (product != null) {
                    product.setAvailable(true);
                    product.setTitle(skProduct.getLocalizedTitle());
                    product.setDescription(skProduct.getLocalizedDescription());
                    product.setPrice(skProduct.getPrice().doubleValue(), skProduct.getPriceLocale().getCurrencyCode());
                }
            }

            productsRequest = null;
            for (BillingObserver observer : billingObservers) {
                observer.onProductsRequestSuccess(productCatalog.getProducts());
            }
        }

        @Override
        public void didFail(SKRequest request, NSError error) {
            productsRequest = null;
            if (error != null && error.getCode() == 2) {
                for (BillingObserver observer : billingObservers) {
                    observer.onProductsRequestCancel();
                }
            } else {
                BillingError billingError = new BillingError(ErrorType.UNKNOWN,
                        "Error requesting product data: " + (error != null ? error.toString() : "unknown"));

                for (BillingObserver observer : billingObservers) {
                    observer.onProductsRequestError(billingError);
                }
            }
        }
    }

    @Override
    public void restoreTransactions() {
        if (restoringTransactions) {
            BillingError error = new BillingError(ErrorType.ALREADY_RESTORING, "Already restoring transactions!");
            for (BillingObserver observer : billingObservers) {
                observer.onRestoreError(error);
            }
            return;
        }
        restoringTransactions = true;

        SKPaymentQueue.getDefaultQueue().restoreCompletedTransactions();
    }

    @Override
    public void purchaseProduct(Product product) {
        Util.requireNonNull(product, "product");
        if (requestedProducts == null) {
            BillingError error = new BillingError(ErrorType.PRODUCTS_NOT_REQUESTED,
                    "Product data not requested! Need to call requestProductData() first.");
            for (BillingObserver observer : billingObservers) {
                observer.onPurchaseError(null, error);
            }
            return;
        }
        String id = product.getIdentifier(getType());
        if (!requestedProducts.containsKey(id)) {
            BillingError error = new BillingError(ErrorType.UNKNOWN_PRODUCT_IDENTIFIER,
                    "Product identifier cannot be found for this store!");
            for (BillingObserver observer : billingObservers) {
                observer.onPurchaseError(null, error);
            }
            return;
        }

        SKPayment payment = new SKPayment(requestedProducts.get(id));
        SKPaymentQueue.getDefaultQueue().addPayment(payment);
    }

    @Override
    public void dispose() {
        SKPaymentQueue.getDefaultQueue().removeTransactionObserver(paymentObserver);
        productsRequest = null;
    }

    @Override
    public StoreType getType() {
        return StoreType.IOS_APP_STORE;
    }
}
