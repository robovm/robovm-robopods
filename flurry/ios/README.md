# Flurry iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/flurry/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party library manually:

1. Download the SDK for iOS from https://dev.flurry.com
2. Put the `libFlurryAds_X.X.X.a` file in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFlurryAds_X.X.X.a</lib>
    </libs>
</config>
```

Change `X.X.X` with the version number of the library.

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-flurry-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-flurry-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

This RoboPod includes both Flurry Analytics and Flurry Advertising.

__Analytics:__ [Link](../ios-analytics)
__Advertising:__ [Link](../ios-ads)

## Official documentation

[Link](https://developer.yahoo.com/flurry/docs/)