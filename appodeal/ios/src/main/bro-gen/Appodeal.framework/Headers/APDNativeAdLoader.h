//
//  APDNativeAdLoader.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDNativeAd.h>
#import <Appodeal/APDSdk.h>
#import <Appodeal/APDDefines.h>


@class APDNativeAdLoader;

/*!
 *  Declaration of native ad loader delegate
 */
@protocol APDNativeAdLoaderDelegate <NSObject>

/*!
 *  Method called when loader recieve native ad.
 *  Count of array can be little than requested capacity
 *
 *  @brief This API will be available in future release
 *
 *  @param loader    Ready loader
 *  @param nativeAds Array of native ads of requested type
 */
- (void)nativeAdLoader:(APDNativeAdLoader *)loader didLoadNativeAds:(NSArray <__kindof APDNativeAd *> *)nativeAds NS_UNAVAILABLE;

/*!
 *  Method called when loaded recieve native ad.
 *
 *  @param loader   Ready loader
 *  @param nativeAd Native ad to show
 */
- (void)nativeAdLoader:(APDNativeAdLoader *)loader didLoadNativeAd:(APDNativeAd *)nativeAd;

/*!
 *  Method called if loader mediation failed
 *
 *  @param loader Failed loader
 *  @param error  Occured error
 */
- (void)nativeAdLoader:(APDNativeAdLoader *)loader didFailToLoadWithError:(NSError *)error;

@end

/*!
 *  You can call -loadAdWithType: or -loadAdWithType:capacity: several times on one loader
 */
@interface APDNativeAdLoader : NSObject

/*!
 *  Set loader delegate
 */
@property (weak, nonatomic) id<APDNativeAdLoaderDelegate> delegate;

/*!
 *  Set custom placement tuned on Appodeal Dashboard
 */
@property (copy, nonatomic) NSString *placement;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic) APDSdk *customSdk;

/*!
 *  Call this method to load native ad.
 *  Capacity equals to 1, it's means that array of native ads
 *  returned in -nativeAdLoader: didLoadNativeAds: will contain
 *  only one instance of native ad
 *
 *  @param type Native ad type
 */
- (void)loadAdWithType:(APDNativeAdType)type;

/*!
 *  Call this method to load native ad.
 *  Capacity equals to 1, it's means that array of native ads
 *  returned in -nativeAdLoader: didLoadNativeAds: will contain
 *  only one instance of native ad
 *
 *  @brief This API will be available in future release
 *
 *  @param type     Native ad type
 *  @param capacity Interger value from 1 to 11
 */
- (void)loadAdWithType:(APDNativeAdType)type capacity:(NSInteger)capacity NS_UNAVAILABLE;

@end
