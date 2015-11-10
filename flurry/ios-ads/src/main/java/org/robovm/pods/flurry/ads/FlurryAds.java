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
package org.robovm.pods.flurry.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryAdsPtr extends Ptr<FlurryAds, FlurryAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryAds() {}
    protected FlurryAds(Handle h, long handle) { super(h, handle); }
    protected FlurryAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "fetchAdForSpace:frame:size:")
    public static native void fetchAd(String space, @ByVal CGRect frame, FlurryAdSize size);
    @Method(selector = "adReadyForSpace:")
    public static native boolean isAdReady(String space);
    @Method(selector = "displayAdForSpace:onView:viewControllerForPresentation:")
    public static native void displayAd(String space, UIView view, UIViewController viewControllerForPresentation);
    @Method(selector = "fetchAndDisplayAdForSpace:view:viewController:size:")
    public static native void fetchAndDisplayAd(String space, UIView viewContainer, UIViewController viewControllerForPresentation, FlurryAdSize size);
    @Method(selector = "removeAdFromSpace:")
    public static native void removeAd(String space);
    @Method(selector = "initialize:")
    public static native void initialize(UIViewController rvc);
    @Method(selector = "setAdDelegate:")
    public static native void setAdDelegate(NSObject delegate);
    @Method(selector = "enableTestAds:")
    public static native void enableTestAds(boolean enable);
    @Method(selector = "setUserCookies:")
    public static native void setUserCookies(NSDictionary<?, ?> userCookies);
    @Method(selector = "clearUserCookies")
    public static native void clearUserCookies();
    @Method(selector = "setKeywordsForTargeting:")
    public static native void setKeywordsForTargeting(NSDictionary<?, ?> keywords);
    @Method(selector = "clearKeywords")
    public static native void clearKeywords();
    /*</methods>*/
}
