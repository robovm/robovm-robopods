/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRewardBasedVideoAdDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADRewardBasedVideoAdDelegate/*</implements>*/ {

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
    @NotImplemented("rewardBasedVideoAd:didRewardUserWithReward:")
    public void didRewardUser(GADRewardBasedVideoAd rewardBasedVideoAd, GADAdReward reward) {}
    @NotImplemented("rewardBasedVideoAd:didFailToLoadWithError:")
    public void didFailToLoad(GADRewardBasedVideoAd rewardBasedVideoAd, NSError error) {}
    @NotImplemented("rewardBasedVideoAdDidReceiveAd:")
    public void rewardBasedVideoAdDidReceiveAd(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdDidOpen:")
    public void rewardBasedVideoAdDidOpen(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdDidStartPlaying:")
    public void rewardBasedVideoAdDidStartPlaying(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdDidCompletePlaying:")
    public void rewardBasedVideoAdDidCompletePlaying(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdDidClose:")
    public void rewardBasedVideoAdDidClose(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdWillLeaveApplication:")
    public void rewardBasedVideoAdWillLeaveApplication(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    @NotImplemented("rewardBasedVideoAdMetadataDidChange:")
    public void rewardBasedVideoAdMetadataDidChange(GADRewardBasedVideoAd rewardBasedVideoAd) {}
    /*</methods>*/
}
