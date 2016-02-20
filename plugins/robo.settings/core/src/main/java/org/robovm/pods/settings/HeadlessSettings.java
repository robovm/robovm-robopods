package org.robovm.pods.settings;

import java.io.*;
import java.util.Properties;

class HeadlessSettings implements InternalSettings {
    private final Properties properties = new Properties();
    private File file;

    HeadlessSettings(String name) {
        if (name.startsWith(File.separator)) {
            file = new File(name);
        } else {
            file = new File(System.getProperty("user.home"), name);
        }
    }

    @Override
    public void flush() {
        try (OutputStream out = new BufferedOutputStream(new FileOutputStream(file))) {
            properties.storeToXML(out, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean contains(String key) {
        return properties.containsKey(key);
    }

    @Override
    public void remove(String key) {
        properties.remove(key);
    }

    @Override
    public void clear() {
        properties.clear();
    }

    @Override
    public void putBoolean(String key, boolean value) {
        properties.put(key, Boolean.toString(value));
    }

    @Override
    public void putLong(String key, long value) {
        properties.put(key, Long.toString(value));
    }

    @Override
    public void putDouble(String key, double value) {
        properties.put(key, Double.toString(value));
    }

    @Override
    public void putString(String key, String value) {
        properties.put(key, value);
    }

    @Override
    public boolean getBoolean(String key, boolean defaultValue) {
        return Boolean.parseBoolean(properties.getProperty(key, Boolean.toString(defaultValue)));
    }

    @Override
    public long getLong(String key, long defaultValue) {
        return Long.parseLong(properties.getProperty(key, Long.toString(defaultValue)));
    }

    @Override
    public double getDouble(String key, double defaultValue) {
        return Double.parseDouble(properties.getProperty(key, Double.toString(defaultValue)));
    }

    @Override
    public String getString(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }
}
