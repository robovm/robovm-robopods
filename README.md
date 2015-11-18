# RoboPods

RoboPods are high-quality RoboVM code modules and bindings for the most popular 3rd party services 
like social media integration, ad networks or crash reporting. 
Currently these are iOS only but we are working hard to provide cross-platform solutions 
to your most favorite app services.

## Usage

A RoboPod comes in form of a simple JAR file published via Maven Central so you can easily 
integrate it via Maven or Gradle.
Just add a depencency to your maven or gradle files and you are ready to go!

For example, if you want to integrate Facebook in your iOS project, just add the following

### Gradle

to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios:1.9.0"
}
```

### Maven

to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios</artifactId>
   <version>1.9.0</version>
</dependency>
```

### Snapshot versions

If you want to use the latest and greatest of every RoboPod, use the latest snapshot version for your dependencies:

> 1.9.1-SNAPSHOT

To prevent compatibility issues make sure you also use the same RoboVM version.

## List of available RoboPods for iOS

|                  Name                   | Version | Dependency                                      |
|-----------------------------------------|:-------:|-------------------------------------------------|
| [Bolts](bolts/)                         | 1.2.2   | org.robovm:robopods-bolts-ios:1.9.0             |
| [Chartboost](chartboost/)               | 6.0.1   | org.robovm:robopods-chartboost-ios:1.9.0        |
| [Facebook](facebook/)                   | 4.7.1   | org.robovm:robopods-facebook-ios:1.9.0          |
| [Flurry](flurry/)                       | 7.3.0   | org.robovm:robopods-flurry-ios:1.9.0            |
| [Google Analytics](google-analytics/)   | 3.14    | org.robovm:robopods-google-analytics-ios:1.9.0  |
| [Google APIs](google-apis/)             |         | org.robovm:robopods-google-apis-ios:1.9.0       |
| [Google Mobile Ads](google-mobile-ads/) | 7.5.2   | org.robovm:robopods-google-mobile-ads-ios:1.9.0 |
| [Google Play Games](google-play-games/) | 2.0     | org.robovm:robopods-google-play-games-ios:1.9.0 |
| [Google Plus](google-plus/)             | 1.7.1   | org.robovm:robopods-google-plus-ios:1.9.0       |
| [Google SignIn](google-signin/)         | 2.4.0   | org.robovm:robopods-google-signin-ios:1.9.0     |
| [Heyzap](heyzap/)                       | 9.2.7   | org.robovm:robopods-heyzap-ios:1.9.0            |
| [Parse](parse/)                         | 1.9.1   | org.robovm:robopods-parse-ios:1.9.0             |
| [Reachability](reachability/)           | 1.0     | org.robovm:robopods-reachability-ios:1.9.0      |