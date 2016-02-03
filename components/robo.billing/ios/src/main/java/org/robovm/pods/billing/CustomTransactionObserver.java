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

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.storekit.SKPaymentQueue;
import org.robovm.apple.storekit.SKPaymentTransaction;
import org.robovm.apple.storekit.SKPaymentTransactionObserverAdapter;

public final class CustomTransactionObserver extends SKPaymentTransactionObserverAdapter {
    private final TransactionObserverListener listener;

    public CustomTransactionObserver(TransactionObserverListener listener) {
        this.listener = listener;
    }

    @Override
    public void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions) {
        for (SKPaymentTransaction transaction : transactions) {
            switch (transaction.getTransactionState()) {
            case Purchased:
                listener.transactionCompleted(transaction);
                break;
            case Failed:
                listener.transactionFailed(transaction, transaction.getError());
                break;
            case Restored:
                listener.transactionRestored(transaction);
                break;
            case Deferred:
                listener.transactionDeferred(transaction);
                break;
            default:
                break;
            }
        }
    }

    @Override
    public void restoreCompletedTransactionsFinished(SKPaymentQueue queue) {
        listener.restoreCompleted(queue);
    }

    @Override
    public void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error) {
        listener.restoreFailed(queue, error);
    }
}
