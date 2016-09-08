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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdRequestTargeting/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdRequestTargetingPtr extends Ptr<MPNativeAdRequestTargeting, MPNativeAdRequestTargetingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAdRequestTargeting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAdRequestTargeting() {}
    protected MPNativeAdRequestTargeting(Handle h, long handle) { super(h, handle); }
    protected MPNativeAdRequestTargeting(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keywords")
    public native String getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(String v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "desiredAssets")
    public native NSSet<?> getDesiredAssets();
    @Property(selector = "setDesiredAssets:")
    public native void setDesiredAssets(NSSet<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "targeting")
    public static native MPNativeAdRequestTargeting getTargeting();
    /*</methods>*/
}
