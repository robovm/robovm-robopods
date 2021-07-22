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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediatedUnifiedNativeAdAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GADMediatedUnifiedNativeAd/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("headline")
    public String getHeadline() { return null; }
    @NotImplemented("images")
    public NSArray<GADNativeAdImage> getImages() { return null; }
    @NotImplemented("body")
    public String getBody() { return null; }
    @NotImplemented("icon")
    public GADNativeAdImage getIcon() { return null; }
    @NotImplemented("callToAction")
    public String getCallToAction() { return null; }
    @NotImplemented("starRating")
    public NSDecimalNumber getStarRating() { return null; }
    @NotImplemented("store")
    public String getStore() { return null; }
    @NotImplemented("price")
    public String getPrice() { return null; }
    @NotImplemented("advertiser")
    public String getAdvertiser() { return null; }
    @NotImplemented("extraAssets")
    public NSDictionary<NSString, ?> getExtraAssets() { return null; }
    @NotImplemented("adChoicesView")
    public UIView getAdChoicesView() { return null; }
    @NotImplemented("mediaView")
    public UIView getMediaView() { return null; }
    @NotImplemented("hasVideoContent")
    public boolean hasVideoContent() { return false; }
    @NotImplemented("mediaContentAspectRatio")
    public @MachineSizedFloat double getMediaContentAspectRatio() { return 0; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("didRenderInView:clickableAssetViews:nonclickableAssetViews:viewController:")
    public void didRenderInView(UIView view, NSDictionary<NSString, UIView> clickableAssetViews, NSDictionary<NSString, UIView> nonclickableAssetViews, UIViewController viewController) {}
    @NotImplemented("didRecordImpression")
    public void didRecordImpression() {}
    @NotImplemented("didRecordClickOnAssetWithName:view:viewController:")
    public void didRecordClickOnAsset(String assetName, UIView view, UIViewController viewController) {}
    @NotImplemented("didUntrackView:")
    public void didUntrackView(UIView view) {}
    /*</methods>*/
}
