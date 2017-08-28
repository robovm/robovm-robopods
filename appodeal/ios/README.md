# Appodeal iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from https://www.appodeal.com/sdk
2. Put the `Appodeal.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-appodeal-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-appodeal-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

### Next steps

- Read the official Appodeal iOS documentation.
