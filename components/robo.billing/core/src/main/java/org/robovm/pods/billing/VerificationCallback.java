package org.robovm.pods.billing;

public interface VerificationCallback {
    void onResult(Transaction transaction, boolean isValid, BillingError error);
}
