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
package org.robovm.pods.ironsource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/IronSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class IronSourcePtr extends Ptr<IronSource, IronSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(IronSource.class); }/*</bind>*/
    /*<constants>*/
    public static final String IS_REWARDED_VIDEO = "rewardedvideo";
    public static final String IS_INTERSTITIAL = "interstitial";
    public static final String IS_OFFERWALL = "offerwall";
    public static final String IS_BANNER = "banner";
    /*</constants>*/
    /*<constructors>*/
    public IronSource() {}
    protected IronSource(Handle h, long handle) { super(h, handle); }
    protected IronSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sdkVersion")
    public static native String sdkVersion();
    @Method(selector = "setAge:")
    public static native void setAge(@MachineSizedSInt long age);
    @Method(selector = "setGender:")
    public static native void setGender(ISGender gender);
    @Method(selector = "shouldTrackReachability:")
    public static native void shouldTrackReachability(boolean flag);
    @Method(selector = "setAdaptersDebug:")
    public static native void setAdaptersDebug(boolean flag);
    @Method(selector = "setDynamicUserId:")
    public static native boolean setDynamicUserId(String dynamicUserId);
    @Method(selector = "advertiserId")
    public static native String advertiserId();
    @Method(selector = "setMediationType:")
    public static native void setMediationType(String mediationType);
    @Method(selector = "setMediationSegment:")
    public static native void setMediationSegment(String segment);
    @Method(selector = "setSegment:")
    public static native void setSegment(ISSegment segment);
    @Method(selector = "setSegmentDelegate:")
    public static native void setSegmentDelegate(ISSegmentDelegate delegate);
    @Method(selector = "setUserId:")
    public static native void setUserId(String userId);
    @Method(selector = "initWithAppKey:")
    public static native void init(String appKey);
    @Method(selector = "initWithAppKey:adUnits:")
    public static native void init(String appKey, NSArray<NSString> adUnits);
    @Method(selector = "initISDemandOnly:adUnits:")
    public static native void initISDemandOnly(String appKey, NSArray<NSString> adUnits);
    @Method(selector = "setRewardedVideoDelegate:")
    public static native void setRewardedVideoDelegate(ISRewardedVideoDelegate delegate);
    @Method(selector = "showRewardedVideoWithViewController:")
    public static native void showRewardedVideo(UIViewController viewController);
    @Method(selector = "showRewardedVideoWithViewController:placement:")
    public static native void showRewardedVideo(UIViewController viewController, String placementName);
    @Method(selector = "hasRewardedVideo")
    public static native boolean hasRewardedVideo();
    @Method(selector = "isRewardedVideoCappedForPlacement:")
    public static native boolean isRewardedVideoCappedForPlacement(String placementName);
    @Method(selector = "rewardedVideoPlacementInfo:")
    public static native ISPlacementInfo rewardedVideoPlacementInfo(String placementName);
    @Method(selector = "setRewardedVideoServerParameters:")
    public static native void setRewardedVideoServerParameters(NSDictionary<?, ?> parameters);
    @Method(selector = "clearRewardedVideoServerParameters")
    public static native void clearRewardedVideoServerParameters();
    @Method(selector = "setISDemandOnlyRewardedVideoDelegate:")
    public static native void setISDemandOnlyRewardedVideoDelegate(ISDemandOnlyRewardedVideoDelegate delegate);
    @Method(selector = "loadISDemandOnlyRewardedVideo:")
    public static native void loadISDemandOnlyRewardedVideo(String instanceId);
    @Method(selector = "showISDemandOnlyRewardedVideo:instanceId:")
    public static native void showISDemandOnlyRewardedVideo(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyRewardedVideo:")
    public static native boolean hasISDemandOnlyRewardedVideo(String instanceId);
    @Method(selector = "setInterstitialDelegate:")
    public static native void setInterstitialDelegate(ISInterstitialDelegate delegate);
    @Method(selector = "setRewardedInterstitialDelegate:")
    public static native void setRewardedInterstitialDelegate(ISRewardedInterstitialDelegate delegate);
    @Method(selector = "loadInterstitial")
    public static native void loadInterstitial();
    @Method(selector = "showInterstitialWithViewController:")
    public static native void showInterstitial(UIViewController viewController);
    @Method(selector = "showInterstitialWithViewController:placement:")
    public static native void showInterstitial(UIViewController viewController, String placementName);
    @Method(selector = "hasInterstitial")
    public static native boolean hasInterstitial();
    @Method(selector = "isInterstitialCappedForPlacement:")
    public static native boolean isInterstitialCappedForPlacement(String placementName);
    @Method(selector = "setISDemandOnlyInterstitialDelegate:")
    public static native void setISDemandOnlyInterstitialDelegate(ISDemandOnlyInterstitialDelegate delegate);
    @Method(selector = "loadISDemandOnlyInterstitial:")
    public static native void loadISDemandOnlyInterstitial(String instanceId);
    @Method(selector = "showISDemandOnlyInterstitial:instanceId:")
    public static native void showISDemandOnlyInterstitial(UIViewController viewController, String instanceId);
    @Method(selector = "hasISDemandOnlyInterstitial:")
    public static native boolean hasISDemandOnlyInterstitial(String instanceId);
    @Method(selector = "setOfferwallDelegate:")
    public static native void setOfferwallDelegate(ISOfferwallDelegate delegate);
    @Method(selector = "showOfferwallWithViewController:")
    public static native void showOfferwall(UIViewController viewController);
    @Method(selector = "showOfferwallWithViewController:placement:")
    public static native void showOfferwall(UIViewController viewController, String placementName);
    @Method(selector = "offerwallCredits")
    public static native void offerwallCredits();
    @Method(selector = "hasOfferwall")
    public static native boolean hasOfferwall();
    @Method(selector = "setBannerDelegate:")
    public static native void setBannerDelegate(ISBannerDelegate delegate);
    @Method(selector = "loadBannerWithViewController:size:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size);
    @Method(selector = "loadBannerWithViewController:size:placement:")
    public static native void loadBanner(UIViewController viewController, ISBannerSize size, String placementName);
    @Method(selector = "destroyBanner:")
    public static native void destroyBanner(ISBannerView banner);
    @Method(selector = "isBannerCappedForPlacement:")
    public static native boolean isBannerCappedForPlacement(String placementName);
    @Method(selector = "setLogDelegate:")
    public static native void setLogDelegate(ISLogDelegate delegate);
    @Method(selector = "setConsent:")
    public static native void setConsent(boolean consent);
    /*</methods>*/
}
