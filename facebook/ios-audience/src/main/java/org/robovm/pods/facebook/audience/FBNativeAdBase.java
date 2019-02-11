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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdBase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdBasePtr extends Ptr<FBNativeAdBase, FBNativeAdBasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdBase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdBase() {}
    protected FBNativeAdBase(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdBase(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementID")
    public native String getPlacementID();
    @Property(selector = "headline")
    public native String getHeadline();
    @Property(selector = "linkDescription")
    public native String getLinkDescription();
    @Property(selector = "advertiserName")
    public native String getAdvertiserName();
    @Property(selector = "socialContext")
    public native String getSocialContext();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "rawBodyText")
    public native String getRawBodyText();
    @Property(selector = "bodyText")
    public native String getBodyText();
    @Property(selector = "sponsoredTranslation")
    public native String getSponsoredTranslation();
    @Property(selector = "adTranslation")
    public native String getAdTranslation();
    @Property(selector = "promotedTranslation")
    public native String getPromotedTranslation();
    @Property(selector = "adChoicesIcon")
    public native FBAdImage getAdChoicesIcon();
    @Property(selector = "aspectRatio")
    public native @MachineSizedFloat double getAspectRatio();
    @Property(selector = "adChoicesLinkURL")
    public native NSURL getAdChoicesLinkURL();
    @Property(selector = "adChoicesText")
    public native String getAdChoicesText();
    @Property(selector = "adFormatType")
    public native FBAdFormatType getAdFormatType();
    @Property(selector = "mediaCachePolicy")
    public native FBNativeAdsCachePolicy getMediaCachePolicy();
    @Property(selector = "isAdValid")
    public native boolean isAdValid();
    @Property(selector = "isRegistered")
    public native boolean isRegistered();
    @Property(selector = "extraHint")
    public native FBAdExtraHint getExtraHint();
    @Property(selector = "setExtraHint:")
    public native void setExtraHint(FBAdExtraHint v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "unregisterView")
    public native void unregisterView();
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadAdWithMediaCachePolicy:")
    public native void loadAd(FBNativeAdsCachePolicy mediaCachePolicy);
    @Method(selector = "loadAdWithBidPayload:")
    public native void loadAd(String bidPayload);
    @Method(selector = "loadAdWithBidPayload:mediaCachePolicy:")
    public native void loadAd(String bidPayload, FBNativeAdsCachePolicy mediaCachePolicy);
    /*</methods>*/
}
