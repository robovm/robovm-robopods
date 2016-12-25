# Yandex AppMetrica iOS

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from https://tech.yandex.com/metrica-mobile-sdk/doc/mobile-sdk-dg/tasks/ios-quickstart-docpage/
2. Put the `YandexMobileMetrica.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>YandexMobileMetrica.framework</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-appmetrica-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-appmetrica-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can display any ads, you have to setup the SDK.

#### Start AppMetrica in your app

Add the following code to your application's entry point:

```Java
String apiKey = "<YOU API KEY>";
YMMYandexMetricaConfiguration configuration = new YMMYandexMetricaConfiguration(apiKey);
configuration.setSessionTimeout(60); // set session timeout in seconds
configuration.setReportCrashesEnabled(true);
YMMYandexMetrica.activate(configuration);

// if you would like to report crashes, happened in you java code, then don't forget to register default handler:
NSException.registerDefaultJavaUncaughtExceptionHandler();

```

##### Next steps

- Read the official Appmetrica iOS documentation: [Link](https://tech.yandex.com/metrica-mobile-sdk/doc/mobile-sdk-dg/concepts/ios-operations-docpage/)
