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
   compile "org.robovm:robopods-facebook-ios:1.0.0-SNAPSHOT"
}
```

### Maven

to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios</artifactId>
   <version>1.0.0-SNAPSHOT</version>
</dependency>
```

