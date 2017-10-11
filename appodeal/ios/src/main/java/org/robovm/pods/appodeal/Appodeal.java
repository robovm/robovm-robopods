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
package org.robovm.pods.appodeal;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Appodeal/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppodealPtr extends Ptr<Appodeal, AppodealPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Appodeal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Appodeal() {}
    protected Appodeal(Handle h, long handle) { super(h, handle); }
    protected Appodeal(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "disableNetworkForAdType:name:")
    public static native void disableNetworkForAdType(AppodealAdType adType, String networkName);
    @Method(selector = "disableLocationPermissionCheck")
    public static native void disableLocationPermissionCheck();
    @Method(selector = "setLocationTracking:")
    public static native void setLocationTracking(boolean enabled);
    @Method(selector = "setAutocache:types:")
    public static native void setAutocache(boolean autocache, AppodealAdType types);
    @Method(selector = "isAutocacheEnabled:")
    public static native boolean isAutocacheEnabled(AppodealAdType types);
    @Method(selector = "initializeWithApiKey:types:")
    public static native void initialize(String apiKey, AppodealAdType types);
    @Method(selector = "isInitalized")
    public static native boolean isInitalized();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(APDLogLevel logLevel);
    @Method(selector = "setPluginVersion:")
    public static native void setPluginVersion(String pluginVersion);
    @Method(selector = "setInterstitialDelegate:")
    public static native void setInterstitialDelegate(AppodealInterstitialDelegate interstitialDelegate);
    @Method(selector = "setBannerDelegate:")
    public static native void setBannerDelegate(AppodealBannerDelegate bannerDelegate);
    @Method(selector = "setSkippableVideoDelegate:")
    public static native void setSkippableVideoDelegate(AppodealSkippableVideoDelegate videoDelegate);
    @Method(selector = "setRewardedVideoDelegate:")
    public static native void setRewardedVideoDelegate(AppodealRewardedVideoDelegate rewardedVideoDelegate);
    @Method(selector = "setNonSkippableVideoDelegate:")
    public static native void setNonSkippableVideoDelegate(AppodealNonSkippableVideoDelegate nonSkippableVideoDelegate);
    @Method(selector = "setNativeAdDelegate:")
    public static native void setNativeAdDelegate(AppodealNativeAdDelegate nativeAdDelegate);
    @Method(selector = "setRequestDelegate:")
    public static native void setRequestDelegate(AppodealRequestDelegate requestDelegate);
    @Method(selector = "banner")
    public static native UIView banner();
    @Method(selector = "showAd:rootViewController:")
    public static native boolean showAd(AppodealShowStyle style, UIViewController rootViewController);
    @Method(selector = "showAd:forPlacement:rootViewController:")
    public static native boolean showAd(AppodealShowStyle style, String placement, UIViewController rootViewController);
    @Method(selector = "canShowAd:forPlacement:")
    public static native boolean canShowAd(AppodealShowStyle style, String placement);
    @Method(selector = "rewardForPlacement:")
    public static native APDReward rewardForPlacement(String placement);
    @Method(selector = "cacheAd:")
    public static native void cacheAd(AppodealAdType type);
    @Method(selector = "cacheAd:forPlacement:")
    public static native void cacheAd(AppodealAdType type, String placement);
    @Method(selector = "hideBanner")
    public static native void hideBanner();
    @Method(selector = "setDebugEnabled:")
    public static native void setDebugEnabled(boolean debugEnabled);
    @Method(selector = "setTestingEnabled:")
    public static native void setTestingEnabled(boolean testingEnabled);
    @Method(selector = "getUUID")
    public static native String getUUID();
    @Method(selector = "getVersion")
    public static native String getVersion();
    @Method(selector = "isReadyForShowWithStyle:")
    public static native boolean isReadyForShow(AppodealShowStyle showStyle);
    @Method(selector = "setCustomRule:")
    public static native void setCustomRule(NSDictionary<?, ?> customRule);
    @Method(selector = "confirmUsage:")
    public static native void confirmUsage(AppodealAdType adTypes);
    @Method(selector = "setSmartBannersEnabled:")
    public static native void setSmartBannersEnabled(boolean smartBannerEnabled);
    @Method(selector = "setBannerBackgroundVisible:")
    public static native void setBannerBackgroundVisible(boolean bannerBackgroundVisible);
    @Method(selector = "setBannerAnimationEnabled:")
    public static native void setBannerAnimationEnabled(boolean bannerAnimationEnabled);
    @Method(selector = "loadNaitveAd:capacity:")
    public static native void loadNativeAd(APDNativeAdType type, @MachineSizedSInt long capacity);
    @Method(selector = "getNativeAdsOfCount:")
    public static native NSArray<?> getNativeAdsOfCount(@MachineSizedSInt long count);
    @Method(selector = "availableNativeAdsCount")
    public static native @MachineSizedSInt long availableNativeAdsCount();
    @Method(selector = "disableUserData:")
    public static native void disableUserData(String networkName);
    @Method(selector = "setMinimumFreeMemoryPercentage:forAdType:")
    public static native void setMinimumFreeMemoryPercentage(@MachineSizedUInt long percentage, AppodealAdType type);
    @Method(selector = "setMinimumFreeMemoryPercentage:observeSystemWarnings:forAdType:")
    public static native void setMinimumFreeMemoryPercentage(@MachineSizedUInt long percentage, boolean observeSystemWarnings, AppodealAdType type);
    @Method(selector = "setChildDirectedTreatment:")
    public static native void setChildDirectedTreatment(boolean childDirectedTreatment);
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "setUserEmail:")
    public static native void setUserEmail(String email);
    @Method(selector = "setUserBirthday:")
    public static native void setUserBirthday(NSDate birthday);
    @Method(selector = "setUserAge:")
    public static native void setUserAge(@MachineSizedUInt long age);
    @Method(selector = "setUserGender:")
    public static native void setUserGender(AppodealUserGender gender);
    @Method(selector = "setUserOccupation:")
    public static native void setUserOccupation(AppodealUserOccupation occupation);
    @Method(selector = "setUserRelationship:")
    public static native void setUserRelationship(AppodealUserRelationship relationship);
    @Method(selector = "setUserSmokingAttitude:")
    public static native void setUserSmokingAttitude(AppodealUserSmokingAttitude smokingAttitude);
    @Method(selector = "setUserAlcoholAttitude:")
    public static native void setUserAlcoholAttitude(AppodealUserAlcoholAttitude alcoholAttitude);
    @Method(selector = "setUserInterests:")
    public static native void setUserInterests(String interests);
    /*</methods>*/
}
