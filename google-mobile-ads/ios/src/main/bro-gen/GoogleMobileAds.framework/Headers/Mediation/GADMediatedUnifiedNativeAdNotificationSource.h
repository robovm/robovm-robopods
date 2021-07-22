//
//  GADMediatedUnifiedNativeAdNotificationSource.h
//  Google Mobile Ads SDK
//
//  Copyright 2017 Google Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <GoogleMobileAds/GoogleMobileAdsDefines.h>
#import <GoogleMobileAds/Mediation/GADMediatedUnifiedNativeAd.h>

NS_ASSUME_NONNULL_BEGIN

/// Notifies the Google Mobile Ads SDK about the events performed by adapters. Adapters may perform
/// some action (e.g. opening an in app browser or opening the iTunes store) when handling methods
/// in GADMediatedUnifiedNativeAd. Adapters in such case should notify the Google Mobile Ads SDK by
/// calling the relevant methods from this class.
@interface GADMediatedUnifiedNativeAdNotificationSource : NSObject

/// Called by the adapter when it has registered an impression on the tracked view. Adapter should
/// only call this method if -[GADMAdNetworkAdapter handlesUserImpressions] returns YES.
+ (void)mediatedNativeAdDidRecordImpression:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Called by the adapter when it has registered a user click on the tracked view. Adapter should
/// only call this method if -[GADMAdNetworkAdapter handlesUserClicks] returns YES.
+ (void)mediatedNativeAdDidRecordClick:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Must be called by the adapter just before mediatedNativeAd has opened an in-app modal screen.
+ (void)mediatedNativeAdWillPresentScreen:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Must be called by the adapter just before the in-app modal screen opened by mediatedNativeAd is
/// dismissed.
+ (void)mediatedNativeAdWillDismissScreen:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Must be called by the adapter after the in-app modal screen opened by mediatedNativeAd is
/// dismissed.
+ (void)mediatedNativeAdDidDismissScreen:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Must be called by the adapter just before mediatedNativeAd leaves the application.
+ (void)mediatedNativeAdWillLeaveApplication:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

#pragma mark - Mediated Native Video Ad Notifications

/// Called by the adapter when native video playback has begun or resumed.
+ (void)mediatedNativeAdDidPlayVideo:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Called by the adapter when native video playback has paused.
+ (void)mediatedNativeAdDidPauseVideo:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

/// Called by the adapter when native video playback has ended.
+ (void)mediatedNativeAdDidEndVideoPlayback:(id<GADMediatedUnifiedNativeAd>)mediatedNativeAd;

@end

NS_ASSUME_NONNULL_END
