//
//  APDDefines.h
//  Appodeal
//
//  Copyright © 2015 Appodeal, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <CoreGraphics/CoreGraphics.h>

/*!
 *  Default APDBanner sizes
 */
extern const CGSize kAPDAdSize320x50;
extern const CGSize kAPDAdSize728x90;
extern const CGSize kAPDAdSize300x250;

/*!
 *  Used in native ad image
 *  Equals to CGSizeZero
 */
extern const CGSize kAPDImageSizeUndefined;

/*!
 *  Size validation
 *
 *  @param size kAPDAdSize320x50, kAPDAdSize728x90, kAPDAdSize300x250
 *
 *  @return BOOL
 */
extern BOOL   APDIsAdSizeValid(const CGSize size);

/*!
 *  Getter of nearest appodeal valid size
 *
 *  @param size CGSize
 *
 *  @return kAPDAdSize320x50, kAPDAdSize728x90, kAPDAdSize300x250
 */
extern CGSize APDNearestValidAdSizeForCGSize(const CGSize size);

/*!
 *  Getter of current sdk version
 *
 *  @return current sdk version
 */
NSString * APDSdkVersionString();

extern NSString * const kAPDErrorDomain;

/*!
 *  Appodeal sdk error types
 */
typedef NS_ENUM(NSInteger, APDError) {
    /*!
     *  Unknown error
     */
    APDUnknownError = 195944097,
    /*!
     * Inconsistency error, occure for example if some kind 
     * of ads start loading, but APDSdk does not initialized 
     * for this type
     */
    APDInternalInconsistencyError,
    /*!
     *  Any network error, for example server is not available
     */
    APDNetworkingError,
    /*!
     *  Errors of this type occure if some network responses contains
     *  data of unsupported/unexpected type
     */
    APDJSONDecodeError,
    /*!
     *  Ad network returns no fill
     */
    APDNoFillError,
    /*!
     *  Mediation failed
     */
    APDMediationError,
    /*!
     *  Presentation failed
     */
    APDPresentationError,
    /*!
     *  Inconsistency size
     */
    APDInvalidAdSizeError,
    /*!
     *  Invalid type was loaded
     */
    APDInvalidAdTypeError,
    /*!
     *  Error while unarchiving cached data
     */
    APDUnarchiveError
};


/*!
 *  Log flags
 */
typedef NS_OPTIONS(NSUInteger, APDLogFlag) {
    /*!
     *  Only error messages is writed to console.
     *  If you see this messages, you must to 
     *  check your integration
     */
    APDLogFlagError   = 1 << 0,
    /*!
     *  Warning and error messages is writed to console.
     *  Different warnings occured while sdk work
     */
    APDLogFlagWarning = 1 << 1,
    /*!
     *  Erorr, warning and information messages is writed to console.
     */
    APDLogFlagInfo    = 1 << 2,
    /*!
     *  Debug messages writed to console
     */
    APDLogFlagDebug   = 1 << 3,
    /*!
     *  All sdk messages writed to console
     */
    APDlogFlagVerbose = 1 << 4
};

/*!
 *  Log levels. Set some value to [APDSdk setLogLevel:]
 */
typedef NS_ENUM(NSUInteger, APDLogLevel) {
    /*!
     *  Log levels
     */
    APDLogLevelOff     = 0,
    /*!
     *  Only error messages is writed to console.
     *  If you see this messages, you must to
     *  check your integration
     */
    APDLogLevelError   = APDLogFlagError,
    /*!
     *  Warning and error messages is writed to console.
     *  Different warnings occured while sdk work
     */
    APDLogLevelWarning = APDLogLevelError   | APDLogFlagWarning,
    /*!
     *  Erorr, warning and information messages is writed to console.
     */
    APDLogLevelInfo    = APDLogLevelWarning | APDLogFlagInfo,
    /*!
     *  Debug messages writed to console
     */
    APDLogLevelDebug   = APDLogLevelInfo    | APDLogFlagDebug,
    /*!
     *  All sdk messages writed to console
     */
    APDLogLevelVerbose = APDLogLevelDebug   | APDlogFlagVerbose
};

/*!
 *  APDSdk supported ad types. You can initialize sdk with
 *  several ad types, by usage binary operand |
 *  For example: APDAdTypeInterstitialAd | APDAdTypeSkippableVideo
 */
typedef NS_OPTIONS(NSUInteger, APDAdType) {
    /*!
     *  Interstital ad
     */
    APDAdTypeInterstitialAd = 1 << 0,
    /*!
     *  Skippavle video ad
     */
    APDAdTypeSkippableVideo = 1 << 1,
    /*!
     *  Banner ad
     */
    APDAdTypeBanner         = 1 << 2,
    /*!
     *  Native ad
     */
    APDAdTypeNativeAd       = 1 << 3,
    /*!
     *  Rewarded ad
     */
    APDAdTypeRewardedVideo  = 1 << 4,
    /*!
     *  Rectangle banner (banner of size 300x250)
     */
    APDAdTypeMREC           = 1 << 5
};

/*!
 *  Native ad types
 */
typedef NS_ENUM(NSUInteger, APDNativeAdType) {
    /*!
     * Native ad loaded can contains video
     * It's depend filled ad network
     */
    APDNativeAdTypeAuto = 0,
    /*!
     *  Native ad contains video
     */
    APDNativeAdTypeVideo,
    /*!
     *  Native ad  does not contain video
     */
    APDNativeAdTypeNoVideo
};

/*!
 *  Gender enum
 */
typedef NS_ENUM(NSUInteger, APDUserGender) {
    /*!
     *  User's gender is undefined
     */
    APDUserGenderOther = 0,
    /*!
     *  Female
     */
    APDUserGenderFemale,
    /*!
     *  Male
     */
    APDUserGenderMale
};

/*!
 *  User ocupation
 */
typedef NS_ENUM(NSUInteger, APDUserOccupation) {
    /*!
     *  User's occupation is undefined / not contains in other values
     */
    APDUserOccupationOther = 0,
    /*!
     *  Work
     */
    APDUserOccupationWork,
    /*!
     *  School
     */
    APDUserOccupationSchool,
    /*!
     *  University
     */
    APDUserOccupationUniversity
};

/*!
 *  User relationship
 */
typedef NS_ENUM(NSUInteger, APDUserRelationship) {
    /*!
     *  User's relationship is undefined / not contains in other values
     */
    APDUserRelationshipOther = 0,
    /*!
     *  Single
     */
    APDUserRelationshipSingle,
    /*!
     *  Dating
     */
    APDUserRelationshipDating,
    /*!
     *  Engaged
     */
    APDUserRelationshipEngaged,
    /*!
     *  Married
     */
    APDUserRelationshipMarried,
    /*!
     *  Searching
     */
    APDUserRelationshipSearching
};

/*!
 *  User smoking attitued
 */
typedef NS_ENUM(NSUInteger, APDUserSmokingAttitude) {
    /*!
     *  Doesn't smoke
     */
    APDUserSmokingAttitudeNegative = 1,
    /*!
     *  Neutral position
     */
    APDUserSmokingAttitudeNeutral,
    /*!
     *  Smoke
     */
    APDUserSmokingAttitudePositive
};

/*!
 *  Alcohol attitude
 */
typedef NS_ENUM(NSUInteger, APDUserAlcoholAttitude) {
    /*!
     *  Negative
     */
    APDUserAlcoholAttitudeNegative = 1,
    /*!
     *  Neutral
     */
    APDUserAlcoholAttitudeNeutral,
    /*!
     *  Positive
     */
    APDUserAlcoholAttitudePositive
};

typedef NS_ENUM(NSUInteger, APDFramework) {
    APDFrameworkNative = 1,
    APDFrameworkUnity,
    APDFrameworkCocos2d,
    APDFrameworkMarmalade,
    APDFrameworkPhoneGap,
    APDFrameworkGiderosMobile,
    APDFrameworkAdobeAir,
    APDFrameworkCordova,
    APDFrameworkXamarin,
    APDFrameworkGameMaker,
    APDFrameworkMonkeyX,
    APDFrameworkSC2,
    APDFrameworkLibGDX,
    APDFrameworkQt,
    APDFrameworkUE4,
    APDFrameworkReactNative,
    APDFrameworkCorona,
    APDFrameworkStencyl,
    APDFrameworkSDKBox
};


