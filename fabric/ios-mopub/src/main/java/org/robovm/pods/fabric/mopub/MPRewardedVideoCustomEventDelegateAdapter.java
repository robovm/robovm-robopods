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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPRewardedVideoCustomEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPRewardedVideoCustomEventDelegate/*</implements>*/ {

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
    @NotImplemented("instanceMediationSettingsForClass:")
    public MPMediationSettingsProtocol getMediationSettings(Class<?> aClass) { return null; }
    @NotImplemented("rewardedVideoDidLoadAdForCustomEvent:")
    public void didLoadAd(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidFailToLoadAdForCustomEvent:error:")
    public void didFailToLoadAd(MPRewardedVideoCustomEvent customEvent, NSError error) {}
    @NotImplemented("rewardedVideoDidExpireForCustomEvent:")
    public void didExpire(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidFailToPlayForCustomEvent:error:")
    public void didFailToPlay(MPRewardedVideoCustomEvent customEvent, NSError error) {}
    @NotImplemented("rewardedVideoWillAppearForCustomEvent:")
    public void willAppear(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidAppearForCustomEvent:")
    public void didAppear(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoWillDisappearForCustomEvent:")
    public void willDisappear(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidDisappearForCustomEvent:")
    public void didDisappear(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoWillLeaveApplicationForCustomEvent:")
    public void willLeaveApplication(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoDidReceiveTapEventForCustomEvent:")
    public void didReceiveTapEvent(MPRewardedVideoCustomEvent customEvent) {}
    @NotImplemented("rewardedVideoShouldRewardUserForCustomEvent:reward:")
    public void shouldRewardUser(MPRewardedVideoCustomEvent customEvent, MPRewardedVideoReward reward) {}
    @NotImplemented("trackImpression")
    public void trackImpression() {}
    @NotImplemented("trackClick")
    public void trackClick() {}
    /*</methods>*/
}
