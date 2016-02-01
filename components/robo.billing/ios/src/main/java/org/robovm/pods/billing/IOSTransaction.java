package org.robovm.pods.billing;

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDataBase64EncodingOptions;
import org.robovm.apple.storekit.SKPaymentQueue;
import org.robovm.apple.storekit.SKPaymentTransaction;
import org.robovm.pods.billing.AppStoreReceiptRequest.AppStoreReceiptRequestListener;
import org.robovm.pods.billing.BillingError.ErrorType;

import java.util.Date;

public class IOSTransaction implements Transaction {
    private final SKPaymentTransaction skTransaction;
    private final Product product;
    private final TransactionVerificator verificator;
    private String receipt;

    IOSTransaction(SKPaymentTransaction transaction, Product product, TransactionVerificator verificator) {
        this.skTransaction = transaction;
        this.product = product;
        this.verificator = verificator;

        if (verificator != null) {
            requestReceipt(null);
        }
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public String getTransactionIdentifier() {
        return skTransaction.getTransactionIdentifier();
    }

    @Override
    public Date getTransactionDate() {
        return skTransaction.getTransactionDate().toDate();
    }

    @Override
    public void finish() {
        SKPaymentQueue.getDefaultQueue().finishTransaction(skTransaction);
    }

    @Override
    public void verify(VerificationCallback callback) {
        if (verificator == null) {
            callback.onResult(this, false, new BillingError(ErrorType.TRANSACTION_VERIFICATOR_MISSING,
                    "No transaction verificator specified!"));
        } else {
            if (receipt == null) {
                requestReceipt(() -> {
                    if (receipt == null) {
                        callback.onResult(this, false, new BillingError(ErrorType.TRANSACTION_VERIFICATOR_MISSING,
                                "Receipt could not be requested!"));
                    } else {
                        verificator.verify(this, callback);
                    }
                });
            } else {
                verificator.verify(this, callback);
            }
        }
    }

    private void requestReceipt(Runnable completion) {
        AppStoreReceiptRequest.requestReceipt(skTransaction, new AppStoreReceiptRequestListener() {
            @Override
            public void onSuccess(NSData receipt) {
                IOSTransaction.this.receipt = receipt.toBase64EncodedString(NSDataBase64EncodingOptions.None);
                if (completion != null) {
                    completion.run();
                }
            }

            @Override
            public void onFail() {
                if (completion != null) {
                    completion.run();
                }
            }
        });
    }

    @Override
    public String getReceipt() {
        return receipt;
    }

    @Override
    public String getSignature() {
        // Not available on iOS
        return null;
    }
}
