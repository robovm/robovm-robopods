/*
 *  Copyright (c) 2014, Facebook, Inc.
 *  All rights reserved.
 *
 *  This source code is licensed under the BSD-style license found in the
 *  LICENSE file in the root directory of this source tree. An additional grant
 *  of patent rights can be found in the PATENTS file in the same directory.
 *
 */
 
#import <Foundation/Foundation.h>

#import "BoltsVersion.h"
#import "BFExecutor.h"
#import "BFTask.h"
#import "BFTaskCompletionSource.h"

#import "BFAppLinkResolving.h"
#import "BFWebViewAppLinkResolver.h"
#import "BFAppLinkNavigation.h"
#import "BFAppLink.h"
#import "BFAppLinkTarget.h"
#import "BFURL.h"
#import "BFMeasurementEvent.h"
#import "BFAppLinkReturnToRefererController.h"
#import "BFAppLinkReturnToRefererView.h"

/*! @abstract 80175001: There were multiple errors. */
extern NSInteger const kBFMultipleErrorsError;

@interface Bolts : NSObject

/*!
 Returns the version of the Bolts Framework as an NSString.
 @returns The NSString representation of the current version.
 */
+ (NSString *)version;

@end
