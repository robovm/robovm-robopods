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
    public YMMYandexMetricaConfiguration(String apiKey) { super((SkipInit) null); initObject(init(apiKey)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apiKey")
    public native String getApiKey();
    @Property(selector = "trackLocationEnabled")
    public native boolean isTrackLocationEnabled();
    @Property(selector = "setTrackLocationEnabled:")
    public native void setTrackLocationEnabled(boolean v);
    @Property(selector = "location")
    public native CLLocation getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "sessionTimeout")
    public native @MachineSizedUInt long getSessionTimeout();
    @Property(selector = "setSessionTimeout:")
    public native void setSessionTimeout(@MachineSizedUInt long v);
    @Property(selector = "reportCrashesEnabled")
    public native boolean isReportCrashesEnabled();
    @Property(selector = "setReportCrashesEnabled:")
    public native void setReportCrashesEnabled(boolean v);
    @Property(selector = "customAppVersion")
    public native String getCustomAppVersion();
    @Property(selector = "setCustomAppVersion:")
    public native void setCustomAppVersion(String v);
    @Property(selector = "loggingEnabled")
    public native boolean isLoggingEnabled();
    @Property(selector = "setLoggingEnabled:")
    public native void setLoggingEnabled(boolean v);
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
