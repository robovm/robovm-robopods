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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRUserTimelineDataSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRTimelineDataSource/*</implements>*/ {

    /*<ptr>*/public static class TWTRUserTimelineDataSourcePtr extends Ptr<TWTRUserTimelineDataSource, TWTRUserTimelineDataSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRUserTimelineDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRUserTimelineDataSource(Handle h, long handle) { super(h, handle); }
    protected TWTRUserTimelineDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithScreenName:APIClient:")
    public TWTRUserTimelineDataSource(String screenName, TWTRAPIClient client) { super((SkipInit) null); initObject(init(screenName, client)); }
    @Method(selector = "initWithScreenName:userID:APIClient:maxTweetsPerRequest:includeReplies:includeRetweets:")
    public TWTRUserTimelineDataSource(String screenName, String userID, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest, boolean includeReplies, boolean includeRetweets) { super((SkipInit) null); initObject(init(screenName, userID, client, maxTweetsPerRequest, includeReplies, includeRetweets)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "screenName")
    public native String getScreenName();
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "maxTweetsPerRequest")
    public native @MachineSizedUInt long getMaxTweetsPerRequest();
    @Property(selector = "includeReplies")
    public native boolean includesReplies();
    @Property(selector = "includeRetweets")
    public native boolean includesRetweets();
    @Property(selector = "timelineType")
    public native TWTRTimelineType getTimelineType();
    @Property(selector = "APIClient")
    public native TWTRAPIClient getAPIClient();
    @Property(selector = "setAPIClient:")
    public native void setAPIClient(TWTRAPIClient v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithScreenName:APIClient:")
    protected native @Pointer long init(String screenName, TWTRAPIClient client);
    @Method(selector = "initWithScreenName:userID:APIClient:maxTweetsPerRequest:includeReplies:includeRetweets:")
    protected native @Pointer long init(String screenName, String userID, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest, boolean includeReplies, boolean includeRetweets);
    @Method(selector = "loadPreviousTweetsBeforePosition:completion:")
    public native void loadPreviousTweets(String position, @Block VoidBlock3<NSArray<TWTRTweet>, NSObject, NSError> completion);
    /*</methods>*/
}
