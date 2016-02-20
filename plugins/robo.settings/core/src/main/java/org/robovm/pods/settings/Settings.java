package org.robovm.pods.settings;

import com.google.gson.Gson;
import org.robovm.pods.Platform;
import org.robovm.pods.Util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class Settings {
    private static Map<String, Settings> sharedSettings = new HashMap<>();

    private InternalSettings impl;
    private Gson gson;

    public Settings(String name) {
        Util.requireNonNull(name, "name");
        impl = Platform.getPlatform().getInstance(InternalSettings.class, name.trim());
        setGson(new Gson());
    }

    public Settings flush() {
        impl.flush();
        return this;
    }

    public boolean contains(String key) {
        return impl.contains(key);
    }

    public <T> Settings remove(T object) {
        Util.requireNonNull(object, "object");
        return remove(object.getClass().getName());
    }

    public Settings remove(String key) {
        impl.remove(key);
        return this;
    }

    public Settings clear() {
        impl.clear();
        return this;
    }

    public <T> Settings put(T object) {
        Util.requireNonNull(object, "object");
        return put(object.getClass().getName(), object);
    }

    public <T> Settings put(String key, T object) {
        requireNonNullKey(key);
        Util.requireNonNull(object, "object");

        String json = gson.toJson(object);
        impl.putString(key, json);
        return this;
    }

    public Settings put(String key, boolean value) {
        requireNonNullKey(key);
        impl.putBoolean(key, value);
        return this;
    }

    public Settings put(String key, byte value) {
        requireNonNullKey(key);
        impl.putLong(key, value);
        return this;
    }

    public Settings put(String key, short value) {
        requireNonNullKey(key);
        impl.putLong(key, value);
        return this;
    }

    public Settings put(String key, int value) {
        requireNonNullKey(key);
        impl.putLong(key, value);
        return this;
    }

    public Settings put(String key, long value) {
        requireNonNullKey(key);
        impl.putLong(key, value);
        return this;
    }

    public Settings put(String key, float value) {
        requireNonNullKey(key);
        impl.putDouble(key, value);
        return this;
    }

    public Settings put(String key, double value) {
        requireNonNullKey(key);
        impl.putDouble(key, value);
        return this;
    }

    public Settings put(String key, String value) {
        requireNonNullKey(key);
        impl.putString(key, value);
        return this;
    }

    public <T> T get(Class<T> type) {
        return get(type.getName(), type);
    }

    public <T> T get(String key, Class<T> type) {
        String json = impl.getString(key, null);
        if (json != null) {
            return gson.fromJson(json, type);
        }
        // Return a new instance of the object.
        try {
            Constructor<T> c = type.getDeclaredConstructor();
            c.setAccessible(true);
            return c.newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return impl.getBoolean(key, defaultValue);
    }

    public byte getByte(String key) {
        return getByte(key, (byte) 0);
    }

    public byte getByte(String key, byte defaultValue) {
        requireNonNullKey(key);
        return (byte) impl.getLong(key, defaultValue);
    }

    public short getShort(String key) {
        return getShort(key, (short) 0);
    }

    public short getShort(String key, short defaultValue) {
        requireNonNullKey(key);
        return (short) impl.getLong(key, defaultValue);
    }

    public int getInt(String key) {
        return getInt(key, 0);
    }

    public int getInt(String key, int defaultValue) {
        requireNonNullKey(key);
        return (int) impl.getLong(key, defaultValue);
    }

    public long getLong(String key) {
        return getLong(key, 0);
    }

    public long getLong(String key, long defaultValue) {
        requireNonNullKey(key);
        return impl.getLong(key, defaultValue);
    }

    public float getFloat(String key) {
        return getFloat(key, 0);
    }

    public float getFloat(String key, float defaultValue) {
        requireNonNullKey(key);
        return (float) impl.getDouble(key, defaultValue);
    }

    public double getDouble(String key) {
        return getDouble(key, 0);
    }

    public double getDouble(String key, double defaultValue) {
        requireNonNullKey(key);
        return impl.getDouble(key, defaultValue);
    }

    public String getString(String key) {
        return getString(key, "");
    }

    public String getString(String key, String defaultValue) {
        requireNonNullKey(key);
        return impl.getString(key, defaultValue);
    }

    private static void requireNonNullKey(String key) {
        Util.requireNonNull(key, "key");
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public static Settings getSharedSettings(String name) {
        if (!sharedSettings.containsKey(name)) {
            sharedSettings.put(name, new Settings(name));
        }
        return sharedSettings.get(name);
    }
}
