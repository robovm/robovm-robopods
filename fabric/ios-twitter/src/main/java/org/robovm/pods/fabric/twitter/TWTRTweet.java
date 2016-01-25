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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweet/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class TWTRTweetPtr extends Ptr<TWTRTweet, TWTRTweetPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTweet.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTweet() {}
    protected TWTRTweet(Handle h, long handle) { super(h, handle); }
    protected TWTRTweet(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithJSONDictionary:")
    public TWTRTweet(NSDictionary<?, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    @Method(selector = "initWithCoder:")
    public TWTRTweet(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tweetID")
    public native String getTweetID();
    @Property(selector = "createdAt")
    public native NSDate getCreatedAt();
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "author")
    public native TWTRUser getAuthor();
    @Property(selector = "likeCount")
    public native long getLikeCount();
    @Property(selector = "retweetCount")
    public native long getRetweetCount();
    @Property(selector = "inReplyToTweetID")
    public native String getInReplyToTweetID();
    @Property(selector = "inReplyToUserID")
    public native String getInReplyToUserID();
    @Property(selector = "inReplyToScreenName")
    public native String getInReplyToScreenName();
    @Property(selector = "permalink")
    public native NSURL getPermalink();
    @Property(selector = "isLiked")
    public native boolean isLiked();
    @Property(selector = "isRetweeted")
    public native boolean isRetweeted();
    @Property(selector = "retweetID")
    public native String getRetweetID();
    @Property(selector = "retweetedTweet")
    public native TWTRTweet getRetweetedTweet();
    @Property(selector = "isRetweet")
    public native boolean isRetweet();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithJSONDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> dictionary);
    @Method(selector = "tweetWithLikeToggled")
    public native TWTRTweet getTweetWithLikeToggled();
    @Method(selector = "tweetsWithJSONArray:")
    public static native NSArray<TWTRTweet> getTweets(NSArray<?> array);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
