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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFLogInViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITextFieldDelegate/*</implements>*/ {

    public static class Notifications {
        public static NSObject observeSuccess(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(SuccessNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeFailure(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(FailureNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
        public static NSObject observeCancel(final Runnable block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(CancelNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.run();
                }
            });
        }
    }
    
    /*<ptr>*/public static class PFLogInViewControllerPtr extends Ptr<PFLogInViewController, PFLogInViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFLogInViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFLogInViewController() {}
    protected PFLogInViewController(Handle h, long handle) { super(h, handle); }
    protected PFLogInViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fields")
    public native PFLogInFields getFields();
    @Property(selector = "setFields:")
    public native void setFields(PFLogInFields v);
    @Property(selector = "logInView")
    public native PFLogInView getLogInView();
    @Property(selector = "delegate")
    public native PFLogInViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PFLogInViewControllerDelegate v);
    @Property(selector = "facebookPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getFacebookPermissions();
    @Property(selector = "setFacebookPermissions:")
    public native void setFacebookPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "signUpController")
    public native PFSignUpViewController getSignUpController();
    @Property(selector = "setSignUpController:")
    public native void setSignUpController(PFSignUpViewController v);
    @Property(selector = "emailAsUsername")
    public native boolean isEmailAsUsername();
    @Property(selector = "setEmailAsUsername:")
    public native void setEmailAsUsername(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="PFLogInSuccessNotification", optional=true)
    public static native NSString SuccessNotification();
    @GlobalValue(symbol="PFLogInFailureNotification", optional=true)
    public static native NSString FailureNotification();
    @GlobalValue(symbol="PFLogInCancelNotification", optional=true)
    public static native NSString CancelNotification();
    
    @Method(selector = "textFieldShouldBeginEditing:")
    public native boolean shouldBeginEditing(UITextField textField);
    @Method(selector = "textFieldDidBeginEditing:")
    public native void didBeginEditing(UITextField textField);
    @Method(selector = "textFieldShouldEndEditing:")
    public native boolean shouldEndEditing(UITextField textField);
    @Method(selector = "textFieldDidEndEditing:")
    public native void didEndEditing(UITextField textField);
    @Method(selector = "textField:shouldChangeCharactersInRange:replacementString:")
    public native boolean shouldChangeCharacters(UITextField textField, @ByVal NSRange range, String string);
    @Method(selector = "textFieldShouldClear:")
    public native boolean shouldClear(UITextField textField);
    @Method(selector = "textFieldShouldReturn:")
    public native boolean shouldReturn(UITextField textField);
    /*</methods>*/
}
