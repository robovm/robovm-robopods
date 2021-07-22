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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediationAdConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADMediationAdConfigurationPtr extends Ptr<GADMediationAdConfiguration, GADMediationAdConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMediationAdConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMediationAdConfiguration() {}
    protected GADMediationAdConfiguration(Handle h, long handle) { super(h, handle); }
    protected GADMediationAdConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "bidResponse")
    public native String getBidResponse();
    @Property(selector = "topViewController")
    public native UIViewController getTopViewController();
    @Property(selector = "credentials")
    public native GADMediationCredentials getCredentials();
    @Property(selector = "watermark")
    public native NSData getWatermark();
    @Property(selector = "extras")
    public native GADAdNetworkExtras getExtras();
    @Property(selector = "childDirectedTreatment")
    public native NSNumber getChildDirectedTreatment();
    @Property(selector = "isTestRequest")
    public native boolean isTestRequest();
    @Property(selector = "hasUserLocation")
    public native boolean hasUserLocation();
    @Property(selector = "userLatitude")
    public native @MachineSizedFloat double getUserLatitude();
    @Property(selector = "userLongitude")
    public native @MachineSizedFloat double getUserLongitude();
    @Property(selector = "userLocationAccuracyInMeters")
    public native @MachineSizedFloat double getUserLocationAccuracyInMeters();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
