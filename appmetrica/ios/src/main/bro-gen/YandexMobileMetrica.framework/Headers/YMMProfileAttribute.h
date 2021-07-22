/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#import <Foundation/Foundation.h>

#ifndef NS_SWIFT_NAME
#define NS_SWIFT_NAME(name)
#endif

NS_ASSUME_NONNULL_BEGIN

/** This class indicates user profile update.
 */
@interface YMMUserProfileUpdate : NSObject

@end

/** The name attribute protocol.
 It enables setting user name for the profile.

 @warning The maximum length of the user profile name is 100 characters.
 */
@protocol YMMNameAttribute <NSObject>

/** Updates the name attribute with the specified value.

 @param value Name attribute. It can contain up to 100 characters
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(nullable NSString *)value;

/** Resets the name attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** Gender enumeration.
 */
typedef NS_ENUM(NSUInteger, YMMGenderType) {

/** Male gender type.
 */
    YMMGenderTypeMale,

/** Female gender type.
 */
    YMMGenderTypeFemale,

/** Other gender type.
 You can set the `YMMGenderTypeOther` value to the gender attribute and pass additional info using the custom attribute.
 */
    YMMGenderTypeOther,
};

/** The gender attribute protocol.
 It enables linking user gender with the profile.
 */
@protocol YMMGenderAttribute <NSObject>

/** Updates the gender attribute with the specified value.

 @param value One of the `YMMGenderType` enumeration values
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(YMMGenderType)value;

/** Resets the gender attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The birth date attribute protocol.
 It enables linking user birth date with the profile.
 */
@protocol YMMBirthDateAttribute <NSObject>

/** Updates the birth date attribute with the specified value.
 It calculates the birth year by using the following formula:

    Birth Year = currentYear - age.

 @param value Age of the user
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withAge:(NSUInteger)value;

/** Updates the birth date attribute with the specified value.
 This method sets the year of birth date.

 @param year Year of birth
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withYear:(NSUInteger)year NS_SWIFT_NAME(withDate(year:));

/** Updates the birth date attribute with the specified values.
 This method sets the year and month of the birth date.

 @param year Year of birth
 @param month Month of birth
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withYear:(NSUInteger)year
                             month:(NSUInteger)month NS_SWIFT_NAME(withDate(year:month:));

/** Updates the birth date attribute with the specified values.
 This methods sets year, month and day of the month of the birth date.

 @param year Year of birth
 @param month Month of birth
 @param day Day of the month of birth
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withYear:(NSUInteger)year
                             month:(NSUInteger)month
                               day:(NSUInteger)day NS_SWIFT_NAME(withDate(year:month:day:));

/** Updates the birth date attribute with the specified value.

 @param dateComponents Birth date value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withDateComponents:(NSDateComponents *)dateComponents NS_SWIFT_NAME(withDate(dateComponents:));

/** Resets the birth date attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The NotificationsEnabled attribute protocol.
 It indicates whether the user has enabled notifications for the application.
 It enables setting notification status for the profile.
 */
@protocol YMMNotificationsEnabledAttribute <NSObject>

/** Updates the NotificationsEnabled attribute with the specified value.
 It indicates whether the user has enabled notifications for the application.

 @param value Notification state value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(BOOL)value;

/** Resets the NotificationsEnabled attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The string attribute protocol.
 It enables creating custom string attribute for the profile.

 @warning The maximum length of the custom string attribute value is 200 characters.
 */
@protocol YMMCustomStringAttribute <NSObject>

/** Updates the string attribute with the specified value.

 @param value String value. It can contain up to 200 characters
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(nullable NSString *)value;

/** Updates the attribute with the specified value only if the attribute value is undefined.
 The method doesn't affect the value if it has been set earlier.

 @param value String value. It can contain up to 200 characters
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueIfUndefined:(nullable NSString *)value;

/** Resets the attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The number attribute protocol.
 It enables creating custom number attribute for the profile.
 */
@protocol YMMCustomNumberAttribute <NSObject>

/** Updates the number attribute with the specified value.

 @param value Number value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(double)value;

/** Updates the attribute with the specified value only if the attribute value is undefined.
 The method doesn't affect the value if it has been set earlier.

 @param value Number value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueIfUndefined:(double)value;

/** Resets the attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The counter attribute protocol.
 It enables creating custom counter for the profile.
 */
@protocol YMMCustomCounterAttribute <NSObject>
/** Updates the counter attribute value with the specified delt a value.

 @param value Delta value to change the counter attribute value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withDelta:(double)value;

@end

/** The boolean attribute protocol.
 It enables creating custom boolean attribute for the profile.
 */
@protocol YMMCustomBoolAttribute <NSObject>

/** Updates the bool attribute with the specified value.

 @param value Bool value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValue:(BOOL)value;

/** Updates the attribute with the specified value only if the attribute value is undefined.
 The method doesn't affect the value if it has been set earlier.

 @param value Bool value
 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueIfUndefined:(BOOL)value;

/** Resets the attribute value.

 @return The `YMMUserProfileUpdate` object
 */
- (YMMUserProfileUpdate *)withValueReset;

@end

/** The attribute class
 Attribute is a property of the user profile.
 You can use predefined attributes (e.g. name, gender, etc.) or create your own.
 AppMetrica allows you to create up to 100 custom attributes.
 */
@interface YMMProfileAttribute : NSObject

/** Creates a name attribute.

 @return The `YMMNameAttribute` object
 */
+ (id<YMMNameAttribute>)name;

/** Creates a gender attribute.

 @return The `YMMGenderAttribute` object
 */
+ (id<YMMGenderAttribute>)gender;

/** Creates a birth date attribute.

 @return The `YMMBirthDateAttribute` object
 */
+ (id<YMMBirthDateAttribute>)birthDate;

/** Creates a NotificationsEnabled attribute.
 It indicates whether the user has enabled notifications for the application.

 @return The `YMMNotificationsEnabledAttribute` object
 */
+ (id<YMMNotificationsEnabledAttribute>)notificationsEnabled;

/** Creates a custom string attribute.

 @param name Attribute name. It can contain up to 200 characters
 @return The `YMMCustomStringAttribute` object
 */
+ (id<YMMCustomStringAttribute>)customString:(NSString *)name;

/** Creates a custom number attribute.

 @param name Attribute name. It can contain up to 200 characters
 @return The `YMMCustomNumberAttribute` object
 */
+ (id<YMMCustomNumberAttribute>)customNumber:(NSString *)name;

/** Creates a custom counter attribute.

 @param name Attribute name. It can contain up to 200 characters
 @return The `YMMCustomCounterAttribute` object
 */
+ (id<YMMCustomCounterAttribute>)customCounter:(NSString *)name;

/** Creates a custom boolean attribute.

 @param name Attribute name. It can contain up to 200 characters
 @return The `YMMCustomBoolAttribute` object
 */
+ (id<YMMCustomBoolAttribute>)customBool:(NSString *)name;

@end

NS_ASSUME_NONNULL_END
