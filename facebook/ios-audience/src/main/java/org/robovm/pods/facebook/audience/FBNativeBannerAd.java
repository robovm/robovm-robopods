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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeBannerAd/*</name>*/ 
    extends /*<extends>*/FBNativeAdBase/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeBannerAdPtr extends Ptr<FBNativeBannerAd, FBNativeBannerAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeBannerAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeBannerAd() {}
    protected FBNativeBannerAd(Handle h, long handle) { super(h, handle); }
    protected FBNativeBannerAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementID:")
    public FBNativeBannerAd(String placementID) { super((SkipInit) null); initObject(init(placementID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBNativeBannerAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBNativeBannerAdDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementID:")
    protected native @Pointer long init(String placementID);
    @Method(selector = "registerViewForInteraction:iconView:viewController:")
    public native void registerView(UIView view, FBMediaView iconView, UIViewController viewController);
    @Method(selector = "registerViewForInteraction:iconView:viewController:clickableViews:")
    public native void registerView(UIView view, FBMediaView iconView, UIViewController viewController, NSArray<UIView> clickableViews);
    @Method(selector = "downloadMedia")
    public native void downloadMedia();
    /*</methods>*/
}
