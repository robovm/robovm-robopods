# Google Personalized Ad Consent SDK

## Official Documentation

[Link](https://developers.google.com/admob/ios/eu-consent)

## Install Instructions

### 3rd party native framework
This RoboPod requires you to download and add the native 3rd party framework manually:

1. Put the `PersonalizedAdConsent.framework` into your iOS project's `libs` folder.
1. Put the `PersonalizedAdConsent.bundle` into your iOS project's `resources/` folder.
3. Add the following to your `robovm.xml`

```
<config>
    ...
    <frameworkPaths>
        <path>libs</path>
    </frameworkPaths>
    <resources>
        ...
        <resource>
          <directory>resources</directory>
        </resource>
      </resources>
    <frameworks>
        ...
        <framework>GoogleMobileAds</framework>
    </frameworks>
</config>
```

### Gradle

Add the following dependency to your `build.gradle`:

```
dependencies {
   ... other dependencies ...
   compile "com.mobidevelop.robovm:robopods-google-ad-consent-ios:$robopodsVersion"
}
```

### Maven

Add the following dependency to your `pom.xml`:

```
<dependency>
   <groupId>com.mobidevelop.robovm</groupId>
   <artifactId>robopods-google-ad-consent-ios</artifactId>
   <version>${robopods.version}</version>
</dependency>
```

## Code Examples

### SDK setup

To use the SDK for debug purposes, you will need to retrieve the debug identifier for your device, and add it to the PACConsentInformation instance:

```Java
String debugAdIdentifier = ASIdentifierManager.getSharedManager().getAdvertisingIdentifier().asString();
PACConsentInformation.getSharedInstance().setDebugIdentifiers(NSArray.fromStrings(debugAdIdentifier));
```

The following code shows you how to set the debug location and consent status for your device, when the app loads:

```Java
PACConsentInformation.getSharedInstance().setDebugGeography(PACDebugGeography.EEA);
PACConsentInformation.getSharedInstance().setConsentStatus(PACConsentStatus.Unknown);
```

### Checking Consent Status

```Java
PACConsentInformation.getSharedInstance().requestConsentInfoUpdateForPublisherIdentifiers(NSArray.fromStrings("pub-0123456789012345"),
    new VoidBlock1<NSError>() {
        @Override
        public void invoke(NSError nsError) {
            if(nsError != null) {
                // Error Occured
            } else {
                PACConsentStatus consentStatus = PACConsentInformation.getSharedInstance().getConsentStatus();
                // Handle consentStatus
            }
        }
    }
);
```

### Requesting Consent

```Java
NSURL privacyUrl = new NSURL("https://yoursite.com/privacyurl");

PACConsentForm form = new PACConsentForm(privacyUrl);
form.setShouldOfferAdFree(true);
form.setShouldOfferNonPersonalizedAds(true);
form.setShouldOfferPersonalizedAds(true);

form.loadWithCompletionHandler(new VoidBlock1<NSError>() {
    @Override
    public void invoke(NSError nsError) {
        if (nsError != null) {
            // Error occured
        } else {
            UIViewController viewController = UIApplication.getSharedApplication().getKeyWindow().getRootViewController();
            form.presentFromViewController(viewController, new VoidBlock2<NSError, Boolean>() {
                @Override
                public void invoke(NSError nsError, Boolean aBoolean) {
                    if (nsError != null) {
                        // Error occured
                    } else if(aBoolean) {
                        // User prefers ad free
                    } else {
                        PACConsentStatus consentStatus = PACConsentInformation.getSharedInstance().getConsentStatus();
                        // Handle consentStatus
                    }
                }
            });
        }
    }
});
```

### Forward consent to the Google Mobile Ads SDK

```Java
GADExtras extras = new GADExtras();
extras.setAdditionalParameters(new NSDictionary<>(new NSString("npa"), new NSString("1")));

GADRequest request = new GADRequest();
request.registerAdNetworkExtras(extras);
```