//
//  HZFetchOptions.h
//  Heyzap
//
//  Created by Monroe Ekilah on 8/26/15.
//  Copyright (c) 2015 Heyzap. All rights reserved.
//

#import <UIKit/UIKit.h>

typedef NS_ENUM(NSInteger, HZAdMobNativeAdImageOrientation) {
    HZAdMobNativeAdImageOrientationAny,
    HZAdMobNativeAdImageOrientationPortrait,
    HZAdMobNativeAdImageOrientationLandscape,
};

@interface HZFetchOptions : NSObject <NSCopying>

// Info passed to HeyzapMediation for a fetch
@property (nonatomic, strong, nullable) NSString *tag;
@property (nonatomic, nullable, copy) void (^completion)(BOOL result,  NSError * __nullable error );

#pragma mark - Native Ad Options

/**
 *  The view controller to fetch native ads for. Currently only AdMob uses this property. This property is required for AdMob.
 */
@property (nonatomic, weak, nullable) UIViewController *presentingViewController;

/**
 *  The number of unique native ads to fetch from each network. The default value is `@20`.
 *
 *  For Heyzap, Facebook, and AppLovin, native ads can be requested in a large batch to ensure that each native ad is unique.
 *  This property is ignored for other networks currently.
 */
@property (nonatomic, null_resettable) NSNumber *uniqueNativeAdsToFetch;

/**
 *  The type of AdMob native ads to request (App Install and/or Content ads). The default value includes all ad types.
 *
 *  You can populate this property using AdMob's constants, or with the functions:
 *      * `hzAdMobNativeAdTypeAppInstall`
 *      * `hzAdMobNativeAdTypeContent`
 */
#if __has_feature(objc_generics)
@property (nonatomic, null_resettable) NSArray <NSString *> *admobNativeAdTypes;
#else
@property (nonatomic, null_resettable) NSArray *admobNativeAdTypes;
#endif

/**
 *  The preferred orientation of images for AdMob native ads. Note that AdMob may only have images of one orientation, so you'll need to handle both landscape and portrait images regardless.
 *
 *  Defaults to `HZAdMobNativeAdImageOrientationAny`.
 */
@property (nonatomic) HZAdMobNativeAdImageOrientation admobPreferredImageOrientation;

#if __has_feature(objc_generics)
NSArray <NSString *> * __nonnull hzAllAdmobAdTypes(void);
#else
NSArray * __nonnull hzAllAdmobAdTypes(void);
#endif

NSString  * __nonnull  hzAdMobNativeAdTypeAppInstall(void);
NSString * __nonnull hzAdMobNativeAdTypeContent(void);

@end
