//
//  APDNativeAdLoader.h
//  Appodeal
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDNativeAd.h>
#import <Appodeal/APDSdk.h>
#import <Appodeal/APDNativeAdSettings.h>


@class APDNativeAdLoader;

@protocol APDNativeAdRequestDelegate <NSObject>

@optional

- (void)nativeAdLoaderDidStartMediation:(nonnull APDNativeAdLoader *)nativeAdLoader;
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)nativeAdLoader willSendRequestToAdNetwork:(nonnull NSString *)adNetwork;
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)nativeAdLoader didRecieveResponseFromAdNetwork:(nonnull NSString *)adNetwork wasFilled:(BOOL)filled;
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)nativeAdLoader didFinishMediationAdWasFilled:(BOOL)filled;

@end

/*!
 *  Declaration of native ad loader delegate
 */
@protocol APDNativeAdLoaderDelegate <NSObject>

/*!
 *  Method called when loader receives native ad.
 *  Count of array can be less than requested capacity
 *
 *  @discussion This API will be available in future release
 *
 *  @param loader    Loader is ready
 *  @param nativeAds Array of native ads of requested type
 */
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)loader didLoadNativeAds:(nonnull NSArray <__kindof APDNativeAd *> *)nativeAds;

/*!
 *  Method called when received native ad is loaded
 *
 *  @param loader   Loader is ready
 *  @param nativeAd Native ad to show
 */
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)loader didLoadNativeAd:(nonnull APDNativeAd *)nativeAd NS_UNAVAILABLE;

/*!
 *  Method called if loader mediation failed
 *
 *  @param loader Failed loader
 *  @param error  Error occurred
 */
- (void)nativeAdLoader:(nonnull APDNativeAdLoader *)loader didFailToLoadWithError:(nonnull NSError *)error;

@end


/*!
 *  You can call -loadAdWithType: or -loadAdWithType:capacity: several times on one loader
 */
__attribute__((deprecated("This class is deprecated. Please use the APDNativeAdQueue instead")))
@interface APDNativeAdLoader : NSObject


@property (weak, nonatomic, nullable) id<APDNativeAdRequestDelegate> requestDelegate;

/*!
 *  Set loader delegate
 */
@property (weak, nonatomic, nullable) id<APDNativeAdLoaderDelegate> delegate;

/*!
 *  Set custom placement turned on in Appodeal Dashboard
 */
@property (copy, nonatomic,nullable) NSString *placement;

/*!
 *  Set custom SDK
 */
@property (weak, nonatomic, nullable) APDSdk *customSdk;

/*
 *
 */
@property (strong, nonatomic, nonnull) APDNativeAdSettings * settings;


@property (weak, nonatomic, nullable) UIViewController * controller;
/*!
 *  Call this method to load native ads.
 *  If the capacity is equal to 1, it means that the array of native ads
 *  returned in -nativeAdLoader: didLoadNativeAds: will contain
 *  only one instance of native ad
 *
 *  @param type Native ad type
 */
- (void)loadAdWithType:(APDNativeAdType)type __attribute__((deprecated("Use loadAd instead, to configure loader set custom settings")));

/*!
 *  Call this method to load native ads.
 *  If the capacity is equal , it means that the  array of native ads
 *  returned in -nativeAdLoader: didLoadNativeAds: will contain
 *  only one instance of native ad
 *
 *
 *
 *  @param type     Native ad type
 *  @param capacity Integer value from 1 to 11
 */
- (void)loadAdWithType:(APDNativeAdType)type capacity:(NSInteger)capacity __attribute__((deprecated("Use loadAd instead, to configure loader set custom settings")));

- (void)loadAd;

@end
