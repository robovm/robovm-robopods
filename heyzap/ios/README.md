# Heyzap on iOS

## Instructions

### Initialize the SDK

In your application delegate's `didFinishLaunching(...)` method, start the Heyzap SDK:

```Java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    super.didFinishLaunching(application, launchOptions);

    HeyzapAds.start("YOUR_PUBLISHER_ID");
    
    return true;
}
```

### Integrate 3rd Party ad networks

You can use all ad networks that you setup in your mediation dashboard.
Use the following link to download all SDKs of ad networks you want to integrate:

> https://developers.heyzap.com/docs/ios_sdk_setup_and_requirements

Copy the `.framework` or `.a` files into your project `libs/` folder.
Also add an entry for each framework and library in your `robovm.xml`.

```xml
<frameworks>
    <framework>UnityAds</framework>
</frameworks>
<libs>
    <lib>libs/libAppLovinSdk.a</lib>
</libs>
```

Ad networks that are available as RoboPods (like Chartboost or Facebook Audience Network) should be added as a Maven/Gradle dependency instead.

### Test integration

You can use the Mediation Test Suite to check if all networks are correctly setup.

To use the Mediation Test Suite, simply call `presentMediationDebugViewController()` after you start the SDK and have setup a root view controller:

```Java
@Override
public boolean didFinishLaunching(UIApplication application, UIApplicationLaunchOptions launchOptions) {
    super.didFinishLaunching(application, launchOptions);
    
    HeyzapAds.start("YOUR_PUBLISHER_ID");
    
    HeyzapAds.presentMediationDebugViewController();
    
    return true;
}
```

### Show Ads

#### Interstitial Ads

```Java
// InterstitialAds are automatically fetched from the server
HZInterstitialAd.show();
```

#### Video Ads

```Java
// As early as possible, and after showing a video, call fetch
HZVideoAd.fetch();

// Later, such as after a level is completed
HZVideoAd.show();
```

#### Rewarded Video Ads

```Java
// As early as possible, and after showing a rewarded video, call fetch
HZIncentivizedAd.fetch();

// Later, such as after a level is completed
HZIncentivizedAd.show();
```

#### Banner Ads

```Java
HZBannerAdOptions options = new HZBannerAdOptions();
HZBannerAd.placeBannerInView(getView(),
        HZBannerPosition.Bottom,
        options,
        banner -> {
            // SUCCESS
        },
        error -> {
            // ERROR
        });
```

## Sample

TODO