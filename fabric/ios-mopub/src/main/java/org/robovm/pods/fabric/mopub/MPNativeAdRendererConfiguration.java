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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPNativeAdRendererConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPNativeAdRendererConfigurationPtr extends Ptr<MPNativeAdRendererConfiguration, MPNativeAdRendererConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPNativeAdRendererConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPNativeAdRendererConfiguration() {}
    protected MPNativeAdRendererConfiguration(Handle h, long handle) { super(h, handle); }
    protected MPNativeAdRendererConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rendererSettings")
    public native MPNativeAdRendererSettings getRendererSettings();
    @Property(selector = "setRendererSettings:")
    public native void setRendererSettings(MPNativeAdRendererSettings v);
    @Property(selector = "rendererClass")
    public native Class<?> getRendererClass();
    @Property(selector = "setRendererClass:", strongRef = true)
    public native void setRendererClass(Class<?> v);
    @Property(selector = "supportedCustomEvents")
    public native NSArray<?> getSupportedCustomEvents();
    @Property(selector = "setSupportedCustomEvents:")
    public native void setSupportedCustomEvents(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
