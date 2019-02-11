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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FacebookCore/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FacebookCore.class); }/*</bind>*/
    /*<constants>*/
    public static final String Constant__FBSDK_VERSION_STRING = "4.39.1";
    public static final String Constant__FBSDK_TARGET_PLATFORM_VERSION = "v3.2";
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAccessTokenDidExpireKey", optional=true)
    public static native String Value__FBSDKAccessTokenDidExpireKey();
    @GlobalValue(symbol="FBSDKAccessTokenDidExpire", optional=true)
    public static native String Value__FBSDKAccessTokenDidExpire();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel0", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel0();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel1", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel1();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel2", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel2();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel3", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel3();
    @GlobalValue(symbol="FBSDKAppEventParameterProductCustomLabel4", optional=true)
    public static native String Value__FBSDKAppEventParameterProductCustomLabel4();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIOSAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIOSAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPhoneAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPhoneAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppStoreID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadAppStoreID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkIPadAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkIPadAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidPackage", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidPackage();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkAndroidAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkAndroidAppName();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneUrl();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppID();
    @GlobalValue(symbol="FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName", optional=true)
    public static native String Value__FBSDKAppEventParameterProductAppLinkWindowsPhoneAppName();
    @GlobalValue(symbol="FBSDKGraphRequestErrorKey", optional=true)
    public static native String Value__FBSDKGraphRequestErrorKey();
    @GlobalValue(symbol="FBSDKAppLinkVersion", optional=true)
    public static native String Value__FBSDKAppLinkVersion();
    @GlobalValue(symbol="FBSDKMeasurementEventNotification", optional=true)
    public static native String Value__FBSDKMeasurementEventNotification();
    @GlobalValue(symbol="FBSDKMeasurementEventNotificationName", optional=true)
    public static native String Value__FBSDKMeasurementEventNotificationName();
    @GlobalValue(symbol="FBSDKMeasurementEventNameKey", optional=true)
    public static native String Value__FBSDKMeasurementEventNameKey();
    @GlobalValue(symbol="FBSDKMeasurementEventArgsKey", optional=true)
    public static native String Value__FBSDKMeasurementEventArgsKey();
    @GlobalValue(symbol="FBSDKAppLinkParseEventName", optional=true)
    public static native String Value__FBSDKAppLinkParseEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateInEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateInEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateOutEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateOutEventName();
    @GlobalValue(symbol="FBSDKAppLinkNavigateBackToReferrerEventName", optional=true)
    public static native String Value__FBSDKAppLinkNavigateBackToReferrerEventName();
    /*</methods>*/
}
