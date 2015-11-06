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
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFAnalyticsPtr extends Ptr<PFAnalytics, PFAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFAnalytics() {}
    protected PFAnalytics(Handle h, long handle) { super(h, handle); }
    protected PFAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackAppOpenedWithLaunchOptions:")
    public static native BFTask<Void> trackAppOpened(UIApplicationLaunchOptions launchOptions);
    @Method(selector = "trackAppOpenedWithLaunchOptionsInBackground:block:")
    public static native void trackAppOpenedInBackground(UIApplicationLaunchOptions launchOptions, @Block PFSaveCallback block);
    @Method(selector = "trackAppOpenedWithRemoteNotificationPayload:")
    public static native BFTask<Void> trackAppOpened(UIRemoteNotification userInfo);
    @Method(selector = "trackAppOpenedWithRemoteNotificationPayloadInBackground:block:")
    public static native void trackAppOpenedInBackground(UIRemoteNotification userInfo, @Block PFSaveCallback block);
    @Method(selector = "trackEvent:")
    public static native BFTask<Void> trackEvent(String name);
    @Method(selector = "trackEventInBackground:block:")
    public static native void trackEventInBackground(String name, @Block PFSaveCallback block);
    @Method(selector = "trackEvent:dimensions:")
    public static native BFTask<Void> trackEvent(String name, NSDictionary<?, ?> dimensions);
    @Method(selector = "trackEventInBackground:dimensions:block:")
    public static native void trackEventInBackground(String name, NSDictionary<?, ?> dimensions, @Block PFSaveCallback block);
    /*</methods>*/
}
