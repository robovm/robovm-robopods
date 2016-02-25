# Google+ SignIn iOS

## Sample app

TBD

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK from https://developers.google.com/identity/sign-in/ios/sdk/
2. Put the `GoogleSignIn.framework` folder in your iOS project's `libs/` folder
3. Put the `GoogleSignIn.bundle` in your iOS project's `resources/` folder
4. Add the following to your `robovm.xml`

```
<config>
    ...
    <resources>
        ...
        <resource>
            <directory>resources</directory>
        </resource>
    </resources>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>GoogleSignIn</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-google-signin-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-google-signin-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

TBD