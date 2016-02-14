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
