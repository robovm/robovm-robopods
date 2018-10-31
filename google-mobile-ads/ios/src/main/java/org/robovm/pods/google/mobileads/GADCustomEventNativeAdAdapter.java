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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADCustomEventNativeAdAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADCustomEventNativeAd/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("delegate")
    public GADCustomEventNativeAdDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(GADCustomEventNativeAdDelegate v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("requestNativeAdWithParameter:request:adTypes:options:rootViewController:")
    public void requestNativeAd(String serverParameter, GADCustomEventRequest request, @org.robovm.rt.bro.annotation.Marshaler(GADAdLoaderAdType.AsListMarshaler.class) List<GADAdLoaderAdType> adTypes, NSArray<?> options, UIViewController rootViewController) {}
    @NotImplemented("handlesUserClicks")
    public boolean handlesUserClicks() { return false; }
    @NotImplemented("handlesUserImpressions")
    public boolean handlesUserImpressions() { return false; }
    /*</methods>*/
}
