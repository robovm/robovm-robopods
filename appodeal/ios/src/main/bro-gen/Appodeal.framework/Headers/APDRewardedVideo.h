//
//  APDReviewVideo.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <Appodeal/APDSdk.h>
#import <Appodeal/APDRewardProtocol.h>

@class APDRewardedVideo;


/*!
 *  Declaration of rewarded video delegate
 */
@protocol APDRewardedVideoDelegate <NSObject>

@optional

/*!
 *  Method called when rewarded video did load
 *
 *  @param rewardedVideo Ready to show rewarded video
 */
- (void)rewardedVideoDidLoad:(APDRewardedVideo *)rewardedVideo;

/*!
 *  Method called if skippable rewarded mediation was failed
 *
 *  @param rewardedVideo Failed rewarded video
 */
- (void)rewardedVideo:(APDRewardedVideo *)rewardedVideo didFailToLoadWithError:(NSError *)error;

/*!
 *  Method called if rewarded video adapter become unavailable
 *  This case can occure only for singleton ad networks: AdColony, Vungle, Unity
 *
 *  @param rewardedVideo Failed rewarded video
 */
- (void)rewardedVideoDidBecomeUnavailable:(APDRewardedVideo *)rewardedVideo;

/*!
 *  Method called after rewarded video did show
 *
 *  @param rewardedVideo Shown rewarded video
 */
- (void)rewardedVideoDidAppear:(APDRewardedVideo *)rewardedVideo;

/*!
 *  Method called after rewarded video did dismiss from screen
 *
 *  @param rewardedVideo Shown rewarded video
 */
- (void)rewardedVideoDidDisappear:(APDRewardedVideo *)rewardedVideo;

/*!
 *   Method called after rewarded video did finish
 *   @warning After call this method video controller can show postbanner 
 *   view and stay on screen.
 *
 *  @param rewardedVideo Finished rewarded video
 *  @param reward        Object conformed APDReward protocol with values tunned by Dashboard
 */
- (void)rewardedVideo:(APDRewardedVideo *)rewardedVideo didFinishWithReward:(id<APDReward>)reward;

/*!
 *  Method called if rewarded video adapter occure some error while presenting
 *
 *  @param rewardedVideo  Failed rewarded video
 *  @param error          Occured error
 */

- (void)rewardedVideo:(APDRewardedVideo *)rewardedVideo didFailToPresentWithError:(NSError *)error;

@end

/*!
 *  You should have strong refrence on loading rewarded video instance
 *  Instance of rewarded video ad can try to load ad only once!
 *  Create new rewarded video before any call -loadAd!
 *  @code - (void) loadRewardedVideo {
 self.rewardedVideo = [APDRewaredVideo new];
 self.rewardedVideo.delegate = self;
 [self.rewardedVideo loadAd]
 }
 */
@interface APDRewardedVideo : NSObject

/*!
 *  Set delegate to skippable video
 */
@property (weak, nonatomic) id<APDRewardedVideoDelegate> delegate;

/*!
 *  Set custom placement name, that you create in Appodeal Dashbord
 */
@property (copy, nonatomic) NSString *placement;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic) APDSdk *customSdk;

/*!
 *  Getter rewarded video availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;

/*!
 *  Start rewarded video loading
 */
- (void)loadAd;

/*!
 *  Show ready rewarded video from view controller
 *
 *  @param viewController Current presented view controller
 */
- (void)presentFromViewController:(UIViewController *)viewController;

@end
