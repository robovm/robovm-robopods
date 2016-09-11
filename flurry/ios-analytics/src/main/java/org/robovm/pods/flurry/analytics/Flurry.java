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
package org.robovm.pods.flurry.analytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Flurry/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryPtr extends Ptr<Flurry, FlurryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Flurry.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Flurry() {}
    protected Flurry(Handle h, long handle) { super(h, handle); }
    protected Flurry(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /**
     * Use this method in {@link UIApplicationDelegate#didFinishLaunching(UIApplication, UIApplicationLaunchOptions)} to install 
     * the crash reporting signal handler of Flurry.
     */
    public static void enableCrashReporting() {
        Signals.installSignals(new org.robovm.rt.Signals.InstallSignalsCallback() {
            @Override
            public void install() {
                setCrashReportingEnabled(true);
            }
        });
    }
    public static void addOrigin(String originName, String originVersion, Map<String, String> parameters) {
        addOrigin(originName, originVersion, stringMapToDictionary(parameters));
    }
    public static FlurryEventRecordStatus logEvent(String eventName, Map<String, String> parameters) {
        return logEvent(eventName, stringMapToDictionary(parameters));
    }
    public static FlurryEventRecordStatus logEvent(String eventName, Map<String, String> parameters, boolean timed) {
        return logEvent(eventName, stringMapToDictionary(parameters), timed);
    }
    public static void endTimedEvent(String eventName, Map<String, String> parameters) {
        endTimedEvent(eventName, stringMapToDictionary(parameters));
    }
    public static void endTimedEvent(String eventName) {
        endTimedEvent(eventName, (NSDictionary<?, ?>) null);
    }
    
    public static void logError(String errorID, String message, Throwable e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        pw.flush();
        NSException exception = new NSException(e.getClass().getName(), sw.toString(), new NSDictionary<>());
        logError(errorID, message, exception);
    }
    public static void logError(Throwable e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        pw.flush();
        NSException exception = new NSException(e.getClass().getName(), sw.toString(), new NSDictionary<>());
        logError(e.getClass().getName(), sw.toString(), exception);
    }
    
    protected static NSDictionary<?, ?> stringMapToDictionary(Map<String, String> map) {
        NSDictionary<NSString, NSString> o = new NSMutableDictionary<>();
        for (Map.Entry<String, String> e : map.entrySet()) {
            o.put(e.getKey(), e.getValue());
        }
        return o;
    }
    
    public static void logAllPageViews(UINavigationController target) {
        logAllPageViews((NSObject)target);
    }
    public static void logAllPageViews(UITabBarController target) {
        logAllPageViews((NSObject)target);
    }
    public static void stopLogPageViews(UINavigationController target) {
        stopLogPageViews((NSObject)target);
    }
    public static void stopLogPageViews(UITabBarController target) {
        stopLogPageViews((NSObject)target);
    }
    /*<methods>*/
    @Method(selector = "setAppVersion:")
    public static native void setAppVersion(String version);
    @Method(selector = "getFlurryAgentVersion")
    public static native String getFlurryAgentVersion();
    @Method(selector = "setShowErrorInLogEnabled:")
    public static native void setShowErrorInLogEnabled(boolean value);
    @Method(selector = "setDebugLogEnabled:")
    public static native void setDebugLogEnabled(boolean value);
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(FlurryLogLevel value);
    @Method(selector = "setSessionContinueSeconds:")
    public static native void setSessionContinueSeconds(int seconds);
    @Method(selector = "setCrashReportingEnabled:")
    public static native void setCrashReportingEnabled(boolean value);
    @Method(selector = "startSession:")
    public static native void startSession(String apiKey);
    @Method(selector = "startSession:withOptions:")
    public static native void startSession(String apiKey, UIApplicationLaunchOptions options);
    @Method(selector = "activeSessionExists")
    public static native boolean activeSessionExists();
    @Method(selector = "getSessionID")
    public static native String getSessionID();
    @Method(selector = "setDelegate:")
    public static native void setDelegate(FlurryDelegate delegate);
    @Method(selector = "pauseBackgroundSession")
    public static native void pauseBackgroundSession();
    @Method(selector = "addSessionOrigin:withDeepLink:")
    public static native void addSessionOrigin(String sessionOriginName, String deepLink);
    @Method(selector = "addSessionOrigin:")
    public static native void addSessionOrigin(String sessionOriginName);
    @Method(selector = "sessionProperties:")
    public static native void setSessionProperties(NSDictionary<?, ?> parameters);
    @Method(selector = "addOrigin:withVersion:")
    public static native void addOrigin(String originName, String originVersion);
    @Method(selector = "addOrigin:withVersion:withParameters:")
    public static native void addOrigin(String originName, String originVersion, NSDictionary<?, ?> parameters);
    @Method(selector = "logEvent:")
    public static native FlurryEventRecordStatus logEvent(String eventName);
    @Method(selector = "logEvent:withParameters:")
    public static native FlurryEventRecordStatus logEvent(String eventName, NSDictionary<?, ?> parameters);
    @Method(selector = "logError:message:exception:")
    public static native void logError(String errorID, String message, NSException exception);
    @Method(selector = "logError:message:error:")
    public static native void logError(String errorID, String message, NSError error);
    @Method(selector = "logEvent:timed:")
    public static native FlurryEventRecordStatus logEvent(String eventName, boolean timed);
    @Method(selector = "logEvent:withParameters:timed:")
    public static native FlurryEventRecordStatus logEvent(String eventName, NSDictionary<?, ?> parameters, boolean timed);
    @Method(selector = "endTimedEvent:withParameters:")
    public static native void endTimedEvent(String eventName, NSDictionary<?, ?> parameters);
    @Method(selector = "logAllPageViewsForTarget:")
    public static native void logAllPageViews(NSObject target);
    @Method(selector = "stopLogPageViewsForTarget:")
    public static native void stopLogPageViews(NSObject target);
    @Method(selector = "logPageView")
    public static native void logPageView();
    @Method(selector = "setUserID:")
    public static native void setUserID(String userID);
    @Method(selector = "setAge:")
    public static native void setAge(int age);
    @Method(selector = "setGender:")
    public static native void setGender(String gender);
    @Method(selector = "setLatitude:longitude:horizontalAccuracy:verticalAccuracy:")
    public static native void setLocation(double latitude, double longitude, double horizontalAccuracy, double verticalAccuracy);
    @Method(selector = "setSessionReportsOnCloseEnabled:")
    public static native void setSessionReportsOnCloseEnabled(boolean sendSessionReportsOnClose);
    @Method(selector = "setSessionReportsOnPauseEnabled:")
    public static native void setSessionReportsOnPauseEnabled(boolean setSessionReportsOnPauseEnabled);
    @Method(selector = "setBackgroundSessionEnabled:")
    public static native void setBackgroundSessionEnabled(boolean setBackgroundSessionEnabled);
    @Method(selector = "setEventLoggingEnabled:")
    public static native void setEventLoggingEnabled(boolean value);
    @Method(selector = "setPulseEnabled:")
    public static native void setPulseEnabled(boolean value);
    @Method(selector = "logEvent:syndicationID:parameters:")
    public static native FlurryEventRecordStatus logEvent(FlurrySyndicationEvent syndicationEvent, String syndicationID, NSDictionary<?, ?> parameters);
    /*</methods>*/
}
