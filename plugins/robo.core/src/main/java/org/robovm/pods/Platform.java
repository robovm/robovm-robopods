/*
 * Copyright (C) 2016 RoboVM AB
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

import android.os.Handler;
import android.os.Looper;
import org.robovm.apple.foundation.NSOperationQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public abstract class Platform {
    private static Platform PLATFORM = findPlatform();

    private Map<Class<?>, Map<String, Class<?>>> implementations = new HashMap<>();

    private Platform() {}

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

    public static Platform getPlatform() {
        return PLATFORM;
    }

    public static PlatformType getType() {
        return PLATFORM.getPlatformType();
    }

    public <T> T getInstance(Class<T> type, Object... args) {
        return getInstance(null, type, args);
    }

    @SuppressWarnings("unchecked")
    public <T> T getInstance(String identifier, Class<T> type, Object... args) {
        Util.requireNonNull(type, "type");
        if (!type.isInterface()) {
            throw new IllegalArgumentException("type must be an interface");
        }

        Map<String, Class<?>> classes = implementations.get(type);
        if (classes == null) {
            classes = findImplementations(type);
            implementations.put(type, classes);
        }
        if (classes.size() > 0) {
            Class<?> target = classes.get(identifier);
            return (T) constructInstance(target, args);
        }
        if (getType() == PlatformType.Headless) {
            // Create default implementation on headless platforms.
            return (T) Proxy.newProxyInstance(type.getClassLoader(), new Class[] { type },
                    (proxy, method, args1) -> {
                        Class<?> returnType = method.getReturnType();
                        if (returnType.isPrimitive()) {
                            return getPrimitiveNullValue(returnType);
                        }
                        return null;
                    });
        }
        throw new IllegalArgumentException("No class found that implements " + type.getSimpleName());
    }

    private static Object getPrimitiveNullValue(Class<?> primitiveClass) {
        if (primitiveClass.equals(boolean.class)) {
            return Boolean.FALSE;
        } else if (primitiveClass.equals(byte.class)) {
            return (byte) 0;
        } else if (primitiveClass.equals(short.class)) {
            return (short) 0;
        }
        return 0;
    }

    @SuppressWarnings("unchecked")
    private <T> T constructInstance(Class<T> type, Object... args) {
        try {
            Constructor<?> construct = type.getDeclaredConstructor(getClassesOfArguments(args));
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

    private Map<String, Class<?>> findImplementations(Class<?> type) {
        Map<String, Class<?>> classes = new HashMap<>();
        try {
            Enumeration<URL> resources = Platform.class.getClassLoader().getResources("services/" + type.getName());
            while (resources.hasMoreElements()) {
                URL url = resources.nextElement();
                InputStream is = url.openStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));

                PlatformType targetPlatform = getPlatformType();
                PlatformType currentPlatform = null;

                String line;
                while ((line = reader.readLine()) != null) {
                    line = line.trim();

                    if (!line.isEmpty()) {
                        if (line.startsWith("#")) {
                            PlatformType newPlatform = PlatformType.fromString(line);
                            if (newPlatform != null) {
                                if (currentPlatform == targetPlatform) {
                                    break;
                                } else {
                                    currentPlatform = PlatformType.fromString(line);
                                }
                            }
                        } else if (currentPlatform == null || currentPlatform == targetPlatform) {
                            if (line.contains(":")) {
                                String[] parts = line.split(":");
                                classes.put(parts[0], Class.forName(parts[1]));
                            } else {
                                classes.put(null, Class.forName(line));
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ignored) {}

        return classes;
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

        private AndroidPlatform() {
            handler = new Handler(Looper.getMainLooper());
        }

        @Override
        PlatformType getPlatformType() {
            return PlatformType.Android;
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
