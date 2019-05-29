/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#import <Foundation/Foundation.h>

@class YMMUserProfileUpdate;

NS_ASSUME_NONNULL_BEGIN

/** The class to store a user profile.
 User profile is a set of user attributes.
 User profile details are displayed in the AppMetrica User profiles report.

 The UserProfile object should be passed to the AppMetrica server by using the `reportUserProfile`
 method of the `YMMYandexMetrica` class.

 AppMetrica has some predefined attributes. You can use them or create own custom attributes. Use the
 `YMMProfileAttribute` interface to create attributes.

 User profiles are stored on the AppMetrica server.
 */
@interface YMMUserProfile : NSObject <NSCopying, NSMutableCopying>

/** An array with applied attributes.
 */
@property (nonatomic, copy, readonly) NSArray<YMMUserProfileUpdate *> *updates;

/** Initialize user profile with specified applied attributes.

 @param updates An array with profile updates
 */
- (instancetype)initWithUpdates:(NSArray<YMMUserProfileUpdate *> *)updates;

@end

/** Mutable version of the `YMMUserProfile` class.
 */
@interface YMMMutableUserProfile : YMMUserProfile

/** Applies single user profile update.

 @param update The `YMMUserProfileUpdate` object
 */
- (void)apply:(YMMUserProfileUpdate *)update;

/** Applies user profile updates.

 @param updatesArray The array of `YMMUserProfileUpdate` objects
 */
- (void)applyFromArray:(NSArray<YMMUserProfileUpdate *> *)updatesArray;

@end

NS_ASSUME_NONNULL_END
