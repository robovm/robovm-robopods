package org.robovm.pods.billing;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.storekit.SKPaymentQueue;
import org.robovm.apple.storekit.SKPaymentTransaction;

public interface TransactionObserverListener {
    void transactionCompleted(SKPaymentTransaction transaction);

    void transactionFailed(SKPaymentTransaction transaction, NSError error);

    void transactionDeferred(SKPaymentTransaction transaction);

    void transactionRestored(SKPaymentTransaction transaction);

    void restoreCompleted(SKPaymentQueue queue);

    void restoreFailed(SKPaymentQueue queue, NSError error);
}
