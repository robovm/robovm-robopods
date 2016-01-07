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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZMediatedNativeAdManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZMediatedNativeAdManagerPtr extends Ptr<HZMediatedNativeAdManager, HZMediatedNativeAdManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZMediatedNativeAdManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZMediatedNativeAdManager() {}
    protected HZMediatedNativeAdManager(Handle h, long handle) { super(h, handle); }
    protected HZMediatedNativeAdManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchNativeAdWithOptions:")
    public static native void fetchNativeAd(HZFetchOptions fetchOptions);
    public static HZMediatedNativeAd getNextNativeAd(String tag) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       HZMediatedNativeAd result = getNextNativeAd(tag, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getNextNativeAdForTag:error:")
    private static native HZMediatedNativeAd getNextNativeAd(String tag, NSError.NSErrorPtr error);
    /*</methods>*/
}
