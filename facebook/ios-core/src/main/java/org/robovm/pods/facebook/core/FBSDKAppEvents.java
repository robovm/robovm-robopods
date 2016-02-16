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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEvents/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeLoggingResult(final VoidBlock1<NSError> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(LoggingResultNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSError)a.getObject());
                }
            });
        }
    }
    
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
    
    /* Convenience methods */
    public static void logEvent(FBSDKAppEventName eventName) {
        logEvent(eventName.value().toString());
    }
    public static void logEvent(FBSDKAppEventName eventName, double valueToSum) {
        logEvent(eventName.value().toString(), valueToSum);
    }
    public static void logEvent(FBSDKAppEventName eventName, NSDictionary<NSString, NSObject> parameters) {
        logEvent(eventName.value().toString(), parameters);
    }
    public static void logEvent(FBSDKAppEventName eventName, Object... parameters) {
        logEvent(eventName.value().toString(), getDictionaryForParameters(parameters));
    }
    public static void logEvent(FBSDKAppEventName eventName, double valueToSum, NSDictionary<NSString, NSObject> parameters) {
        logEvent(eventName.value().toString(), valueToSum, parameters);
    }
    public static void logEvent(FBSDKAppEventName eventName, double valueToSum, Object... parameters) {
        logEvent(eventName.value().toString(), valueToSum, getDictionaryForParameters(parameters));
    }
    public static void logEvent(FBSDKAppEventName eventName, double valueToSum, FBSDKAccessToken accessToken, NSDictionary<NSString, NSObject> parameters) {
        logEvent(eventName.value().toString(), NSNumber.valueOf(valueToSum), parameters, accessToken);
    }
    public static void logEvent(FBSDKAppEventName eventName, double valueToSum, FBSDKAccessToken accessToken, Object... parameters) {
        logEvent(eventName.value().toString(), NSNumber.valueOf(valueToSum), getDictionaryForParameters(parameters), accessToken);
    }
    public static void logPurchase(double purchaseAmount, String currency, Object... parameters) {
        logPurchase(purchaseAmount, currency, getDictionaryForParameters(parameters));
    }
    public static void logPurchase(double purchaseAmount, String currency, FBSDKAccessToken accessToken, Object... parameters) {
        logPurchase(purchaseAmount, currency, getDictionaryForParameters(parameters), accessToken);
    }
    
    public static void logEvent(String eventName, Object...parameters) {
        logEvent(eventName,  getDictionaryForParameters(parameters));
    }
    public static void logEvent(String eventName, double valueToSum, Object...parameters) {
        logEvent(eventName, valueToSum, getDictionaryForParameters(parameters));
    }
    public static void logEvent(String eventName, NSNumber valueToSum, FBSDKAccessToken accessToken, Object...parameters) {
        logEvent(eventName, valueToSum, accessToken, getDictionaryForParameters(parameters));
    }
    
    private static NSDictionary<NSString, NSObject> getDictionaryForParameters(Object...parameters) {
        NSDictionary<NSString, NSObject> dict = new NSMutableDictionary<>();
        for (int i = 0; i < parameters.length; i += 2) {
            NSString key = null;
            Object keyObj = parameters[i];
            if (keyObj instanceof String) {
                key = new NSString((String)keyObj);
            } else if (keyObj instanceof NSString) {
                key = (NSString)keyObj;
            } else {
               key = new NSString(String.valueOf(keyObj));
            }
            NSObject value = null;
            Object valueObj = parameters[i + 1];
            if (valueObj instanceof String) {
                value = new NSString((String)valueObj);
            } else if (valueObj instanceof Number) {
                value = NSNumber.valueOf((Number)valueObj);
            } else if (valueObj instanceof NSObject) {
                value = (NSObject)valueObj;
            } else {
                value = new NSString(String.valueOf(valueObj));
            }
            dict.put(key, value);
        }
        return dict;
    }
    
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
    @Method(selector = "activateApp")
    public static native void activateApp();
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
    /*</methods>*/
}
