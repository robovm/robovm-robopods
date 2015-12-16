/*
 * Copyright (C) 2013-2016 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;

import org.robovm.apple.foundation.NSOperationQueue;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;

public abstract class Platform {
    private static Platform PLATFORM = findPlatform();

    private List<Class<?>> classes = new ArrayList<>();

    private Platform() {
        readImpls();
    }

    private static Platform findPlatform() {
        String vm = System.getProperty("java.runtime.name");
        if (vm.contains("Android Runtime")) {
            return new AndroidPlatform();
        } else if (vm.contains("RoboVM Runtime")) {
            return new IOSPlatform();
        } else {
            return new HeadlessPlatform();
        }
    }

    private void readImpls() {
        try {
            Enumeration<URL> resources = Platform.class.getClassLoader().getResources("classes.txt");
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                InputStream is = url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String targetPlatform = getPlatformType().name().toLowerCase();

                String line;
                boolean correctPlatform = false;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();
                    if (correctPlatform && !line.isEmpty() && !line.contains("-")) {
                        classes.add(Class.forName(line));
                    } else if (line.toLowerCase().contains(targetPlatform)) {
                        correctPlatform = true;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // We will end here when there are classes not available to the
            // current platform.
        }
    }

    public static Platform getPlatform() {
        return PLATFORM;
    }

    public static PlatformType getType() {
        return PLATFORM.getPlatformType();
    }

    @SuppressWarnings("unchecked")
    public <T> T getInstance(Class<T> type, Object... args) {
        Objects.requireNonNull(type, "type");
        if (!type.isInterface()) {
            throw new IllegalArgumentException("type must be an interface");
        }
        Class<?> target = null;
        for (Class<?> c : classes) {
            if (Arrays.asList(c.getInterfaces()).contains(type)) {
                target = c;
                break;
            }
        }
        if (target != null) {
            try {
                Constructor<?> construct = target.getDeclaredConstructor(getClassesOfArguments(args));
                construct.setAccessible(true);
                return (T) construct.newInstance(args);
            } catch (InstantiationException
                    | IllegalAccessException
                    | IllegalArgumentException
                    | InvocationTargetException
                    | NoSuchMethodException e) {
                throw new AssertionError(e);
            }
        }
        throw new IllegalArgumentException("No class found that implements " + type.getSimpleName());
    }

    private Class<?>[] getClassesOfArguments(Object... args) {
        Class<?>[] classes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            classes[i] = args[i].getClass();
        }
        return classes;
    }

    abstract PlatformType getPlatformType();

    public abstract void runOnUIThread(Runnable runnable);

    public static final class AndroidPlatform extends Platform {
        final Handler handler;
        Activity launchActivity;

        private AndroidPlatform() {
            handler = new Handler(Looper.getMainLooper());
        }

        @Override
        PlatformType getPlatformType() {
            return PlatformType.Android;
        }

        public Activity getLaunchActivity() {
            if (launchActivity == null) {
                launchActivity = findLaunchActivity();
            }
            return launchActivity;
        }

        public void setLaunchActivity(Activity mainActivity) {
            this.launchActivity = mainActivity;
        }

        private Activity findLaunchActivity() {
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
                System.err.println(
                        "Couldn't find launch activity! "
                                + "Specify manually with ((AndroidPlatform) Platform.getPlatform()).setLaunchActivity(activity); to make RoboPods work correctly!");
            }
            return null;
        }

        @Override
        public void runOnUIThread(Runnable runnable) {
            handler.post(runnable);
        }
    }

    public static final class IOSPlatform extends Platform {
        final NSOperationQueue mainQueue;

        private IOSPlatform() {
            mainQueue = NSOperationQueue.getMainQueue();
        }

        @Override
        PlatformType getPlatformType() {
            return PlatformType.iOS;
        }

        @Override
        public void runOnUIThread(Runnable runnable) {
            mainQueue.addOperation(runnable);
        }
    }

    public static final class HeadlessPlatform extends Platform {
        private HeadlessPlatform() {}

        @Override
        PlatformType getPlatformType() {
            return PlatformType.Headless;
        }

        @Override
        public void runOnUIThread(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
