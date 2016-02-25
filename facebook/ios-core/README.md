# Facebook iOS CoreKit framework

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios-core:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios-core</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can do anything with Facebook, you have to setup the SDK.

#### Configure project

First open your project's `robovm.properties` file and add an entry for your facebook ID and app name as defined in your Facebook [dashboard](https://developers.facebook.com/apps):

```
fb.id=1234123412341234
fb.name=My App Name
```

Now open up your `Info.plist.xml` and add the following entries:

```plist
<key>FacebookAppID</key>
<string>${fb.id}</string>
<key>FacebookDisplayName</key>
<string>${fb.name}</string>
<key>CFBundleURLTypes</key>
<array>
    <dict>
        <key>CFBundleURLSchemes</key>
        <array>
            <string>fb${fb.id}</string>
        </array>
    </dict>
</array>
```

If your app should support iOS 9+ you will be affected by [App Transport Security](https://developer.apple.com/library/prerelease/ios/technotes/App-Transport-Security-Technote/). 
You will either have to whitelist Facebook domains or allow arbitrary loads.

Add the following entries if you want to whitelist especially Facebook domains:

```plist
<key>NSAppTransportSecurity</key>
<dict>
    <key>NSExceptionDomains</key>
    <dict>
        <key>facebook.com</key>
        <dict>
            <key>NSIncludesSubdomains</key>
            <true />
            <key>NSThirdPartyExceptionRequiresForwardSecrecy</key>
            <false />
        </dict>
        <key>fbcdn.net</key>
        <dict>
            <key>NSIncludesSubdomains</key>
            <true />
            <key>NSThirdPartyExceptionRequiresForwardSecrecy</key>
            <false />
        </dict>
        <key>akamaihd.net</key>
        <dict>
            <key>NSIncludesSubdomains</key>
            <true />
            <key>NSThirdPartyExceptionRequiresForwardSecrecy</key>
            <false />
        </dict>
    </dict>
</dict>
```

If you plan to access multiple different domains in your app, it's easier to specify the following instead:

```plist
<key>NSAppTransportSecurity</key>
<dict>
    <key>NSAllowsArbitraryLoads</key>
    <true />
</dict>
```

#### Connect Application Delegate

To post process the results from Facebook Login or Facebook Dialogs (or any action that requires switching over to the native Facebook app or Safari) 
you need to connect your `AppDelegate` to the `FBSDKApplicationDelegate`.  
Add the following calls to `didFinishLaunching(...)` and `openURL(...)`:

```Java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    FBSDKApplicationDelegate.getSharedInstance().didFinishLaunching(application, launchOptions);
    return true;
}

@Override
public boolean openURL(UIApplication application, NSURL url, String sourceApplication, NSPropertyList annotation) {
    return FBSDKApplicationDelegate.getSharedInstance().openURL(application, url, sourceApplication, annotation);
}
```

##### Having trouble?

- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Track app events (important for install tracking): [Link](#event-tracking)
- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/ios/getting-started/)

### Event tracking

Track important app events and take advantage of Facebook's incredible analytics tools.

#### Startup

Logging app activations as an App Event enables almost all other functionality and should be the first thing that you add to your app. 
The SDK provides a helper method to log app activation. By logging an activation event, you can observe how frequently users activate
your app, how much time they spend using it, and view other demographic information through [Facebook Analytics for Apps](https://www.facebook.com/analytics).

Add the following piece of code to your app delegate's `didBecomeActive(...)` method:

```Java
@Override
public void didBecomeActive(UIApplication application) {
    FBSDKAppEvents.activateApp();
}
```

#### Purchase

Logging purchase events helps you greatly to identify your most valuable users.  
Use the following method to track a purchase amount and currency (ISO 4217 currency code):

```Java
FBSDKAppEvents.logPurchase(4.32, "USD");
```

#### Other Events

You can track many different predefined and custom events with Facebook.  
Simply use the `FBSDKAppEvents.logEvent(...)` method. The `FBSDKAppEventName` and `FBSDKAppEventParameterName` classes give you access 
to many predefined events and parameters.

```Java
FBSDKAppEvents.logEvent(FBSDKAppEventName.SpentCredits, 10);
```

#### Try it out!

Add code for tracking several events and run your app. Then go to your [Analytics Dashboard](https://www.facebook.com/analytics) and 
check if the events got tracked.

##### Having trouble?

- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/ios/getting-started/)

