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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMMYandexMetricaConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMMYandexMetricaConfigurationPtr extends Ptr<YMMYandexMetricaConfiguration, YMMYandexMetricaConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMMYandexMetricaConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YMMYandexMetricaConfiguration(Handle h, long handle) { super(h, handle); }
    protected YMMYandexMetricaConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApiKey:")
    public YMMYandexMetricaConfiguration(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apiKey")
    public native String getApiKey();
    @Property(selector = "handleFirstActivationAsUpdate")
    public native boolean isHandleFirstActivationAsUpdate();
    @Property(selector = "setHandleFirstActivationAsUpdate:")
    public native void setHandleFirstActivationAsUpdate(boolean v);
    @Property(selector = "statisticsSending")
    public native boolean isStatisticsSending();
    @Property(selector = "setStatisticsSending:")
    public native void setStatisticsSending(boolean v);
    @Property(selector = "locationTracking")
    public native boolean isLocationTracking();
    @Property(selector = "setLocationTracking:")
    public native void setLocationTracking(boolean v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "sessionTimeout")
    public native @MachineSizedUInt long getSessionTimeout();
    @Property(selector = "setSessionTimeout:")
    public native void setSessionTimeout(@MachineSizedUInt long v);
    @Property(selector = "crashReporting")
    public native boolean isCrashReporting();
    @Property(selector = "setCrashReporting:")
    public native void setCrashReporting(boolean v);
    @Property(selector = "appVersion")
    public native String getAppVersion();
    @Property(selector = "setAppVersion:")
    public native void setAppVersion(String v);
    @Property(selector = "logs")
    public native boolean isLogs();
    @Property(selector = "setLogs:")
    public native void setLogs(boolean v);
    @Property(selector = "preloadInfo")
    public native YMMYandexMetricaPreloadInfo getPreloadInfo();
    @Property(selector = "setPreloadInfo:")
    public native void setPreloadInfo(YMMYandexMetricaPreloadInfo v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApiKey:")
    protected native @Pointer long init(String apiKey);
    /*</methods>*/
}
