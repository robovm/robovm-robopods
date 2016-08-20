#import <Foundation/Foundation.h>
#import "GGLContext.h"

#import <GoogleMobileAds/GoogleMobileAds.h>

/**
 * This category extends |GGLContext| with the mobile ads service.
 *
 * Import GGLContext+AdMob.h to use AdMob in your app. After calling
 * -[[GGLContext sharedInstance] configureWithError:],
 * | [GGLContext sharedInstance].adUnitIDForBannerTest |,
 * | [GGLContext sharedInstance].adUnitIDForInterstitialTest |,
 * | [GGLContext sharedInstance].bannerView | and
 * | [GGLContext sharedInstance].interstitialView |
 * are ready for use.
 *
 * @see GGLContext
 */
@interface GGLContext (AdMob)

/**
 * Provides an AdUnitID to use the banner view. This value can be updated by changing the
 * AD_UNIT_ID_FOR_BANNER_TEST in GoogleService-Info.plist.
 */
@property(nonatomic, readonly, strong) NSString *adUnitIDForBannerTest;

/**
 * Provides an AdUnitID to use the interstitial view. This value can be updated by changing
 * the AD_UNIT_ID_FOR_INTERSTITIAL_TEST in GoogleService-Info.plist.
 */
@property(nonatomic, readonly, strong) NSString *adUnitIDForInterstitialTest;

/**
 * Provides a |GADBannerView| configured using adUnitIDForBannerTest.
 */
@property(nonatomic, strong) GADBannerView *bannerView;

/**
 * Provides an |GADInterstitial| configured using adUnitIDForInterstitialTest.
 */
@property(nonatomic, strong) GADInterstitial *interstitialView;

@end