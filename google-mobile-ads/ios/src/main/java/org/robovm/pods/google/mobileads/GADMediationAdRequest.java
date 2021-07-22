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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADMediationAdRequest/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "publisherId")
    String publisherId();
    @Method(selector = "credentials")
    NSDictionary<?, ?> credentials();
    @Method(selector = "testMode")
    boolean testMode();
    @Method(selector = "networkExtras")
    GADAdNetworkExtras networkExtras();
    @Method(selector = "childDirectedTreatment")
    NSNumber childDirectedTreatment();
    @Method(selector = "maxAdContentRating")
    String maxAdContentRating();
    @Method(selector = "underAgeOfConsent")
    NSNumber underAgeOfConsent();
    @Method(selector = "userHasLocation")
    boolean userHasLocation();
    @Method(selector = "userLatitude")
    @MachineSizedFloat double userLatitude();
    @Method(selector = "userLongitude")
    @MachineSizedFloat double userLongitude();
    @Method(selector = "userLocationAccuracyInMeters")
    @MachineSizedFloat double userLocationAccuracyInMeters();
    @Method(selector = "userLocationDescription")
    String userLocationDescription();
    @Method(selector = "userKeywords")
    NSArray<?> userKeywords();
    @Method(selector = "userGender")
    GADGender userGender();
    @Method(selector = "userBirthday")
    NSDate userBirthday();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
