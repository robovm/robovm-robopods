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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/DGTAuthEventDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "digitsAuthenticationDidBegin:")
    void authenticationDidBegin(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsPhoneNumberEntryScreenVisited:")
    void phoneNumberEntryScreenVisited(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsPhoneNumberSubmitted:")
    void phoneNumberSubmitted(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsPhoneNumberSubmissionDidSucceed:")
    void phoneNumberSubmissionDidSucceed(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsConfirmationCodeEntryScreenVisited:")
    void confirmationCodeEntryScreenVisited(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsConfirmationCodeSubmitted:")
    void confirmationCodeSubmitted(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsAuthenticationDidComplete:")
    void authenticationDidComplete(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsLogout:")
    void logout(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsTwoFactorPinEntryScreenVisited:")
    void twoFactorPinEntryScreenVisited(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsTwoFactorPinSubmitted:")
    void twoFactorPinSubmitted(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsTwoFactorPinSubmissionSucceeded:")
    void twoFactorPinSubmissionSucceeded(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsEmailUpdateScreenVisited:")
    void emailUpdateScreenVisited(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsEmailUpdateSubmitted:")
    void emailUpdateSubmitted(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsEmailUpdateSubmissionSucceeded:")
    void emailUpdateSubmissionSucceeded(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsErrorRescueScreenVisited:")
    void errorRescueScreenVisited(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsUserDismissErrorRescue:")
    void userDismissErrorRescue(DGTAuthEventDetails authEventDetails);
    @Method(selector = "digitsUserRetryOnErrorRescueScreen:")
    void userRetryOnErrorRescueScreen(DGTAuthEventDetails authEventDetails);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
