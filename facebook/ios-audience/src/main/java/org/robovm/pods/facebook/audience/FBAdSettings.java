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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdSettingsPtr extends Ptr<FBAdSettings, FBAdSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdSettings() {}
    protected FBAdSettings(Handle h, long handle) { super(h, handle); }
    protected FBAdSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isBackgroundVideoPlaybackAllowed")
    public static native boolean isBackgroundVideoPlaybackAllowed();
    @Property(selector = "setBackgroundVideoPlaybackAllowed:")
    public static native void setBackgroundVideoPlaybackAllowed(boolean v);
    @Property(selector = "testAdType")
    public static native FBAdTestAdType getTestAdType();
    @Property(selector = "setTestAdType:")
    public static native void setTestAdType(FBAdTestAdType v);
    @Property(selector = "loggingDelegate")
    public static native FBAdLoggingDelegate getLoggingDelegate();
    @Property(selector = "setLoggingDelegate:", strongRef = true)
    public static native void setLoggingDelegate(FBAdLoggingDelegate v);
    @Property(selector = "bidderToken")
    public static native String getBidderToken();
    @Property(selector = "routingToken")
    public static native String getRoutingToken();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isTestMode")
    public static native boolean isTestMode();
    @Method(selector = "testDeviceHash")
    public static native String testDeviceHash();
    @Method(selector = "addTestDevice:")
    public static native void addTestDevice(String deviceHash);
    @Method(selector = "addTestDevices:")
    public static native void addTestDevices(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> devicesHash);
    @Method(selector = "clearTestDevices")
    public static native void clearTestDevices();
    @Method(selector = "clearTestDevice:")
    public static native void clearTestDevice(String deviceHash);
    @Method(selector = "setIsChildDirected:")
    public static native void setIsChildDirected(boolean isChildDirected);
    @Method(selector = "setMediationService:")
    public static native void setMediationService(String service);
    @Method(selector = "urlPrefix")
    public static native String getUrlPrefix();
    @Method(selector = "setUrlPrefix:")
    public static native void setUrlPrefix(String urlPrefix);
    @Method(selector = "getLogLevel")
    public static native FBAdLogLevel getLogLevel();
    @Method(selector = "setLogLevel:")
    public static native void setLogLevel(FBAdLogLevel level);
    @Method(selector = "mediaViewRenderingMethod")
    public static native FBMediaViewRenderingMethod mediaViewRenderingMethod();
    @Method(selector = "setMediaViewRenderingMethod:")
    public static native void setMediaViewRenderingMethod(FBMediaViewRenderingMethod mediaViewRenderingMethod);
    /*</methods>*/
}
