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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPRewardedVideoDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "rewardedVideoAdDidLoadForAdUnitID:")
    void didLoad(String adUnitID);
    @Method(selector = "rewardedVideoAdDidFailToLoadForAdUnitID:error:")
    void didFailToLoadAd(String adUnitID, NSError error);
    @Method(selector = "rewardedVideoAdDidExpireForAdUnitID:")
    void didExpire(String adUnitID);
    @Method(selector = "rewardedVideoAdDidFailToPlayForAdUnitID:error:")
    void didFailToPlayAd(String adUnitID, NSError error);
    @Method(selector = "rewardedVideoAdWillAppearForAdUnitID:")
    void willAppear(String adUnitID);
    @Method(selector = "rewardedVideoAdDidAppearForAdUnitID:")
    void didAppear(String adUnitID);
    @Method(selector = "rewardedVideoAdWillDisappearForAdUnitID:")
    void willDisappear(String adUnitID);
    @Method(selector = "rewardedVideoAdDidDisappearForAdUnitID:")
    void didDisappear(String adUnitID);
    @Method(selector = "rewardedVideoAdDidReceiveTapEventForAdUnitID:")
    void didReceiveTapEvent(String adUnitID);
    @Method(selector = "rewardedVideoAdWillLeaveApplicationForAdUnitID:")
    void willLeaveApplication(String adUnitID);
    @Method(selector = "rewardedVideoAdShouldRewardForAdUnitID:reward:")
    void shouldReward(String adUnitID, MPRewardedVideoReward reward);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
