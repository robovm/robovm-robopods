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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPInterstitialCustomEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPInterstitialCustomEventPtr extends Ptr<MPInterstitialCustomEvent, MPInterstitialCustomEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPInterstitialCustomEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPInterstitialCustomEvent() {}
    protected MPInterstitialCustomEvent(Handle h, long handle) { super(h, handle); }
    protected MPInterstitialCustomEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPInterstitialCustomEventDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPInterstitialCustomEventDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestInterstitialWithCustomEventInfo:")
    public native void requestInterstitial(NSDictionary<?, ?> info);
    @Method(selector = "showInterstitialFromRootViewController:")
    public native void showInterstitial(UIViewController rootViewController);
    @Method(selector = "enableAutomaticImpressionAndClickTracking")
    public native boolean enableAutomaticImpressionAndClickTracking();
    /*</methods>*/
}
