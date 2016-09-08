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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPStaticNativeAdRendererSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPNativeAdRendererSettings/*</implements>*/ {

    /*<ptr>*/public static class MPStaticNativeAdRendererSettingsPtr extends Ptr<MPStaticNativeAdRendererSettings, MPStaticNativeAdRendererSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPStaticNativeAdRendererSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPStaticNativeAdRendererSettings() {}
    protected MPStaticNativeAdRendererSettings(Handle h, long handle) { super(h, handle); }
    protected MPStaticNativeAdRendererSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "renderingViewClass")
    public native Class<?> getRenderingViewClass();
    @Property(selector = "setRenderingViewClass:", strongRef = true)
    public native void setRenderingViewClass(Class<?> v);
    @Property(selector = "viewSizeHandler")
    public native @Block("(@MachineSizedFloat)") Block1<Double, CGSize> getViewSizeHandler();
    @Property(selector = "setViewSizeHandler:")
    public native void setViewSizeHandler(@Block("(@MachineSizedFloat)") Block1<Double, CGSize> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
