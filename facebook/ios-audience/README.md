# Facebook iOS AudienceNetwork framework

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)

## Install Instructions

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-facebook-ios-audience:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-facebook-ios-audience</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### Display ads

Cache and display ads.

#### Interstitials

Create a new instance of `FBInterstitialAd` and store it as a member variable:

```Java
adInterstitial = new FBInterstitialAd("MY_PLACEMENT_ID");
```

Change `MY_PLACEMENT_ID` with the one you setup in your Facebook [dashboard](https://developers.facebook.com/apps).

You can optionally listen for certain events by setting the ad delegate:

```Java
adInterstitial.setDelegate(new FBInterstitialAdDelegateAdapter() {
    @Override
    public void didLoad(FBInterstitialAd interstitialAd) {
        // Ad is loaded and ready to be displayed!
    }

    @Override
    public void didFail(FBInterstitialAd interstitialAd, NSError error) {
        System.err.println("Ad failed to load: " + error);
    }
});
```

To be able to display an ad later, you have to fetch an ad first. Do this as early as possible.

```Java
adInterstitial.loadAd();
```

When the ad is loaded, display it with the following code:

```Java
adInterstitial.showAd(viewController);
```

You have to pass a `UIViewController` when presenting the ad. Ideally you should setup the interstitial
in a view controller subclass and specify `this`.  

If you're developing a __libGDX__ game you can just use the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

#### Banners

Create a new instance of `FBAdView` and store it as a member variable:

```Java
adBanner = new FBAdView("PLACEMENT_ID", FBAdSize.Height50Banner(), viewController);
```

Change the first parameter with the placement id you have setup in your Facebook [dashboard](https://developers.facebook.com/apps).  

Specify the desired `FBAdSize` in the second parameter.

In the last parameter specify the `UIViewController` where the banner will be added. Ideally you should setup the interstitial
in a view controller subclass and specify `this`.  

If you're developing a __libGDX__ game you can just use the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

Now add the banner to your view hierarchy. Use the view of the view controller you just specified.

```Java
viewController.getView().addSubview(adBanner);
```

You can optionally listen for certain events by setting the ad delegate:

```Java
aadBanner.setDelegate(new FBAdViewDelegateAdapter() {
    @Override
    public void didLoad(FBAdView adView) {
        // Ad was loaded and will be displayed!
    }

    @Override
    public void didFail(FBAdView adView, NSError error) {
        System.err.println("Ad failed to load: " + error);
    }
});
```

Before an ad will be displayed, you have to load it. Do this as early as possible.

```Java
adBanner.loadAd();
```

#### Try it out!

Add the code for interstitials and banners to your app. If you want to see test ads on your device, 
add the following code and specify your device's ID:

```Java
FBAdSettings.addTestDevice("DEVICE_ID");
```

Run the app and display the ads. With test ads enabled you should always see an ad.

##### Having trouble?

- Make sure you have setup your app in your Facebook dashboard: [Link](https://developers.facebook.com/apps)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/facebook/ios)
- Read the official Facebook documentation: [Link](https://developers.facebook.com/docs/audience-network)