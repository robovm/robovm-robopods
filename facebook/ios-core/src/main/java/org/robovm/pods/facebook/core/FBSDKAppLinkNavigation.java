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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppLinkNavigation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppLinkNavigationPtr extends Ptr<FBSDKAppLinkNavigation, FBSDKAppLinkNavigationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppLinkNavigation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppLinkNavigation() {}
    protected FBSDKAppLinkNavigation(Handle h, long handle) { super(h, handle); }
    protected FBSDKAppLinkNavigation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extras")
    public native NSDictionary<NSString, ?> getExtras();
    @Property(selector = "appLinkData")
    public native NSDictionary<NSString, ?> getAppLinkData();
    @Property(selector = "appLink")
    public native FBSDKAppLink getAppLink();
    @Property(selector = "navigationType")
    public native FBSDKAppLinkNavigationType getNavigationType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "navigate:")
    public native FBSDKAppLinkNavigationType navigate(NSError.NSErrorPtr error);
    @Method(selector = "navigationWithAppLink:extras:appLinkData:")
    public static native FBSDKAppLinkNavigation create(FBSDKAppLink appLink, NSDictionary<NSString, ?> extras, NSDictionary<NSString, ?> appLinkData);
    @Method(selector = "callbackAppLinkDataForAppWithName:url:")
    public static native NSDictionary<?, ?> callbackAppLinkData(String appName, String url);
    @Method(selector = "resolveAppLink:handler:")
    public static native void resolve(NSURL destination, @Block VoidBlock2<FBSDKAppLink, NSError> handler);
    @Method(selector = "resolveAppLink:resolver:handler:")
    public static native void resolve(NSURL destination, FBSDKAppLinkResolving resolver, @Block VoidBlock2<FBSDKAppLink, NSError> handler);
    @Method(selector = "navigateToAppLink:error:")
    public static native FBSDKAppLinkNavigationType navigate(FBSDKAppLink link, NSError.NSErrorPtr error);
    @Method(selector = "navigationTypeForLink:")
    public static native FBSDKAppLinkNavigationType navigationTypeForLink(FBSDKAppLink link);
    @Method(selector = "navigateToURL:handler:")
    public static native void navigate(NSURL destination, @Block VoidBlock2<FBSDKAppLinkNavigationType, NSError> handler);
    @Method(selector = "navigateToURL:resolver:handler:")
    public static native void navigate(NSURL destination, FBSDKAppLinkResolving resolver, @Block VoidBlock2<FBSDKAppLinkNavigationType, NSError> handler);
    @Method(selector = "defaultResolver")
    public static native FBSDKAppLinkResolving defaultResolver();
    @Method(selector = "setDefaultResolver:")
    public static native void setDefaultResolver(FBSDKAppLinkResolving resolver);
    /*</methods>*/
}
