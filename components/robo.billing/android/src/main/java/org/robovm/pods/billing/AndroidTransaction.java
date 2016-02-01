package org.robovm.pods.billing;

import org.onepf.oms.OpenIabHelper;
import org.onepf.oms.appstore.googleUtils.Purchase;
import org.robovm.pods.Log;
import org.robovm.pods.billing.BillingError.ErrorType;

import java.util.Date;

public class AndroidTransaction implements Transaction {
    private final OpenIabHelper iabHelper;
    private final Purchase purchase;
    private final Product product;
    private final TransactionVerificator verificator;

    private final Date purchaseDate;

    AndroidTransaction(OpenIabHelper iabHelper, Purchase purchase, Product product,
            TransactionVerificator verificator) {
        this.iabHelper = iabHelper;
        this.purchase = purchase;
        this.product = product;
        this.verificator = verificator;
        this.purchaseDate = new Date(purchase.getPurchaseTime());
    }

    @Override
    public Product getProduct() {
        return product;
    }

    @Override
    public String getTransactionIdentifier() {
        return purchase.getOrderId();
    }

    @Override
    public Date getTransactionDate() {
        return purchaseDate;
    }

    @Override
    public String getReceipt() {
        return purchase.getOriginalJson();
    }

    @Override
    public String getSignature() {
        return purchase.getSignature();
    }

    @Override
    public void finish() {
        iabHelper.consumeAsync(purchase, (purchase, result) -> {
            if (!result.isSuccess()) {
                Log.err("Failed to finish transaction: " + getTransactionIdentifier());
            }
        });
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
}
