/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface YMMReporterConfiguration : NSObject <NSCopying, NSMutableCopying>

/** Application key used to initialize the configuration.
 */
@property (nonatomic, copy, nullable, readonly) NSString *apiKey;

/** A boolean value indicating whether statistics sending to the AppMetrica server is enabled.

 @note Disabling this option doesn't affect data sending from the main apiKey.

 By default, the statistics sending is enabled.
 */
@property (nonatomic, assign, readonly) BOOL statisticsSending;

/** Session timeout (in seconds).
 Time interval which determines for how long the application is considered active after being resigned.
 */
@property (nonatomic, assign, readonly) NSUInteger sessionTimeout;

/** Logging activation status.
 */
@property (nonatomic, assign, readonly) BOOL logs;

/** Initialize configuration with specified Application key.

 @param apiKey Application key that is issued during application registration in AppMetrica.
 Application key must be a hexadecimal string in format xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
 The key can be requested or checked at https://appmetrica.yandex.com
 */
- (nullable instancetype)initWithApiKey:(NSString *)apiKey;

- (instancetype)init NS_UNAVAILABLE;

@end

@interface YMMMutableReporterConfiguration : YMMReporterConfiguration

/** A boolean value indicating whether statistics sending to the AppMetrica server is enabled.

 @note Disabling this option doesn't affect data sending from the main apiKey.

 By default, the statistics sending is enabled.
 */
@property (nonatomic, assign) BOOL statisticsSending;

/** Session timeout (in seconds).
 Time interval which determines for how long the application is considered active after being resigned.
 */
@property (nonatomic, assign) NSUInteger sessionTimeout;

/** Enables/disables logging.

 By default logging is disabled.
 */
@property (nonatomic, assign) BOOL logs;

- (instancetype)init NS_UNAVAILABLE;

@end

NS_ASSUME_NONNULL_END
