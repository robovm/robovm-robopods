//
//  APDRewardProtocol.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>


/*!
 *  Declaration of appodeal reward protocol object
 */
@protocol APDReward <NSObject>

/*!
 *  App currency name. For example @"Coins", @"Stars"
 */
@property (copy,   nonatomic, readonly) NSString *currencyName;

/*!
 *  App currency amount
 */
@property (assign, nonatomic, readonly) NSUInteger amount;

@end
