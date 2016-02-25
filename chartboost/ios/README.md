# Chartboost iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/chartboost/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK from https://answers.chartboost.com/hc/en-us/articles/201220095
2. Put the `Chartboost.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>Chartboost</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-chartboost-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-chartboost-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can display any ads, you have to setup the SDK.

#### Start Chartboost in your app

Add the following code to your application's entry point, typically `didFinishLaunching()`
in your app delegate.

```Java
Chartboost.start("APP_ID", "APP_SIGNATURE", delegate);
```

Change the `APP_ID` and `APP_SIGNATURE` with your app specific data that you can find in the
Chartboost [dashboard](https://dashboard.chartboost.com/). You can also specify a delegate if you want to listen for
certain events, like ad display or failures.

##### Having trouble?

- Make sure you have setup an app in your Chartboost dashboard and specified the correct
`APP_ID` and `APP_SECRET`.
- Check your logs for any errors, like network failures.

##### Next steps

- Load and display advertisements in your app: [Link](#display-ads)
- Read the official Chartboost iOS documentation: [Link](https://answers.chartboost.com/hc/en-us/articles/201220095)

### Display ads

Cache and display ads.

#### Interstitials

To show a static or interstitial video ad add the following code:

```Java
Chartboost.showInterstitial(CBLocation.HomeScreen);
```

The first method parameter tells Chartboost the location where the interstitial is shown in your game.

__Note:__ Chartboost calls should __always__ be made from the main - not background - thread: These calls may time out otherwise. 

#### Rewarded video ad

To show a rewarded video ad add the following code:

```Java
Chartboost.showRewardedVideo(CBLocation.HomeScreen);
```

The first method parameter tells Chartboost the location where the interstitial is shown in your game.

You should typically cache a video ad before displaying it:

```Java
Chartboost.cacheRewardedVideo(CBLocation.HomeScreen);

...

if (Chartboost.hasRewardedVideo(CBLocation.HomeScreen)) {
    Chartboost.showRewardedVideo(CBLocation.HomeScreen);
} else {
    // We don't have a cached video right now, but try to get one for next time
    Chartboost.cacheRewardedVideo(CBLocation.HomeScreen);
}
```

If you want to reward your user after he watched the rewarded video, implement the required method in the delegate you specified when setting up the SDK:

```Java
new ChartboostDelegateAdapter() {
    @Override
    public void didCompleteRewardedVideo(String location, int reward) {
        // Reward your user
    }
}
```

__Note:__ Chartboost calls should __always__ be made from the main - not background - thread: These calls may time out otherwise. 

#### Try it out!

Add the code where you want to see interstitials or video ads and run the app. You should always see at least test ads, if you setup everything correctly.

##### Having trouble?

- Make sure you have started the Chartboost SDK: [Link](#sdk-setup)
- Make sure you call all Chartboost methods on the main thread.
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/chartboost/ios)
- Read the official Chartboost iOS documentation: [Link](https://answers.chartboost.com/hc/en-us/articles/201220095)