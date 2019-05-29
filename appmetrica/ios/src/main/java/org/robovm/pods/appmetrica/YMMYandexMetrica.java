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
package org.robovm.pods.appmetrica;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMMYandexMetrica/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMMYandexMetricaPtr extends Ptr<YMMYandexMetrica, YMMYandexMetricaPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMMYandexMetrica.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMMYandexMetrica() {}
    protected YMMYandexMetrica(Handle h, long handle) { super(h, handle); }
    protected YMMYandexMetrica(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "activateWithConfiguration:")
    public static native void activate(YMMYandexMetricaConfiguration configuration);
    @Method(selector = "reportEvent:onFailure:")
    public static native void reportEvent(String message, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "reportEvent:parameters:onFailure:")
    public static native void reportEvent(String message, NSDictionary<?, ?> params, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "reportError:exception:onFailure:")
    public static native void reportError(String message, NSException exception, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "reportUserProfile:onFailure:")
    public static native void reportUserProfile(YMMUserProfile userProfile, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "reportRevenue:onFailure:")
    public static native void reportRevenue(YMMRevenueInfo revenueInfo, @Block VoidBlock1<NSError> onFailure);
    @Method(selector = "setUserProfileID:")
    public static native void setUserProfileID(String userProfileID);
    @Method(selector = "setStatisticsSending:")
    public static native void setStatisticsSending(boolean enabled);
    @Method(selector = "setLocationTracking:")
    public static native void setLocationTracking(boolean enabled);
    @Method(selector = "setLocation:")
    public static native void setLocation(CLLocation location);
    @Method(selector = "libraryVersion")
    public static native String libraryVersion();
    @Method(selector = "requestAppMetricaDeviceIDWithCompletionQueue:completionBlock:")
    public static native void requestAppMetricaDeviceId(DispatchQueue queue, @Block VoidBlock2<String, NSError> block);
    @Method(selector = "handleOpenURL:")
    public static native boolean handleOpenURL(NSURL url);
    @Method(selector = "activateReporterWithConfiguration:")
    public static native void activateReporter(YMMReporterConfiguration configuration);
    @Method(selector = "reporterForApiKey:")
    public static native YMMYandexMetricaReporting reporterForApiKey(String apiKey);
    @Method(selector = "reportReferralUrl:")
    public static native void reportReferralUrl(NSURL url);
    @Method(selector = "sendEventsBuffer")
    public static native void sendEventsBuffer();
    /*</methods>*/

    /** Wraps java's throwable into NSException and reports it */
    public static void reportError(Throwable throwable) {
        final StringWriter sw = new StringWriter();
        final PrintWriter pw = new PrintWriter(sw);
        throwable.printStackTrace(pw);
        pw.flush();
        final NSException exception = new NSException(throwable.getClass().getName(), sw.toString(), new NSDictionary());
        reportError(throwable.getMessage(), exception, null);
    }
}
