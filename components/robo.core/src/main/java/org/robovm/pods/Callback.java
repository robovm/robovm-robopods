package org.robovm.pods;

public interface Callback<T> {
    void invoke(T result);
}
