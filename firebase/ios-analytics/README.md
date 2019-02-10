# Firebase iOS Analytics framework

Firebase Analytics is a free, out-of-the-box analytics solution that inspires actionable insights based on app usage and user engagement.

This robopod includes Core and InstanceID frameworks as well.

## Install Instructions

1. Firebase is a large library (+500MB) divided in sub modules, each of them including several frameworks.
Download ZIP with frameworks from here: [Link](https://firebase.google.com/docs/ios/setup#frameworks)
2. Unzip, go into 'Analytics' subdirectory and copy all of the frameworks into the libs folder inside your RoboVM project.
3. Add the following to your `robovm.xml`
```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>FIRAnalyticsConnector</framework>
        <framework>FirebaseAnalytics</framework>
        <framework>FirebaseCore</framework>
        <framework>FirebaseCoreDiagnostics</framework>
        <framework>FirebaseInstanceID</framework>
        <framework>GoogleAppMeasurement</framework>
        <framework>GoogleUtilities</framework>
        <framework>nanopb</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-firebase-ios-analytics:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-firebase-ios-analytics</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

#### Configure project

Download 'GoogleService-Info.plist' from Firebase Console and put it into data/ folder of your RoboVM project.

#### Connect Application Delegate

In your `AppDelegate` add the following calls to `didFinishLaunching(...)`:

```Java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    FIRApp.configure()
    return true;
}
```

##### Next steps
- Read the official Firebase Analytics documentation: [Link](https://firebase.google.com/docs/analytics/ios/start)
- Read the official Firebase Core documentation: [Link](https://firebase.google.com/docs/ios)

