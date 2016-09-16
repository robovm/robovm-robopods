package org.robovm.pods.billing.googleplay;

public class NewThreadSleepAsyncExecutor implements AsyncExecutor {
    @Override
    public void executeAsync(Runnable runnable) {
        new Thread(runnable).start();
    }

    @Override
    public void executeAsync(Runnable runnable, long delay) {
        if (delay == 0) {
            executeAsync(runnable);
        } else {
            Runnable sleepingRunnable = () -> {
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    return;
                }
                runnable.run();
            };
            new Thread(sleepingRunnable).start();
        }
    }
}
