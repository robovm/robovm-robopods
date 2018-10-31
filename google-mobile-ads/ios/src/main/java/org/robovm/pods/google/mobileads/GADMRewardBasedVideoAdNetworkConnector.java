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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADMRewardBasedVideoAdNetworkConnector/*</name>*/ 
    /*<implements>*/extends GADMediationAdRequest/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adapterDidSetUpRewardBasedVideoAd:")
    void adapterDidSetUpRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapter:didFailToSetUpRewardBasedVideoAdWithError:")
    void didFailToSetUpRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter, NSError error);
    @Method(selector = "adapterDidGetAdClick:")
    void adapterDidGetAdClick(GADMRewardBasedVideoAdNetworkAdapter adapter);
    @Method(selector = "adapterDidReceiveRewardBasedVideoAd:")
    void adapterDidReceiveRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapterDidOpenRewardBasedVideoAd:")
    void adapterDidOpenRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapterDidStartPlayingRewardBasedVideoAd:")
    void adapterDidStartPlayingRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapterDidCompletePlayingRewardBasedVideoAd:")
    void adapterDidCompletePlayingRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapterDidCloseRewardBasedVideoAd:")
    void adapterDidCloseRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapter:didRewardUserWithReward:")
    void adidRewardUser(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAd, GADAdReward reward);
    @Method(selector = "adapterWillLeaveApplication:")
    void adapterWillLeaveApplication(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter);
    @Method(selector = "adapter:didFailToLoadRewardBasedVideoAdwithError:")
    void didFailToLoadRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
