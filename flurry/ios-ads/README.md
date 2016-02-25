# Flurry Advertising iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/flurry/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party library manually:

1. Download the SDK for iOS from https://dev.flurry.com
2. Put the `libFlurryAds_X.X.X.a` file in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <libs>
        <lib>libs/libFlurryAds_X.X.X.a</lib>
    </libs>
</config>
```

Change `X.X.X` with the version number of the library.

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-flurry-ios-ads:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-flurry-ios-ads</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can display any ads, you have to setup the SDK.

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

##### Having trouble?

- Make sure you have setup an app in your Flurry [dashboard](https://dev.flurry.com/home.do)
and specified the correct `API_KEY`.
- Check your logs for any errors, like network failures.

##### Next steps

- Load and display advertisements in your app: [Link](#display-ads)
- Read the official Flurry documentation: [Link](https://developer.yahoo.com/flurry/docs/)

### Display ads

Cache and display ads.

#### Interstitials

Create a new instance of `FlurryAdInterstitial` and store it as a member variable:

```Java
adInterstitial = new FlurryAdInterstitial("AD_SPACE_NAME");
```

Change `AD_SPACE_NAME` with the one you setup in your Flurry [dashboard](https://dev.flurry.com/home.do).

You can optionally listen for certain events by setting the ad delegate:

```Java
adInterstitial.setAdDelegate(new FlurryAdInterstitialDelegateAdapter() {
    @Override
    public void didFetchAd(FlurryAdInterstitial interstitialAd) {
        // You can choose to present the ad as soon as it is received.
        // adInterstitial.present(viewController);
    }

    @Override
    public void didDismiss(FlurryAdInterstitial interstitialAd) {
        // Ideal time to fetch a new ad.
        adInterstitial.fetchAd();
    }

    @Override
    public void didFail(FlurryAdInterstitial interstitialAd, FlurryAdError adError, NSError errorDescription) {
        // Ideal time to fetch a new ad.
        adInterstitial.fetchAd();
    }
});
```

To be able to display an ad later, you have to fetch an ad first. Do this as early as possible.

```Java
adInterstitial.fetchAd();
```

To display the interstitial use the following code:

```Java
if (adInterstitial.isReady()) {
    adInterstitial.present(viewController);
} else {
    adInterstitial.fetchAd();
}
```

You have to pass a `UIViewController` when presenting the ad. Ideally you should setup the interstitial
in a view controller subclass and specify `this`.  

If you're developing a __libGDX__ game you can just use the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

#### Banners

Create a new instance of `FlurryAdBanner` and store it as a member variable:

```Java
adBanner = new FlurryAdBanner("AD_SPACE_NAME");
```

Change `AD_SPACE_NAME` with the one you setup in your Flurry [dashboard](https://dev.flurry.com/home.do).

You can optionally listen for certain events by setting the ad delegate:

```Java
adBanner.setAdDelegate(new FlurryAdBannerDelegateAdapter() {
    @Override
    public void didFetchAd(FlurryAdBanner bannerAd) {
        // If you used fetchAd(CGRect) you should display the banner now.
        // adBanner.displayAd(viewController.getView(), viewController);
    }

    @Override
    public void didFail(FlurryAdBanner bannerAd, FlurryAdError adError, NSError errorDescription) {
        // Ideal time to fetch a new ad.
        adBanner.fetchAd(getView().getFrame());
    }
});
```

To be able to display an ad later, you have to fetch an ad first. Do this as early as possible.

```Java
// You can either only fetch the ad and display at a later time;
adBanner.fetchAd(viewController.getView().getFrame());
// Or you fetch and display the ad ASAP.
adBanner.fetchAndDisplayAd(viewController.getView(), viewController);
```

You have to pass a `UIView` and `UIViewController` when presenting the ad. Ideally you should setup 
the banner in a view controller subclass and specify `this.getView()` and `this`.  
If you're developing a __libGDX__ game you can just get the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

#### Try it out!

Add the code for interstitials and banners to your app. If you want to see test ads, you can specify
special targeting options on your ad instance:

```Java
FlurryAdTargeting targeting = new FlurryAdTargeting();
targeting.setTestAdsEnabled(true);

ad.setTargeting(targeting);
```

Run the app and display the ads. With test ads enabled you should always see an ad.

##### Having trouble?

- Make sure you have setup the Flurry SDK: [Link](#sdk-setup)
- Make sure you have setup your app in your Flurry dashboard: [Link](https://dev.flurry.com/home.do)
- Check your logs for any errors, like network failures.

##### Next steps

- Now that you have setup Flurry ads, why not log some events for analytics? [Link](../ios-analytics)
- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/flurry/ios)
- Read the official Flurry documentation: [Link](https://developer.yahoo.com/flurry/docs/)