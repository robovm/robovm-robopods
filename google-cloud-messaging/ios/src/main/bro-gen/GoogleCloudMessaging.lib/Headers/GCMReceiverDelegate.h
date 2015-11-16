@protocol GCMReceiverDelegate <NSObject>

/**
 *  This callback is invoked if somehow the upstream message that you sent with messageID
 *  failed to be sent.
 *
 *  @param messageID The messageID for the message that failed to be sent upstream
 *  @param error     The error on why the send failed.
 */
- (void)willSendDataMessageWithID:(NSString *)messageID error:(NSError *)error;

/**
 *  The callback is invoked if we have successfully sent the message upstream and the message
 *  was successfully received.
 *
 *  @param messageID The messageID for the message sent.
 */
- (void)didSendDataMessageWithID:(NSString *)messageID;

/*
 *  Called when GCM server deletes pending messages due to exceeded
 *  storage limits, for example, when the device cannot be reached
 *  for an extended period of time.
 *
 *  It is recommended to retrieve any missing messages directly from the
 *  app server.
 */
- (void)didDeleteMessagesOnServer;

@end
