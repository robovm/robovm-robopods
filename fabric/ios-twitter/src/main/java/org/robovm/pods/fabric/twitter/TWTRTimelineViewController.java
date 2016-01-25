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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTimelineViewController/*</name>*/ 
    extends /*<extends>*/UITableViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRTimelineViewControllerPtr extends Ptr<TWTRTimelineViewController, TWTRTimelineViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTimelineViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTimelineViewController() {}
    protected TWTRTimelineViewController(Handle h, long handle) { super(h, handle); }
    protected TWTRTimelineViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDataSource:")
    public TWTRTimelineViewController(TWTRTimelineDataSource dataSource) { super((SkipInit) null); initObject(init(dataSource)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSource")
    public native TWTRTimelineDataSource getDataSource();
    @Property(selector = "setDataSource:")
    public native void setDataSource(TWTRTimelineDataSource v);
    @Property(selector = "showTweetActions")
    public native boolean showsTweetActions();
    @Property(selector = "setShowTweetActions:")
    public native void setShowsTweetActions(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDataSource:")
    protected native @Pointer long init(TWTRTimelineDataSource dataSource);
    @Method(selector = "refresh")
    public native void refresh();
    /*</methods>*/
}
