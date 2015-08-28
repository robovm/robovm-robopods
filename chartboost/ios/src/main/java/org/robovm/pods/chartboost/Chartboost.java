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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Chartboost/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ChartboostPtr extends Ptr<Chartboost, ChartboostPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Chartboost.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Chartboost() {}
    protected Chartboost(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    private static ChartboostDelegate delegate;
    
    public static void start(String appId, String appSignature, ChartboostDelegate delegate) {
        Chartboost.delegate = delegate;
        start0(appId, appSignature, delegate);
    }
    
    public static boolean hasInterstitial(CBLocation location) {
        return hasInterstitial(location.value().toString());
    }
    public static void showInterstitial(CBLocation location) {
        showInterstitial(location.value().toString());
    }
    public static boolean hasMoreApps(CBLocation location) {
        return hasMoreApps(location.value().toString());
    }
    public static void showMoreApps(CBLocation location) {
        showMoreApps(location.value().toString());
    }
    public static void showMoreApps(UIViewController viewController, CBLocation location) {
        showMoreApps(location.value().toString());
    }
    public static boolean hasRewardedVideo(CBLocation location) {
        return hasRewardedVideo(location.value().toString());
    }
    public static void showRewardedVideo(CBLocation location) {
        showRewardedVideo(location.value().toString());
    }
    public static void cacheInterstitial(CBLocation location) {
        cacheInterstitial(location.value().toString());
    }
    public static void cacheMoreApps(CBLocation location) {
        cacheMoreApps(location.value().toString());
    }
    public static void cacheRewardedVideo(CBLocation location) {
        cacheRewardedVideo(location.value().toString());
    }
    public static void cacheInPlay(CBLocation location) {
        cacheInPlay(location.value().toString());
    }
    public static boolean hasInPlay(CBLocation location) {
        return hasInPlay(location.value().toString());
    }
    public static CBInPlay getInPlay(CBLocation location) {
        return getInPlay(location.value().toString());
    }
    /*<methods>*/
    @Method(selector = "startWithAppId:appSignature:delegate:")
    private static native void start0(String appId, String appSignature, ChartboostDelegate delegate);
    @Method(selector = "isAnyViewVisible")
    public static native boolean isAnyViewVisible();
    @Method(selector = "hasInterstitial:")
    public static native boolean hasInterstitial(String location);
    @Method(selector = "showInterstitial:")
    public static native void showInterstitial(String location);
    @Method(selector = "hasMoreApps:")
    public static native boolean hasMoreApps(String location);
    @Method(selector = "showMoreApps:")
    public static native void showMoreApps(String location);
    @Method(selector = "showMoreApps:location:")
    public static native void showMoreApps(UIViewController viewController, String location);
    @Method(selector = "hasRewardedVideo:")
    public static native boolean hasRewardedVideo(String location);
    @Method(selector = "showRewardedVideo:")
    public static native void showRewardedVideo(String location);
    @Method(selector = "didPassAgeGate:")
    public static native void didPassAgeGate(boolean pass);
    @Method(selector = "handleOpenURL:sourceApplication:")
    public static native boolean handleOpenURL(NSURL url, String sourceApplication);
    @Method(selector = "handleOpenURL:sourceApplication:annotation:")
    public static native boolean handleOpenURL(NSURL url, String sourceApplication, NSPropertyList annotation);
    @Method(selector = "setCustomId:")
    public static native void setCustomId(String customId);
    @Method(selector = "getCustomId")
    public static native String getCustomId();
    @Method(selector = "setFrameworkVersion:")
    public static native void setFrameworkVersion(String frameworkVersion);
    @Method(selector = "setFramework:")
    public static native void setFramework(CBFramework framework);
    @Method(selector = "setFramework:withVersion:")
    public static native void setFramework(CBFramework framework, String version);
    @Method(selector = "setMediation:withVersion:")
    public static native void setMediation(String libraryName, String libraryVersion);
    @Method(selector = "setShouldRequestInterstitialsInFirstSession:")
    public static native void setShouldRequestInterstitialsInFirstSession(boolean shouldRequest);
    @Method(selector = "setShouldPauseClickForConfirmation:")
    public static native void setShouldPauseClickForConfirmation(boolean shouldPause);
    @Method(selector = "setShouldDisplayLoadingViewForMoreApps:")
    public static native void setShouldDisplayLoadingViewForMoreApps(boolean shouldDisplay);
    @Method(selector = "setShouldPrefetchVideoContent:")
    public static native void setShouldPrefetchVideoContent(boolean shouldPrefetch);
    @Method(selector = "cacheInterstitial:")
    public static native void cacheInterstitial(String location);
    @Method(selector = "cacheMoreApps:")
    public static native void cacheMoreApps(String location);
    @Method(selector = "cacheRewardedVideo:")
    public static native void cacheRewardedVideo(String location);
    @Method(selector = "setAutoCacheAds:")
    public static native void setAutoCacheAds(boolean shouldCache);
    @Method(selector = "getAutoCacheAds")
    public static native boolean getAutoCacheAds();
    @Method(selector = "closeImpression")
    public static native void closeImpression();
    @Method(selector = "setStatusBarBehavior:")
    public static native void setStatusBarBehavior(CBStatusBarBehavior statusBarBehavior);
    @Method(selector = "cacheInPlay:")
    public static native void cacheInPlay(String location);
    @Method(selector = "hasInPlay:")
    public static native boolean hasInPlay(String location);
    @Method(selector = "getInPlay:")
    public static native CBInPlay getInPlay(String location);
    /*</methods>*/
}
