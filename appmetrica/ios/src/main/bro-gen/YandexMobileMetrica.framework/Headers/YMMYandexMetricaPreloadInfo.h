/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#import <Foundation/Foundation.h>

NS_ASSUME_NONNULL_BEGIN

@interface YMMYandexMetricaPreloadInfo : NSObject <NSCopying>

- (instancetype)init __attribute__((unavailable("initWithTrackingIdentifier: must be used instead.")));

/** Initialize Preload info with specific publisher and tracking identifiers.
 If case of invalid identifiers constructor returns nil in release and raises an exception in debug

 @param trackingID Tracking identifier
 */
- (nullable instancetype)initWithTrackingIdentifier:(NSString *)trackingID;

/** Setting key - value data to be used as additional information, associated with preload info.

 @param info Additional preload info.
 @param key Additional preload key.
 */
- (void)setAdditionalInfo:(NSString *)info forKey:(NSString *)key;

@end

NS_ASSUME_NONNULL_END
