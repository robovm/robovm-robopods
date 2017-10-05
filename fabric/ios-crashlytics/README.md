# Crashlytics iOS Framework

### RoboVM Configuration
In addition to adding the robopod and framework dependencies, Crashlytics requires the following symbols to run. Add these into `robovm.xml`

```
    <exportedSymbols>
        <symbol>CLS*</symbol>
    </exportedSymbols>
```

You need to configure Robovm to report uncaught exceptions as crashes. Call `org.robovm.apple.foundation.NSException#registerDefaultJavaUncaughtExceptionHandler` in `com.badlogic.gdx.backends.iosrobovm.IOSApplication.Delegate#didFinishLaunching`.

### Initialization
```java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    super.didFinishLaunching(application, launchOptions);
    Fabric.with(Crashlytics.class);
    return true;
}
```
Additionally you can add this line to enable debug:
```java
Crashlytics.getSharedInstance().setDebugMode(true);
```
