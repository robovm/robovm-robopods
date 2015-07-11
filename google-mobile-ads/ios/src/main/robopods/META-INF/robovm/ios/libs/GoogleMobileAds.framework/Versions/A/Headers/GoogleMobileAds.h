//
//  GoogleMobileAds.h
//  Google Mobile Ads SDK
//
//  Copyright 2014 Google Inc. All rights reserved.

#import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>

#if __IPHONE_OS_VERSION_MIN_REQUIRED < __IPHONE_6_0
#error The Google Mobile Ads SDK requires a deployment target of iOS 6.0 or later.
#endif

//! Project version string for GoogleMobileAds.
FOUNDATION_EXPORT const unsigned char GoogleMobileAdsVersionString[];

#import "GADAdNetworkExtras.h"
#import "GADAdSize.h"
#import "GADBannerView.h"
#import "GADBannerViewDelegate.h"
#import "GADExtras.h"
#import "GADInAppPurchase.h"
#import "GADInAppPurchaseDelegate.h"
#import "GADInterstitial.h"
#import "GADInterstitialDelegate.h"
#import "GADRequest.h"
#import "GADRequestError.h"

#import "DFPBannerView.h"
#import "DFPCustomRenderedAd.h"
#import "DFPCustomRenderedBannerViewDelegate.h"
#import "DFPCustomRenderedInterstitialDelegate.h"
#import "DFPInterstitial.h"
#import "DFPRequest.h"
#import "GADAdSizeDelegate.h"
#import "GADAppEventDelegate.h"

#import "Loading/GADAdLoader.h"
#import "Loading/GADAdLoaderAdTypes.h"
#import "Loading/GADAdLoaderDelegate.h"

#import "Loading/Formats/GADNativeAd.h"
#import "Loading/Formats/GADNativeAdDelegate.h"
#import "Loading/Formats/GADNativeAdImage.h"
#import "Loading/Formats/GADNativeAppInstallAd.h"
#import "Loading/Formats/GADNativeContentAd.h"
#import "Loading/Formats/GADNativeCustomTemplateAd.h"

#import "Loading/Options/GADNativeAdImageAdLoaderOptions.h"

#import "Mediation/GADCustomEventBanner.h"
#import "Mediation/GADCustomEventBannerDelegate.h"
#import "Mediation/GADCustomEventExtras.h"
#import "Mediation/GADCustomEventInterstitial.h"
#import "Mediation/GADCustomEventInterstitialDelegate.h"
#import "Mediation/GADCustomEventRequest.h"

#import "Search/GADSearchBannerView.h"
#import "Search/GADSearchRequest.h"
