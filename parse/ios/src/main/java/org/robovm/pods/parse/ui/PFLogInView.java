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
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.bolts.*;
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFLogInView/*</name>*/ 
    extends /*<extends>*/UIScrollView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFLogInViewPtr extends Ptr<PFLogInView, PFLogInViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFLogInView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFLogInView() {}
    protected PFLogInView(SkipInit skipInit) { super(skipInit); }
    public PFLogInView(PFLogInFields fields) { super((SkipInit) null); initObject(init(fields)); }
    /*</constructors>*/
    public PFLogInView(CGRect frame) {
        super(frame);
    }
    /*<properties>*/
    @Property(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @Property(selector = "setPresentingViewController:", strongRef = true)
    public native void setPresentingViewController(UIViewController v);
    @Property(selector = "logo")
    public native UIView getLogo();
    @Property(selector = "setLogo:")
    public native void setLogo(UIView v);
    @Property(selector = "emailAsUsername")
    public native boolean isEmailAsUsername();
    @Property(selector = "setEmailAsUsername:")
    public native void setEmailAsUsername(boolean v);
    @Property(selector = "fields")
    public native PFLogInFields getFields();
    @Property(selector = "usernameField")
    public native PFTextField getUsernameField();
    @Property(selector = "passwordField")
    public native PFTextField getPasswordField();
    @Property(selector = "passwordForgottenButton")
    public native UIButton getPasswordForgottenButton();
    @Property(selector = "logInButton")
    public native UIButton getLogInButton();
    @Property(selector = "facebookButton")
    public native UIButton getFacebookButton();
    @Property(selector = "twitterButton")
    public native UIButton getTwitterButton();
    @Property(selector = "signUpButton")
    public native UIButton getSignUpButton();
    @Property(selector = "dismissButton")
    public native UIButton getDismissButton();
    @Property(selector = "externalLogInLabel")
    public native UILabel getExternalLogInLabel();
    @Property(selector = "signUpLabel")
    public native UILabel getSignUpLabel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFields:")
    protected native @Pointer long init(PFLogInFields fields);
    /*</methods>*/
}
