//
//  APDBannerView.h
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <Appodeal/APDSdk.h>

#ifdef ADVANCED_INTEGRATION
#import <Appodeal/AppodealRequestDelegateProtocol.h>
#endif


@class APDBannerView;

@class APDBannerView;
/*!
 *  Declaration of banner view delegate
 */
@protocol APDBannerViewDelegate <NSObject>

@optional

/*!
 *  Method called when banner view loaded
 *  After refresh, usual banner will be shown if loaded
 *  @param bannerView Ready banner view
 */
- (void)bannerViewDidLoadAd:(nonnull APDBannerView *)bannerView __attribute__((deprecated("Use bannerViewDidLoadAd:isPrecache: instead")));

/*!
 *  Method called after any banner was ready to present.
 *  Maybe called twice for precache banner and usual banner
 *
 *  @param bannerView Nonnul, ready to show banner
 *  @param precache Boolean flag indicates that banner is precache
 */
- (void)bannerViewDidLoadAd:(nonnull APDBannerView *)bannerView isPrecache:(BOOL)precache;

/**
 *  Method called in case that banner mediation failed
 *
 *  @param bannerView Nonnul failed banner view
 *  @param error      Error occured while mediation
 */
- (void)bannerView:(nonnull APDBannerView *)bannerView didFailToLoadAdWithError:(nonnull NSError *)error;

/**
 *  Method called after any banner was show
 *
 *  @param bannerView presented banner view
 */
- (void)bannerViewDidInteract:(nonnull APDBannerView *)bannerView;

/*!

 *  Call when user taps on banner
 *
 *  @param bannerView On screen banner view
 */
- (void)bannerViewDidShow:(nonnull APDBannerView *)bannerView;

/**
 Called in case if banner view was successfully loaded,
 but ad expire before show. Banner will retry to load
 new creative for presentation if autocache enabled

 @param bannerView Expired banner view
 */
- (void)bannerViewExpired:(nonnull APDBannerView *)bannerView;

@end


@interface APDBannerView : UIView 

#ifdef ADVANCED_INTEGRATION
@property (weak, nonatomic, nullable) IBOutlet id<APDBannerViewRequestDelegate> requestDelegate;
#endif
/*!
 *  Set banner view delegate
 */
@property (weak, nonatomic, nullable) IBOutlet id<APDBannerViewDelegate> delegate;

/*!
 *  Set non-null root view controller before loading banner view
 */
@property (weak, nonatomic, nullable) IBOutlet UIViewController *rootViewController;

/*!
 *  Set custom placement, turned on in Appodeal Dashboard
 */
@property (copy, nonatomic, nullable) IBInspectable NSString *placement;

/*!
 *  If this flag is set to YES, banner view will auto-resize after screen rotation
 *  (It is possible to use the flag only if the application supports one orientation)
 *  Set to NO by default
 */
@property (assign, nonatomic) IBInspectable BOOL usesSmartSizing;

/*!
 *  If this flag is set to YES, banner view will refresh after refresh interval turned on in Appodeal Dashboard
 *  Set to YES by default
 */
@property (assign, nonatomic) IBInspectable BOOL autoRefreshing __attribute__((deprecated("Use autocache property instead")));;

@property (assign, nonatomic) IBInspectable BOOL autocache;

/*!
 *  Set valid banner size. Valid values: kAPDAdSize320x50, kAPDAdSize728x90
 */
@property (assign, nonatomic) IBInspectable CGSize adSize;

/*!
 *  Set banner refresh animation
 */
@property (assign, nonatomic) IBInspectable UIViewAnimationOptions refreshAnimation;

/*!
 *  Set banner background visibility
 */
@property (assign, nonatomic) BOOL backgroundVisible;

/*!
 *  get predicated ecpm
 */
@property (assign, nonatomic, readonly) double predictedEcpm;

/*!
 *  Set custom SDK
 */
@property (weak, nonatomic, nullable) APDSdk *customSdk;

/*!
 *  Get banner availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;

+ (instancetype _Nonnull)bannerViewWithSize:(CGSize)adSize
                         rootViewController:(nonnull UIViewController *)rootViewController
                                        sdk:(nullable APDSdk *)sdk
                                   delegate:(nullable id<APDBannerViewDelegate>)delegate
                                  autocache:(BOOL)autocache;

/*!
 *  Initializer
 *
 *  @param adSize kAPDAdSize320x50, kAPDAdSize728x90
 *
 *  @return Instance of APDBannerView
 */
- (instancetype _Nonnull)initWithSize:(CGSize)adSize;

/*!
 *  Initializator
 *
 *  @param adSize kAPDAdSize320x50, kAPDAdSize728x90
 *
 *  @return Instance of APDBannerView
 */
- (instancetype _Nonnull)initWithSize:(CGSize)adSize rootViewController:(nonnull UIViewController *)rootViewController;

/*!
 *  Start loading
 */
- (void)loadAd;

/*!
 *  Call this method when orientation changes
 *
 *  @param orientation Current interface orientation
 */
- (void)rotateToOrientation:(UIInterfaceOrientation)orientation;

@end

@compatibility_alias AppodealBannerView APDBannerView;
@protocol AppodealBannerViewDelegate <APDBannerViewDelegate> @end

