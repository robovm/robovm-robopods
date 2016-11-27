//
//  APDSkippableVideo.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#import <Appodeal/APDSdk.h>


@class APDSkippableVideo;

/*!
 *  Declaration of skippable video delegate
 */
@protocol APDSkippableVideoDelegate <NSObject>

@optional

/*!
 *  Method called when skippable video did load
 *
 *  @param skippableVideo Ready to show skippable video
 */
- (void)skippableVideoDidLoad:(APDSkippableVideo *)skippableVideo;

/*!
 *  Method called if skippable video mediation was failed
 *
 *  @param skippableVideo Failed skippable video
 */
- (void)skippableVideo:(APDSkippableVideo *)skippableVideo didFailToLoadWithError:(NSError *)error;

/*!
 *  Method called if skippable video adapter become unavailable
 *  This case can occure only for singleton ad networks: AdColony, Vungle, Unity
 *
 *  @param skippableVideo Failed skippable video
 */
- (void)skippableVideoDidBecomeUnavailable:(APDSkippableVideo *)skippableVideo;

/*!
 *  Method called after skippable video did show
 *
 *  @param skippableVideo Shown skippable video
 */
- (void)skippableVideoDidAppear:(APDSkippableVideo *)skippableVideo;

/*!
 *  Method called after skippable video did finish
 *  @warning Not all video ad networks provides this callback
 *  therefore this callback may not called even video was fully watched
 *
 *  @param skippableVideo Shown skippable video
 */
- (void)skippableVideoDidFinish:(APDSkippableVideo *)skippableVideo;

/*!
 *  Method called after skippable video did dismiss from screen
 *
 *  @param skippableVideo Shown skippable video
 */
- (void)skippableVideoDidDisappear:(APDSkippableVideo *)skippableVideo;

/*!
 *  Method called if skippable video adapter occure some error while presenting
 *
 *  @param skippableVideo Failed skippable video
 *  @param error          Occured error
 */
- (void)skippableVideo:(APDSkippableVideo *)skippableVideo didFailToPresentWithError:(NSError *)error;

@end


/*!
 *  You should have strong refrence on loading skippable video instance
 *  Instance of skippable video ad can try to load ad only once!
 *  Create new skippable video before any call -loadAd!
 *  @code - (void) loadSkippableVideo {
    self.skippableVideo = [APDSkippableVideo new];
    self.skippableVideo.delegate = self;
    [self.skippableVideo loadAd]
 }
 */
@interface APDSkippableVideo : NSObject

/*!
 *  Set delegate to skippable video
 */
@property (weak, nonatomic) id<APDSkippableVideoDelegate> delegate;

/*!
 *  Set custom placement name, that you create in Appodeal Dashbord
 */
@property (copy, nonatomic) NSString *placement;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic) APDSdk *customSdk;

/*!
 *  Getter skippable video availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;

/*!
 *  Start skippable video loading
 */
- (void)loadAd;

/*!
 *  Show ready skippable video from view controller
 *
 *  @param viewController Current presented view controller
 */
- (void)presentFromViewController:(UIViewController *)viewController;

@end
