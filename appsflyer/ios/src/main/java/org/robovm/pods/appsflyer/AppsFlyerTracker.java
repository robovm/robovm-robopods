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
package org.robovm.pods.appsflyer;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppsFlyerTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppsFlyerTrackerPtr extends Ptr<AppsFlyerTracker, AppsFlyerTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppsFlyerTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AppsFlyerTracker() {}
    protected AppsFlyerTracker(Handle h, long handle) { super(h, handle); }
    protected AppsFlyerTracker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "customerUserID")
    public native String getCustomerUserID();
    @Property(selector = "setCustomerUserID:")
    public native void setCustomerUserID(String v);
    @Property(selector = "customData")
    public native NSDictionary<?, ?> getCustomData();
    @Property(selector = "setAdditionalData:")
    public native void setCustomData(NSDictionary<?, ?> v);
    @Property(selector = "appsFlyerDevKey")
    public native String getAppsFlyerDevKey();
    @Property(selector = "setAppsFlyerDevKey:")
    public native void setAppsFlyerDevKey(String v);
    @Property(selector = "appleAppID")
    public native String getAppleAppID();
    @Property(selector = "setAppleAppID:")
    public native void setAppleAppID(String v);
    @Property(selector = "currencyCode")
    public native String getCurrencyCode();
    @Property(selector = "setCurrencyCode:")
    public native void setCurrencyCode(String v);
    @Property(selector = "disableAppleAdSupportTracking")
    public native boolean isDisableAppleAdSupportTracking();
    @Property(selector = "setDisableAppleAdSupportTracking:")
    public native void setDisableAppleAdSupportTracking(boolean v);
    @Property(selector = "isDebug")
    public native boolean isDebug();
    @Property(selector = "setIsDebug:")
    public native void setIsDebug(boolean v);
    @Property(selector = "shouldCollectDeviceName")
    public native boolean shouldCollectDeviceName();
    @Property(selector = "setShouldCollectDeviceName:")
    public native void setShouldCollectDeviceName(boolean v);
    @Property(selector = "appInviteOneLinkID")
    public native String getAppInviteOneLinkID();
    @Property(selector = "setAppInviteOneLink:")
    public native void setAppInviteOneLinkID(String v);
    @Property(selector = "deviceTrackingDisabled")
    public native boolean isDeviceTrackingDisabled();
    @Property(selector = "setDeviceTrackingDisabled:")
    public native void setDeviceTrackingDisabled(boolean v);
    @Property(selector = "disableIAdTracking")
    public native boolean isDisableIAdTracking();
    @Property(selector = "setDisableIAdTracking:")
    public native void setDisableIAdTracking(boolean v);
    @Property(selector = "delegate")
    public native AppsFlyerTrackerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(AppsFlyerTrackerDelegate v);
    @Property(selector = "useReceiptValidationSandbox")
    public native boolean isUseReceiptValidationSandbox();
    @Property(selector = "setUseReceiptValidationSandbox:")
    public native void setUseReceiptValidationSandbox(boolean v);
    @Property(selector = "useUninstallSandbox")
    public native boolean isUseUninstallSandbox();
    @Property(selector = "setUseUninstallSandbox:")
    public native void setUseUninstallSandbox(boolean v);
    @Property(selector = "advertiserId")
    public native String getAdvertiserId();
    @Property(selector = "resolveDeepLinkURLs")
    public native NSArray<NSString> getResolveDeepLinkURLs();
    @Property(selector = "setResolveDeepLinkURLs:")
    public native void setResolveDeepLinkURLs(NSArray<NSString> v);
    @Property(selector = "oneLinkCustomDomains")
    public native NSArray<NSString> getOneLinkCustomDomains();
    @Property(selector = "setOneLinkCustomDomains:")
    public native void setOneLinkCustomDomains(NSArray<NSString> v);
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "setPhoneNumber:")
    public native void setPhoneNumber(String v);
    @Property(selector = "disableIDFVCollection")
    public native boolean isDisableIDFVCollection();
    @Property(selector = "setDisableIDFVCollection:")
    public native void setDisableIDFVCollection(boolean v);
    @Property(selector = "host")
    public native String getHost();
    @Property(selector = "hostPrefix")
    public native String getHostPrefix();
    @Property(selector = "minTimeBetweenSessions")
    public native @MachineSizedUInt long getMinTimeBetweenSessions();
    @Property(selector = "setMinTimeBetweenSessions:")
    public native void setMinTimeBetweenSessions(@MachineSizedUInt long v);
    @Property(selector = "isStopTracking")
    public native boolean isStopTracking();
    @Property(selector = "setIsStopTracking:")
    public native void setIsStopTracking(boolean v);
    @Property(selector = "facebookDeferredAppLink")
    public native NSURL getFacebookDeferredAppLink();
    @Property(selector = "setFacebookDeferredAppLink:")
    public native void setFacebookDeferredAppLink(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enableFacebookDeferredApplinksWithClass:")
    public native void enableFacebookDeferredApplinks(Class<?> facebookAppLinkUtilityClass);
    @Method(selector = "setUserEmails:withCryptType:")
    public native void setUserEmails(NSArray<NSString> userEmails, EmailCryptType type);
    @Method(selector = "trackAppLaunch")
    public native void trackAppLaunch();
    @Method(selector = "trackAppLaunchWithCompletionHandler:")
    public native void trackAppLaunch(@Block VoidBlock2<NSDictionary<NSString, ?>, NSError> completionHandler);
    @Deprecated
    @Method(selector = "trackEvent:withValue:")
    public native void trackEvent(String eventName, String value);
    @Method(selector = "trackEvent:withValues:")
    public native void trackEvent(String eventName, NSDictionary<?, ?> values);
    @Method(selector = "trackEventWithEventName:eventValues:completionHandler:")
    public native void trackEvent(String eventName, NSDictionary<NSString, ?> eventValues, @Block VoidBlock2<NSDictionary<NSString, ?>, NSError> completionHandler);
    @Method(selector = "validateAndTrackInAppPurchase:price:currency:transactionId:additionalParameters:success:failure:")
    public native void validateAndTrackInAppPurchase(String productIdentifier, String price, String currency, String tranactionId, NSDictionary<?, ?> params, @Block VoidBlock1<NSDictionary<?, ?>> successBlock, @Block VoidBlock2<NSError, NSObject> failedBlock);
    @Method(selector = "trackLocation:latitude:")
    public native void trackLocation(double longitude, double latitude);
    @Method(selector = "getAppsFlyerUID")
    public native String getAppsFlyerUID();
    @Method(selector = "handleOpenURL:sourceApplication:")
    public native void handleOpenURL(NSURL url, String sourceApplication);
    @Method(selector = "handleOpenURL:sourceApplication:withAnnotation:")
    public native void handleOpenURL(NSURL url, String sourceApplication, NSObject annotation);
    @Method(selector = "handleOpenUrl:options:")
    public native void handleOpenUrl(NSURL url, NSDictionary<?, ?> options);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "continueUserActivity:restorationHandler:")
    public native boolean continueUserActivity(NSUserActivity userActivity, @Block VoidBlock1<NSArray<?>> restorationHandler);
    @Method(selector = "handlePushNotification:")
    public native void handlePushNotification(NSDictionary<?, ?> pushPayload);
    @Method(selector = "registerUninstall:")
    public native void registerUninstall(NSData deviceToken);
    @Method(selector = "getSDKVersion")
    public native String getSDKVersion();
    @Method(selector = "remoteDebuggingCallWithData:")
    public native void remoteDebuggingCall(String data);
    @Method(selector = "setHost:withHostPrefix:")
    public native void setHost(String host, String hostPrefix);
    @Method(selector = "sharedTracker")
    public static native AppsFlyerTracker sharedTracker();
    /*</methods>*/
}
