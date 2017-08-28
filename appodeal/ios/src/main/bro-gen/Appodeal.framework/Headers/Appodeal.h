//
//  Appodeal.h
//  Appodeal
//
//  Copyright (c) 2015 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <Appodeal/AppodealBannerView.h>
#import <Appodeal/APDDefines.h>
#import <Appodeal/APDSdk.h>

#import <Appodeal/APDInterstitialAd.h>
#import <Appodeal/APDRewardProtocol.h>
#import <Appodeal/APDSkippableVideo.h>
#import <Appodeal/APDRewardedVideo.h>

#import <Appodeal/APDMRECView.h>
#import <Appodeal/APDBannerView.h>

#import <Appodeal/APDNativeAdLoader.h>
#import <Appodeal/APDNativeAd.h>
#import <Appodeal/APDImage.h>
#import <Appodeal/APDMediaView.h>


FOUNDATION_EXPORT const CGSize kAppodealUnitSize_320x50;
FOUNDATION_EXPORT const CGSize kAppodealUnitSize_300x250;
FOUNDATION_EXPORT const CGSize kAppodealUnitSize_728x90;

FOUNDATION_EXPORT NSArray * AppodealAvailableUnitSizes();

FOUNDATION_EXPORT BOOL AppodealIsUnitSizeSupported(const CGSize size, NSArray *supportedSizes);
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
     *  Skippable video (can be skipped by user after several seconds of watch)
     */
    AppodealAdTypeSkippableVideo    = 1 << 1,
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
    AppodealAdTypeMREC              = 1 << 5,
    /*!
     *  Non skippable video (does not return reward parameter in finish callback, can not be skipped by user)
     */
    AppodealAdTypeNonSkippableVideo = 1 << 6,
};

/*!
 *  Appodeal styles to show
 */
typedef NS_ENUM(NSInteger, AppodealShowStyle) {
    /*!
     *  Show interstial ads
     */
    AppodealShowStyleInterstitial = 1,
    /*!
     *  Show skippable ads
     */
    AppodealShowStyleSkippableVideo,
    /*!
     *  - If both ready, show ad that eCPM heigher
     *  @discussion - If one of this types ready, show with ad
     *  @discussion - If no one ready, waiting for first ready
     */
    AppodealShowStyleVideoOrInterstitial __attribute__((deprecated("This style will be removed in next release!"))),
    /*!
     *  Show banner at top of screen
     */
    AppodealShowStyleBannerTop,
    /*!
     *  Show banner at bottom of screen
     */
    AppodealShowStyleBannerBottom,
    /*!
     *  Show rewareded video
     */
    AppodealShowStyleRewardedVideo,
    /*!
     *  Show non skippable video
     */
    AppodealShowStyleNonSkippableVideo
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
 *  Method called when precache (cheap and fast load) or usual banner view did load
 *
 *  @param precache If precache is YES it's mean that precache loaded
 */
- (void)bannerDidLoadAdIsPrecache:(BOOL)precache;

/*!
 *  @brief Method called when banner did load and ready to show
 */
- (void)bannerDidLoadAd __attribute__((deprecated("Use -bannerDidLoadAdisPrecache:precache: instead")));

/*!
 *  Method called when banner refresh
 */
- (void)bannerDidRefresh;

/*!
 *  Method called if banner mediation failed
 */
- (void)bannerDidFailToLoadAd;

/*!
 *  Method called when user tap on banner
 */
- (void)bannerDidClick;

/*!
 *  Method called when banner show first time
 *  @warniing After refresh this method not called
 */
- (void)bannerDidShow;

@end

/*!
 *  Interstital delegate declaration
 */
@protocol AppodealInterstitialDelegate <NSObject>

@optional

/*!
 *  Method called when usual interstitial view did load
 *
 */
- (void)interstitialDidLoadAd __attribute__((deprecated("Use -interstitialDidLoadAdisPrecache: instead")));

/*!
 *  Method called when precache (cheap and fast load) or usual interstitial view did load
 *  @warning If you want show only expensive ad, ignore this callback call with precache equal to YES
 *
 *  @param precache If precache is YES it's mean that precache loaded
 */
- (void)interstitialDidLoadAdisPrecache:(BOOL)precache;

/*!
 *  Nethod called if interstitial mediation failed
 */
- (void)interstitialDidFailToLoadAd;

/*!
 *  Method called when interstitial will diaplay on screen
 */
- (void)interstitialWillPresent;

/*!
 *  Method called after interstitial leave screeen
 */
- (void)interstitialDidDismiss;

/*!
 *  Method called when user tap on interstitial
 */
- (void)interstitialDidClick;

@end


/*!
 *  Rewarded video delegate declaration
 */
@protocol AppodealRewardedVideoDelegate <NSObject>

@optional

/*!
 *  Method called when rewarded video did load
 */
- (void)rewardedVideoDidLoadAd;

/*!
 *  Mehtod called if rewarded video mediation failed
 */
- (void)rewardedVideoDidFailToLoadAd;

/*!
 *  Method called after rewarded video start displaying
 */
- (void)rewardedVideoDidPresent;

/*!
 *  Methof called before rewarded video leave screen
 */
- (void)rewardedVideoWillDismiss;

/*!
 *  Method called after fully watch of video
 *  @warning After call this method rewarded video can stay on screen and show postbanner
 *
 *  @param rewardAmount Amount of app curency tuned via Appodeal Dashboard
 *  @param rewardName   Name of app curency tuned via Appodeal Dashboard
 */
- (void)rewardedVideoDidFinish:(NSUInteger)rewardAmount name:(NSString *)rewardName;

/*!
 *  Method called after user tap on screen
 *  @warning Not all ad networks provides this callback!
 */
- (void)rewardedVideoDidClick;

@end


/*!
 *  Non skippable video delegate
 */
@protocol AppodealNonSkippableVideoDelegate <NSObject>

@optional

/*!
 *  Method called when non skippable video did load
 */
- (void)nonSkippableVideoDidLoadAd;

/*!
 *  Mehtod called if non skippable video mediation failed
 */
- (void)nonSkippableVideoDidFailToLoadAd;

/*!
 *  Method called after non skippable video start displaying
 */
- (void)nonSkippableVideoDidPresent;

/*!
 *  Methof called before non skippable video leave screen
 */
- (void)nonSkippableVideoWillDismiss;

/*!
 *  Method called after fully watch of video
 *  @warning After call this method non skippable video can stay on screen and show postbanner
 *
*/
- (void)nonSkippableVideoDidFinish;

/*!
 *  Method called after user tap on screen
 *  @warning Not all ad networks provides this callback!
 */
- (void)nonSkippableVideoDidClick;

@end


/*!
 *  Skippable video delegate
 */
@protocol AppodealSkippableVideoDelegate <NSObject>

@optional

/*!
 *  Method called when skippable video did load
 */
- (void)skippableVideoDidLoadAd;

/*!
 *  Mehtod called if skippable video mediation failed
 */
- (void)skippableVideoDidFailToLoadAd;

/*!
 *  Method called after skippable video start displaying
 */
- (void)skippableVideoDidPresent;

/*!
 *  Methof called before skippable video leave screen
 */
- (void)skippableVideoWillDismiss;

/*!
 *  Method called after fully watch of video, if user skipp video this callback not called
 *  @warning After call this method skippable video can stay on screen and show postbanner
 *  @warning Not all ad networks provides this callback!
 *
 */
- (void)skippableVideoDidFinish;

/*!
 *  Method called after user tap on screen
 *  @warning Not all ad networks provides this callback!
 */
- (void)skippableVideoDidClick;

@end


/*!
 *  Appdoeal ads sdk
 */
@interface Appodeal : NSObject

+ (instancetype)alloc NS_UNAVAILABLE;
- (instancetype)init NS_UNAVAILABLE;
+ (instancetype)new NS_UNAVAILABLE;

/*!
 *  @brief To disable network use this method
 *  @brief Use method before initializtion!
 *  @brief Objective-C
 *  @code [Appodeal disableNetworkForAdType:AppodealAdTypeInterstitial name:@"YOUR_NETWORK_NAME"]; @endcode
 *  @brief Swift
 *  @code Appodeal.disableNetworkForAdType(AppodealAdType.Interstitial, name: "YOUR") @endcode
 *  @param adType      AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo, AppodealAdTypeBanner, AppodealAdTypeNativeAd, AppodealAdTypeRewardedVideo, AppodealAdTypeMREC, AppodealAdTypeNonSkippableVideo
 *  @param networkName Use network name
 */
+ (void)disableNetworkForAdType:(AppodealAdType)adType name:(NSString *)networkName __attribute__((deprecated("Now you can simple delete unused adapter from project")));

/*!
 *  @brief To disable location check use this method (deprecated), use setLocationTracking:
 *  @brief Objective-C
 *  @code [Appodeal disableLocationPermissionCheck]; @endcode
 *  @brief Swift
 *  @code Appodeal.disableLocationPermissionCheck() @endcode
 */
+ (void)disableLocationPermissionCheck __attribute__((deprecated("use method setLocationTracking:")));

/*!
 *  @brief To disable location check use this method
 *  @brief Use method before initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setLocationTracking:YES]; @endcode
 *  @brief Swift
 *  @code Appodeal.setLocationTracking(true) @endcode
 *  @param enabled Set flag NO if you have disabled locationTracking, and YES that enabled
 */
+ (void)setLocationTracking:(BOOL)enabled;

/*!
 *  @brief Enable/disable autocache
 *  @brief Use method before initializtion!
 *  @discussion After initialization sdk start cache ads of those types that was enable as autocache
 *  Default autocache enabled for AppodealAdTypeInterstitial, AppodealAdTypeRewardedVideo or AppodealAdTypeNonSkippableVideo
 *  Also you can do something like this to disable autocache:
 *  @brief Objective-C
 *  @code
    [Appodeal setAutocache: NO types: AppodealAdTypeInterstitial | AppodealAdTypeRewardedVideo]
 *  @endcode
 *  @brief Swift
 *  @code Appodeal.setAutocache(false, types: AppodealAdType.Interstitial) @endcode
 *  @param autocache Bolean flag
 *  @param types     AppodealAdTypeRewardedVideo or AppodealAdTypeNonSkippableVideo, AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo
 */
+ (void)setAutocache:(BOOL)autocache types:(AppodealAdType)types;

/*!
 *  @brief Getter of autocache enabling
 *  @brief after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal isAutocacheEnabled:AppodealAdTypeInterstitial]; @endcode
 *  @brief Swift
 *  @code Appodeal.isAutocacheEnabled(AppodealAdType.Interstitial) @endcode
 *  @param types AppodealAdTypeRewardedVideo, AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo
 *
 *  @return If enabled return YES or NO if not
 */
+ (BOOL)isAutocacheEnabled:(AppodealAdType)types;

/*!
 *  @brief Initialize method. To initialize appodeal with several types you
 *  @brief can do something like this:
 *  @brief Objective-C
 *  @code [Appodeal initializeWithApiKey:YOUR_API_KEY types: AppodealAdTypeInterstitial | AppodealAdTypeRewardedVideo]; @endcode
 *  @brief Swift
 *  @code 
    let adTypes: AppodealAdType = [.banner, .interstitial]
    Appodeal.initialize(withApiKey: "API_KEY", types: adTypes) @endcode
 *  @param apiKey Your api key from Appodeal Dashboard
 *  @param types  Appodeal ad type
 */
+ (void)initializeWithApiKey:(NSString *)apiKey types:(AppodealAdType)types;

+ (void)deinitialize NS_UNAVAILABLE;

/*!
 *  @brief Getter that sdk initialized
 *  @brief Use method after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal isInitalized]; @endcode
 *  @brief Swift
 *  @code Appodeal.isInitalized() @endcode
 *  @return YES if sdk initialized or NO if not
 */
+ (BOOL)isInitalized;

/*!
 *  @brief Set framework type before initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setFramework:APDFrameworkNative]; @endcode
 *  @brief Swift
 *  @code Appodeal.setFramework(APDFramework.native) @endcode
 *  @param framework Framework type, default is iOS Native SDK
 */
+ (void)setFramework:(APDFramework)framework;

/*!
 *  @brief Set interstital delegate to get callbacks
 *  @brief Use method before or after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setInterstitialDelegate:self]; @endcode
 *  @brief Swift
 *  @code Appodeal.setInterstitialDelegate(self) @endcode
 *  @param interstitialDelegate Object that implement AppodealInterstitialDelegate protocol
 */
+ (void)setInterstitialDelegate:(id<AppodealInterstitialDelegate>)interstitialDelegate;

/*!
 *  @brief Set banner delegate to get callbacks
 *  @brief Use method before or after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setBannerDelegate:self]; @endcode
 *  @brief Swift
 *  @code Appodeal.setBannerDelegate(self) @endcode
 *  @param bannerDelegate Object that implement AppodealBannerDelegate protocol
 */
+ (void)setBannerDelegate:(id<AppodealBannerDelegate>)bannerDelegate;

/*!
 *  @brief Set skippable video delegate to get callbacks
 *  @brief Use method before or after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setSkippableVideoDelegate:self]; @endcode
 *  @brief Swift
 *  @code Appodeal.setSkippableVideoDelegate(self) @endcode
 *  @param videoDelegate Object that implement AppodealSkippableVideoDelegate protocol
 */
+ (void)setSkippableVideoDelegate:(id<AppodealSkippableVideoDelegate>)videoDelegate;

/*!
 *  @brief Set rewarded video delegate to get callbacks
 *  @brief Use method before or after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setRewardedVideoDelegate:self]; @endcode
 *  @brief Swift
 *  @code Appodeal.setRewardedVideoDelegate(self) @endcode
 *  @param rewardedVideoDelegate Object that implement AppodealRewardedVideoDelegate protocol
 */
+ (void)setRewardedVideoDelegate:(id<AppodealRewardedVideoDelegate>)rewardedVideoDelegate;

/*!
 *  @brief Set non skippable video delegate to get callbacks
 *  @brief Use method before or after initializtion!
 *  @brief Objective-C
 *  @code [Appodeal setNonSkippableVideoDelegate:self]; @endcode
 *  @brief Swift
 *  @code Appodeal.setNonSkippableVideoDelegate(self) @endcode
 *  @param nonSkippableVideoDelegate Object that implement AppodealNonSkippableVideoDelegate protocol
 */
+ (void)setNonSkippableVideoDelegate:(id<AppodealNonSkippableVideoDelegate>)nonSkippableVideoDelegate;

/*!
 *  @brief Appodeal banner view to custom placement
 *  @brief Use method before or after initializtion!
 *  @warning We highly recommend to use APDSdk and APDBannerView if you want to get custom placement of banner ads in your app
 *
 *  @brief Objective-C
 *  @code [Appodeal banner]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.banner() @endcode
 *
 *  @return View that contains banner ad
 */
+ (UIView *)banner;

/*!
 *  @brief If ad of this type ready, ad show at once. But if not ad start caching and show after caching anyway if it have time to 3 seconds.
 *
 *  @brief Objective-C
 *  @code [Appodeal showAd:AppodealAdTypeInterstitial rootViewController:UIViewController]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.showAd(AppodealShowStyle.Interstitial, rootViewController: UIViewController!) @endcode
 *
 *  @param style              AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo, AppodealAdTypeBanner, AppodealAdTypeNativeAd, AppodealAdTypeRewardedVideo, AppodealAdTypeMREC, AppodealAdTypeNonSkippableVideo
 *  @param rootViewController Controlled for present ads
 *
 *  @return YES if possible to show or NO if not
 */
+ (BOOL)showAd:(AppodealShowStyle)style rootViewController:(UIViewController *)rootViewController;

/*!
 *  @brief - @sa + (BOOL)showAd:(AppodealShowStyle)style rootViewController:(UIViewController *)rootViewController;
 *
 *  @brief Objective-C
 *  @code [Appodeal showAd:AppodealAdTypeInterstitial forPlacement:@"PLACEMENT" rootViewController:UIViewController]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.showAd(AppodealShowStyle.Interstitial, forPlacement: String!, rootViewController: UIViewController!) @endcode
 *
 *  @param style              AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo, AppodealAdTypeBanner, AppodealAdTypeNativeAd, AppodealAdTypeRewardedVideo, AppodealAdTypeMREC, AppodealAdTypeNonSkippableVideo
 *  @param placement          Placement name configured in segments settings on Appodeal Dashboard
 *  @param rootViewController Controller for present
 *
 *  @return YES if possible to show or NO if not
 */
+ (BOOL)showAd:(AppodealShowStyle)style forPlacement:(NSString *)placement rootViewController:(UIViewController *)rootViewController;

/*!
 *  @brief Start cache ad for type if autocache disabled
 *  @brief Ad will not be show after load
 *
 *  @brief Objective-C
 *  @code [Appodeal cacheAd:AppodealAdTypeInterstitial]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.cacheAd(AppodealAdType.Interstitial) @endcode
 *
 *  @param type AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo, AppodealAdTypeBanner, AppodealAdTypeNativeAd, AppodealAdTypeRewardedVideo, AppodealAdTypeMREC, AppodealAdTypeNonSkippableVideo
 */
+ (void)cacheAd:(AppodealAdType)type;

/*!
 *  @brief Hide banner if it on screen
 *
 *  @brief Objective-C
 *  @code [Appodeal hideBanner]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.hideBanner() @endcode
 *
 */
+ (void)hideBanner;

/*!
 *  @brief Enable debug mode
 *
 *  @brief Objective-C
 *  @code [Appodeal setDebugEnabled:YES]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setDebugEnabled(true) @endcode
 *
 *  @param debugEnabled Bolean flag
 */
+ (void)setDebugEnabled:(BOOL)debugEnabled;

/*!
 *  @brief Enable testing mode.
 *  @brief In this mode your will get test ad with <b>eCPM = 0$</b>
 *  @brief Use method before initializtion!
 *
 *  @brief Objective-C
 *  @code [Appodeal setTestingEnabled:YES]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setTestingEnabled(true) @endcode
 *
 *  @param testingEnabled Bolean flag
 */
+ (void)setTestingEnabled:(BOOL)testingEnabled;

/*!
 *  @brief Reset UUID for tracking/targeting ad
 *  @brief Use method before initializtion!
 *
 *  @brief Objective-C
 *  @code [Appodeal resetUUID]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.resetUUID() @endcode
 *
 */
+ (void)resetUUID NS_UNAVAILABLE;

/*!
 *  Get current sdk version
 *
 *  @brief Objective-C
 *  @code [Appodeal getVersion]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.getVersion() @endcode
 *
 *  @return Current sdk version
 */
+ (NSString *)getVersion;

/*!
 *  @brief Check that ad is ready to show
 *
 *  @brief Objective-C
 *  @code [Appodeal isReadyForShowWithStyle:AppodealShowStyleInterstitial]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.isReadyForShowWithStyle(AppodealShowStyle.Interstitial) @endcode
 *
 *  @param showStyle AppodealShowStyleInterstitial, AppodealShowStyleSkippableVideo, AppodealShowStyleVideoOrInterstitial, AppodealShowStyleBannerTop, AppodealShowStyleBannerBottom, AppodealShowStyleRewardedVideo, AppodealShowStyleNonSkippableVideo
 *
 *  @return YES if ready or NO if not
 */
+ (BOOL)isReadyForShowWithStyle:(AppodealShowStyle)showStyle;

/*!
 *  @brief You can set custom rule by usage this method.
 *  Configure rules for segments in <b>Appodeal Dashboard</b>.
 *  @discussion For example, you want to use segment, when user complete 20 or more levels
 *  You create rule in dashboard with name "completedLevels" of type Int,
 *  operator GreaterThanOrEqualTo and value 10, now you implement folowing code:
 *
 *  @brief Objective-C
 *  @code
    NSDictionary * customRule = {@"completedLevels" : CURRENT_NUMBER_OF_COMPLETED_LEVELS};
    [[APDSdk sharedSdk] setCustomRule: customRule];
 *  @endcode
 *
 *  @brief Swift
 *  @code
    let customRule = ["completedLevels" : CURRENT_NUMBER_OF_COMPLETED_LEVELS]
    APDSdk .sharedSdk().setCustomRule(customRule)
 *  @endcode
 *
 *  Call this method any time you want, segments change dynamically
 *
 *  @discussion And then CURRENT_NUMBER_OF_COMPLETED_LEVELS become 10 or greater
 *  You segments settings become available
 *
 *  @param customRule NSDictionary instance with keys that similar to  keys that you tune in Appodeal Dashboard's Segment settings block and values of similar types
 */
+ (void)setCustomRule:(NSDictionary *)customRule;

/*!
 *  @brief -
 *
 *  @brief Objective-C
 *  @code [Appodeal confirmUsage:AppodealAdTypeInterstitial]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.confirmUsage(AppodealAdType.Interstitial) @endcode
 *
 *  @param adTypes AppodealAdTypeInterstitial, AppodealAdTypeSkippableVideo, AppodealAdTypeBanner, AppodealAdTypeNativeAd, AppodealAdTypeRewardedVideo, AppodealAdTypeMREC, AppodealAdTypeNonSkippableVideo
 */
+ (void)confirmUsage:(AppodealAdType)adTypes;

/*!
 *  @brief Autoresized banner suport. Default set to YES;
 *  Call this method before caching banners!
 *
 *  @brief Objective-C
 *  @code [Appodeal setSmartBannersEnabled:YES]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setSmartBannersEnabled(true) @endcode
 *
 *  @param smartBannerEnabled If YES banner will resize it depend of screen size, If NO banner has fixed size (320x50 on iPhone and 728x90 on iPad)
 */
+ (void)setSmartBannersEnabled:(BOOL)smartBannerEnabled;

/*!
 *  @brief Banner background visibility setter. Default set to NO.
 *  Call this method before caching banners!
 *
 *  @brief Objective-C
 *  @code [Appodeal setBannerBackgroundVisible:YES]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setBannerBackgroundVisible(true) @endcode
 *
 *  @param bannerBackgroundVisible If YES banner will have background, if NO banner background will be transparent
 */
+ (void)setBannerBackgroundVisible:(BOOL)bannerBackgroundVisible;

/*!
 *  @brief Banner animation setter. Default set to YES
 *  Call this method before caching banners!
 *
 *  @brief Objective-C
 *  @code [Appodeal setBannerAnimationEnabled:YES]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setBannerAnimationEnabled(true) @endcode
 *
 *  @param bannerAnimationEnabled If YES banner will refresh with animation (UIViewAnimationOptionTransitionCrossDissolve), if NO will refresh without animation;
 */
+ (void)setBannerAnimationEnabled:(BOOL)bannerAnimationEnabled;

@end

/*!
 *  Set user metada for right ad targeting
 */
@interface Appodeal (UserMetadata)

/*!
 *  @brief User id setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserId:@"USER_ID"]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserId("USER_ID") @endcode
 *
 *  @param userId Set userId as string
 */
+ (void)setUserId:(NSString *)userId;

/*!
 *  @brief User email setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserEmail:@"USER_EMAIL"]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserEmail("USER_EMAIL") @endcode
 *
 *  @param email Set userEmail as string
 */
+ (void)setUserEmail:(NSString *)email;

/*!
 *  @brief User birthday setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserBirthday:[NSDate date]]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserBirthday(Date() as Date!) @endcode
 *
 *  @param birthday Set userBirthday as NSDate
 */
+ (void)setUserBirthday:(NSDate *)birthday;

/*!
 *  @brief User age setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserAge:25]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserAge(25) @endcode
 *
 *  @param age Set age as integer value
 */
+ (void)setUserAge:(NSUInteger)age;

/*!
 *  @brief User gender setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserGender:AppodealUserGenderMale]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserGender(AppodealUserGender.male) @endcode
 *
 *  @param gender AppodealUserGenderOther, AppodealUserGenderMale, AppodealUserGenderFemale
 */
+ (void)setUserGender:(AppodealUserGender)gender;

/*!
 *  @brief User occupdation setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserOccupation:AppodealUserOccupationWork]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserOccupation(AppodealUserOccupation.work) @endcode
 *
 *  @param occupation AppodealUserOccupationOther, AppodealUserOccupationWork, AppodealUserOccupationSchool, AppodealUserOccupationUniversity
 */
+ (void)setUserOccupation:(AppodealUserOccupation)occupation;

/*!
 *  @brief User relationship setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserRelationship:AppodealUserRelationshipMarried]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserRelationship(AppodealUserRelationship.married) @endcode
 *
 *  @param relationship AppodealUserRelationshipOther, AppodealUserRelationshipSingle, AppodealUserRelationshipDating, AppodealUserRelationshipEngaged, AppodealUserRelationshipMarried, AppodealUserRelationshipSearching
 */
+ (void)setUserRelationship:(AppodealUserRelationship)relationship;

/*!
 *  @brief User smoking attitude setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserSmokingAttitude:AppodealUserSmokingAttitudeNeutral]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserSmokingAttitude(AppodealUserSmokingAttitude.neutral) @endcode
 *
 *  @param smokingAttitude AppodealUserSmokingAttitudeNegative, AppodealUserSmokingAttitudeNeutral, AppodealUserSmokingAttitudePositive
 */
+ (void)setUserSmokingAttitude:(AppodealUserSmokingAttitude)smokingAttitude;

/*!
 *  @brief User alcohol attitude
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserAlcoholAttitude:AppodealUserAlcoholAttitudeNeutral]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserAlcoholAttitude(AppodealUserAlcoholAttitude.neutral) @endcode
 *
 *  @param alcoholAttitude AppodealUserAlcoholAttitudeNegative, AppodealUserAlcoholAttitudeNeutral, AppodealUserAlcoholAttitudePositive
 */
+ (void)setUserAlcoholAttitude:(AppodealUserAlcoholAttitude)alcoholAttitude;

/*!
 *  @brief User interests setter
 *
 *  @brief Objective-C
 *  @code [Appodeal setUserInterests:@"USER_INTERESTS"]; @endcode
 *
 *  @brief Swift
 *  @code Appodeal.setUserInterests("USER_INTERESTS") @endcode
 *
 *  @param interests Set user interests as string
 */
+ (void)setUserInterests:(NSString *)interests;

@end
