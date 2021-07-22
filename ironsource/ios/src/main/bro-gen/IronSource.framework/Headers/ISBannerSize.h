//
//  ISBannerSize.h
//  IronSource
//
//  Created by Dor Alon on 12/09/2018.
//  Copyright © 2018 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

static NSString * const kSizeBanner = @"BANNER";
static NSString * const kSizeLarge = @"LARGE";
static NSString * const kSizeRectangle = @"RECTANGLE";
static NSString * const kSizeLeaderboard = @"LEADERBOARD";
static NSString * const kSizeSmart = @"SMART";
static NSString * const kSizeCustom = @"CUSTOM";

#define ISBannerSize_BANNER [[ISBannerSize alloc] initWithDescription:kSizeBanner width:320 height:50]
#define ISBannerSize_LARGE [[ISBannerSize alloc] initWithDescription:kSizeLarge width:320 height:90]
#define ISBannerSize_RECTANGLE [[ISBannerSize alloc] initWithDescription:kSizeRectangle width:300 height:250]
#define ISBannerSize_SMART [[ISBannerSize alloc] initWithDescription:kSizeSmart width:0 height:0]

@interface ISBannerSize : NSObject

#define ISBannerSize_LEADERBOARD [[ISBannerSize alloc] initWithDescription:kSizeLeaderboard width:728 height:90]

- (instancetype)initWithWidth:(NSInteger)width andHeight:(NSInteger)height;
- (instancetype)initWithDescription:(NSString *)description width:(NSInteger)width height:(NSInteger)height;
- (BOOL)isSmart;

@property (readonly) NSString* sizeDescription;
@property (readonly) NSInteger width;
@property (readonly) NSInteger height;

@end
