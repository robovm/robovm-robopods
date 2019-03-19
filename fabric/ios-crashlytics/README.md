# Crashlytics iOS Framework

### RoboVM Configuration
In addition to adding the robopod and framework dependencies, Crashlytics requires the following symbols to run. Add these into `robovm.xml`

```
    <exportedSymbols>
        <symbol>CLS*</symbol>
    </exportedSymbols>
```

### Initialization

Use `Signals.installSignals()` to initialize Crashlytics. More information is available [in this blog post](https://dkimitsa.github.io/2019/02/21/mach-exception-handler-and-crashlytics/).

You need to configure Robovm to report uncaught exceptions as crashes. Call `org.robovm.apple.foundation.NSException#registerDefaultJavaUncaughtExceptionHandler` in `com.badlogic.gdx.backends.iosrobovm.IOSApplication.Delegate#didFinishLaunching`.

```java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    super.didFinishLaunching(application, launchOptions);
    Signals.installSignals(() -> {
        Fabric.with(Crashlytics.class);
    }, true);
    NSException.registerDefaultJavaUncaughtExceptionHandler();
    return true;
}
```

Additionally you can add this line to enable debug:
```java
Crashlytics.getSharedInstance().setDebugMode(true);
```

### Uploading dSYMs
Fabric includes a tool to automatically upload your project's dSYM files on each build, but this only works for XCode projects.

dSYM files can be uploaded manually through the Fabric console, once the first unsymbolicated crash reports have been received. To do this, follow the instructions from [the official Fabric documentation](https://docs.fabric.io/apple/crashlytics/missing-dsyms.html#uploading-missing-dsyms).

This process can also be automated. For this, you can use the `upload-symbols` script included with the Fabric OS X app. Typical usage is as follows:

```sh
/Applications/Fabric.app/Contents/MacOS/upload-symbols -a <api-key> -p ios robovm/build/robovm/<your-app-name>.dSYM
```

More info on `upload-symbols` script is available [in the Fabric docs](https://docs.fabric.io/apple/crashlytics/missing-dsyms.html#upload-symbols-script).
