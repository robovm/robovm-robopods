//
//  APDDefines.h
//  Appodeal
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreGraphics/CoreGraphics.h>

FOUNDATION_EXPORT NSString * _Nonnull const kAPDBuildIdendtifier;

FOUNDATION_EXPORT const CGSize kAppodealUnitSize_320x50;
FOUNDATION_EXPORT const CGSize kAppodealUnitSize_300x250 __attribute__((deprecated("This size is deprecated and will be removed in next release")));
FOUNDATION_EXPORT const CGSize kAppodealUnitSize_728x90;

FOUNDATION_EXPORT NSArray * _Nonnull AppodealAvailableUnitSizes(void);


FOUNDATION_EXPORT BOOL AppodealIsUnitSizeSupported(const CGSize size, NSArray * _Nonnull supportedSizes);
FOUNDATION_EXPORT BOOL AppodealIsUnitSizeAvailable(const CGSize size);


FOUNDATION_EXPORT CGSize AppodealNearestUnitSizeForSize(CGSize size);

/*!
 *  Appodeal ads types
 */
typedef NS_OPTIONS(NSInteger, AppodealAdType) {
    /*!
     *  Interstitial
     */
    AppodealAdTypeInterstitial      = 1 << 0,
    /*!
     *  Banner ads
     */
    AppodealAdTypeBanner            = 1 << 2,
    /*!
     *  Native ads
     */
    AppodealAdTypeNativeAd          = 1 << 3,
    /*!
     *  Rewarded video (return reward parameter in finish callback, can not be skipped by user)
     */
    AppodealAdTypeRewardedVideo     = 1 << 4,
    /*!
     *  Rectangle banner of size 300 x 250
     */
    AppodealAdTypeMREC __attribute__((deprecated("Type is deprecated"))) = 1 << 5,
    /*!
     *  Non-skippable video (does not return reward parameter in finish callback, can not be skipped by user)
     */
    AppodealAdTypeNonSkippableVideo = 1 << 6,
};


/*!
 *  APDSdk supported ad types. You can initialize sdk with
 *  several ad types, by usage binary operand |
 *  For example: APDAdTypeInterstitialAd | APDAdTypeSkippableVideo
 */
typedef NS_OPTIONS(NSUInteger, APDAdType) {
    /*!
     *  Interstital ad
     */
    APDAdTypeInterstitialAd = AppodealAdTypeInterstitial,
    /*!
     *  Banner ad
     */
    APDAdTypeBanner         = AppodealAdTypeBanner,
    /*!
     *  Native ad
     */
    APDAdTypeNativeAd       = AppodealAdTypeNativeAd,
    /*!
     *  Rewarded ad
     */
    APDAdTypeRewardedVideo  = AppodealAdTypeRewardedVideo,
    /*!
     *  Rectangular banner (banner of size 300x250)
     */
    APDAdTypeMREC     __attribute__((deprecated("Type is deprecated")))     = AppodealAdTypeMREC
};

/*!
 *  Appodeal styles to show
 */
typedef NS_OPTIONS(NSInteger, AppodealShowStyle) {
    /*!
     *  Show interstial ads
     */
    AppodealShowStyleInterstitial       = 1 << 0,
    /*!
     *  Show banner at top of screen
     */
    AppodealShowStyleBannerTop          = 1 << 2,
    /*!
     *  Show banner at bottom of screen
     */
    AppodealShowStyleBannerBottom       = 1 << 3,
    /*!
     *  Show rewareded video
     */
    AppodealShowStyleRewardedVideo      = 1 << 4,
    /*!
     *  Show non-skippable video
     */
    AppodealShowStyleNonSkippableVideo  = 1 << 5
};

typedef NS_ENUM(NSUInteger, AppodealUserGender) {
    AppodealUserGenderOther = 0,
    AppodealUserGenderFemale,
    AppodealUserGenderMale
};

typedef NS_ENUM(NSUInteger, AppodealUserOccupation) {
    AppodealUserOccupationOther = 0,
    AppodealUserOccupationWork,
    AppodealUserOccupationSchool,
    AppodealUserOccupationUniversity
};

typedef NS_ENUM(NSUInteger, AppodealUserRelationship) {
    AppodealUserRelationshipOther = 0,
    AppodealUserRelationshipSingle,
    AppodealUserRelationshipDating,
    AppodealUserRelationshipEngaged,
    AppodealUserRelationshipMarried,
    AppodealUserRelationshipSearching
};

typedef NS_ENUM(NSUInteger, AppodealUserSmokingAttitude) {
    AppodealUserSmokingAttitudeNegative = 1,
    AppodealUserSmokingAttitudeNeutral,
    AppodealUserSmokingAttitudePositive
};

typedef NS_ENUM(NSUInteger, AppodealUserAlcoholAttitude) {
    AppodealUserAlcoholAttitudeNegative = 1,
    AppodealUserAlcoholAttitudeNeutral,
    AppodealUserAlcoholAttitudePositive
};

/*!
 *  Declaration of banner delegate
 */
@protocol AppodealBannerDelegate <NSObject>

@optional
/*!
 *  Method called when precached or usual banner view loads
 *
 *  @param precache If precache is YES it means that precached ad loaded
 */
- (void)bannerDidLoadAdIsPrecache:(BOOL)precache;

/*!
 *  Method called when banner loaded and is ready to show
 */
- (void)bannerDidLoadAd __attribute__((deprecated("Use -bannerDidLoadAdisPrecache:precache: instead")));

/*!
 *  Method called when banner refreshes
 */
- (void)bannerDidRefresh __attribute__((deprecated("Use -bannerDidShow instead")));

/*!
 *  Method called if banner mediation failed
 */
- (void)bannerDidFailToLoadAd;

/**
 *  Method called when banner view did fail to load
 */
- (void)bannerDidExpired;

/*!
 *  Method called when user taps on banner
 */
- (void)bannerDidClick;

/*!
 *  Method called when banner shows or refreshes
 */
- (void)bannerDidShow;

@end

/*!
 *  Interstital delegate declaration
 */
@protocol AppodealInterstitialDelegate <NSObject>

@optional

/*!
 *  Method called when usual interstitial view loads
 *
 */
- (void)interstitialDidLoadAd __attribute__((deprecated("Use -interstitialDidLoadAdisPrecache: instead")));

/*!
 *  Method called when precached or usual interstitial view loads
 *  @warning If you want show only expensive ads, ignore this callback call with precache equal to YES
 *
 *  @param precache If precache is YES it means that precached ad loaded
 */
- (void)interstitialDidLoadAdIsPrecache:(BOOL)precache;

/*!
 *  Method called if interstitial mediation failed
 */
- (void)interstitialDidFailToLoadAd;

/**
 *  Method called if loaded interstital ad expired by timeout
 */
- (void)interstitialDidExpired;

/*!
 *  Method called if interstitial mediation was successful, but ready ad network can't show ad or
 *  ad presentation was too frequent according to your placement settings
 */
- (void)interstitialDidFailToPresent;

/*!
 *  Method called when interstitial displays on screen
 */
- (void)interstitialWillPresent;

/*!
 *  Method called after interstitial leaves the screen
 */
- (void)interstitialDidDismiss;

/*!
 *  Method called when user taps on interstitial
 */
- (void)interstitialDidClick;

@end


/*!
 *  Rewarded video delegate declaration
 */
@protocol AppodealRewardedVideoDelegate <NSObject>

@optional

/*!
 *  Method called when rewarded video loads
 */
- (void)rewardedVideoDidLoadAd __attribute__((deprecated("Use -rewardedVideoDidLoadAdIsPrecache: instead")));

/*!
 *  Method called when rewarded video loads
 *  @param precache If precache is YES it means that precached ad loaded
 */
- (void)rewardedVideoDidLoadAdIsPrecache:(BOOL)precache;

/*!
 *  Method called if rewarded video mediation failed
 */
- (void)rewardedVideoDidFailToLoadAd;

/**
 Method called if loaded ad creative expired by timeout
 */
- (void)rewardedVideoDidExpired;

/*!
 *  Method called if interstitial mediation was successful, but ready ad network can't show ad or
 *  ad presentation was too frequent according to your placement settings
 */
- (void)rewardedVideoDidFailToPresent __attribute__((deprecated("Use -rewardedVideoDidFailToPresentWithError: instead")));

/*!
 *  Method called if interstitial mediation was successful, but ready ad network can't show ad or
 *  ad presentation was too frequent according to your placement settings
 *  @param error Error object that indicates error reason
 */
- (void)rewardedVideoDidFailToPresentWithError:(nonnull NSError *)error;

/*!
 *  Method called after rewarded video starts displaying
 */
- (void)rewardedVideoDidPresent;

/*!
 *  Method called before rewarded video leaves screen
 */
- (void)rewardedVideoWillDismiss __attribute__((deprecated("Use -rewardedVideoWillDismissAndWasFullyWatched: instead")));

/*!
 *  Method called before rewarded video leaves screen
 *  @param wasFullyWatched boolean flag indicated that user watch video fully
 */
- (void)rewardedVideoWillDismissAndWasFullyWatched:(BOOL)wasFullyWatched;


/*!
 *  Method called after completion of video
 *  @warning After calling this method, rewarded video can stay on screen and show postbanner
 *
 *  @param rewardAmount Amount of app currency turned on in Appodeal Dashboard
 *  @param rewardName Name of app currency set on in Appodeal Dashboard
 */
- (void)rewardedVideoDidFinish:(NSUInteger)rewardAmount name:(nullable NSString *)rewardName;

@end


/*!
 *  Non-skippable video delegate
 */
@protocol AppodealNonSkippableVideoDelegate <NSObject>

@optional

/*!
 *  Method called when non skippable video loads
 */
- (void)nonSkippableVideoDidLoadAd __attribute__((deprecated("Use -nonSkippableVideoDidFailToLoadAd:isPrecache instead")));

/*!
 *  Method called when non skippable video loads
 *  @param precache If precache is YES it means that precached ad loaded
 */
- (void)nonSkippableVideoDidLoadAdIsPrecache:(BOOL)precache;

/*!
 *  Mehtod called if non-skippable video mediation failed
 */
- (void)nonSkippableVideoDidFailToLoadAd;

/**
 *  Method called if non-skippable video did load but expired by timeout
 */
- (void)nonSkippableVideoDidExpired;

/*!
 *  Method called after non-skippable video starts displaying
 */
- (void)nonSkippableVideoDidPresent;

/*!
 *  Method called if non-skippable mediation was successful, but ready ad network can't show ad or
 *  ad presentation was too frequent according to your placement settings
 */
- (void)nonSkippableVideoDidFailToPresent __attribute__((deprecated("Use -nonSkippableVideoDidFailToPresentWithError: instead")));;

/*!
 *  Method called if non-skippable mediation was successful, but ready ad network can't show ad or
 *  ad presentation was too frequent according to your placement settings
 *  @param error Error object that indicates error reason
 */
- (void)nonSkippableVideoDidFailToPresentWithError:(nonnull NSError *)error;

/*!
 *  Method called before non-skippable video leaves screen
 */
- (void)nonSkippableVideoWillDismiss __attribute__((deprecated("Use -nonSkippableVideoWillDismissAndWasFullyWatched: instead")));;

/*!
 *  Method called before rewarded video leaves screen
 *  @param wasFullyWatched boolean flag indicated that user watch video fully
 */
- (void)nonSkippableVideoWillDismissAndWasFullyWatched:(BOOL)wasFullyWatched;

/*!
 *  Method called after completion of video
 *  @warning After calling this method, non-skippable video can stay on screen and show postbanner
 *
 */
- (void)nonSkippableVideoDidFinish;

@end


@protocol AppodealNativeAdDelegate <NSObject>

/*!
 *  Method called after native ads load
 */
- (void)didLoadNativeAds:(NSInteger)count;

/*!
 *  Method called if native ads get some error while loading
 */
- (void)didFailToLoadNativeAdsWithError:(nonnull NSError *)error;

@end

/*!
 *  Extra Keys defines
 */

extern NSString * _Nonnull kAPDAppsFlyerIdExtrasKey;

/*!
 *  Network defines
 */

extern const NSString * _Nonnull kAPDGoogleDFPNetworkName;
extern const NSString * _Nonnull kAPDTapsenseNetworkName;
extern const NSString * _Nonnull kAPDInnerActiveNetworkName;
extern const NSString * _Nonnull kAPDSmaatoNetworkName;
extern const NSString * _Nonnull kAPDAppNexusNetworkName;
extern const NSString * _Nonnull kAPDOpenXNetworkName;
extern const NSString * _Nonnull kAPDVungleNetworkName;
extern const NSString * _Nonnull kAPDUnityNetworkName;
extern const NSString * _Nonnull kAPDAdColonyNetworkName;
extern const NSString * _Nonnull kAPDAmazonNetworkName;
extern const NSString * _Nonnull kAPDApplovinNetworkName;
extern const NSString * _Nonnull kAPDAvocarrotNetworkName;
extern const NSString * _Nonnull kAPDChartboostNetworkName;
extern const NSString * _Nonnull kAPDFacebookNetworkName;
extern const NSString * _Nonnull kAPDFlurryNetworkName;
extern const NSString * _Nonnull kAPDAdMobNetworkName;
extern const NSString * _Nonnull kAPDMyTargetNetworkName;
extern const NSString * _Nonnull kAPDMoPubNetworkName;
extern const NSString * _Nonnull kAPDPubnativeNetworkName;
extern const NSString * _Nonnull kAPDStartAppNetworkName;
extern const NSString * _Nonnull kAPDYandexNetworkName;
extern const NSString * _Nonnull kAPDMillenialNetworkName;
extern const NSString * _Nonnull kAPDTapjoyNetworkName;
extern const NSString * _Nonnull kAPDZplayNetworkName;
extern const NSString * _Nonnull kAPDInMobiNetworkName;
extern const NSString * _Nonnull kAPDIronSourceNetworkName;
extern const NSString * _Nonnull kAPDAppnextNetworkName;
extern const NSString * _Nonnull kAPDCheetahNetworkName;
extern const NSString * _Nonnull kAPDRevMobNetworkName;
extern const NSString * _Nonnull kAPDMobvistaNetworkName;

/*!
 *  Default APDBanner sizes
 */
extern const CGSize kAPDAdSize320x50;
extern const CGSize kAPDAdSize728x90;
extern const CGSize kAPDAdSize300x250 __attribute__((deprecated("This size is deprecated and will be removed in next release")));

/*!
 *  Used in native ad image
 *  Equals to CGSizeZero
 */
extern const CGSize kAPDImageSizeUndefined;

/*!
 *  Size validation
 *
 *  @param size kAPDAdSize320x50, kAPDAdSize728x90, kAPDAdSize300x250
 *
 *  @return BOOL
 */
extern BOOL   APDIsAdSizeValid(const CGSize size);

/*!
 *  Get nearest valid Appodeal size
 *
 *  @param size CGSize
 *
 *  @return kAPDAdSize320x50, kAPDAdSize728x90, kAPDAdSize300x250
 */
extern CGSize APDNearestValidAdSizeForCGSize(const CGSize size);

/*!
 *  Get current SDK version
 *
 *  @return current SDK version
 */
NSString  * _Nonnull  APDSdkVersionString(void);


extern NSString * _Nonnull const kAPDErrorDomain;

/*!
 *  Appodeal sdk error types
 */
typedef NS_ENUM(NSInteger, APDError) {
    /*!
     *  Unknown error
     */
    APDUnknownError = 195944097,
    /*!
     * Inconsistency error: occurrs for example if some kind
     * of ads start loading, but APDSdk does not initialize
     * for this type
     */
    APDInternalInconsistencyError,
    /*!
     *  Any network error, for example server is not available
     */
    APDNetworkingError,
    /*!
     *  Device is not reachable
     */
    APDDeviceNotReachableError,
    /*!
     *  Errors of this type occur if some network response contains
     *  data of an unsupported/unexpected type
     */
    APDJSONDecodeError,
    /*!
     *  Ad network returns no fill
     */
    APDNoFillError,
    /*!
     *  Mediation failed
     */
    APDMediationError,
    /*!
     *  Presentation failed
     */
    APDPresentationError,
    /*!
     *  Device offline or ready ad does not conform to presentation settings
     */
    APDInconsistencyPresentationError,
    /*!
     *  Inconsistency size
     */
    APDInvalidAdSizeError,
    /*!
     *  Handled exception size
     */
    APDHandledExceptionError,
    /*!
     *  Invalid type was loaded
     */
    APDInvalidAdTypeError,
    /*!
     *  Ad unit returned from server contains invalid data
     */
    APDIncorrectAdUnitError,
    /*!
     *  Error while unarchiving cached data
     */
    APDUnarchiveError,
    /*!
     *  Insufficiently device's current memory
     */
    APDLowMemoryError,
    /*!
     *  Error while calling cache method on unitialized ad type
     */
    APDAdTypeNotInitializedError,
    /*!
     * Error returned if sdk unable to start loading.
     * For example if you trying to cache fullscreen ad while it's presenting
     */
    APDLoadingDeniedError
};


/*!
 *  Log flags
 */
typedef NS_OPTIONS(NSUInteger, APDLogFlag) {
    /*!
     *  Only error messages are written to console.
     *  If you see this message, you must
     *  check your integration
     */
    APDLogFlagError   = 1 << 0,
    /*!
     *  Warning and error messages are written to console.
     *  Different warnings occur while the SDK works
     */
    APDLogFlagWarning = 1 << 1,
    /*!
     *  Error, warning and information messages are written to console.
     */
    APDLogFlagInfo    = 1 << 2,
    /*!
     *  Debug messages written to console
     */
    APDLogFlagDebug   = 1 << 3,
    /*!
     *  All SDK messages written to console
     */
    APDlogFlagVerbose = 1 << 4
};

/*!
 *  Log levels. Set some value to [APDSdk setLogLevel:]
 */
typedef NS_ENUM(NSUInteger, APDLogLevel) {
    /*!
     *  Log levels
     */
    APDLogLevelOff     = 0,
    /*!
     *  Only error messages are written to console.
     *  If you see this message, you must
     *  check your integration
     */
    APDLogLevelError   = APDLogFlagError,
    /*!
     *  Warning and error messages are written to console.
     *  Different warnings occur while the SDK works
     */
    APDLogLevelWarning = APDLogLevelError   | APDLogFlagWarning,
    /*!
     *  Error, warning and information messages are written to console.
     */
    APDLogLevelInfo    = APDLogLevelWarning | APDLogFlagInfo,
    /*!
     *  Debug messages written to console
     */
    APDLogLevelDebug   = APDLogLevelInfo    | APDLogFlagDebug,
    /*!
     *  All SDK messages written to console
     */
    APDLogLevelVerbose = APDLogLevelDebug   | APDlogFlagVerbose
};

/*!
 *  Native ad types
 */
typedef NS_ENUM(NSUInteger, APDNativeAdType) {
    /*!
     * Native ad loaded can contain video
     * It depends on filled ad’s network
     */
    APDNativeAdTypeAuto = 0,
    /*!
     *  Native ad contains video
     */
    APDNativeAdTypeVideo,
    /*!
     *  Native ad  does not contain video
     */
    APDNativeAdTypeNoVideo
};

typedef NS_ENUM(NSUInteger, APDUserGender) {
    APDUserGenderOther = AppodealUserGenderOther,
    APDUserGenderFemale = AppodealUserGenderFemale,
    APDUserGenderMale = AppodealUserGenderMale
};

typedef NS_ENUM(NSUInteger, APDUserOccupation) {
    APDUserOccupationOther = AppodealUserOccupationOther,
    APDUserOccupationWork = AppodealUserOccupationWork,
    APDUserOccupationSchool = AppodealUserOccupationSchool,
    APDUserOccupationUniversity = AppodealUserOccupationUniversity
};

typedef NS_ENUM(NSUInteger, APDUserRelationship) {
    APDUserRelationshipOther = AppodealUserRelationshipOther,
    APDUserRelationshipSingle = AppodealUserRelationshipSingle,
    APDUserRelationshipDating = AppodealUserRelationshipDating,
    APDUserRelationshipEngaged = AppodealUserRelationshipEngaged,
    APDUserRelationshipMarried = AppodealUserRelationshipMarried,
    APDUserRelationshipSearching = AppodealUserRelationshipSearching
};

typedef NS_ENUM(NSUInteger, APDUserSmokingAttitude) {
    APDUserSmokingAttitudeNegative = AppodealUserSmokingAttitudeNegative,
    APDUserSmokingAttitudeNeutral = AppodealUserSmokingAttitudeNeutral,
    APDUserSmokingAttitudePositive = AppodealUserSmokingAttitudePositive
};

typedef NS_ENUM(NSUInteger, APDUserAlcoholAttitude) {
    APDUserAlcoholAttitudeNegative = AppodealUserAlcoholAttitudeNegative,
    APDUserAlcoholAttitudeNeutral = AppodealUserAlcoholAttitudeNeutral,
    APDUserAlcoholAttitudePositive = AppodealUserAlcoholAttitudePositive
};

typedef NS_ENUM(NSUInteger, APDFramework) {
    APDFrameworkNative = 1,
    APDFrameworkUnity,
    APDFrameworkCocos2d,
    APDFrameworkMarmalade,
    APDFrameworkPhoneGap,
    APDFrameworkGiderosMobile,
    APDFrameworkAdobeAir,
    APDFrameworkCordova,
    APDFrameworkXamarin,
    APDFrameworkGameMaker,
    APDFrameworkMonkeyX,
    APDFrameworkSC2,
    APDFrameworkLibGDX,
    APDFrameworkQt,
    APDFrameworkUE4,
    APDFrameworkReactNative,
    APDFrameworkCorona,
    APDFrameworkStencyl,
    APDFrameworkSDKBox,
    APDFrameworkDefold,
    APDFrameworkBuildBox
};


