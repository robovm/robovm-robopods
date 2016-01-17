/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.pods.fabric.answers;

import java.math.BigDecimal;

import org.robovm.apple.foundation.NSDecimalNumber;
import org.robovm.apple.foundation.NSNumber;

public final class StartCheckoutEvent extends AnswersEvent<StartCheckoutEvent> {
    protected NSDecimalNumber totalPrice;
    protected String currency;
    protected NSNumber itemCount;

    public StartCheckoutEvent putItemCount(int itemCount) {
        this.itemCount = NSNumber.valueOf(itemCount);
        return this;
    }

    public StartCheckoutEvent putTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = new NSDecimalNumber(String.valueOf(totalPrice));
        return this;
    }

    public StartCheckoutEvent putCurrency(String currency) {
        this.currency = currency;
        return this;
    }
}
