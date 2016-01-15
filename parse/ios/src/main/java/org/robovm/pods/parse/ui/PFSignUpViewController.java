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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFSignUpViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*/implements UITextFieldDelegate, UIScrollViewDelegate/*</implements>*/ {

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
    
    /*<ptr>*/public static class PFSignUpViewControllerPtr extends Ptr<PFSignUpViewController, PFSignUpViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFSignUpViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFSignUpViewController() {}
    protected PFSignUpViewController(Handle h, long handle) { super(h, handle); }
    protected PFSignUpViewController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fields")
    public native PFSignUpFields getFields();
    @Property(selector = "setFields:")
    public native void setFields(PFSignUpFields v);
    @Property(selector = "signUpView")
    public native PFSignUpView getSignUpView();
    @Property(selector = "delegate")
    public native PFSignUpViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(PFSignUpViewControllerDelegate v);
    @Property(selector = "minPasswordLength")
    public native @MachineSizedUInt long getMinPasswordLength();
    @Property(selector = "setMinPasswordLength:")
    public native void setMinPasswordLength(@MachineSizedUInt long v);
    @Property(selector = "emailAsUsername")
    public native boolean isEmailAsUsername();
    @Property(selector = "setEmailAsUsername:")
    public native void setEmailAsUsername(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="PFSignUpSuccessNotification", optional=true)
    public static native NSString SuccessNotification();
    @GlobalValue(symbol="PFSignUpFailureNotification", optional=true)
    public static native NSString FailureNotification();
    @GlobalValue(symbol="PFSignUpCancelNotification", optional=true)
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
    @Method(selector = "scrollViewDidScroll:")
    public native void didScroll(UIScrollView scrollView);
    /**
     * @since Available since iOS 3.2.
     */
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "3.2") })
    @Method(selector = "scrollViewDidZoom:")
    public native void didZoom(UIScrollView scrollView);
    @Method(selector = "scrollViewWillBeginDragging:")
    public native void willBeginDragging(UIScrollView scrollView);
    /**
     * @since Available since iOS 5.0.
     */
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "5.0") })
    @Method(selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void willEndDragging(UIScrollView scrollView, @ByVal CGPoint velocity, CGPoint targetContentOffset);
    @Method(selector = "scrollViewDidEndDragging:willDecelerate:")
    public native void didEndDragging(UIScrollView scrollView, boolean decelerate);
    @Method(selector = "scrollViewWillBeginDecelerating:")
    public native void willBeginDecelerating(UIScrollView scrollView);
    @Method(selector = "scrollViewDidEndDecelerating:")
    public native void didEndDecelerating(UIScrollView scrollView);
    @Method(selector = "scrollViewDidEndScrollingAnimation:")
    public native void didEndScrollingAnimation(UIScrollView scrollView);
    @Method(selector = "viewForZoomingInScrollView:")
    public native UIView getViewForZooming(UIScrollView scrollView);
    /**
     * @since Available since iOS 3.2.
     */
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "3.2") })
    @Method(selector = "scrollViewWillBeginZooming:withView:")
    public native void willBeginZooming(UIScrollView scrollView, UIView view);
    @Method(selector = "scrollViewDidEndZooming:withView:atScale:")
    public native void didEndZooming(UIScrollView scrollView, UIView view, @MachineSizedFloat double scale);
    @Method(selector = "scrollViewShouldScrollToTop:")
    public native boolean shouldScrollToTop(UIScrollView scrollView);
    @Method(selector = "scrollViewDidScrollToTop:")
    public native void didScrollToTop(UIScrollView scrollView);
    /*</methods>*/
}
