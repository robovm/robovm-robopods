# Crashlytics iOS Framework

# RoboVM Configuration
In addition to adding the robopod and framework dependencies, you need to configure Robovm to report uncaught exceptions as crashes. Call `org.robovm.apple.foundation.NSException#registerDefaultJavaUncaughtExceptionHandler` in `com.badlogic.gdx.backends.iosrobovm.IOSApplication.Delegate#didFinishLaunching`.
