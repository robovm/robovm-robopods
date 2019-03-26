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
package org.robovm.pods.google.adconsent;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PACConsentInformation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PACConsentInformationPtr extends Ptr<PACConsentInformation, PACConsentInformationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PACConsentInformation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PACConsentInformation() {}
    protected PACConsentInformation(Handle h, long handle) { super(h, handle); }
    protected PACConsentInformation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedInstance")
    public static native PACConsentInformation getSharedInstance();
    @Property(selector = "consentStatus")
    public native PACConsentStatus getConsentStatus();
    @Property(selector = "setConsentStatus:")
    public native void setConsentStatus(PACConsentStatus v);
    @Property(selector = "isTaggedForUnderAgeOfConsent")
    public native boolean isTagForUnderAgeOfConsent();
    @Property(selector = "setTagForUnderAgeOfConsent:")
    public native void setTagForUnderAgeOfConsent(boolean v);
    @Property(selector = "isRequestLocationInEEAOrUnknown")
    public native boolean isRequestLocationInEEAOrUnknown();
    @Property(selector = "adProviders")
    public native NSArray<PACAdProvider> getAdProviders();
    @Property(selector = "debugIdentifiers")
    public native NSArray<NSString> getDebugIdentifiers();
    @Property(selector = "setDebugIdentifiers:")
    public native void setDebugIdentifiers(NSArray<NSString> v);
    @Property(selector = "debugGeography")
    public native PACDebugGeography getDebugGeography();
    @Property(selector = "setDebugGeography:")
    public native void setDebugGeography(PACDebugGeography v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "requestConsentInfoUpdateForPublisherIdentifiers:completionHandler:")
    public native void requestConsentInfoUpdateForPublisherIdentifiers(NSArray<NSString> publisherIdentifiers, @Block VoidBlock1<NSError> handler);
    /*</methods>*/
}
