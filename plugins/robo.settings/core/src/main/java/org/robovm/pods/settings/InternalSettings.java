package org.robovm.pods.settings;

interface InternalSettings {
    void flush();

    boolean contains(String key);

    void remove(String key);

    void clear();

    void putBoolean(String key, boolean value);

    void putLong(String key, long value);

    void putDouble(String key, double value);

    void putString(String key, String value);

    boolean getBoolean(String key, boolean defaultValue);

    long getLong(String key, long defaultValue);

    double getDouble(String key, double defaultValue);

    String getString(String key, String defaultValue);
}
