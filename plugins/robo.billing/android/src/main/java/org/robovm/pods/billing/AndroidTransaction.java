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

import org.onepf.oms.appstore.googleUtils.Purchase;
import org.robovm.pods.billing.BillingError.ErrorType;

import java.util.Date;

public class AndroidTransaction extends Transaction {
    private final AndroidStoreImpl store;

    // Only needed for OpenIab
    private Purchase purchase;

    AndroidTransaction(Product product, TransactionVerificator verificator, AndroidStoreImpl store) {
        super(product, verificator);
        this.store = store;
    }

    protected void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    protected void setDate(Date date) {
        this.date = date;
    }

    protected void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    protected void setSignature(String signature) {
        this.signature = signature;
    }

    protected void setToken(String token) {
        this.token = token;
    }

    @Override
    public void finish() {
        store.finishTransaction(this);
    }

    @Override
    public void verify(VerificationCallback callback) {
        if (verificator == null) {
            callback.onResult(this, false, new BillingError(ErrorType.TRANSACTION_VERIFICATOR_MISSING,
                    "No transaction verificator specified!"));
        } else {
            verificator.verify(this, callback);
        }
    }

    // Only needed for OpenIab
    protected void setPurchase(Purchase purchase) {
        this.purchase = purchase;
        if (purchase != null) {
            setIdentifier(purchase.getOrderId());
            setDate(new Date(purchase.getPurchaseTime()));
            setReceipt(purchase.getOriginalJson());
            setSignature(purchase.getSignature());
            setToken(purchase.getToken());
        }
    }

    protected Purchase getPurchase() {
        return purchase;
    }
}
