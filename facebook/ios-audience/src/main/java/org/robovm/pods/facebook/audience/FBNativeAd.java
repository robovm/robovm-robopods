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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdPtr extends Ptr<FBNativeAd, FBNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAd() {}
    protected FBNativeAd(Handle h, long handle) { super(h, handle); }
    protected FBNativeAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementID:")
    public FBNativeAd(String placementID) { super((SkipInit) null); initObject(init(placementID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementID")
    public native String getPlacementID();
    @Property(selector = "starRating")
    public native @ByVal FBAdStarRating getStarRating();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "subtitle")
    public native String getSubtitle();
    @Property(selector = "socialContext")
    public native String getSocialContext();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "icon")
    public native FBAdImage getIcon();
    @Property(selector = "coverImage")
    public native FBAdImage getCoverImage();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "mediaCachePolicy")
    public native FBNativeAdsCachePolicy getMediaCachePolicy();
    @Property(selector = "setMediaCachePolicy:")
    public native void setMediaCachePolicy(FBNativeAdsCachePolicy v);
    @Property(selector = "delegate")
    public native FBNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBNativeAdDelegate v);
    @Property(selector = "isAdValid")
    public native boolean isAdValid();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementID:")
    protected native @Pointer long init(String placementID);
    @Method(selector = "registerViewForInteraction:withViewController:")
    public native void registerViewForInteraction(UIView view, UIViewController viewController);
    @Method(selector = "registerViewForInteraction:withViewController:withClickableViews:")
    public native void registerViewForInteraction(UIView view, UIViewController viewController, NSArray<UIView> clickableViews);
    @Method(selector = "unregisterView")
    public native void unregisterView();
    @Method(selector = "loadAd")
    public native void loadAd();
    /*</methods>*/
}
