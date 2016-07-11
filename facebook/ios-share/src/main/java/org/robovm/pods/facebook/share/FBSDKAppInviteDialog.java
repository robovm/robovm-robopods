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
package org.robovm.pods.facebook.share;

import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppInviteDialog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppInviteDialogPtr extends Ptr<FBSDKAppInviteDialog, FBSDKAppInviteDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppInviteDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppInviteDialog() {}
    protected FBSDKAppInviteDialog(long handle) { super(handle); }
    protected FBSDKAppInviteDialog(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromViewController")
    public native UIViewController getFromViewController();
    @Property(selector = "setFromViewController:", strongRef = true)
    public native void setFromViewController(UIViewController v);
    @Property(selector = "delegate")
    public native FBSDKAppInviteDialogDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKAppInviteDialogDelegate v);
    @Property(selector = "content")
    public native FBSDKAppInviteContent getContent();
    @Property(selector = "setContent:")
    public native void setContent(FBSDKAppInviteContent v);
    /*</properties>*/
    /*<members>*//*</members>*/
    private static FBSDKAppInviteDialogDelegate delegate;
    
    public static FBSDKAppInviteDialog show(UIViewController viewController, FBSDKAppInviteContent content, FBSDKAppInviteDialogDelegate delegate) {
        FBSDKAppInviteDialog.delegate = delegate;
        return show0(viewController, content, delegate);
    }
    
    /*<methods>*/
    @Method(selector = "canShow")
    public native boolean canShow();
    @Method(selector = "show")
    public native boolean show();
    public boolean validate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateWithError:")
    private native boolean validate(NSError.NSErrorPtr errorRef);
    @Method(selector = "showFromViewController:withContent:delegate:")
    private static native FBSDKAppInviteDialog show0(UIViewController viewController, FBSDKAppInviteContent content, FBSDKAppInviteDialogDelegate delegate);
    /*</methods>*/
}
