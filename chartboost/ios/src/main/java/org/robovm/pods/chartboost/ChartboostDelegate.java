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
package org.robovm.pods.chartboost;

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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ChartboostDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didInitialize:")
    void didInitialize(boolean status);
    @Method(selector = "shouldRequestInterstitial:")
    boolean shouldRequestInterstitial(String location);
    @Method(selector = "shouldDisplayInterstitial:")
    boolean shouldDisplayInterstitial(String location);
    @Method(selector = "didDisplayInterstitial:")
    void didDisplayInterstitial(String location);
    @Method(selector = "didCacheInterstitial:")
    void didCacheInterstitial(String location);
    @Method(selector = "didFailToLoadInterstitial:withError:")
    void didFailToLoadInterstitial(String location, CBLoadError error);
    @Method(selector = "didFailToRecordClick:withError:")
    void didFailToRecordClick(String location, CBClickError error);
    @Method(selector = "didDismissInterstitial:")
    void didDismissInterstitial(String location);
    @Method(selector = "didCloseInterstitial:")
    void didCloseInterstitial(String location);
    @Method(selector = "didClickInterstitial:")
    void didClickInterstitial(String location);
    @Method(selector = "shouldDisplayMoreApps:")
    boolean shouldDisplayMoreApps(String location);
    @Method(selector = "didDisplayMoreApps:")
    void didDisplayMoreApps(String location);
    @Method(selector = "didCacheMoreApps:")
    void didCacheMoreApps(String location);
    @Method(selector = "didDismissMoreApps:")
    void didDismissMoreApps(String location);
    @Method(selector = "didCloseMoreApps:")
    void didCloseMoreApps(String location);
    @Method(selector = "didClickMoreApps:")
    void didClickMoreApps(String location);
    @Method(selector = "didFailToLoadMoreApps:withError:")
    void didFailToLoadMoreApps(String location, CBLoadError error);
    @Method(selector = "didPrefetchVideos")
    void didPrefetchVideos();
    @Method(selector = "shouldDisplayRewardedVideo:")
    boolean shouldDisplayRewardedVideo(String location);
    @Method(selector = "didDisplayRewardedVideo:")
    void didDisplayRewardedVideo(String location);
    @Method(selector = "didCacheRewardedVideo:")
    void didCacheRewardedVideo(String location);
    @Method(selector = "didFailToLoadRewardedVideo:withError:")
    void didFailToLoadRewardedVideo(String location, CBLoadError error);
    @Method(selector = "didDismissRewardedVideo:")
    void didDismissRewardedVideo(String location);
    @Method(selector = "didCloseRewardedVideo:")
    void didCloseRewardedVideo(String location);
    @Method(selector = "didClickRewardedVideo:")
    void didClickRewardedVideo(String location);
    @Method(selector = "didCompleteRewardedVideo:withReward:")
    void didCompleteRewardedVideo(String location, int reward);
    @Method(selector = "didCacheInPlay:")
    void didCacheInPlay(String location);
    @Method(selector = "didFailToLoadInPlay:withError:")
    void didFailToLoadInPlay(String location, CBLoadError error);
    @Method(selector = "willDisplayVideo:")
    void willDisplayVideo(String location);
    @Method(selector = "didCompleteAppStoreSheetFlow")
    void didCompleteAppStoreSheetFlow();
    @Method(selector = "didPauseClickForConfirmation")
    void didPauseClickForConfirmation();
    @Method(selector = "didFailToLoadMoreApps:")
    void didFailToLoadMoreApps(CBLoadError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
