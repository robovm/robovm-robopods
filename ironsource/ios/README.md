# IronSource iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from "Manual Download" section on https://developers.ironsrc.com/ironsource-mobile/ios/ios-sdk/#step-1
2. Put the `IronSource.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>IronSource</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-ironsource-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-ironsource-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

##### Next steps

- Read the official IronSource iOS documentation to learn about how to Init and Configure the SDK: [Link](https://developers.ironsrc.com/ironsource-mobile/ios/ios-sdk/#step-1)
- Read the official documentation on how to use Mediation [Link](https://developers.ironsrc.com/ironsource-mobile/ios/mediation-networks-ios/#step-1)

Adapters must be added as any other framework by copying the .framework file to /libs and referencing it on robovm.xml <frameworks> block.
