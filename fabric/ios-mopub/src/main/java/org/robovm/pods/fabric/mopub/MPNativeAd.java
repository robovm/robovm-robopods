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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdPtr extends Ptr<MPNativeAd, MPNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAd() {}
    protected MPNativeAd(Handle h, long handle) { super(h, handle); }
    protected MPNativeAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdAdapter:")
    public MPNativeAd(MPNativeAdAdapter adAdapter) { super((SkipInit) null); initObject(init(adAdapter)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPNativeAdDelegate v);
    @Property(selector = "properties")
    public native NSDictionary<?, ?> getProperties();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdAdapter:")
    protected native @Pointer long init(MPNativeAdAdapter adAdapter);
    public UIView retrieveAdView() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       UIView result = retrieveAdView(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "retrieveAdViewWithError:")
    private native UIView retrieveAdView(NSError.NSErrorPtr error);
    @Method(selector = "trackMetricForURL:")
    public native void trackMetric(NSURL URL);
    /*</methods>*/
}
