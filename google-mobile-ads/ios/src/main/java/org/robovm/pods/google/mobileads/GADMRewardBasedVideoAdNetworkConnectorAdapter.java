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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMRewardBasedVideoAdNetworkConnectorAdapter/*</name>*/ 
    extends /*<extends>*/GADMediationAdRequestAdapter/*</extends>*/ 
    /*<implements>*/implements GADMRewardBasedVideoAdNetworkConnector/*</implements>*/ {

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
    @NotImplemented("adapterDidSetUpRewardBasedVideoAd:")
    public void adapterDidSetUpRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapter:didFailToSetUpRewardBasedVideoAdWithError:")
    public void didFailToSetUpRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter, NSError error) {}
    @NotImplemented("adapterDidGetAdClick:")
    public void adapterDidGetAdClick(GADMRewardBasedVideoAdNetworkAdapter adapter) {}
    @NotImplemented("adapterDidReceiveRewardBasedVideoAd:")
    public void adapterDidReceiveRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapterDidOpenRewardBasedVideoAd:")
    public void adapterDidOpenRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapterDidStartPlayingRewardBasedVideoAd:")
    public void adapterDidStartPlayingRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapterDidCompletePlayingRewardBasedVideoAd:")
    public void adapterDidCompletePlayingRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapterDidCloseRewardBasedVideoAd:")
    public void adapterDidCloseRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapter:didRewardUserWithReward:")
    public void didRewardUser(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAd, GADAdReward reward) {}
    @NotImplemented("adapterWillLeaveApplication:")
    public void adapterWillLeaveApplication(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter) {}
    @NotImplemented("adapter:didFailToLoadRewardBasedVideoAdwithError:")
    public void didFailToLoadRewardBasedVideoAd(GADMRewardBasedVideoAdNetworkAdapter rewardBasedVideoAdAdapter, NSError error) {}
    /*</methods>*/
}
