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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPRewardedVideoCustomEventDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "instanceMediationSettingsForClass:")
    MPMediationSettingsProtocol getMediationSettings(Class<?> aClass);
    @Method(selector = "rewardedVideoDidLoadAdForCustomEvent:")
    void didLoadAd(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoDidFailToLoadAdForCustomEvent:error:")
    void didFailToLoadAd(MPRewardedVideoCustomEvent customEvent, NSError error);
    @Method(selector = "rewardedVideoDidExpireForCustomEvent:")
    void didExpire(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoDidFailToPlayForCustomEvent:error:")
    void didFailToPlay(MPRewardedVideoCustomEvent customEvent, NSError error);
    @Method(selector = "rewardedVideoWillAppearForCustomEvent:")
    void willAppear(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoDidAppearForCustomEvent:")
    void didAppear(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoWillDisappearForCustomEvent:")
    void willDisappear(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoDidDisappearForCustomEvent:")
    void didDisappear(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoWillLeaveApplicationForCustomEvent:")
    void willLeaveApplication(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoDidReceiveTapEventForCustomEvent:")
    void didReceiveTapEvent(MPRewardedVideoCustomEvent customEvent);
    @Method(selector = "rewardedVideoShouldRewardUserForCustomEvent:reward:")
    void shouldRewardUser(MPRewardedVideoCustomEvent customEvent, MPRewardedVideoReward reward);
    @Method(selector = "trackImpression")
    void trackImpression();
    @Method(selector = "trackClick")
    void trackClick();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
