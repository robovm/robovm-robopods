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
   compile "org.robovm:robopods-facebook-ios:1.6.0"
}
```

### Maven

to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios</artifactId>
   <version>1.6.0</version>
</dependency>
```

## List of available RoboPods for iOS

|                  Name                   | Version | Dependency                                      |
|-----------------------------------------|:-------:|-------------------------------------------------|
| [Bolts](bolts/)                         | 1.1.5   | org.robovm:robopods-bolts-ios:1.6.0             |
| [Chartboost](chartboost/)               | 5.5.0   | org.robovm:robopods-chartboost-ios:1.6.0        |
| [Facebook](facebook/)                   | 4.3.0   | org.robovm:robopods-facebook-ios:1.6.0          |
| [Flurry](flurry/)                       | 6.6.0   | org.robovm:robopods-flurry-ios:1.6.0            |
| [Google Analytics](google-analytics/)   | 3.12    | org.robovm:robopods-google-analytics-ios:1.6.0  |
| [Google APIs](google-apis/)             |         | org.robovm:robopods-google-apis-ios:1.6.0       |
| [Google Mobile Ads](google-mobile-ads/) | 7.3.1   | org.robovm:robopods-google-mobile-ads-ios:1.6.0 |
| [Google Play Games](google-play-games/) | 1.4.1   | org.robovm:robopods-google-play-games-ios:1.6.0 |
| [Parse](parse/)                         | 1.7.4   | org.robovm:robopods-parse-ios:1.6.0             |