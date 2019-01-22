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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISSupersonicAdsConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISSupersonicAdsConfigurationPtr extends Ptr<ISSupersonicAdsConfiguration, ISSupersonicAdsConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISSupersonicAdsConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISSupersonicAdsConfiguration() {}
    protected ISSupersonicAdsConfiguration(Handle h, long handle) { super(h, handle); }
    protected ISSupersonicAdsConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "useClientSideCallbacks")
    public native NSNumber getUseClientSideCallbacks();
    @Property(selector = "setUseClientSideCallbacks:", strongRef = true)
    public native void setUseClientSideCallbacks(NSNumber v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "minimumOfferCommission")
    public native String getMinimumOfferCommission();
    @Property(selector = "setMinimumOfferCommission:")
    public native void setMinimumOfferCommission(String v);
    @Property(selector = "controllerConfig")
    public native NSDictionary<?, ?> getControllerConfig();
    @Property(selector = "setControllerConfig:")
    public native void setControllerConfig(NSDictionary<?, ?> v);
    @Property(selector = "itemName")
    public native String getItemName();
    @Property(selector = "setItemName:")
    public native void setItemName(String v);
    @Property(selector = "controllerUrl")
    public native String getControllerUrl();
    @Property(selector = "setControllerUrl:")
    public native void setControllerUrl(String v);
    @Property(selector = "itemCount")
    public native NSNumber getItemCount();
    @Property(selector = "setItemCount:")
    public native void setItemCount(NSNumber v);
    @Property(selector = "maxVideoLength")
    public native NSNumber getMaxVideoLength();
    @Property(selector = "setMaxVideoLength:")
    public native void setMaxVideoLength(NSNumber v);
    @Property(selector = "privateKey")
    public native String getPrivateKey();
    @Property(selector = "setPrivateKey:")
    public native void setPrivateKey(String v);
    @Property(selector = "debugMode")
    public native boolean isDebugMode();
    @Property(selector = "setDebugMode:")
    public native void setDebugMode(boolean v);
    @Property(selector = "debugLevel")
    public native @MachineSizedSInt long getDebugLevel();
    @Property(selector = "setDebugLevel:")
    public native void setDebugLevel(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurations")
    public static native ISSupersonicAdsConfiguration configurations();
    /*</methods>*/
}
