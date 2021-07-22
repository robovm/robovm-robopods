//
//  ISProductSettings.h
//  IronSource
//
//  Created by Yotam Ohayon on 07/01/2016.
//  Copyright © 2016 IronSource. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface ISProductSettings : NSObject

@property (readonly, strong)    NSArray         *placements;
@property (readonly, assign)    NSUInteger      maxNumOfAdaptersToLoadOnStart;
@property (readonly, assign)    BOOL            advancedLoading;
@property (readonly, assign)    double          adapterTimeOutInSeconds;
@property (readonly, strong)    NSString        *algo;
@property (nonatomic, copy)     NSString        *backFillProviderName;
@property (nonatomic, copy)     NSString        *premiumProviderName;
@property (assign)              NSInteger       bannerInterval;
@property (assign)              NSInteger       loadRVInterval;
@property (assign)              NSUInteger      delayLoadFailureNotificationInSeconds;
@property (readonly,assign)     NSInteger       expiredDurationInMinutes;



- (instancetype) initWithplacements:(NSArray *)placements
      maxNumOfAdaptersToLoadOnStart:(NSUInteger)maxAdapters
                    advancedLoading:(BOOL)advancedLoading
            adapterTimeOutInSeconds:(double)adapterTimeout
delayLoadFailureNotificationInSeconds:(NSUInteger)delayLoadFailure
                               algo:(NSString *)algo
               backFillProviderName:(NSString *)backFillProviderName
                premiumProviderName:(NSString *)premiumProviderName
           expiredDurationInMinutes:(NSInteger)expiredDurationInMinutes;
@end
