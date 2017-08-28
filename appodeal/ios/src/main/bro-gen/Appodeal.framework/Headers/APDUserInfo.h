//
//  APDUserInfo.h
//  Appodeal
//
//  Copyright © 2016 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <Appodeal/APDUserInfoProtocol.h>

/**
 *  Instance of class provides user data for targeting
 */
@interface APDUserInfo : NSObject <APDUserInfo>


/**
 *  Set user email
 */
@property (copy, nonatomic) NSString *email;

/**
 *  Set user id
 */
@property (copy, nonatomic) NSString *userId;

/**
 *  Array of user intersets in string
 * @code userInfo.interests = @[@"music", @"sport"];
 */
@property (copy, nonatomic) NSArray *interests;

/**
 *  Set user birthday
 */
@property (strong, nonatomic) NSDate *birthday;

/**
 *  Set user age
 */
@property (assign, nonatomic) NSUInteger age;

/**
 *  Set user gender
 */
@property (assign, nonatomic) APDUserGender gender;

/**
 *  Set user occupation
 */
@property (assign, nonatomic) APDUserOccupation occupation;

/**
 *  Set user relationship
 */
@property (assign, nonatomic) APDUserRelationship relationship;

/**
 *  Set user smoking attitude
 */
@property (assign, nonatomic) APDUserSmokingAttitude smokingAttitude;

/**
 *  Set user alcohol attitude
 */
@property (assign, nonatomic) APDUserAlcoholAttitude alcoholAttitude;

@end
