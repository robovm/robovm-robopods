package org.robovm.pods.billing;

public abstract class TransactionVerificator {
    protected Store store;

    public abstract void verify(Transaction transaction, VerificationCallback callback);

    void setStore(Store store) {
        this.store = store;
    }
}
