package org.robovm.pods.dialog;

abstract class DialogBuilder<T extends DialogBuilder<T, R>, R> {
    String title;
    String message;

    DialogBuilder() {}

    @SuppressWarnings("unchecked")
    public T setTitle(String title) {
        this.title = title;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T setMessage(String message) {
        this.message = message;
        return (T) this;
    }

    public abstract R build();
}
