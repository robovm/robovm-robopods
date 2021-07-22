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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PACConsentForm/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PACConsentFormPtr extends Ptr<PACConsentForm, PACConsentFormPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PACConsentForm.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PACConsentForm() {}
    protected PACConsentForm(Handle h, long handle) { super(h, handle); }
    protected PACConsentForm(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithApplicationPrivacyPolicyURL:")
    public PACConsentForm(NSURL privacyPolicyURL) { super((SkipInit) null); initObject(initWithApplicationPrivacyPolicyURL(privacyPolicyURL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shouldOfferPersonalizedAds")
    public native boolean shouldOfferPersonalizedAds();
    @Property(selector = "setShouldOfferPersonalizedAds:")
    public native void setShouldOfferPersonalizedAds(boolean v);
    @Property(selector = "shouldOfferNonPersonalizedAds")
    public native boolean shouldOfferNonPersonalizedAds();
    @Property(selector = "setShouldOfferNonPersonalizedAds:")
    public native void setShouldOfferNonPersonalizedAds(boolean v);
    @Property(selector = "shouldOfferAdFree")
    public native boolean shouldOfferAdFree();
    @Property(selector = "setShouldOfferAdFree:")
    public native void setShouldOfferAdFree(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithApplicationPrivacyPolicyURL:")
    protected native @Pointer long initWithApplicationPrivacyPolicyURL(NSURL privacyPolicyURL);
    @Method(selector = "loadWithCompletionHandler:")
    public native void loadWithCompletionHandler(@Block VoidBlock1<NSError> loadCompletion);
    @Method(selector = "presentFromViewController:dismissCompletion:")
    public native void presentFromViewController(UIViewController viewController, @Block VoidBlock2<NSError, Boolean> completionHandler);
    /*</methods>*/
}
