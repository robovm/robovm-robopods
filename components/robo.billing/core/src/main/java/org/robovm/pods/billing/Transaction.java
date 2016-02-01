package org.robovm.pods.billing;

import java.util.Date;

public interface Transaction {
    Product getProduct();

    String getTransactionIdentifier();

    Date getTransactionDate();

    String getReceipt();

    String getSignature();

    void finish();

    void verify(VerificationCallback callback);
}
