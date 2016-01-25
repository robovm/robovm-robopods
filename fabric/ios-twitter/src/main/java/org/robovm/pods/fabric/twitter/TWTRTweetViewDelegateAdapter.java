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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweetViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRTweetViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("tweetView:didSelectTweet:")
    public void didSelectTweet(TWTRTweetView tweetView, TWTRTweet tweet) {}
    @NotImplemented("tweetView:didTapImage:withURL:")
    public void didTapImage(TWTRTweetView tweetView, UIImage image, NSURL imageURL) {}
    @NotImplemented("tweetView:didTapVideoWithURL:")
    public void didTapVideo(TWTRTweetView tweetView, NSURL videoURL) {}
    @NotImplemented("tweetView:didTapURL:")
    public void didTapURL(TWTRTweetView tweetView, NSURL url) {}
    @NotImplemented("tweetView:didTapProfileImageForUser:")
    public void didTapProfileImage(TWTRTweetView tweetView, TWTRUser user) {}
    @NotImplemented("tweetView:willShareTweet:")
    public void willShareTweet(TWTRTweetView tweetView, TWTRTweet tweet) {}
    @NotImplemented("tweetView:didShareTweet:withType:")
    public void didShareTweet(TWTRTweetView tweetView, TWTRTweet tweet, String shareType) {}
    @NotImplemented("tweetView:cancelledShareTweet:")
    public void didCancelShareTweet(TWTRTweetView tweetView, TWTRTweet tweet) {}
    @NotImplemented("tweetView:didLikeTweet:")
    public void didLikeTweet(TWTRTweetView tweetView, TWTRTweet tweet) {}
    @NotImplemented("tweetView:didUnlikeTweet:")
    public void didUnlikeTweet(TWTRTweetView tweetView, TWTRTweet tweet) {}
    @NotImplemented("tweetView:willRequireAuthenticationCompletionHandler:")
    public void willRequireAuthentication(TWTRTweetView tweetView, @Block VoidBlock2<TWTRSessionStore, String> authenticationCompletionHandler) {}
    /*</methods>*/
}
