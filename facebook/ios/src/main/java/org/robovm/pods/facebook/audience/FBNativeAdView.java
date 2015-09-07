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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdViewPtr extends Ptr<FBNativeAdView, FBNativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdView() {}
    protected FBNativeAdView(SkipInit skipInit) { super(skipInit); }
    public FBNativeAdView(FBNativeAd nativeAd, FBNativeAdViewType type) { super(create(nativeAd, type)); retain(getHandle()); }
    public FBNativeAdView(FBNativeAd nativeAd, FBNativeAdViewType type, FBNativeAdViewAttributes attributes) { super(create(nativeAd, type, attributes)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "type")
    public native FBNativeAdViewType getType();
    @Property(selector = "viewController")
    public native UIViewController getViewController();
    @Property(selector = "setViewController:", strongRef = true)
    public native void setViewController(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nativeAdViewWithNativeAd:withType:")
    protected static native @Pointer long create(FBNativeAd nativeAd, FBNativeAdViewType type);
    @Method(selector = "nativeAdViewWithNativeAd:withType:withAttributes:")
    protected static native @Pointer long create(FBNativeAd nativeAd, FBNativeAdViewType type, FBNativeAdViewAttributes attributes);
    /*</methods>*/
}
