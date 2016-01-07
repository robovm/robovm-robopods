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
package org.robovm.pods.heyzap.ads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZNetworkCallback/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(HZNetworkCallback.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="HZNetworkCallbackInitialized", optional=true)
    public static native String Initialized();
    @GlobalValue(symbol="HZNetworkCallbackShow", optional=true)
    public static native String Show();
    @GlobalValue(symbol="HZNetworkCallbackAvailable", optional=true)
    public static native String Available();
    @GlobalValue(symbol="HZNetworkCallbackHide", optional=true)
    public static native String Hide();
    @GlobalValue(symbol="HZNetworkCallbackFetchFailed", optional=true)
    public static native String FetchFailed();
    @GlobalValue(symbol="HZNetworkCallbackClick", optional=true)
    public static native String Click();
    @GlobalValue(symbol="HZNetworkCallbackDismiss", optional=true)
    public static native String Dismiss();
    @GlobalValue(symbol="HZNetworkCallbackIncentivizedResultIncomplete", optional=true)
    public static native String IncentivizedResultIncomplete();
    @GlobalValue(symbol="HZNetworkCallbackIncentivizedResultComplete", optional=true)
    public static native String IncentivizedResultComplete();
    @GlobalValue(symbol="HZNetworkCallbackAudioStarting", optional=true)
    public static native String AudioStarting();
    @GlobalValue(symbol="HZNetworkCallbackAudioFinished", optional=true)
    public static native String AudioFinished();
    @GlobalValue(symbol="HZNetworkCallbackLeaveApplication", optional=true)
    public static native String LeaveApplication();
    @GlobalValue(symbol="HZNetworkCallbackBannerLoaded", optional=true)
    public static native String BannerLoaded();
    @GlobalValue(symbol="HZNetworkCallbackBannerClick", optional=true)
    public static native String BannerClick();
    @GlobalValue(symbol="HZNetworkCallbackBannerHide", optional=true)
    public static native String BannerHide();
    @GlobalValue(symbol="HZNetworkCallbackBannerDismiss", optional=true)
    public static native String BannerDismiss();
    @GlobalValue(symbol="HZNetworkCallbackBannerFetchFailed", optional=true)
    public static native String BannerFetchFailed();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsFetchFailed", optional=true)
    public static native String ChartboostMoreAppsFetchFailed();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsDismiss", optional=true)
    public static native String ChartboostMoreAppsDismiss();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsHide", optional=true)
    public static native String ChartboostMoreAppsHide();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsClick", optional=true)
    public static native String ChartboostMoreAppsClick();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsShow", optional=true)
    public static native String ChartboostMoreAppsShow();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsAvailable", optional=true)
    public static native String ChartboostMoreAppsAvailable();
    @GlobalValue(symbol="HZNetworkCallbackChartboostMoreAppsClickFailed", optional=true)
    public static native String ChartboostMoreAppsClickFailed();
    @GlobalValue(symbol="HZNetworkCallbackFacebookLoggingImpression", optional=true)
    public static native String FacebookLoggingImpression();
    /*</methods>*/
}
