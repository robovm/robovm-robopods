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
package org.robovm.pods.heyzap.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZNativeAdPtr extends Ptr<HZNativeAd, HZNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZNativeAd() {}
    protected HZNativeAd(Handle h, long handle) { super(h, handle); }
    protected HZNativeAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appName")
    public native String getAppName();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "iconImage")
    public native HZNativeAdImage getIconImage();
    @Property(selector = "landscapeCreative")
    public native HZNativeAdImage getLandscapeCreative();
    @Property(selector = "portraitCreative")
    public native HZNativeAdImage getPortraitCreative();
    @Property(selector = "rating")
    public native NSNumber getRating();
    @Property(selector = "category")
    public native String getCategory();
    @Property(selector = "appDescription")
    public native String getAppDescription();
    @Property(selector = "developerName")
    public native String getDeveloperName();
    @Property(selector = "rawResponse")
    public native NSDictionary<?, ?> getRawResponse();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reportImpression")
    public native void reportImpression();
    @Method(selector = "presentAppStoreFromViewController:storeDelegate:completion:")
    public native SKStoreProductViewController presentAppStore(UIViewController viewController, SKStoreProductViewControllerDelegate storeDelegate, @Block VoidBlock2<Boolean, NSError> completion);
    /*</methods>*/
}
