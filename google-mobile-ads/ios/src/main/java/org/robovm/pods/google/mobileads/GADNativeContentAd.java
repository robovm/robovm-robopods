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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeContentAd/*</name>*/ 
    extends /*<extends>*/GADNativeAd/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeContentAdPtr extends Ptr<GADNativeContentAd, GADNativeContentAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeContentAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADNativeContentAd() {}
    protected GADNativeContentAd(Handle h, long handle) { super(h, handle); }
    protected GADNativeContentAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "images")
    public native NSArray<GADNativeAdImage> getImages();
    @Property(selector = "logo")
    public native GADNativeAdImage getLogo();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "advertiser")
    public native String getAdvertiser();
    @Property(selector = "videoController")
    public native GADVideoController getVideoController();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "registerAdView:assetViews:")
    public native void registerAdView(UIView adView, NSDictionary<?, ?> assetViews);
    @Method(selector = "registerAdView:clickableAssetViews:nonclickableAssetViews:")
    public native void registerAdView(UIView adView, NSDictionary<?, ?> clickableAssetViews, NSDictionary<?, ?> nonclickableAssetViews);
    @Method(selector = "unregisterAdView")
    public native void unregisterAdView();
    /*</methods>*/
}
