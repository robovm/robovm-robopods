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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRCollectionTimelineDataSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRTimelineDataSource/*</implements>*/ {

    /*<ptr>*/public static class TWTRCollectionTimelineDataSourcePtr extends Ptr<TWTRCollectionTimelineDataSource, TWTRCollectionTimelineDataSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRCollectionTimelineDataSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRCollectionTimelineDataSource(Handle h, long handle) { super(h, handle); }
    protected TWTRCollectionTimelineDataSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCollectionID:APIClient:")
    public TWTRCollectionTimelineDataSource(String collectionID, TWTRAPIClient client) { super((SkipInit) null); initObject(init(collectionID, client)); }
    @Method(selector = "initWithCollectionID:APIClient:maxTweetsPerRequest:")
    public TWTRCollectionTimelineDataSource(String collectionID, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest) { super((SkipInit) null); initObject(init(collectionID, client, maxTweetsPerRequest)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxTweetsPerRequest")
    public native @MachineSizedSInt long getMaxTweetsPerRequest();
    @Property(selector = "collectionID")
    public native String getCollectionID();
    @Property(selector = "timelineType")
    public native TWTRTimelineType getTimelineType();
    @Property(selector = "APIClient")
    public native TWTRAPIClient getAPIClient();
    @Property(selector = "setAPIClient:")
    public native void setAPIClient(TWTRAPIClient v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCollectionID:APIClient:")
    protected native @Pointer long init(String collectionID, TWTRAPIClient client);
    @Method(selector = "initWithCollectionID:APIClient:maxTweetsPerRequest:")
    protected native @Pointer long init(String collectionID, TWTRAPIClient client, @MachineSizedUInt long maxTweetsPerRequest);
    @Method(selector = "loadPreviousTweetsBeforePosition:completion:")
    public native void loadPreviousTweets(String position, @Block VoidBlock3<NSArray<TWTRTweet>, NSObject, NSError> completion);
    /*</methods>*/
}
