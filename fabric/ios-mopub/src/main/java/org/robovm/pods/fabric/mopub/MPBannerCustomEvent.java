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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPBannerCustomEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPBannerCustomEventPtr extends Ptr<MPBannerCustomEvent, MPBannerCustomEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPBannerCustomEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPBannerCustomEvent() {}
    protected MPBannerCustomEvent(Handle h, long handle) { super(h, handle); }
    protected MPBannerCustomEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPBannerCustomEventDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPBannerCustomEventDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestAdWithSize:customEventInfo:")
    public native void requestAd(@ByVal CGSize size, NSDictionary<?, ?> info);
    @Method(selector = "rotateToOrientation:")
    public native void rotate(UIInterfaceOrientation newOrientation);
    @Method(selector = "didDisplayAd")
    public native void didDisplayAd();
    @Method(selector = "enableAutomaticImpressionAndClickTracking")
    public native boolean enableAutomaticImpressionAndClickTracking();
    /*</methods>*/
}
