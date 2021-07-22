/*
 * Version for iOS
 * © 2012–2019 YANDEX
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://yandex.com/legal/appmetrica_sdk_agreement/
 */

#ifndef YMMCompletionBlocks_h
#define YMMCompletionBlocks_h

/** Identifiers callback block

 @param appMetricaDeviceID Contains retrieved appMetricaDeviceID
 Empty appMetricaDeviceID may be returned if server by any reason did not provide identifier.

 @param error Error of NSURLErrorDomain. In a case of error appMetricaDeviceID param is nil.
 */
typedef void(^YMMAppMetricaDeviceIDRetrievingBlock)(NSString * _Nullable appMetricaDeviceID, NSError * _Nullable error);

#endif /* YMMCompletionBlocks_h */
