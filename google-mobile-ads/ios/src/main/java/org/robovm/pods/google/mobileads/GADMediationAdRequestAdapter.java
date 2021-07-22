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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediationAdRequestAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADMediationAdRequest/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("publisherId")
    public String publisherId() { return null; }
    @NotImplemented("credentials")
    public NSDictionary<?, ?> credentials() { return null; }
    @NotImplemented("testMode")
    public boolean testMode() { return false; }
    @NotImplemented("networkExtras")
    public GADAdNetworkExtras networkExtras() { return null; }
    @NotImplemented("childDirectedTreatment")
    public NSNumber childDirectedTreatment() { return null; }
    @NotImplemented("maxAdContentRating")
    public String maxAdContentRating() { return null; }
    @NotImplemented("underAgeOfConsent")
    public NSNumber underAgeOfConsent() { return null; }
    @NotImplemented("userHasLocation")
    public boolean userHasLocation() { return false; }
    @NotImplemented("userLatitude")
    public @MachineSizedFloat double userLatitude() { return 0; }
    @NotImplemented("userLongitude")
    public @MachineSizedFloat double userLongitude() { return 0; }
    @NotImplemented("userLocationAccuracyInMeters")
    public @MachineSizedFloat double userLocationAccuracyInMeters() { return 0; }
    @NotImplemented("userLocationDescription")
    public String userLocationDescription() { return null; }
    @NotImplemented("userKeywords")
    public NSArray<?> userKeywords() { return null; }
    @NotImplemented("userGender")
    public GADGender userGender() { return null; }
    @NotImplemented("userBirthday")
    public NSDate userBirthday() { return null; }
    /*</methods>*/
}
