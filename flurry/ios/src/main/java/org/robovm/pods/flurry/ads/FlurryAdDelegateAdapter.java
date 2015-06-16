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
package org.robovm.pods.flurry.ads;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAdDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FlurryAdDelegate/*</implements>*/ {

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
    @NotImplemented("spaceDidReceiveAd:")
    public void spaceDidReceiveAd(String adSpace) {}
    @NotImplemented("spaceDidFailToReceiveAd:error:")
    public void spaceDidFailToReceiveAd(String adSpace, NSError error) {}
    @NotImplemented("spaceShouldDisplay:interstitial:")
    public boolean spaceShouldDisplay(String adSpace, boolean interstitial) { return false; }
    @NotImplemented("spaceDidRender:interstitial:")
    public void spaceDidRender(String space, boolean interstitial) {}
    @NotImplemented("spaceDidFailToRender:error:")
    public void spaceDidFailToRender(String space, NSError error) {}
    @NotImplemented("spaceWillDismiss:interstitial:")
    public void spaceWillDismiss(String adSpace, boolean interstitial) {}
    @NotImplemented("spaceDidDismiss:interstitial:")
    public void spaceDidDismiss(String adSpace, boolean interstitial) {}
    @NotImplemented("spaceWillLeaveApplication:")
    public void spaceWillLeaveApplication(String adSpace) {}
    @NotImplemented("spaceWillExpand:")
    public void spaceWillExpand(String adSpace) {}
    @NotImplemented("spaceWillCollapse:")
    public void spaceWillCollapse(String adSpace) {}
    @NotImplemented("spaceDidCollapse:")
    public void spaceDidCollapse(String adSpace) {}
    @NotImplemented("spaceDidReceiveClick:")
    public void spaceDidReceiveClick(String adSpace) {}
    @NotImplemented("spaceClickActionDidFail:error:")
    public void spaceClickActionDidFail(String adSpace, NSError error) {}
    @NotImplemented("videoDidFinish:")
    public void videoDidFinish(String adSpace) {}
    @NotImplemented("videoDidNotFinish:")
    public void videoDidNotFinish(String adSpace) {}
    @NotImplemented("appSpotMillennialAppKey")
    public String getAppSpotMillennialAppKey() { return null; }
    @NotImplemented("appSpotMillennialInterstitalAppKey")
    public String getAppSpotMillennialInterstitalAppKey() { return null; }
    @NotImplemented("appSpotInMobiAppKey")
    public String getAppSpotInMobiAppKey() { return null; }
    @NotImplemented("appSpotFANAppPlacementID")
    public String getAppSpotFANAppPlacementID() { return null; }
    @NotImplemented("appSpotAdMobPublisherID")
    public String getAppSpotAdMobPublisherID() { return null; }
    @NotImplemented("appSpotMobclixApplicationID")
    public String getAppSpotMobclixApplicationID() { return null; }
    @NotImplemented("appSpotJumptapPublisherID")
    public String getAppSpotJumptapPublisherID() { return null; }
    @NotImplemented("appSpotJumptapSiteID")
    public String getAppSpotJumptapSiteID() { return null; }
    @NotImplemented("appSpotJumptapBannerAdSpotID")
    public String getAppSpotJumptapBannerAdSpotID() { return null; }
    @NotImplemented("appSpotJumptapLeaderboardAdSpotID")
    public String getAppSpotJumptapLeaderboardAdSpotID() { return null; }
    @NotImplemented("appSpotJumptapMediumRectangleAdSpotID")
    public String getAppSpotJumptapMediumRectangleAdSpotID() { return null; }
    @NotImplemented("appSpotRootViewController")
    public NSObject getAppSpotRootViewController() { return null; }
    @NotImplemented("appSpotAccelerometerEnabled")
    public boolean isAppSpotAccelerometerEnabled() { return false; }
    /*</methods>*/
}
