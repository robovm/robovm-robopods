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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Objects;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import org.robovm.apple.foundation.NSOperationQueue;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

public abstract class Platform {
    private static Platform PLATFORM = findPlatform();
    private static final String ROBOPODS_CLASSES_DIR_NAME = "robopods-classes/";
    private static final String JAR_URL_SEPARATOR = "!/";
    private static final String FILE_URL_PREFIX = "file:";

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
            Enumeration<URL> resources = Platform.class.getClassLoader().getResources(ROBOPODS_CLASSES_DIR_NAME);
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();

                if (isJarURL(url)) {
                    URLConnection con = url.openConnection();
                    JarFile jarFile;
                    boolean newJarFile = false;

                    if (con instanceof JarURLConnection) {
                        JarURLConnection jarCon = (JarURLConnection) con;
                        jarFile = jarCon.getJarFile();
                    } else {
                        jarFile = createJarFile(url.getFile());
                        newJarFile = true;
                    }

                    for (Enumeration<JarEntry> entries = jarFile.entries(); entries.hasMoreElements();) {
                        JarEntry entry = entries.nextElement();
                        if (entry.getName().contains(ROBOPODS_CLASSES_DIR_NAME) && entry.getName().endsWith("txt")) {
                            readClassesFromStream(jarFile.getInputStream(entry));
                        }
                    }

                    if (newJarFile) {
                        jarFile.close();
                    }
                } else {
                    File file = new File(url.getFile());

                    if (file.isDirectory()) {
                        final File[] fileList = file.listFiles();
                        for (final File entry : fileList) {
                            if (entry.getName().endsWith("txt")) {
                                readClassesFromStream(new FileInputStream(file));
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private JarFile createJarFile(String urlFile) throws IOException {
        String jarFileUrl;

        int separatorIndex = urlFile.indexOf(JAR_URL_SEPARATOR);
        if (separatorIndex != -1) {
            jarFileUrl = urlFile.substring(0, separatorIndex);
            if (jarFileUrl.startsWith(FILE_URL_PREFIX)) {
                try {
                    return new JarFile(new URI(jarFileUrl).getSchemeSpecificPart());
                } catch (URISyntaxException ex) {
                    return new JarFile(jarFileUrl.substring(FILE_URL_PREFIX.length()));
                }
            } else {
                return new JarFile(jarFileUrl);
            }
        } else {
            return new JarFile(urlFile);
        }
    }

    private boolean isJarURL(URL url) {
        String protocol = url.getProtocol();
        return "jar".equalsIgnoreCase(protocol) || "zip".equalsIgnoreCase(protocol)
                || "wsjar".equalsIgnoreCase(protocol);
    }

    private void readClassesFromStream(InputStream is) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String targetPlatform = getPlatformType().name().toLowerCase();

            String line;
            boolean correctPlatform = false;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (correctPlatform && !line.isEmpty()) {
                    if (!line.contains("-")) {
                        classes.add(Class.forName(line));
                    } else {
                        break;
                    }
                } else if (line.toLowerCase().contains(targetPlatform)) {
                    correctPlatform = true;
                }
            }
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
        List<ActivityLifecycleListener> lifecycleListeners = new ArrayList<>();

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

        public void registerActivityLifecycleListener(ActivityLifecycleListener listener) {
            lifecycleListeners.add(listener);
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
                System.err.println("Couldn't find launch activity! "
                        + "Specify manually with ((AndroidPlatform) Platform.getPlatform()).setLaunchActivity(activity); to make RoboPods work correctly!");
            }
            return null;
        }

        @Override
        public void runOnUIThread(Runnable runnable) {
            handler.post(runnable);
        }

        // FIXME this is just temporary. We should use a proxy activity that
        // is launched with the target activity to listen for lifecycle events.
        public void onActivityResult(int requestCode, int resultCode, Intent data) {
            for (ActivityLifecycleListener listener : lifecycleListeners) {
                listener.onActivityResult(requestCode, resultCode, data);
            }
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
