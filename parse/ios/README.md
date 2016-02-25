# Parse iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/parse/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party frameworks manually:

1. Download the SDK for iOS from https://parse.com/docs/downloads
2. Put the `Parse.framework`, `ParseFacebookUtilsV4.framework` and `ParseUI.framework` folders in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>Parse</framework>
        <framework>ParseFacebookUtilsV4</framework>
        <framework>ParseTwitterUtils</framework>
        <framework>ParseUI</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-parse-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-parse-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Important notes

The Parse service is going offline. We strongly advise to look for alternative services for your app. 
This site has a good list of alternatives: [Link](https://github.com/relatedcode/ParseAlternatives)

## Official documentation

[Link](https://www.parse.com/docs)