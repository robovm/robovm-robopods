package org.robovm.pods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.robovm.apple.foundation.NSOperationQueue;

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
            return new Android();
        } else if (vm.contains("RoboVM Runtime")) {
            return new IOS();
        } else {
            return new Unknown();
        }
    }

    private void readImpls() {
        try (InputStream is = Platform.class.getResourceAsStream("/classes.txt")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String targetPlatform = getPlatformType().name().toLowerCase();

            String line;
            boolean correctPlatform = false;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (correctPlatform && !line.isEmpty()) {
                    classes.add(Class.forName(line));
                } else if (line.toLowerCase().contains(targetPlatform)) {
                    correctPlatform = true;
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

    static class Android extends Platform {
        final Handler handler;

        Android() {
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

    static class IOS extends Platform {
        final NSOperationQueue mainQueue;

        IOS() {
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

    static class Unknown extends Platform {
        @Override
        PlatformType getPlatformType() {
            return PlatformType.Unknown;
        }

        @Override
        public void runOnUIThread(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
