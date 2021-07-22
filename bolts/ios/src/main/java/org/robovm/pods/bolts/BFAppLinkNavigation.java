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
package org.robovm.pods.bolts;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFAppLinkNavigation/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFAppLinkNavigationPtr extends Ptr<BFAppLinkNavigation, BFAppLinkNavigationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFAppLinkNavigation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFAppLinkNavigation() {}
    protected BFAppLinkNavigation(Handle h, long handle) { super(h, handle); }
    protected BFAppLinkNavigation(SkipInit skipInit) { super(skipInit); }
    public BFAppLinkNavigation(BFAppLink appLink, NSDictionary<NSString, NSObject> extras, NSDictionary<NSString, NSObject> appLinkData) { super((Handle) null, create(appLink, extras, appLinkData)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "extras")
    public native NSDictionary<NSString, NSObject> getExtras();
    @Property(selector = "appLinkData")
    public native NSDictionary<NSString, NSObject> getAppLinkData();
    @Property(selector = "appLink")
    public native BFAppLink getAppLink();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public BFAppLinkNavigationType navigate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BFAppLinkNavigationType result = navigate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "navigate:")
    private native BFAppLinkNavigationType navigate(NSError.NSErrorPtr error);
    @Method(selector = "navigationType")
    public native BFAppLinkNavigationType getNavigationType();
    @Method(selector = "navigationWithAppLink:extras:appLinkData:")
    protected static native @Pointer long create(BFAppLink appLink, NSDictionary<NSString, NSObject> extras, NSDictionary<NSString, NSObject> appLinkData);
    @Method(selector = "callbackAppLinkDataForAppWithName:url:")
    public static native NSDictionary<?, ?> getCallbackAppLinkData(String appName, String url);
    @Method(selector = "resolveAppLinkInBackground:")
    public static native BFTask resolveAppLinkInBackground(NSURL destination);
    @Method(selector = "resolveAppLinkInBackground:resolver:")
    public static native BFTask resolveAppLinkInBackground(NSURL destination, BFAppLinkResolving resolver);
    public static BFAppLinkNavigationType navigateToAppLink(BFAppLink link) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       BFAppLinkNavigationType result = navigateToAppLink(link, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "navigateToAppLink:error:")
    private static native BFAppLinkNavigationType navigateToAppLink(BFAppLink link, NSError.NSErrorPtr error);
    @Method(selector = "navigationTypeForLink:")
    public static native BFAppLinkNavigationType getNavigationTypeForLink(BFAppLink link);
    @Method(selector = "navigateToURLInBackground:")
    public static native BFTask navigateToURLInBackground(NSURL destination);
    @Method(selector = "navigateToURLInBackground:resolver:")
    public static native BFTask navigateToURLInBackground(NSURL destination, BFAppLinkResolving resolver);
    @Method(selector = "defaultResolver")
    public static native BFAppLinkResolving getDefaultResolver();
    @Method(selector = "setDefaultResolver:")
    public static native void setDefaultResolver(BFAppLinkResolving resolver);
    /*</methods>*/
}
