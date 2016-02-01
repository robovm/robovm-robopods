package org.robovm.pods.billing;

import org.robovm.apple.foundation.*;
import org.robovm.apple.storekit.SKPaymentTransaction;
import org.robovm.apple.storekit.SKReceiptRefreshRequest;
import org.robovm.apple.storekit.SKRequest;
import org.robovm.apple.storekit.SKRequestDelegateAdapter;
import org.robovm.pods.Log;

public class AppStoreReceiptRequest {
    public static void requestReceipt(AppStoreReceiptRequestListener listener) {
        requestReceipt(null, listener);
    }

    @SuppressWarnings("deprecation")
    public static void requestReceipt(SKPaymentTransaction transaction, final AppStoreReceiptRequestListener listener) {
        NSData receipt = null;
        if (Foundation.getMajorSystemVersion() >= 7) {
            NSURL receiptURL = NSBundle.getMainBundle().getAppStoreReceiptURL();
            receipt = NSData.read(receiptURL);
            if (receipt == null) {
                final SKReceiptRefreshRequest request = new SKReceiptRefreshRequest();
                request.setDelegate(new SKRequestDelegateAdapter() {
                    @Override
                    public void didFinish(SKRequest r) {
                        if (r.equals(request)) {
                            NSURL receiptURL = NSBundle.getMainBundle().getAppStoreReceiptURL();
                            NSData receipt = NSData.read(receiptURL);
                            listener.onSuccess(receipt);
                        } else {
                            listener.onFail();
                        }
                    }

                    @Override
                    public void didFail(SKRequest request, NSError error) {
                        Log.err("AppStoreReceipt request failed!");
                        listener.onFail();
                    }
                });
                request.start();
                return;
            }
        } else if (transaction != null) {
            receipt = transaction.getTransactionReceipt();
        }

        if (receipt != null) {
            listener.onSuccess(receipt);
        } else {
            listener.onFail();
        }
    }

    public interface AppStoreReceiptRequestListener {
        void onSuccess(NSData receipt);

        void onFail();
    }
}
