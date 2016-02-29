package org.robovm.pods.settings;

import org.robovm.apple.foundation.NSAutoreleasePool;
import org.robovm.apple.foundation.NSDictionary;
import org.robovm.apple.foundation.NSMutableDictionary;
import org.robovm.pods.Log;

import java.io.File;

public class IOSSettings implements InternalSettings {
    private NSDictionary<?, ?> preferences;
    private File path;

    IOSSettings(String name) {
        path = new File(new File(System.getenv("HOME"), "Library"), name + ".plist");
        preferences = NSMutableDictionary.read(path);

        if (preferences == null) {
            preferences = new NSMutableDictionary<>();
            preferences.write(path, false);
        }
    }

    @Override
    public void flush() {
        try (NSAutoreleasePool ignored = new NSAutoreleasePool()) {
            if (!preferences.write(path, false)) {
                Log.err("IOSSettings", "Failed to write settings to file: " + path);
            }
        }
    }

    @Override
    public boolean contains(String key) {
        return preferences.containsKey(key);
    }

    @Override
    public void remove(String key) {
        preferences.remove(key);
    }

    @Override
    public void clear() {
        preferences.clear();
    }

    @Override
    public void putBoolean(String key, boolean value) {
        preferences.put(key, value);
    }

    @Override
    public void putLong(String key, long value) {
        preferences.put(key, value);
    }

    @Override
    public void putDouble(String key, double value) {
        preferences.put(key, value);
    }

    @Override
    public void putString(String key, String value) {
        preferences.put(key, value);
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return preferences.getLong(key, defaultValue);
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return preferences.getDouble(key, defaultValue);
    }

    @Override
    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }
}
