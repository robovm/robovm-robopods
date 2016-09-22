//
//  HZMediatedNativeAdManager.h
//  Heyzap
//
//  Created by Maximilian Tagher on 11/20/15.
//  Copyright © 2015 Heyzap. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "HZFetchOptions.h"

@class HZMediatedNativeAd;

@interface HZMediatedNativeAdManager : NSObject

+ (void)fetchNativeAdWithOptions:(HZFetchOptions * __nullable)fetchOptions;
+ (HZMediatedNativeAd * __nullable)getNextNativeAdForTag:(NSString * __nullable)tag error:(NSError * __nullable * __nullable)error;

+ (BOOL)isAvailableForTag:(NSString * __nullable)tag;

@end
