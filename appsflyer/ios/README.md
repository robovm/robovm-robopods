# AppsFlyer iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from https://support.appsflyer.com/hc/en-us/articles/207032066-iOS-SDK-integration-for-developers#introduction
2. Put the `AppsFlyerLib.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    ...
    <frameworks>
        <framework>AppsFlyerLib</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-appsflyer-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-appsflyer-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

### Next steps

- Read the official AppsFlyer iOS documentation.
