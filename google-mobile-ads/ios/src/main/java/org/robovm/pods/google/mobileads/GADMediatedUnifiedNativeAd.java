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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GADMediatedUnifiedNativeAd/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "headline")
    String getHeadline();
    @Property(selector = "images")
    NSArray<GADNativeAdImage> getImages();
    @Property(selector = "body")
    String getBody();
    @Property(selector = "icon")
    GADNativeAdImage getIcon();
    @Property(selector = "callToAction")
    String getCallToAction();
    @Property(selector = "starRating")
    NSDecimalNumber getStarRating();
    @Property(selector = "store")
    String getStore();
    @Property(selector = "price")
    String getPrice();
    @Property(selector = "advertiser")
    String getAdvertiser();
    @Property(selector = "extraAssets")
    NSDictionary<NSString, ?> getExtraAssets();
    @Property(selector = "adChoicesView")
    UIView getAdChoicesView();
    @Property(selector = "mediaView")
    UIView getMediaView();
    @Property(selector = "hasVideoContent")
    boolean hasVideoContent();
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didRenderInView:clickableAssetViews:nonclickableAssetViews:viewController:")
    void didRenderInView(UIView view, NSDictionary<?, ?> clickableAssetViews, NSDictionary<?, ?> nonclickableAssetViews, UIViewController viewController);
    @Method(selector = "didRecordImpression")
    void didRecordImpression();
    @Method(selector = "didRecordClickOnAssetWithName:view:viewController:")
    void didRecordClickOnAsset(String assetName, UIView view, UIViewController viewController);
    @Method(selector = "didUntrackView:")
    void didUntrackView(UIView view);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
