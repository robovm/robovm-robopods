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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADRequestPtr extends Ptr<GADRequest, GADRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected GADRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public GADRequest() {
        super(create());
        retain(getHandle());
    }
    /*<properties>*/
    @Property(selector = "testDevices")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getTestDevices();
    @Property(selector = "setTestDevices:")
    public native void setTestDevices(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class)List<String> v);
    @Property(selector = "gender")
    public native GADGender getGender();
    @Property(selector = "setGender:")
    public native void setGender(GADGender v);
    @Property(selector = "birthday")
    public native NSDate getBirthday();
    @Property(selector = "setBirthday:")
    public native void setBirthday(NSDate v);
    @Property(selector = "keywords")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class)List<String> v);
    @Property(selector = "contentURL")
    public native String getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(String v);
    @Property(selector = "requestAgent")
    public native String getRequestAgent();
    @Property(selector = "setRequestAgent:")
    public native void setRequestAgent(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGADSimulatorID", optional=true)
    public static native String getSimulatorID();
    
    @Method(selector = "registerAdNetworkExtras:")
    public native void registerAdNetworkExtras(GADAdNetworkExtras extras);
    @Method(selector = "adNetworkExtrasFor:")
    public native GADAdNetworkExtras getAdNetworkExtras(Class<? extends GADAdNetworkExtras> aClass);
    @Method(selector = "removeAdNetworkExtrasFor:")
    public native void removeAdNetworkExtras(Class<? extends GADAdNetworkExtras> aClass);
    @Method(selector = "setLocationWithLatitude:longitude:accuracy:")
    public native void setLocation(@MachineSizedFloat double latitude, @MachineSizedFloat double longitude, @MachineSizedFloat double accuracyInMeters);
    @Method(selector = "setLocationWithDescription:")
    public native void setLocation(String locationDescription);
    @Method(selector = "tagForChildDirectedTreatment:")
    public native void tagForChildDirectedTreatment(boolean childDirectedTreatment);
    @Method(selector = "request")
    protected static native @Pointer long create();
    @Method(selector = "sdkVersion")
    public static native String getSdkVersion();
    /*</methods>*/
}
