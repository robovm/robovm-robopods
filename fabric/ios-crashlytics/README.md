# Crashlytics iOS Framework

### RoboVM Configuration
In addition to adding the robopod and framework dependencies, Crashlytics requires the following symbols to run. Add these into `robovm.xml`

```
    <exportedSymbols>
        <symbol>CLS*</symbol>
    </exportedSymbols>
```

Forward uncaught runtime exceptions to Crashlytics crash reporter by calling `org.robovm.apple.foundation.NSException#registerDefaultJavaUncaughtExceptionHandler` in `com.badlogic.gdx.backends.iosrobovm.IOSApplication.Delegate#didFinishLaunching`.
