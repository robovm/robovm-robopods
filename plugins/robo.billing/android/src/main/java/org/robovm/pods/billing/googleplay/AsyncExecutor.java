package org.robovm.pods.billing.googleplay;

public interface AsyncExecutor {
    void executeAsync(Runnable runnable);

    void executeAsync(Runnable runnable, long delayInMs);
}
