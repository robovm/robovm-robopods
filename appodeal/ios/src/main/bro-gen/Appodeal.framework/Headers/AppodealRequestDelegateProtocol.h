//
//  AppodealRequestDelegateProtocol.h
//  Appodeal

//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDDefines.h>

@class APDBannerView;
@class APDInterstitialAd;
@class APDRewardedVideo;

@protocol AppodealRequestDelegate <NSObject>

- (void)mediationDidStartForAdType:(AppodealAdType)adType;
- (void)willStartAdRequestForAdNetwork:(nonnull NSString *)adNetwork adType:(AppodealAdType)adType;
- (void)didReceiveAdResponseFromAdNetwork:(nonnull NSString *)adNetwork adType:(AppodealAdType)adType wasFilled:(BOOL)filled;
- (void)didFinishMediationForAdType:(AppodealAdType)adType hasFilledAd:(BOOL)filled;
- (void)didDetectImpressionForAdNetwork:(nonnull NSString *)adNetwork adType:(AppodealAdType)adType;
- (void)didDetectClickForAdNetwork:(nonnull NSString *)adNetwork adType:(AppodealAdType)adType;

@end


@protocol APDBannerViewRequestDelegate <NSObject>

@optional

- (void)bannerViewDidStartMediation:(nonnull APDBannerView *)bannerView;
- (void)bannerView:(nonnull APDBannerView *)bannerView willSendRequestToAdNetwork:(nonnull NSString *)adNetwork;
- (void)bannerView:(nonnull APDBannerView *)bannerView didRecieveResponseFromAdNetwork:(nonnull NSString *)adNetwork wasFilled:(BOOL)filled;
- (void)bannerView:(nonnull APDBannerView *)bannerView didFinishMediationAdWasFilled:(BOOL)filled;
- (void)bannerView:(nonnull APDBannerView *)bannerView logImpressionForAdNetwork:(nonnull NSString *)adNetwork;
- (void)bannerView:(nonnull APDBannerView *)bannerView logClickForAdNetwork:(nonnull NSString *)adNetwork;

@end


@protocol APDInterstitalAdRequestDelegate <NSObject>

@optional

- (void)interstitialDidStartMediation:(nonnull APDInterstitialAd *)interstitial;
- (void)interstitial:(nonnull APDInterstitialAd *)interstitial willSendRequestToAdNetwork:(nonnull NSString *)adNetwork;
- (void)interstitial:(nonnull APDInterstitialAd *)interstitial didRecieveResponseFromAdNetwork:(nonnull NSString *)adNetwork wasFilled:(BOOL)filled;
- (void)interstitial:(nonnull APDInterstitialAd *)interstitial didFinishMediationAdWasFilled:(BOOL)filled;
- (void)interstitial:(nonnull APDInterstitialAd *)interstitial logImpressionForAdNetwork:(nonnull NSString *)adNetwork;
- (void)interstitial:(nonnull APDInterstitialAd *)interstitial logClickForAdNetwork:(nonnull NSString *)adNetwork;

@end


@protocol APDRewardedVideoRequestDelegate <NSObject>

@optional

- (void)rewardedVideoDidStartMediation:(nonnull APDRewardedVideo *)rewardedVideo;
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo willSendRequestToAdNetwork:(nonnull NSString *)adNetwork;
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo didRecieveResponseFromAdNetwork:(nonnull NSString *)adNetwork wasFilled:(BOOL)filled;
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo didFinishMediationAdWasFilled:(BOOL)filled;
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo logImpressionForAdNetwork:(nonnull NSString *)adNetwork;
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo logClickForAdNetwork:(nonnull NSString *)adNetwork;

@end
