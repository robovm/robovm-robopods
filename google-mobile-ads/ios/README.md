# Google Mobile Ads iOS (a.k.a. Admob)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party frameworks manually:

1. Download the SDK Zip file from https://developers.google.com/admob/ios/download
2. Unzil all the contents (several .framework files) in your iOS project's `libs/` folder
3. Add the missing frameworks to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        ...
        <framework>GoogleAppMeasurement</framework>
        <framework>GoogleMobileAds</framework>
        <framework>GoogleUtilities</framework>
        <framework>nanopb</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-google-mobile-ads-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-google-mobile-ads-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

- [Update your Info.plist](https://developers.google.com/admob/ios/quick-start#update_your_infoplist)
- [Initialize the SDK](https://developers.google.com/admob/ios/quick-start#initialize_mobile_ads).

#### Disable crash reporting

Admob reports SDK crashes by default. This will make problems if you intend to use a different crash reporting service, 
as you can only have one (1!) crash reporting service in your app.

To disable Admob's crash reporting add the following code to your application's entry point:

```Java
GADMobileAds.disableSDKCrashReporting();
```

##### Having trouble?

- Make sure you have setup your app in your [Admob dashboard](https://apps.admob.com/).
- Check your logs for any errors, like network failures.

##### Next steps

- Load and display advertisements in your app: [Link](#display-ads)
- Read the official Google Mobile Ads iOS documentation: [Link](https://developers.google.com/admob/ios)

### Display ads

Setup and display ads.

#### Ad Request

To display any ad you have to create a `GADRequest` first.  
You can specify various user information for better ad targeting and enable test ads for specific device ids.

```Java
GADRequest request = new GADRequest();
// Display test ads on the simulator.
request.setTestDevices(Arrays.asList(GADRequest.getSimulatorID()));

...
```

#### Interstitials

Create a new instance of `GADInterstitial` and store it as a member variable:

```Java
adInterstitial = new GADInterstitial("AD_UNIT_ID");
```

Change `AD_UNIT_ID` with the one you setup in your Admob [dashboard](https://apps.admob.com/#monetize).  
If you setup Google Mobile Ads with a configuration file you can get the default interstitial id:

```Java
String interstitialId = GGLContextMobileAds.getSharedInstance().getConfiguration().getInterstitialAdUnitID();
```

You can optionally listen for certain events by setting the ad delegate:

```Java
adInterstitial.setDelegate(new GADInterstitialDelegateAdapter() {
    @Override
    public void didReceiveAd(GADInterstitial ad) {
        // Ad received.
    }
    
    ...
});
```

To be able to display the ad later, you have to load the ad first. Do this as early as possible.

```Java
adInterstitial.loadRequest(request);
```

Create and pass a new `GADRequest` object as explained in an earlier section.

To display the interstitial use the following code:

```Java
if (adInterstitial.isReady()) {
    adInterstitial.present(viewController);
} else {
    adInterstitial.loadRequest(request);
}
```

You have to pass a `UIViewController` when presenting the ad. Ideally you should setup the interstitial
in a view controller subclass and specify `this`.  

If you're developing a __libGDX__ game you can just use the root view controller of the application:

```Java
UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
```

If you want to show another interstitial after that one is shown, you have to create a new `GADInterstitial`. 
Never show the same `GADInterstitial` twice!

The best place to recreate the interstitial is in the `didDismissScreen` delegate callback:

```Java
@Override
public void didDismissScreen(GADInterstitial ad) {
    interstitial = createAndLoadInterstitial(); // As described before.
}
```

#### Banners

Create a new instance of `GADBannerView`, set the ad unit id and store it as a member variable:

```Java
bannerView = new GADBannerView();
bannerView.setAdUnitID("AD_UNIT_AD");
```

Change `AD_UNIT_ID` with the one you setup in your AdMob [dashboard](https://apps.admob.com/#monetize).  
If you setup Google Mobile Ads with a configuration file you can get the default banner id:

```Java
String bannerId = GGLContextMobileAds.getSharedInstance().getConfiguration().getBannerAdUnitID();
```

Alternatively you can add the banner as an outlet and add the banner view to your storyboard in Interface Builder.

```Java
@IBOutlet
private GADBannerView bannerView;
```
  
See the Quick Start guide how to add the banner in interface builder: [Link](https://developers.google.com/admob/ios/quick-start)


You can optionally listen for certain events by setting the ad delegate:

```Java
bannerView.setDelegate(new GADBannerViewDelegateAdapter() {
    @Override
    public void didReceiveAd(GADBannerView bannerView) {
        // Did receive ad.
    }
});
```

To be able to display the ad later, you have to load the ad first. Do this as early as possible.

```Java
bannerView.loadRequest(request);
```

Create and pass a new `GADRequest` object as explained in an earlier section.

To display the ad you have to add it to your view hierarchy (skip this step if you added the banner to your storyboard):

```Java
viewController.getView().addSubview(bannerView);
```

Modify the frame of the banner view to change it's position.

#### Try it out!

Add the code for interstitials and banners to your app.  
Run the app and display the ads. If you set correct test device ids when creating your `GADRequest` objects 
you should always see an ad.

##### Having trouble?

- Make sure you have setup your app in your [Admob dashboard](https://apps.admob.com/).
- Make sure you have create ad units for your app in your [Admob dashboard](https://apps.admob.com/).
- Check your logs for any errors, like network failures.

##### Next steps

- Read the official Google Mobile Ads iOS documentation: [Link](https://developers.google.com/admob/ios)
