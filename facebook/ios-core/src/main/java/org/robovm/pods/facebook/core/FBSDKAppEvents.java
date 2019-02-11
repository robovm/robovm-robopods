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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEvents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppEventsPtr extends Ptr<FBSDKAppEvents, FBSDKAppEventsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppEvents.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppEvents() {}
    protected FBSDKAppEvents(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppEvents(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAppEventsLoggingResultNotification", optional=true)
    public static native NSString LoggingResultNotification();
    @GlobalValue(symbol="FBSDKAppEventsOverrideAppIDBundleKey", optional=true)
    public static native NSString OverrideAppIDBundleKey();
    
    @Method(selector = "logEvent:")
    public static native void logEvent(String eventName);
    @Method(selector = "logEvent:valueToSum:")
    public static native void logEvent(String eventName, double valueToSum);
    @Method(selector = "logEvent:parameters:")
    public static native void logEvent(String eventName, NSDictionary<NSString, NSObject> parameters);
    @Method(selector = "logEvent:valueToSum:parameters:")
    public static native void logEvent(String eventName, double valueToSum, NSDictionary<NSString, NSObject> parameters);
    @Method(selector = "logEvent:valueToSum:parameters:accessToken:")
    public static native void logEvent(String eventName, NSNumber valueToSum, NSDictionary<NSString, NSObject> parameters, FBSDKAccessToken accessToken);
    @Method(selector = "logPurchase:currency:")
    public static native void logPurchase(double purchaseAmount, String currency);
    @Method(selector = "logPurchase:currency:parameters:")
    public static native void logPurchase(double purchaseAmount, String currency, NSDictionary<NSString, NSObject> parameters);
    @Method(selector = "logPurchase:currency:parameters:accessToken:")
    public static native void logPurchase(double purchaseAmount, String currency, NSDictionary<NSString, NSObject> parameters, FBSDKAccessToken accessToken);
    @Method(selector = "logPushNotificationOpen:")
    public static native void logPushNotificationOpen(UIRemoteNotification payload);
    @Method(selector = "logPushNotificationOpen:action:")
    public static native void logPushNotificationOpen(UIRemoteNotification payload, String action);
    @Method(selector = "logProductItem:availability:condition:description:imageLink:link:title:priceAmount:currency:gtin:mpn:brand:parameters:")
    public static native void logProductItem(String itemID, FBSDKProductAvailability availability, FBSDKProductCondition condition, String description, String imageLink, String link, String title, double priceAmount, String currency, String gtin, String mpn, String brand, NSDictionary<?, ?> parameters);
    @Method(selector = "activateApp")
    public static native void activateApp();
    @Method(selector = "setPushNotificationsDeviceToken:")
    public static native void setPushNotificationsDeviceToken(NSData deviceToken);
    @Method(selector = "setPushNotificationsDeviceTokenString:")
    public static native void setPushNotificationsDeviceTokenString(String deviceTokenString);
    @Method(selector = "flushBehavior")
    public static native FBSDKAppEventsFlushBehavior getFlushBehavior();
    @Method(selector = "setFlushBehavior:")
    public static native void setFlushBehavior(FBSDKAppEventsFlushBehavior flushBehavior);
    @Method(selector = "setLoggingOverrideAppID:")
    public static native void setLoggingOverrideAppID(String appID);
    @Method(selector = "loggingOverrideAppID")
    public static native String getLoggingOverrideAppID();
    @Method(selector = "flush")
    public static native void flush();
    @Method(selector = "requestForCustomAudienceThirdPartyIDWithAccessToken:")
    public static native FBSDKGraphRequest requestForCustomAudienceThirdPartyID(FBSDKAccessToken accessToken);
    @Method(selector = "setUserID:")
    public static native void setUserID(String userID);
    @Method(selector = "clearUserID")
    public static native void clearUserID();
    @Method(selector = "userID")
    public static native String userID();
    @Method(selector = "setUserData:")
    public static native void setUserData(NSDictionary<?, ?> userData);
    @Method(selector = "setUserEmail:firstName:lastName:phone:dateOfBirth:gender:city:state:zip:country:")
    public static native void setUserData(String email, String firstName, String lastName, String phone, String dateOfBirth, String gender, String city, String state, String zip, String country);
    @Method(selector = "getUserData")
    public static native String getUserData();
    @Method(selector = "clearUserData")
    public static native void clearUserData();
    @Method(selector = "updateUserProperties:handler:")
    public static native void updateUserProperties(NSDictionary<?, ?> properties, @Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> handler);
    @Method(selector = "augmentHybridWKWebView:")
    public static native void augmentHybridWKWebView(WKWebView webView);
    @Method(selector = "setIsUnityInit:")
    public static native void setIsUnityInit(boolean isUnityInit);
    @Method(selector = "sendEventBindingsToUnity")
    public static native void sendEventBindingsToUnity();
    /*</methods>*/
}
