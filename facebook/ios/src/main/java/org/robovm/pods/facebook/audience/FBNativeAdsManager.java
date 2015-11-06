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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdsManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdsManagerPtr extends Ptr<FBNativeAdsManager, FBNativeAdsManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdsManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdsManager() {}
    protected FBNativeAdsManager(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdsManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementID:forNumAdsRequested:")
    public FBNativeAdsManager(String placementID, @MachineSizedUInt long numAdsRequested) { super((SkipInit) null); initObject(init(placementID, numAdsRequested)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBNativeAdsManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBNativeAdsManagerDelegate v);
    @Property(selector = "mediaCachePolicy")
    public native FBNativeAdsCachePolicy getMediaCachePolicy();
    @Property(selector = "setMediaCachePolicy:")
    public native void setMediaCachePolicy(FBNativeAdsCachePolicy v);
    @Property(selector = "uniqueNativeAdCount")
    public native @MachineSizedUInt long getUniqueNativeAdCount();
    @Property(selector = "isValid")
    public native boolean isValid();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementID:forNumAdsRequested:")
    protected native @Pointer long init(String placementID, @MachineSizedUInt long numAdsRequested);
    @Method(selector = "loadAds")
    public native void loadAds();
    @Method(selector = "disableAutoRefresh")
    public native void disableAutoRefresh();
    @Method(selector = "nextNativeAd")
    public native FBNativeAd getNextNativeAd();
    /*</methods>*/
}
