package org.robovm.pods.android;

import android.app.Activity;
import android.content.Intent;
import org.robovm.pods.ActivityLifecycleListener;
import org.robovm.pods.Log;
import org.robovm.pods.Util;

import java.lang.reflect.Field;
import java.util.*;

public final class AndroidConfig {
    private static final AndroidConfig instance = new AndroidConfig();

    private Activity launchActivity;
    private Map<String, Activity> registeredActivities = new HashMap<>();
    private Map<Object, String> activityMappings = new HashMap<>();

    private List<ActivityLifecycleListener> lifecycleListeners = new ArrayList<>();

    private AndroidConfig() {}

    protected static AndroidConfig instance() {
        return instance;
    }

    /**
     * Register the activity with the specified name. Use {@link #getActivity(String)} to get a registered activity.
     *
     * @param activityName The name to register the activity for.
     * @param activity     The activity that should be registered.
     */
    public static void registerActivity(String activityName, Activity activity) {
        instance().registeredActivities.put(activityName, activity);
    }

    public static void setActivity(String activityName, Object object) {
        if (object instanceof ActivityConfigurable) {
            ((ActivityConfigurable) object).setActivity(getActivity(activityName));
        }
        instance().activityMappings.put(object, activityName);
    }

    public static void setActivity(String activityName, Class<?> clazz) {
        instance().activityMappings.put(clazz, activityName);
    }

    /**
     * @param activityName The registered name of the activity. Must have called {@link #registerActivity(String, Activity)} first.
     * @return the activity for the registered name or {@code null} if there is no activity with that name.
     */
    public static Activity getActivity(String activityName) {
        Util.requireNonNull(activityName, "activityName");
        return instance().registeredActivities.get(activityName);
    }

    public static Activity getActivity(Object object) {
        Util.requireNonNull(object, "object");

        String activityName = instance().activityMappings.get(object);
        if (activityName != null) {
            return getActivity(activityName);
        }

        return getActivity(object.getClass());
    }

    public static Activity getActivity(Class<?> clazz) {
        Util.requireNonNull(clazz, "clazz");

        Map<Object, String> map = instance().activityMappings;

        String activityName = instance().activityMappings.get(clazz);
        if (activityName != null) {
            return getActivity(activityName);
        }

        for (Map.Entry<Object, String> entry : map.entrySet()) {
            Object key = entry.getKey();
            Class<?> entryClass = (key instanceof Class) ? (Class<?>) key : key.getClass();
            if (entryClass.isAssignableFrom(clazz)) {
                activityName = entry.getValue();
                break;
            }
        }
        if (activityName != null) {
            return getActivity(activityName);
        }
        return getLaunchActivity();
    }

    public static Activity getLaunchActivity() {
        if (instance().launchActivity == null) {
            instance().launchActivity = findLaunchActivity();
        }
        return instance().launchActivity;
    }

    public static void setLaunchActivity(Activity mainActivity) {
        instance().launchActivity = mainActivity;
    }

    private static Activity findLaunchActivity() {
        try {
            Class<?> activityThreadClass = Class.forName("android.app.ActivityThread");
            Object activityThread = activityThreadClass.getMethod("currentActivityThread").invoke(null);
            Field activitiesField = activityThreadClass.getDeclaredField("mActivities");
            activitiesField.setAccessible(true);
            Object activities = activitiesField.get(activityThread);
            Collection<?> values = (Collection<?>) activities.getClass().getDeclaredMethod("values")
                    .invoke(activities);

            for (Object activityRecord : values) {
                Class<?> activityRecordClass = activityRecord.getClass();
                Field pausedField = activityRecordClass.getDeclaredField("paused");
                pausedField.setAccessible(true);
                if (!pausedField.getBoolean(activityRecord)) {
                    Field activityField = activityRecordClass.getDeclaredField("activity");
                    activityField.setAccessible(true);
                    Activity activity = (Activity) activityField.get(activityRecord);
                    if (activity.getIntent().getCategories().contains("android.intent.category.LAUNCHER")) {
                        return activity;
                    }
                }
            }
        } catch (Exception e) {
            Log.err("Couldn't find launch activity! "
                    + "Specify manually with AndroidConfig.setLaunchActivity(activity); to make RoboPods work correctly!");
        }
        return null;
    }

    public static void registerActivityLifecycleListener(ActivityLifecycleListener listener) {
        instance().lifecycleListeners.add(listener);
    }

    // FIXME this is just temporary. We should use a proxy activity that
    // is launched with the target activity to listen for lifecycle events.
    public static void onActivityResult(int requestCode, int resultCode, Intent data) {
        for (ActivityLifecycleListener listener : instance().lifecycleListeners) {
            listener.onActivityResult(requestCode, resultCode, data);
        }
    }
}
