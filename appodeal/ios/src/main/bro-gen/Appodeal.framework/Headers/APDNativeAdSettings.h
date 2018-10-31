//
//  APDNativeAdSettings.h
//  Appodeal
//
//  Created by Stas Kochkin on 04/07/2018.
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDNativeAdViewProtocol.h>
#import <Appodeal/APDDefines.h>


typedef NS_OPTIONS(NSUInteger, APDNativeResourceAutocacheMask) {
    APDNativeResourceAutocacheIcon = 1 << 0,
    APDNativeResourceAutocacheMedia = 1 << 1
};

@interface APDNativeAdSettings : NSObject

@property (nonatomic, assign, nonnull) Class <APDNativeAdView> adViewClass;
@property (nonatomic, assign) APDNativeAdType type;
@property (nonatomic, assign) APDNativeResourceAutocacheMask autocacheMask;

@property (nonatomic, strong, nullable) NSURL * nativeMediaViewPlaceholder;

+ (instancetype _Nonnull)defaultSettings;

@end
