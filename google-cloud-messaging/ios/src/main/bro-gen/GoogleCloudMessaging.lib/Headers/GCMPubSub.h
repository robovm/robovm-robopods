/**
 *  @related GCMPubSub
 *
 *  The completion handler invoked when the GCM subscribe/unsubscribe returns.
 *  If the call fails we return the approprirate `error code` as documented in
 *  `GCMService`.
 *
 *  @param error The error describing subscribe failure else nil.
 */
typedef void(^GCMPubSubCompletion)(NSError *error);

/**
 *  GcmPubSub provides a publish-subscribe model for sending GCM topic messages.
 *
 *  An app can subscribe to different topics defined by the
 *  developer. The app server can then send messages to the subscribed devices
 *  without having to maintain topic-subscribers mapping. Topics do not
 *  need to be explicitly created before subscribing or publishing&mdash;they
 *  are automatically created when publishing or subscribing.
 *
 *  Messages published to the topic will be received as regular GCM messages
 *  with 'from' set to "/topics/myTopic".
 *
 *  Only topic names that match the pattern "/topics/[a-zA-Z0-9-_.~%]{1,900}"
 *  are allowed for subscribing and publishing.
 *
 *  To publish to a topic, see
 *  {@link <a href="https://developer.android.com/google/gcm/server.html">
 *  GCM server documentation</a>}.
 */
@interface GCMPubSub : NSObject

/**
 *  Returns an instance of GCMPubSub. Note you need to call
 *  `GCMService startWithConfig` to start using GCM.
 *
 *  @return A shared instance of GCMPubSub.
 */
+ (instancetype)sharedInstance;

/**
 *  Subscribes an app instance to a topic, enabling it to receive messages
 *  sent to that topic.
 *
 *  This is an asynchronous call. In case the subscribe fails for some reason we
 *  invoke the completion callback with the appropriate error.
 *
 *  Call this function from the main thread since GCM is not thread safe.
 *
 *  @see GCMPubSub unsubscribeWithToken:topic:handler:
 *
 *  @param token    The registration token as received from the InstanceID library
 *                  for a given `authorizedEntity` and "gcm" scope.
 *  @param topic    The topic to subscribe to. Should be of the form
 *                  "/topics/<topic-name>".
 *  @param handler  The callback handler which is invoked when the subscribe call
 *                  ends. In case of success nil error is returned else an
 *                  appropriate error object is returned.
 */
- (void)subscribeWithToken:(NSString *)token
                     topic:(NSString *)topic
                   options:(NSDictionary *)options
                   handler:(GCMPubSubCompletion)handler;


/**
 *  Unsubscribes an app instance from a topic, stopping it from receiving
 *  any further messages sent to that topic.
 *
 *  This is an asynchronous call. In case the `unsubscribe` fails for some reason
 *  we invoke the `completion` callback passed in with an appropriate error.
 *
 *  Call this function from the main thread.
 *
 *  @param token   The token used to subscribe to this topic to.
 *  @param topic   The topic to unsubscribe from.
 *  @param handler The handler that is invoked once the unsubscribe call ends.
 *                 In case of error an appropriate error object is returned else
 *                 error is nil.
 */
- (void)unsubscribeWithToken:(NSString *)token
                       topic:(NSString *)topic
                     options:(NSDictionary *)options
                     handler:(GCMPubSubCompletion)handler;

@end
