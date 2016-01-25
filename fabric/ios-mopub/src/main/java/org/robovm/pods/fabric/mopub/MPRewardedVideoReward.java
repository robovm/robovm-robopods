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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoReward/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPRewardedVideoRewardPtr extends Ptr<MPRewardedVideoReward, MPRewardedVideoRewardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPRewardedVideoReward.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPRewardedVideoReward() {}
    protected MPRewardedVideoReward(Handle h, long handle) { super(h, handle); }
    protected MPRewardedVideoReward(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCurrencyAmount:")
    public MPRewardedVideoReward(NSNumber amount) { super((SkipInit) null); initObject(init(amount)); }
    @Method(selector = "initWithCurrencyType:amount:")
    public MPRewardedVideoReward(String currencyType, NSNumber amount) { super((SkipInit) null); initObject(init(currencyType, amount)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currencyType")
    public native String getCurrencyType();
    @Property(selector = "amount")
    public native NSNumber getAmount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCurrencyAmount:")
    protected native @Pointer long init(NSNumber amount);
    @Method(selector = "initWithCurrencyType:amount:")
    protected native @Pointer long init(String currencyType, NSNumber amount);
    /*</methods>*/
}
