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
