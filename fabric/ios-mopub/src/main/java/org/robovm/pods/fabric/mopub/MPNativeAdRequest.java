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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdRequestPtr extends Ptr<MPNativeAdRequest, MPNativeAdRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAdRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAdRequest() {}
    protected MPNativeAdRequest(Handle h, long handle) { super(h, handle); }
    protected MPNativeAdRequest(SkipInit skipInit) { super(skipInit); }
    public MPNativeAdRequest(String identifier, NSArray<MPNativeAdRendererConfiguration> rendererConfigurations) { super((Handle) null, create(identifier, rendererConfigurations)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "targeting")
    public native MPNativeAdRequestTargeting getTargeting();
    @Property(selector = "setTargeting:")
    public native void setTargeting(MPNativeAdRequestTargeting v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithCompletionHandler:")
    public native void start(@Block VoidBlock3<MPNativeAdRequest, MPNativeAd, NSError> handler);
    @Method(selector = "requestWithAdUnitIdentifier:rendererConfigurations:")
    protected static native @Pointer long create(String identifier, NSArray<MPNativeAdRendererConfiguration> rendererConfigurations);
    /*</methods>*/
}
