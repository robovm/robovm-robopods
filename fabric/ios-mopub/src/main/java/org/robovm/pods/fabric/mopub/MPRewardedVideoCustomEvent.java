/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.mopub;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoCustomEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRewardedVideoCustomEventPtr extends Ptr<MPRewardedVideoCustomEvent, MPRewardedVideoCustomEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRewardedVideoCustomEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPRewardedVideoCustomEvent() {}
    protected MPRewardedVideoCustomEvent(Handle h, long handle) { super(h, handle); }
    protected MPRewardedVideoCustomEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPRewardedVideoCustomEventDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPRewardedVideoCustomEventDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestRewardedVideoWithCustomEventInfo:")
    public native void requestRewardedVideo(NSDictionary<?, ?> info);
    @Method(selector = "hasAdAvailable")
    public native boolean hasAdAvailable();
    @Method(selector = "presentRewardedVideoFromViewController:")
    public native void presentRewardedVideo(UIViewController viewController);
    @Method(selector = "enableAutomaticImpressionAndClickTracking")
    public native boolean enableAutomaticImpressionAndClickTracking();
    @Method(selector = "handleAdPlayedForCustomEventNetwork")
    public native void handleAdPlayedForCustomEventNetwork();
    @Method(selector = "handleCustomEventInvalidated")
    public native void handleCustomEventInvalidated();
    /*</methods>*/
}
