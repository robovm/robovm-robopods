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
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTAuthEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements DGTAuthEventDelegate/*</implements>*/ {

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
    @NotImplemented("digitsAuthenticationDidBegin:")
    public void authenticationDidBegin(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsPhoneNumberEntryScreenVisited:")
    public void phoneNumberEntryScreenVisited(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsPhoneNumberSubmitted:")
    public void phoneNumberSubmitted(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsPhoneNumberSubmissionDidSucceed:")
    public void phoneNumberSubmissionDidSucceed(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsConfirmationCodeEntryScreenVisited:")
    public void confirmationCodeEntryScreenVisited(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsConfirmationCodeSubmitted:")
    public void confirmationCodeSubmitted(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsAuthenticationDidComplete:")
    public void authenticationDidComplete(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsLogout:")
    public void logout(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsTwoFactorPinEntryScreenVisited:")
    public void twoFactorPinEntryScreenVisited(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsTwoFactorPinSubmitted:")
    public void twoFactorPinSubmitted(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsTwoFactorPinSubmissionSucceeded:")
    public void twoFactorPinSubmissionSucceeded(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsEmailUpdateScreenVisited:")
    public void emailUpdateScreenVisited(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsEmailUpdateSubmitted:")
    public void emailUpdateSubmitted(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsEmailUpdateSubmissionSucceeded:")
    public void emailUpdateSubmissionSucceeded(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsErrorRescueScreenVisited:")
    public void errorRescueScreenVisited(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsUserDismissErrorRescue:")
    public void userDismissErrorRescue(DGTAuthEventDetails authEventDetails) {}
    @NotImplemented("digitsUserRetryOnErrorRescueScreen:")
    public void userRetryOnErrorRescueScreen(DGTAuthEventDetails authEventDetails) {}
    /*</methods>*/
}
