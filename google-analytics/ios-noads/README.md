# Google Analytics iOS (without ad support)

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/google-analytics/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party libraries manually:

1. Download the SDK from https://developers.google.com/analytics/devguides/collection/ios/v3/sdk-download
2. Put the `libGoogleAnalyticsServices.a` file in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libGoogleAnalyticsServices.a</lib>
    </libs>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-google-analytics-ios-noads:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-google-analytics-ios-noads</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Use Google Analytics without ad support

If you are planning to use ads in your app, you should use the `robopods-google-analytics-ios` artifact.

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-google-analytics-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-google-analytics-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Google Analytics does not require SDK initialization to allow you to track events.  
However it is highly recommended to use a _Google Service configuration file_ if you plan on using more 
Google services than just Analytics. You will then have all your keys in one place.

#### Use a Google Service configuration file

Go to [Google Developers](https://developers.google.com/mobile/add?platform=ios) and follow the instruction to create your 
configuration file.

Copy the generated file to a resource folder of your app that will get bundled with your app 
(the folder should be specified as a resource in your `robovm.xml`).

Add the following code to your application's entry point, typically `didFinishLaunching()`
in your app delegate.

```Java
try {
    GGLContext.getSharedInstance().configure();
} catch (NSErrorException e) {
    System.err.println("Error configuring the Google context: " + e.getError());
}
```

Now all your Google services are setup.

#### Enable debug logging

When setting up a Google service it's very helpful to get logs.  
Add the following code to your application's entry point, typically `didFinishLaunching()` 
in your app delegate.

```Java
GAI gai = GAI.getSharedInstance();
gai.getLogger().setLogLevel(GAILogLevel.Verbose);
```

__Note:__ Don't forget to disable debug logging when you release your app!

#### Crash reporting

To enable crash reporting run the following code (preferably as early as possible in your app):

```Java
GAI gai = GAI.getSharedInstance();
gai.enableCrashReporting();
```

__Note:__ You can only have one (1!) crash reporting service in your app! If you use multiple crash reporters no crashes will be reported!


##### Having trouble?

- Make sure you have setup your app in your [Google Play Developer Console](https://play.google.com/apps/publish/).
- Check your logs for any errors, like network failures.

##### Next steps

- Track custom events in your app: [Link](#track-events)
- Read the official Google Analytics iOS documentation: [Link](https://developers.google.com/analytics/devguides/collection/ios/)


### Track events

Gather analytics data for your app.

#### Event Tracker

To track any events you have to obtain an instance of `GAITracker`.  
If you setup Google Analytics with a configuration file you can get the default tracker:

```Java
GAITracker tracker = GAI.getSharedInstance().getDefaultTracker();
```

If you want a specific tracker use the following code:

```Java
GAITracker tracker = GAI.getSharedInstance().getTracker("MY-TRACKER-ID");
```

#### Create events

Now it's time to create the event. Events are just maps of keys and values stored in a `NSDictionary`. 
There are two ways to build the event dictionary:

A. Manually create a `NSMutableDictionary` and fill it. Use the the fields in `GAIFields` and `GAIEcommerceFields` as keys:

```Java
NSDictionary<?, ?> event = new NSMutableDictionary<>();
event.put(GAIFields.EventCategory(), "ui_action");    // Event category (required)
event.put(GAIFields.EventAction(),   "button_press"); // Event action (required)
event.put(GAIFields.EventLabel(),    "play");         // Event label
event.put(GAIFields.EventValue(),    10);             // Event value
```

B. Use the handy `GAIDictionaryBuilder`:

```Java
NSDictionary<?, ?> event = GAIDictionaryBuilder
    .createEvent("ui_action",       // Event category (required)
                 "button_press",    // Event action (required)
                 "play",            // Event label
                 null).build();     // Event value
```

#### Global event parameters

If you have parameters that you want to send with every event you can specify them directly on the tracker:

```Java
tracker.put(GAIFields.ScreenName(), "Home Screen");
```

#### Send events

With the tracker and the event in place, we only need to send the event:

```Java
tracker.send(event);
```

#### Try it out!

Run your app and trigger some event tracking code. If you enabled debug logging, you should see logs confirming your event tracking.

##### Having trouble?

- Make sure you have setup your app in your [Google Play Developer Console](https://play.google.com/apps/publish/).
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/google-analytics/ios)
- Read the official Google Analytics iOS documentation: [Link](https://developers.google.com/analytics/devguides/collection/ios/)