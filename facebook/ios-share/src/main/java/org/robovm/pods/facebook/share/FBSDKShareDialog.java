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
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareDialog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingDialog/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareDialogPtr extends Ptr<FBSDKShareDialog, FBSDKShareDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareDialog() {}
    protected FBSDKShareDialog(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareDialog(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fromViewController")
    public native UIViewController getFromViewController();
    @Property(selector = "setFromViewController:", strongRef = true)
    public native void setFromViewController(UIViewController v);
    @Property(selector = "mode")
    public native FBSDKShareDialogMode getMode();
    @Property(selector = "setMode:")
    public native void setMode(FBSDKShareDialogMode v);
    @Property(selector = "canShow")
    public native boolean canShow();
    @Property(selector = "delegate")
    public native FBSDKSharingDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKSharingDelegate v);
    @Property(selector = "shareContent")
    public native FBSDKSharingContent getShareContent();
    @Property(selector = "setShareContent:")
    public native void setShareContent(FBSDKSharingContent v);
    @Property(selector = "shouldFailOnDataError")
    public native boolean shouldFailOnDataError();
    @Property(selector = "setShouldFailOnDataError:")
    public native void setShouldFailOnDataError(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "showFromViewController:withContent:delegate:")
    private static native FBSDKShareDialog show0(UIViewController viewController, FBSDKSharingContent content, FBSDKSharingDelegate delegate);
    @Method(selector = "show")
    public native boolean show();
    /*</methods>*/
}
