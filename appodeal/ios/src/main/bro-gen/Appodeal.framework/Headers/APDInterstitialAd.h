//
//  APDInterstital.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <Appodeal/APDSdk.h>

@class APDInterstitialAd;

/*!
 *  Declaration of interstitial delgate
 */
@protocol APDInterstitalAdDelegate <NSObject>

@optional

/*!
 *  Method called when interstital did load
 *
 *  @param interstitialAd Instance of ready to show interstitial
 */
- (void)interstitialAdDidLoad:(APDInterstitialAd *)interstitialAd;

/*!
 *  Method called if precache interstitial (cheap and fast loading) did load.
 *  If you want to show only expensive ad ignore this method!
 *
 *  @param precacheInterstitial Instance of ready interstitial
 */
- (void)precacheInterstitialAdDidLoad:(APDInterstitialAd *)precacheInterstitial;

/*!
 *  Method called if interstitial mediation attempt was unsucessfull
 *
 *  @param interstitialAd Instance of failed interstitial
 *  @param error          Mediation error
 */
- (void)interstitialAd:(APDInterstitialAd *)interstitialAd didFailToLoadWithError:(NSError *)error;

/*!
 *  Method called when interstitial did show on screen
 *
 *  @param interstitialAd Shown interstitial
 */
- (void)interstitialAdDidAppear:(APDInterstitialAd *)interstitialAd;

/*!
 *  Method called when interstitial did dismiss from screen
 *
 *  @param interstitialAd Shown interstitial
 */
- (void)interstitialAdDidDisappear:(APDInterstitialAd *)interstitialAd;

/*!
 *  Method called in case that interstitial failed while showing
 *  For example current ad network occure error
 *
 *  @param interstitialAd Shown interstitial
 *  @param error          Error
 */
- (void)interstitialAd:(APDInterstitialAd *)interstitialAd didFailToPresentWithError:(NSError *)error;

/*!
 *  Call when user tap on interstital
 *
 *  @param interstitialAd Shown interstitial
 */- (void)interstitialAdDidRecieveTapAction:(APDInterstitialAd *)interstitialAd;

@end


/*!
 *  You should have strong refrence on loading interstial instance
 *  Instance of interstital ad can try to load ad only once!
 *  Create new interstial before any call -loadAd!
 *  @code - (void) loadInterstitial {
        self.interstital = [APDInterstitialAd new];
        self.interstital.delegate = self;
        [self.interstital loadAd]
    }
 */
@interface APDInterstitialAd : NSObject

/*!
 *  Set interstitial delegate
 */
@property (weak, nonatomic) id<APDInterstitalAdDelegate> delegate;

/*!
 *  Set custom placement name, that you create in Appodeal Dashbord
 */
@property (copy, nonatomic) NSString *placement;

/*!
 *  Set custom sdk
 */
@property (weak, nonatomic) APDSdk *customSdk;

/*!
 *  Getter interstital availability
 */
@property (assign, nonatomic, readonly, getter=isReady) BOOL ready;


/*!
 *  Getter interstitial already show
 */
@property (assign, nonatomic, readonly) BOOL hasBeenPresented;

/*!
 *  Start interstiail loading
 */
- (void)loadAd;

/*!
 *  Show ready interstital from view controller
 *
 *  @param viewController Current presented view controller
 */
- (void)presentFromViewController:(UIViewController *)viewController;

@end

