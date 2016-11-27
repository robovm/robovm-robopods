//
//  APDBannerView.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <Appodeal/APDSdk.h>

@class APDBannerView;

/*!
 *  Declaration of banner view delegate
 */
@protocol APDBannerViewDelegate <NSObject>

@optional

/*!
 *  Method called when banner view did load in first time
 *
 *  @param bannerView Ready banner view
 */
- (void)bannerViewDidLoadAd:(APDBannerView *)bannerView;

/*!
 *  Method called when precache (cheap and fast load) banner view did load
 *  After refresh will be show usual banner if loaded
 *  @param precacheBannerView Ready precache
 */
- (void)precacheBannerViewDidLoadAd:(APDBannerView *)precacheBannerView;

/*!
 *  Method called after any banner refresh
 *
 *  @param bannerView On screen banner view
 */
- (void)bannerViewDidRefresh:(APDBannerView *)bannerView;

/*!
 *  Method called if banner view if banner mediation failed
 *
 *  @param bannerView Failed banner
 *  @param error      Occured error
 */
- (void)bannerView:(APDBannerView *)bannerView didFailToLoadAdWithError:(NSError *)error;

/*!
 *  Call when user tap on banner
 *
 *  @param bannerView On screen banner view
 */
- (void)bannerViewDidReceiveTapAction:(APDBannerView *)bannerView;

@end


@interface APDBannerView : UIView

/*!
 *  Set banner view delegate
 */
@property (weak, nonatomic) IBOutlet id<APDBannerViewDelegate> delegate;

/*!
 *  Set nonnul root view controller before load banner view
 */
@property (weak, nonatomic) IBOutlet UIViewController *rootViewController;

/*!
 *  Set custom placed, tuned on Appodeal Dashboard
 */
@property (copy, nonatomic) IBInspectable NSString *placement;

/*!
 *  If this flag set YES banner view will autoresize after screen rotation
 *  By default set to NO
 */
@property (assign, nonatomic) IBInspectable BOOL usesSmartSizing;

/*!
 *  If this flag set to YES banner view will refreshing after refresh interval tuned in Appodeal Dashboard
 *  Default set to YES
 */
@property (assign, nonatomic) IBInspectable BOOL autoRefreshing;

/*!
 *  Set valid banner size. Valid values: kAPDAdSize320x50, kAPDAdSize728x90
 */
@property (assign, nonatomic) IBInspectable CGSize adSize;

/*!
 *  @brief Set banner refreshing
 */
@property (assign, nonatomic) IBInspectable UIViewAnimationOptions refreshAnimation;

/*!
 *  @brief Set banner background visability
 */
@property (assign, nonatomic) BOOL backgroundVisible;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic) APDSdk *customSdk;

/*!
 *  Getter banner availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;

/*!
 *  Iitializator
 *
 *  @param adSize kAPDAdSize320x50, kAPDAdSize728x90
 *
 *  @return Instance of APDBannerView
 */
- (instancetype)initWithSize:(CGSize)adSize;

/*!
 *  Start loading
 */
- (void)loadAd;

/*!
 *  Start loading precache banner, after that automatically usual load start
 */
- (void)loadAdWhithPrecache;

/*!
 *  Call this method when orientation change
 *
 *  @param orientation Current interface orientation
 */
- (void)rotateToOrientation:(UIInterfaceOrientation)orientation;

@end


