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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPAdViewPtr extends Ptr<MPAdView, MPAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPAdView() {}
    protected MPAdView(Handle h, long handle) { super(h, handle); }
    protected MPAdView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitId:size:")
    public MPAdView(String adUnitId, @ByVal CGSize size) { super((SkipInit) null); initObject(init(adUnitId, size)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPAdViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPAdViewDelegate v);
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitId:size:")
    protected native @Pointer long init(String adUnitId, @ByVal CGSize size);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "forceRefreshAd")
    public native void forceRefreshAd();
    @Method(selector = "rotateToOrientation:")
    public native void rotate(UIInterfaceOrientation newOrientation);
    @Method(selector = "lockNativeAdsToOrientation:")
    public native void lockNativeAdsOrientation(MPNativeAdOrientation orientation);
    @Method(selector = "unlockNativeAdsOrientation")
    public native void unlockNativeAdsOrientation();
    @Method(selector = "allowedNativeAdsOrientation")
    public native MPNativeAdOrientation getAllowedNativeAdsOrientation();
    @Method(selector = "adContentViewSize")
    public native @ByVal CGSize getAdContentViewSize();
    @Method(selector = "stopAutomaticallyRefreshingContents")
    public native void stopAutomaticallyRefreshingContents();
    @Method(selector = "startAutomaticallyRefreshingContents")
    public native void startAutomaticallyRefreshingContents();
    /*</methods>*/
}
