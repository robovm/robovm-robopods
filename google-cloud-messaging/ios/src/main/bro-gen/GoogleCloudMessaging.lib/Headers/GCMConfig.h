@protocol GCMReceiverDelegate;

typedef NS_ENUM(int8_t, GCMLogLevel) {
  kGCMLogLevelDebug,
  kGCMLogLevelInfo,
  kGCMLogLevelError,
  kGCMLogLevelAssert,
};

/**
 *  The config used to configure different options in GCM library.
 */
@interface GCMConfig : NSObject

/**
 *  Set the GCMReceiverDelegate to receive callbacks on upstream messages.
 *
 *  @see GCMReceiverDelegate
 */
@property(nonatomic, readwrite, weak) id<GCMReceiverDelegate> receiverDelegate;

// the log level for the GCM library.
@property(nonatomic, readwrite, assign) GCMLogLevel logLevel;

/**
 *  Access a shared instance of GCMConfig. The first call to this method gives
 *  you a default config with logLevel set to `kGCMLogLevelError`.
 *
 *  @return GCMConfig sharedInstance.
 */
+ (instancetype)defaultConfig;

@end
