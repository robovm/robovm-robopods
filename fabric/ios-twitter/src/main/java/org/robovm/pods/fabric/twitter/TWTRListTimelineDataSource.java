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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRListTimelineDataSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRTimelineDataSource/*</implements>*/ {

    /*<ptr>*/public static class TWTRListTimelineDataSourcePtr extends Ptr<TWTRListTimelineDataSource, TWTRListTimelineDataSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRListTimelineDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRListTimelineDataSource(Handle h, long handle) { super(h, handle); }
    protected TWTRListTimelineDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithListID:APIClient:")
    public TWTRListTimelineDataSource(String listID, TWTRAPIClient client) { super((SkipInit) null); initObject(init(listID, client)); }
    @Method(selector = "initWithListSlug:listOwnerScreenName:APIClient:")
    public TWTRListTimelineDataSource(String listSlug, String listOwnerScreenName, TWTRAPIClient client) { super((SkipInit) null); initObject(init(listSlug, listOwnerScreenName, client)); }
    @Method(selector = "initWithListID:listSlug:listOwnerScreenName:APIClient:maxTweetsPerRequest:includeRetweets:")
    public TWTRListTimelineDataSource(String listID, String listSlug, String listOwnerScreenName, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest, boolean includeRetweets) { super((SkipInit) null); initObject(init(listID, listSlug, listOwnerScreenName, client, maxTweetsPerRequest, includeRetweets)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "listID")
    public native String getListID();
    @Property(selector = "listSlug")
    public native String getListSlug();
    @Property(selector = "listOwnerScreenName")
    public native String getListOwnerScreenName();
    @Property(selector = "maxTweetsPerRequest")
    public native @MachineSizedUInt long getMaxTweetsPerRequest();
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
    @Method(selector = "initWithListID:APIClient:")
    protected native @Pointer long init(String listID, TWTRAPIClient client);
    @Method(selector = "initWithListSlug:listOwnerScreenName:APIClient:")
    protected native @Pointer long init(String listSlug, String listOwnerScreenName, TWTRAPIClient client);
    @Method(selector = "initWithListID:listSlug:listOwnerScreenName:APIClient:maxTweetsPerRequest:includeRetweets:")
    protected native @Pointer long init(String listID, String listSlug, String listOwnerScreenName, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest, boolean includeRetweets);
    @Method(selector = "loadPreviousTweetsBeforePosition:completion:")
    public native void loadPreviousTweets(String position, @Block VoidBlock3<NSArray<TWTRTweet>, NSObject, NSError> completion);
    /*</methods>*/
}
