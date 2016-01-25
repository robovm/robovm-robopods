/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/TWTRTweetViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "tweetView:didSelectTweet:")
    void didSelectTweet(TWTRTweetView tweetView, TWTRTweet tweet);
    @Method(selector = "tweetView:didTapImage:withURL:")
    void didTapImage(TWTRTweetView tweetView, UIImage image, NSURL imageURL);
    @Method(selector = "tweetView:didTapVideoWithURL:")
    void didTapVideo(TWTRTweetView tweetView, NSURL videoURL);
    @Method(selector = "tweetView:didTapURL:")
    void didTapURL(TWTRTweetView tweetView, NSURL url);
    @Method(selector = "tweetView:didTapProfileImageForUser:")
    void didTapProfileImage(TWTRTweetView tweetView, TWTRUser user);
    @Method(selector = "tweetView:willShareTweet:")
    void willShareTweet(TWTRTweetView tweetView, TWTRTweet tweet);
    @Method(selector = "tweetView:didShareTweet:withType:")
    void didShareTweet(TWTRTweetView tweetView, TWTRTweet tweet, String shareType);
    @Method(selector = "tweetView:cancelledShareTweet:")
    void didCancelShareTweet(TWTRTweetView tweetView, TWTRTweet tweet);
    @Method(selector = "tweetView:didLikeTweet:")
    void didLikeTweet(TWTRTweetView tweetView, TWTRTweet tweet);
    @Method(selector = "tweetView:didUnlikeTweet:")
    void didUnlikeTweet(TWTRTweetView tweetView, TWTRTweet tweet);
    @Method(selector = "tweetView:willRequireAuthenticationCompletionHandler:")
    void willRequireAuthentication(TWTRTweetView tweetView, @Block VoidBlock2<TWTRSessionStore, String> authenticationCompletionHandler);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
