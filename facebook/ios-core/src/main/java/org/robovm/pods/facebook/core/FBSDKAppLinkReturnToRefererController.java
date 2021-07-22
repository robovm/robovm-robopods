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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppLinkReturnToRefererController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKAppLinkReturnToRefererViewDelegate/*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppLinkReturnToRefererControllerPtr extends Ptr<FBSDKAppLinkReturnToRefererController, FBSDKAppLinkReturnToRefererControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppLinkReturnToRefererController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppLinkReturnToRefererController() {}
    protected FBSDKAppLinkReturnToRefererController(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppLinkReturnToRefererController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initForDisplayAboveNavController:")
    public FBSDKAppLinkReturnToRefererController(UINavigationController navController) { super((SkipInit) null); initObject(initForDisplayAboveNavController(navController)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBSDKAppLinkReturnToRefererControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKAppLinkReturnToRefererControllerDelegate v);
    @Property(selector = "view")
    public native FBSDKAppLinkReturnToRefererView getView();
    @Property(selector = "setView:")
    public native void setView(FBSDKAppLinkReturnToRefererView v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initForDisplayAboveNavController:")
    protected native @Pointer long initForDisplayAboveNavController(UINavigationController navController);
    @Method(selector = "removeFromNavController")
    public native void removeFromNavController();
    @Method(selector = "showViewForRefererAppLink:")
    public native void showViewForRefererAppLink(FBSDKAppLink refererAppLink);
    @Method(selector = "showViewForRefererURL:")
    public native void showViewForRefererURL(NSURL url);
    @Method(selector = "closeViewAnimated:")
    public native void closeViewAnimated(boolean animated);
    @Method(selector = "returnToRefererViewDidTapInsideCloseButton:")
    public native void returnToRefererViewDidTapInsideCloseButton(FBSDKAppLinkReturnToRefererView view);
    @Method(selector = "returnToRefererViewDidTapInsideLink:link:")
    public native void returnToRefererViewDidTapInsideLink(FBSDKAppLinkReturnToRefererView view, FBSDKAppLink link);
    /*</methods>*/
}
