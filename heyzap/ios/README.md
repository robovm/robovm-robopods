# Heyzap iOS

## Sample app

[Link](https://github.com/robovm/robovm-samples/tree/master/robopods/heyzap/ios)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Download the SDK for iOS from https://developers.heyzap.com
2. Put the `HeyzapAds.framework` folder in your iOS project's `libs/` folder
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <frameworks>
        <framework>HeyzapAds</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "org.robovm:robopods-heyzap-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>org.robovm</groupId>
   <artifactId>robopods-heyzap-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

Before you can display any ads, you have to setup the SDK.

#### Start Heyzap in your app

Add the following code to your application's entry point, typically `didFinishLaunching()`
in your app delegate.

```Java
HeyzapAds.start("PUBLISHER_ID");
```

Change the `PUBLISHER_ID` with the id that you can find in your Heyzap [dashboard](https://developers.heyzap.com/account).

#### Enable debug logging

When setting up Heyzap it's very helpful to get logs.  
Add the following code before starting Heyzap:

```Java
HeyzapAds.setDebug(true);
HeyzapAds.setDebugLevel(HZDebugLevel.Verbose); // Adjust level to your needs.

...

HeyzapAds.start("PUBLISHER_ID");
```

__Note:__ Don't forget to disable debug logging when you release your app!

##### Having trouble?

- Make sure you have setup an app in your Heyzap [dashboard](https://developers.heyzap.com/)
and specified the correct `PUBLISHER_ID`.
- Check your logs for any errors, like network failures.

##### Next steps

- Integrate 3rd party ad networks: [Link](#integrate-3rd-party-ad-networks)
- Read the official Heyzap iOS documentation: [Link](https://developers.heyzap.com/docs/ios_sdk_setup_and_requirements)

### Integrate 3rd party ad networks

Heyzap is an ad mediation network, so we should add as many different ad providers as possible.

#### Add 3rd party SDKs

You can use all ad networks that you setup in the Heyzap mediation dashboard.  
Use the following link to download all SDKs of ad networks you want to integrate:

[Link](https://developers.heyzap.com/docs/ios_sdk_setup_and_requirements)

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

#### Test integration

You can use the Mediation Test Suite to check if all networks are correctly setup.

To use the Mediation Test Suite, simply call `presentMediationDebugViewController()` after you start the SDK and have setup a root view controller:

```Java
HeyzapAds.start("PUBLISHER_ID");
    
HeyzapAds.presentMediationDebugViewController();
```

##### Having trouble?

- Make sure you have setup different ad networks app in your Heyzap [dashboard](https://developers.heyzap.com/).
- Check your logs for any errors, like network failures.

##### Next steps

- Load and display advertisements in your app: [Link](#display-ads) TODO
- Read the official Heyzap iOS documentation: [Link](https://developers.heyzap.com/docs/ios_sdk_setup_and_requirements)

### Display ads

Load and display ads.

#### Interstitial Ads

Interstitial ads are automatically loaded by Heyzap, you only have to show them when needed:

```Java
HZInterstitialAd.show();
```

#### Video Ads

Video ads need to be fetched before showing them:

```Java
HZVideoAd.fetch();
```

When you are ready to show them use the following code:

```Java
HZVideoAd.show();
```

#### Rewarded Video Ads

Rewarded video ads need to be fetched before showing them:

```Java
HZIncentivizedAd.fetch();
```

When you are ready to show them use the following code:

```Java
HZIncentivizedAd.show();
```

#### Banner Ads

To add banner ads to your app you first have to create banner options. You can specify the presenting view controller and 
banner sizes for various ad providers along with other options:

```Java
HZBannerAdOptions options = new HZBannerAdOptions();
```

Now you just need to place the banner in your view controller:

```Java
HZBannerAd.placeBannerInView(viewController.getView(),
        HZBannerPosition.Bottom,
        options,
        banner -> {
            // SUCCESS
        },
        error -> {
            // ERROR
        });
```

Specify the view controllers view, the banner position, the options you created earlier and callbacks for success and error.  
You can store and modify the `HZBannerAd` instance that you get in the success callback.

#### Try it out!

Add the code for ads to your app and run the app. If you setup everything correctly you should see ads in your app after a little loading time.

##### Having trouble?

- Make sure you have setup the Heyzap SDK: [Link](#sdk-setup)
- Make sure you have setup your app in your Heyzap dashboard: [Link](https://developers.heyzap.com/)
- Check your logs for any errors, like network failures.

##### Next steps

- Take a look at our sample app: [Link](https://github.com/robovm/robovm-samples/tree/master/robopods/heyzap/ios)
- Read the official Heyzap iOS documentation: [Link](https://developers.heyzap.com/docs/ios_sdk_setup_and_requirements)