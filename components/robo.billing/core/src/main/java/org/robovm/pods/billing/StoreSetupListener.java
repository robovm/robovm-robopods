package org.robovm.pods.billing;

public interface StoreSetupListener {
    void onSuccess();

    void onError(BillingError error);
}
