# Flurry Analytics iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/flurry/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party library manually:

1. Download the SDK for iOS from https://dev.flurry.com
2. Put the `libFlurry_X.X.X.a` file in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFlurry_X.X.X.a</lib>
    </libs>
</config>
```

Change `X.X.X` with the version number of the library.

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-flurry-ios-analytics:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-flurry-ios-analytics</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can track any events, you have to setup the SDK.

#### Start Flurry in your app

Add the following code to your application's entry point, typically `didFinishLaunching()`
in your app delegate.

```Java
Flurry.startSession("API_KEY");
```

Change the `API_KEY` with your key that you can find in your Flurry [dashboard](https://dev.flurry.com/home.do).

#### Enable debug logging

When setting up Flurry it's very helpful to get logs.  
Add the following code before starting Flurry:

```Java
Flurry.setDebugLogEnabled(true);
Flurry.setLogLevel(FlurryLogLevel.All); // Adjust level to your needs.

...

Flurry.startSession("API_KEY");
```

__Note:__ Don't forget to disable debug logging when you release your app!

#### Crash reporting

To enable crash reporting add the following code before starting Flurry:

```Java
Flurry.enableCrashReporting();

...

Flurry.startSession("API_KEY");
```

__Note:__ You can only have one (1!) crash reporting service in your app! If you use multiple crash reporters no crashes will be reported!

##### Having trouble?

- Make sure you have setup an app in your Flurry [dashboard](https://dev.flurry.com/home.do)
and specified the correct `API_KEY`.
- Check your logs for any errors, like network failures.

##### Next steps

- Track custom events in your app: [Link](#track-events)
- Read the official Flurry documentation: [Link](https://developer.yahoo.com/flurry/docs/)

### Track events

Gather analytics data for your app by tracking custom events.

#### Custom events

Add the following code to track your event:

```Java
Flurry.logEvent("Event Name");
```

You can also specify up to 10 additional parameters:

```Java
Map<String, String> params = new HashMap<>();
params.put("some_parameter", "value");

Flurry.logEvent("Event Name", params);
```

You can also track the duration for an event:

```Java
// Start the timed event.
Flurry.logEvent("Timed Event", true);

...

// Later, end the timed event.
Flurry.endTimedEvent("Timed Event");
```

#### Try it out!

Run your app and trigger some event tracking code. If you enabled debug logging, you should see logs confirming your event tracking.

##### Having trouble?

- Make sure you have setup the Flurry SDK: [Link](#sdk-setup)
- Make sure you have setup your app in your Flurry dashboard: [Link](https://dev.flurry.com/home.do)
- Check your logs for any errors, like network failures.

##### Next steps

- Now that you have setup Flurry Analytics, why not display some ads? [Link](../ios-ads)
- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/flurry/ios)
- Read the official Flurry documentation: [Link](https://developer.yahoo.com/flurry/docs/)