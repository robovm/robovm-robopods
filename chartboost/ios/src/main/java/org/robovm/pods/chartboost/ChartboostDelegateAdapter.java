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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ChartboostDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ChartboostDelegate/*</implements>*/ {

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
    @NotImplemented("didInitialize:")
    public void didInitialize(boolean status) {}
    @NotImplemented("shouldRequestInterstitial:")
    public boolean shouldRequestInterstitial(String location) { return true; }
    @NotImplemented("shouldDisplayInterstitial:")
    public boolean shouldDisplayInterstitial(String location) { return true; }
    @NotImplemented("didDisplayInterstitial:")
    public void didDisplayInterstitial(String location) {}
    @NotImplemented("didCacheInterstitial:")
    public void didCacheInterstitial(String location) {}
    @NotImplemented("didFailToLoadInterstitial:withError:")
    public void didFailToLoadInterstitial(String location, CBLoadError error) {}
    @NotImplemented("didFailToRecordClick:withError:")
    public void didFailToRecordClick(String location, CBClickError error) {}
    @NotImplemented("didDismissInterstitial:")
    public void didDismissInterstitial(String location) {}
    @NotImplemented("didCloseInterstitial:")
    public void didCloseInterstitial(String location) {}
    @NotImplemented("didClickInterstitial:")
    public void didClickInterstitial(String location) {}
    @NotImplemented("shouldDisplayMoreApps:")
    public boolean shouldDisplayMoreApps(String location) { return true; }
    @NotImplemented("didDisplayMoreApps:")
    public void didDisplayMoreApps(String location) {}
    @NotImplemented("didCacheMoreApps:")
    public void didCacheMoreApps(String location) {}
    @NotImplemented("didDismissMoreApps:")
    public void didDismissMoreApps(String location) {}
    @NotImplemented("didCloseMoreApps:")
    public void didCloseMoreApps(String location) {}
    @NotImplemented("didClickMoreApps:")
    public void didClickMoreApps(String location) {}
    @NotImplemented("didFailToLoadMoreApps:withError:")
    public void didFailToLoadMoreApps(String location, CBLoadError error) {}
    @NotImplemented("didPrefetchVideos")
    public void didPrefetchVideos() {}
    @NotImplemented("shouldDisplayRewardedVideo:")
    public boolean shouldDisplayRewardedVideo(String location) { return true; }
    @NotImplemented("didDisplayRewardedVideo:")
    public void didDisplayRewardedVideo(String location) {}
    @NotImplemented("didCacheRewardedVideo:")
    public void didCacheRewardedVideo(String location) {}
    @NotImplemented("didFailToLoadRewardedVideo:withError:")
    public void didFailToLoadRewardedVideo(String location, CBLoadError error) {}
    @NotImplemented("didDismissRewardedVideo:")
    public void didDismissRewardedVideo(String location) {}
    @NotImplemented("didCloseRewardedVideo:")
    public void didCloseRewardedVideo(String location) {}
    @NotImplemented("didClickRewardedVideo:")
    public void didClickRewardedVideo(String location) {}
    @NotImplemented("didCompleteRewardedVideo:withReward:")
    public void didCompleteRewardedVideo(String location, int reward) {}
    @NotImplemented("didCacheInPlay:")
    public void didCacheInPlay(String location) {}
    @NotImplemented("didFailToLoadInPlay:withError:")
    public void didFailToLoadInPlay(String location, CBLoadError error) {}
    @NotImplemented("willDisplayVideo:")
    public void willDisplayVideo(String location) {}
    @NotImplemented("didCompleteAppStoreSheetFlow")
    public void didCompleteAppStoreSheetFlow() {}
    @NotImplemented("didPauseClickForConfirmation")
    public void didPauseClickForConfirmation() {}
    @NotImplemented("didFailToLoadMoreApps:")
    public void didFailToLoadMoreApps(CBLoadError error) {}
    /*</methods>*/
}
