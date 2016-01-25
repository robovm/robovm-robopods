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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPRewardedVideoDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("rewardedVideoAdDidLoadForAdUnitID:")
    public void didLoad(String adUnitID) {}
    @NotImplemented("rewardedVideoAdDidFailToLoadForAdUnitID:error:")
    public void didFailToLoadAd(String adUnitID, NSError error) {}
    @NotImplemented("rewardedVideoAdDidExpireForAdUnitID:")
    public void didExpire(String adUnitID) {}
    @NotImplemented("rewardedVideoAdDidFailToPlayForAdUnitID:error:")
    public void didFailToPlayAd(String adUnitID, NSError error) {}
    @NotImplemented("rewardedVideoAdWillAppearForAdUnitID:")
    public void willAppear(String adUnitID) {}
    @NotImplemented("rewardedVideoAdDidAppearForAdUnitID:")
    public void didAppear(String adUnitID) {}
    @NotImplemented("rewardedVideoAdWillDisappearForAdUnitID:")
    public void willDisappear(String adUnitID) {}
    @NotImplemented("rewardedVideoAdDidDisappearForAdUnitID:")
    public void didDisappear(String adUnitID) {}
    @NotImplemented("rewardedVideoAdDidReceiveTapEventForAdUnitID:")
    public void didReceiveTapEvent(String adUnitID) {}
    @NotImplemented("rewardedVideoAdWillLeaveApplicationForAdUnitID:")
    public void willLeaveApplication(String adUnitID) {}
    @NotImplemented("rewardedVideoAdShouldRewardForAdUnitID:reward:")
    public void shouldReward(String adUnitID, MPRewardedVideoReward reward) {}
    /*</methods>*/
}
