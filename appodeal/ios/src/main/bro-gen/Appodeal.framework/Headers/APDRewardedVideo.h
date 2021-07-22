//
//  APDReviewVideo.h
//  Appodeal
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <Appodeal/APDSdk.h>
#import <Appodeal/APDRewardProtocol.h>

#ifdef ADVANCED_INTEGRATION
#import <Appodeal/AppodealRequestDelegateProtocol.h>
#endif


@class APDRewardedVideo;

/*!
 *  Declaration of rewarded video delegate
 */
@protocol APDRewardedVideoDelegate <NSObject>

@optional

/*!
 *  Method called when rewarded video loads
 *
 *  @param rewardedVideo Ready to show rewarded video
 */
- (void)rewardedVideoDidLoad:(nonnull APDRewardedVideo *)rewardedVideo __attribute__((deprecated("Use geoInfoForAdapter instead")));

/*!
 *  Method called when rewarded video did load
 *
 *  @param rewardedVideo Ready to show rewarded video
 *  @param isPrecache Boolean flag that indicates that loaded rewarded video is preache or not
 *
 */
- (void)rewardedVideoDidLoad:(nonnull APDRewardedVideo *)rewardedVideo isPrecache:(BOOL)isPrecache;

/*!
 *  Method called if skippable rewarded mediation failed
 *
 *  @param rewardedVideo Failed rewarded video
 */
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo didFailToLoadWithError:(nonnull NSError *)error;

/*!
 *  Method called if rewarded video adapter becomes unavailable
 *  This case can occur only for singleton ad networks: AdColony, Vungle, Unity
 *
 *  @param rewardedVideo Failed rewarded video
 */
- (void)rewardedVideoDidBecomeUnavailable:(nonnull APDRewardedVideo *)rewardedVideo __attribute__((deprecated("Use rewardedVideoDidExpired: instead")));;

/**
 Called when rewarded video ad expired

 @param rewardedVideo Rewarded video expired
 */
- (void)rewardedVideoDidExpired:(nonnull APDRewardedVideo *)rewardedVideo;

/*!
 *  Method called after rewarded video shows
 *
 *  @param rewardedVideo Shown rewarded video
 */
- (void)rewardedVideoDidAppear:(nonnull APDRewardedVideo *)rewardedVideo;

/*!
 *  Method called after rewarded video is dismissed from screen
 *
 *  @param rewardedVideo Shown rewarded video
 */
- (void)rewardedVideoDidDisappear:(nonnull APDRewardedVideo *)rewardedVideo wasFullyWatched:(BOOL)wasFullyWatched;

/*!
 *   Method called after rewarded video completes
 *   @warning After calling this method video controller can show postbanner
 *   view and stay on screen.
 *
 *  @param rewardedVideo Completed rewarded video
 *  @param reward        Object conformed APDReward protocol with values turned on in Appodeal Dashboard
 */
- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo didFinishWithReward:(nonnull id<APDReward>)reward;

/*!
 *  Method called if an error occurs while presenting the rewarded video adapter
 *
 *  @param rewardedVideo  Failed rewarded video
 *  @param error          Error occurred
 */

- (void)rewardedVideo:(nonnull APDRewardedVideo *)rewardedVideo didFailToPresentWithError:(nonnull NSError *)error;

@end

/*!
 *  You should have strong reference on loading rewarded video instance
 *  Instance of rewarded video ad can try to load ad only once!
 *  Create new rewarded video before any call -loadAd!
 *  @code - (void) loadRewardedVideo {
            self.rewardedVideo = [APDRewaredVideo new];
            self.rewardedVideo.delegate = self;
            [self.rewardedVideo loadAd]
        }
 */
@interface APDRewardedVideo : NSObject

#ifdef ADVANCED_INTEGRATION
@property (weak, nonatomic, nullable) id<APDRewardedVideoRequestDelegate> requestDelegate;
#endif

/*!
 *  Set delegate to skippable video
 */
@property (weak, nonatomic, nullable) id<APDRewardedVideoDelegate> delegate;

/*!
 *  Set custom placement name, that you create in the Appodeal Dashboard
 */
@property (copy, nonatomic, nullable) NSString *placement;

/*!
 *  Set custom SDK
 */
@property (weak, nonatomic, nullable) APDSdk *customSdk;

/*!
 *  get predicated ecpm
 */
@property (assign, nonatomic, readonly) double predictedEcpm;


@property (assign, nonatomic) BOOL autocache;

/*!
 *  Return reward for current placement
 */
@property (strong, nonatomic, readonly, nonnull) id<APDReward> reward;

/*!
 *  Get rewarded video availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;

+ (nonnull instancetype)rewardedVideoWithSdk:(nullable APDSdk *)sdk
                                    delegate:(nullable id<APDRewardedVideoDelegate>)delegate
                                   autocache:(BOOL)autocache;

/*!
 *  Start loading rewarded video
 */
- (void)loadAd;

/*!
 *  Show ready rewarded video from view controller
 *
 *  @param viewController Current presented view controller
 */
- (void)presentFromViewController:(nonnull UIViewController *)viewController;

@end
