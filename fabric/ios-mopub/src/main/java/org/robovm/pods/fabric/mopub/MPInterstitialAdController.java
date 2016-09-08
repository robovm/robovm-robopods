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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPInterstitialAdController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPInterstitialAdControllerPtr extends Ptr<MPInterstitialAdController, MPInterstitialAdControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPInterstitialAdController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPInterstitialAdController() {}
    protected MPInterstitialAdController(Handle h, long handle) { super(h, handle); }
    protected MPInterstitialAdController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPInterstitialAdControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPInterstitialAdControllerDelegate v);
    @Property(selector = "adUnitId")
    public native String getAdUnitId();
    @Property(selector = "setAdUnitId:")
    public native void setAdUnitId(String v);
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "isTesting")
    public native boolean isTesting();
    @Property(selector = "setTesting:")
    public native void setTesting(boolean v);
    @Property(selector = "ready")
    public native boolean isReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "showFromViewController:")
    public native void show(UIViewController controller);
    @Method(selector = "interstitialAdControllerForAdUnitId:")
    public static native MPInterstitialAdController getInterstitialAdController(String adUnitId);
    @Method(selector = "removeSharedInterstitialAdController:")
    public static native void removeSharedInterstitialAdController(MPInterstitialAdController controller);
    @Method(selector = "sharedInterstitialAdControllers")
    public static native NSMutableArray<MPInterstitialAdController> getSharedInterstitialAdControllers();
    /*</methods>*/
}
