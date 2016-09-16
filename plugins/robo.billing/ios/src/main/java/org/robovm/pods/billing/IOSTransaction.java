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

import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDataBase64EncodingOptions;
import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.storekit.SKPaymentQueue;
import org.robovm.apple.storekit.SKPaymentTransaction;
import org.robovm.pods.billing.AppStoreReceiptRequest.AppStoreReceiptRequestListener;
import org.robovm.pods.billing.BillingError.ErrorType;

public class IOSTransaction extends Transaction {
    private final SKPaymentTransaction skTransaction;

    IOSTransaction(Product product, TransactionVerificator verificator, SKPaymentTransaction transaction) {
        super(product, verificator);
        this.skTransaction = transaction;

        this.identifier = skTransaction.getTransactionIdentifier();
        NSDate nsDate = skTransaction.getTransactionDate();
        if (nsDate != null) {
            this.date = nsDate.toDate();
        }

        if (verificator != null) {
            requestReceipt(null);
        }
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
}
