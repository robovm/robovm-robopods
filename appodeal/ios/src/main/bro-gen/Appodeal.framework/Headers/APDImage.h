//
//  APDImage.h
//  Appodeal
//
//  AppodealSDK version 2.4.4.2-Beta
//
//  Copyright © 2018 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreGraphics/CoreGraphics.h>

/*!
 *  Instance of this class contains URL to image source and size of image
 */
@interface APDImage : NSObject

/*!
 *  Size of image, can be APDImageUndefined
 */
@property (nonatomic, assign) CGSize size;

/*!
 *  Url to image source. Can be local
 */
@property (nonatomic, strong, readonly, nonnull) NSURL * url;

@end
