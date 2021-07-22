/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#import <Foundation/Foundation.h>
#import "YMMCompletionBlocks.h"

@class CLLocation;
@class YMMYandexMetricaConfiguration;
@class YMMReporterConfiguration;
@class YMMUserProfile;
@class YMMRevenueInfo;
@protocol YMMYandexMetricaReporting;

NS_ASSUME_NONNULL_BEGIN

extern NSString *const kYMMYandexMetricaErrorDomain;

typedef NS_ENUM(NSInteger, YMMYandexMetricaEventErrorCode) {
    YMMYandexMetricaEventErrorCodeInitializationError = 1000,
    YMMYandexMetricaEventErrorCodeInvalidName = 1001,
    YMMYandexMetricaEventErrorCodeJsonSerializationError = 1002,
    YMMYandexMetricaEventErrorCodeInvalidRevenueInfo = 1003,
    YMMYandexMetricaEventErrorCodeEmptyUserProfile = 1004,
};

@interface YMMYandexMetrica : NSObject

/** Starting the statistics collection process.

 @param configuration Configuration combines all AppMetrica settings in one place.
 Configuration initialized with unique application key that is issued during application registration in AppMetrica.
 Application key must be a hexadecimal string in format xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
 The key can be requested or checked at https://appmetrica.yandex.com
 */
+ (void)activateWithConfiguration:(YMMYandexMetricaConfiguration *)configuration;

/** Reporting custom event.

 @param message Short name or description of the event.
 @param onFailure Block to be executed if an error occurs while reporting, the error is passed as block argument.
 */
+ (void)reportEvent:(NSString *)message
          onFailure:(nullable void (^)(NSError *error))onFailure;

/** Reporting custom event with additional parameters.

 @param message Short name or description of the event.
 @param params Dictionary of name/value pairs that should be sent to the server.
 @param onFailure Block to be executed if an error occurs while reporting, the error is passed as block argument.
 */
+ (void)reportEvent:(NSString *)message
         parameters:(nullable NSDictionary *)params
          onFailure:(nullable void (^)(NSError *error))onFailure;

/** Reporting custom error messages.

 @param message Short name or description of the error
 @param exception Exception contains an NSException object that must be passed to the server. It can take the nil value.
 @param onFailure Block to be executed if an error occurs while reporting, the error is passed as block argument.
 */
+ (void)reportError:(NSString *)message
          exception:(nullable NSException *)exception
          onFailure:(nullable void (^)(NSError *error))onFailure;

/** Sends information about the user profile.
 
 @param userProfile The `YMMUserProfile` object. Contains user profile information.
 @param onFailure Block to be executed if an error occurs while reporting, the error is passed as block argument.
 */
+ (void)reportUserProfile:(YMMUserProfile *)userProfile
                onFailure:(nullable void (^)(NSError *error))onFailure;

/** Sends information about the purchase.

 @param revenueInfo The `YMMRevenueInfo` object. Contains purchase information
 @param onFailure Block to be executed if an error occurs while reporting, the error is passed as block argument.
 */
+ (void)reportRevenue:(YMMRevenueInfo *)revenueInfo
            onFailure:(nullable void (^)(NSError *error))onFailure;

/** Sets the ID of the user profile.

 @warning The value can contain up to 200 characters
 @param userProfileID The custom user profile ID
 */
+ (void)setUserProfileID:(nullable NSString *)userProfileID;

/** Enables/disables statistics sending to the AppMetrica server.

 @note Disabling this option also turns off data sending from the reporters that initialized for different apiKey.

 @param enabled Flag indicating whether the statistics sending is enabled. By default, the sending is enabled.
 */
+ (void)setStatisticsSending:(BOOL)enabled;

/** Enables/disables location reporting to AppMetrica.
 If enabled and location set via setLocation: method - that location would be used.
 If enabled and location is not set via setLocation,
 but application has appropriate permission - CLLocationManager would be used to acquire location data.
 
 @param enabled Flag indicating if reporting location to AppMetrica enabled
 Enabled by default.
 */
+ (void)setLocationTracking:(BOOL)enabled;

/** Sets location to AppMetrica.
 To enable AppMetrica to use this location trackLocationEnabled should be 'YES'

 @param location Custom device location to be reported.
 */
+ (void)setLocation:(nullable CLLocation *)location;

/** Retrieves current version of library.
 */
+ (NSString *)libraryVersion;

/** Retrieves unique AppMetrica device identifier. It is used to identify a device in the statistics.

 @note AppMetrica device ID is used in the Logs API and Post API as 'appmetrica_device_id'.

 @param queue Queue for the block to be dispatched to. If nil, main queue is used.
 @param block Block will be dispatched upon identifier becoming available or in a case of error.
 */
+ (void)requestAppMetricaDeviceIDWithCompletionQueue:(nullable dispatch_queue_t)queue
                                     completionBlock:(YMMAppMetricaDeviceIDRetrievingBlock)block;

/** Handles the URL that has opened the application.
 Reports the URL for deep links tracking.
 URL scheme should be registered beforehand via `enableTrackingWithUrlScheme:` method for tracking to work correctly.

 @param url URL that has opened the application.
 */
+ (BOOL)handleOpenURL:(NSURL *)url;

/** Activates reporter with specific configuration.

 @param configuration Configuration combines all reporter settings in one place.
 Configuration initialized with unique application key that is issued during application registration in AppMetrica.
 Application key must be a hexadecimal string in format xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
 The key can be requested or checked at https://appmetrica.yandex.com
 */
+ (void)activateReporterWithConfiguration:(YMMReporterConfiguration *)configuration;

/** Returns id<YMMYandexMetricaReporting> that can send events to specific API key.
 To customize configuration of reporter activate with 'activateReporterWithConfiguration:' method first.

 @param apiKey Api key to send events to.
 @return id<YMMYandexMetricaReporting> that conforms to YMMYandexMetricaReporting and handles 
 sending events to specified apikey
 */
+ (nullable id<YMMYandexMetricaReporting>)reporterForApiKey:(NSString *)apiKey;

/**
 * Sets referral URL for this installation. This might be required to track some specific traffic sources like Facebook.
 * @param url referral URL value.
 */
+ (void)reportReferralUrl:(NSURL *)url;

/** Sends all stored events from the buffer.

 AppMetrica SDK doesn't send events immediately after they occurred. It stores events data in the buffer.
 This method sends all the data from the buffer and flushes it.
 Use the method to force stored events sending after important checkpoints of user scenarios.

 @warning Frequent use of the method can lead to increasing outgoing internet traffic and energy consumption.
 */
+ (void)sendEventsBuffer;

@end

NS_ASSUME_NONNULL_END
