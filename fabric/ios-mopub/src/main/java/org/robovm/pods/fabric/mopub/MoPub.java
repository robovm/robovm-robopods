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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MoPub/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MoPubPtr extends Ptr<MoPub, MoPubPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MoPub.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MoPub() {}
    protected MoPub(Handle h, long handle) { super(h, handle); }
    protected MoPub(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initializeRewardedVideoWithGlobalMediationSettings:delegate:")
    public MoPub(NSArray<?> globalMediationSettings, MPRewardedVideoDelegate delegate) { super((SkipInit) null); initObject(init(globalMediationSettings, delegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "locationUpdatesEnabled")
    public native boolean areLocationUpdatesEnabled();
    @Property(selector = "setLocationUpdatesEnabled:")
    public native void setLocationUpdatesEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeRewardedVideoWithGlobalMediationSettings:delegate:")
    protected native @Pointer long init(NSArray<?> globalMediationSettings, MPRewardedVideoDelegate delegate);
    @Method(selector = "globalMediationSettingsForClass:")
    public native MPMediationSettingsProtocol getGlobalMediationSettings(Class<?> aClass);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "version")
    public native String getVersion();
    @Method(selector = "bundleIdentifier")
    public native String getBundleIdentifier();
    @Method(selector = "sharedInstance")
    public static native MoPub getSharedInstance();
    /*</methods>*/
}
