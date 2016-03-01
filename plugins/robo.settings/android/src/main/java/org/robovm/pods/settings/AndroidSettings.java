package org.robovm.pods.settings;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import org.robovm.pods.android.ActivityConfigurable;
import org.robovm.pods.android.AndroidConfig;

public class AndroidSettings implements InternalSettings, ActivityConfigurable {
    private String name;
    private SharedPreferences preferences;
    private Editor editor;

    AndroidSettings(String name) {
        this.name = name;
        setActivity(AndroidConfig.getActivity(this));
    }

    @Override
    public void setActivity(Activity activity) {
        preferences = activity.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    @Override
    public void flush() {
        if (editor != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
                editor.apply();
            } else {
                editor.commit();
            }
            editor = null;
        }
    }

    @Override
    public boolean contains(String key) {
        return preferences.contains(key);
    }

    @Override
    public void remove(String key) {
        edit();
        editor.remove(key);
    }

    @Override
    public void clear() {
        edit();
        editor.clear();
    }

    @Override
    public void putBoolean(String key, boolean value) {
        edit();
        editor.putBoolean(key, value);
    }

    @Override
    public void putLong(String key, long value) {
        edit();
        editor.putLong(key, value);
    }

    @Override
    public void putDouble(String key, double value) {
        edit();
        editor.putLong(key, Double.doubleToRawLongBits(value));
    }

    @Override
    public void putString(String key, String value) {
        edit();
        editor.putString(key, value);
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
        return Double.longBitsToDouble(preferences.getLong(key, Double.doubleToLongBits(defaultValue)));
    }

    @Override
    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

    private void edit() {
        if (editor == null) {
            editor = preferences.edit();
        }
    }
}
