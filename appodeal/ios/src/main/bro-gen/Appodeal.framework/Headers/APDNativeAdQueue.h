//
//  APDNativeAdQueue.h
//  Appodeal
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDNativeAd.h>
#import <Appodeal/APDDefines.h>
#import <Appodeal/APDNativeAdSettings.h>
#import <Appodeal/APDSdk.h>


@class APDNativeAdQueue;


@protocol APDNativeAdQueueDelegate <NSObject>

@optional

/**
 Method called when loader receives native ad.
 
 @param adQueue ad queue object
 @param count count of available native ad
 */
- (void)adQueueAdIsAvailable:(nonnull APDNativeAdQueue *)adQueue ofCount:(NSUInteger)count;


/**
 Method called when loader fails to receive native ad.
 
 @param adQueue ad queue object
 @param error Error occurred
 */
- (void)adQueue:(nonnull APDNativeAdQueue *)adQueue failedWithError:(nonnull NSError *)error;

@end


@interface APDNativeAdQueue : NSObject

/*!
 *  Set loader delegate
 */
@property (nonatomic, weak, nullable) id<APDNativeAdQueueDelegate> delegate;

/*!
 *  Set queue settings
 */
@property (nonatomic, strong, nonnull) APDNativeAdSettings * settings;

/**
 * Get count of available native ads
 */
@property (nonatomic, readonly, assign) NSInteger currentAdCount;

@property (nonatomic, strong, nullable) NSString * placement;

@property (nonatomic, assign) BOOL autocache;

@property (nonatomic, readonly, assign) NSInteger precacheAdCount;

@property (nonatomic, readonly, assign) BOOL containsSuitableAdsForCurrentPlacement;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic, nullable) APDSdk *customSdk;

+ (nonnull instancetype)nativeAdQueueWithSdk:(nullable APDSdk *)sdk
                                    settings:(nonnull APDNativeAdSettings *)settings
                                    delegate:(nullable id<APDNativeAdQueueDelegate>)delegate
                                   autocache:(BOOL)autocache;

/**
 Set max count native ad
 @param adSize max count of native ad
 */
- (void)setMaxAdSize:(NSInteger)adSize __attribute__((deprecated("Configure ad queue size in dashboard")));


/**
 * Call this method to load native ad.
 * @param type APDNativeAdTypeAuto or APDNativeAdTypeVideo or APDNativeAdTypeNoVideo
 */
- (void)loadAdOfType:(APDNativeAdType)type __attribute__((deprecated("Use -loadAd. Type of native ad defined in settings")));;

/**
 * Call this method to load native ad.
 */
- (void)loadAd;

/**
 Call this method to get native ads
 
 @param count count available native ads
 @return array of native ad
 */
- (nonnull NSArray <__kindof APDNativeAd *> *)getNativeAdsOfCount:(NSInteger)count;


@end
