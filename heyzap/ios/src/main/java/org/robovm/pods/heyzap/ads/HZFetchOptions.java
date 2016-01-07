/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.heyzap.ads;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZFetchOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZFetchOptionsPtr extends Ptr<HZFetchOptions, HZFetchOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZFetchOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZFetchOptions() {}
    protected HZFetchOptions(Handle h, long handle) { super(h, handle); }
    protected HZFetchOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tag")
    public native String getTag();
    @Property(selector = "setTag:")
    public native void setTag(String v);
    @Property(selector = "completion")
    public native @Block VoidBlock2<Boolean, NSError> getCompletion();
    @Property(selector = "setCompletion:")
    public native void setCompletion(@Block VoidBlock2<Boolean, NSError> v);
    @Property(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @Property(selector = "setPresentingViewController:", strongRef = true)
    public native void setPresentingViewController(UIViewController v);
    @Property(selector = "uniqueNativeAdsToFetch")
    public native NSNumber getUniqueNativeAdsToFetch();
    @Property(selector = "setUniqueNativeAdsToFetch:")
    public native void setUniqueNativeAdsToFetch(NSNumber v);
    @Property(selector = "admobNativeAdTypes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAdmobNativeAdTypes();
    @Property(selector = "setAdmobNativeAdTypes:")
    public native void setAdmobNativeAdTypes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "admobPreferredImageOrientation")
    public native HZAdMobNativeAdImageOrientation getAdmobPreferredImageOrientation();
    @Property(selector = "setAdmobPreferredImageOrientation:")
    public native void setAdmobPreferredImageOrientation(HZAdMobNativeAdImageOrientation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
