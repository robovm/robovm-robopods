//
//  APDMRECView.h
//  Appodeal
//
//  AppodealSDK 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Appodeal/APDBannerView.h>

/*!
 * Instance of this class returns rectangular banner of size 300x250
 * All methods/properties besides initializer similar to APDBannerView
 */

__attribute__((deprecated("This class is deprecated and will be removed in next release")))
@interface APDMRECView : APDBannerView

/*!
 *  Use -init method to create instance APDMRECView
 *
 */
- (instancetype)init;

@end

@compatibility_alias AppodealMRECView APDMRECView;
