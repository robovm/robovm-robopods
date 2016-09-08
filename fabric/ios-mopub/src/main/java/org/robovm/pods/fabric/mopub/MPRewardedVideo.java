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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRewardedVideoPtr extends Ptr<MPRewardedVideo, MPRewardedVideoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRewardedVideo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPRewardedVideo() {}
    protected MPRewardedVideo(Handle h, long handle) { super(h, handle); }
    protected MPRewardedVideo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadRewardedVideoAdWithAdUnitID:withMediationSettings:")
    public static native void loadRewardedVideoAd(String adUnitID, NSArray<?> mediationSettings);
    @Method(selector = "hasAdAvailableForAdUnitID:")
    public static native boolean hasAdAvailable(String adUnitID);
    @Method(selector = "presentRewardedVideoAdForAdUnitID:fromViewController:")
    public static native void presentRewardedVideoAd(String adUnitID, UIViewController viewController);
    /*</methods>*/
}
