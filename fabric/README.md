# RoboPods for Fabric

## Available RoboPods

| Platform                                  | Version | Description                  |
|-------------------------------------------|---------|------------------------------|
| [ios](ios/)                               | 1.6.8   | Fabric iOS binding           |
| [ios-answers](ios-answers/)               | 1.2.2   | Answers iOS binding          |
| [ios-crashlytics](ios-crashlytics/)       | 3.7.3   | Crashlytics iOS binding      |
| [ios-digits](ios-digits/)                 | 2.4.0   | DigitsKit iOS binding        |
| [ios-mopub](ios-mopub/)                   | 4.8.0   | MoPub iOS binding            |
| [ios-twitter](ios-twitter/)               | 2.4.0   | TwitterKit iOS binding       |
| [ios-twittercore](ios-twittercore/)       | 2.4.0   | TwitterCore iOS binding      |

## Official website

https://fabric.io/

## Getting started

### Make app available in the Fabric.io dashboard

* Download `Fabric.app` and integrate Fabric in a dummy Xcode project using `Fabric.app`.  This dummy app must have the  `Bundle Identifier` of the Robovm app.
* Run the Xcode dummy app once on a device.
* App should now become visible in the Fabric.io dashboard within minutes.

### Integrate in Robovm app

* Download libraries from Fabric website (don't use CocoaPods, as they need manual processing; website download `com.twitter.crashlytics.ios-manual.zip` contains .framework directories that can be used in Robovm unmodified)
* Add Fabric RoboPods to `pom.xml` / `build.gradle`
* In IosApplication.Delegate.didFinishLaunching, initialize Fabric (using `Fabric.with`)

## Further reading

* Also check the README files of the various Fabric RoboPods for specific instructions per Pod.
 