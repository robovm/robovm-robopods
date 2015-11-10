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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAdNative/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryAdNativePtr extends Ptr<FlurryAdNative, FlurryAdNativePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryAdNative.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryAdNative() {}
    protected FlurryAdNative(Handle h, long handle) { super(h, handle); }
    protected FlurryAdNative(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSpace:")
    public FlurryAdNative(String space) { super((SkipInit) null); initObject(init(space)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "space")
    public native String getSpace();
    @Property(selector = "adDelegate")
    public native FlurryAdNativeDelegate getAdDelegate();
    @Property(selector = "setAdDelegate:", strongRef = true)
    public native void setAdDelegate(FlurryAdNativeDelegate v);
    @Property(selector = "ready")
    public native boolean isReady();
    @Property(selector = "expired")
    public native boolean isExpired();
    @Property(selector = "displayState")
    public native FlurryAdNativeDisplayState getDisplayState();
    @Property(selector = "setDisplayState:")
    public native void setDisplayState(FlurryAdNativeDisplayState v);
    @Property(selector = "assetList")
    public native NSArray<FlurryAdNativeAsset> getAssetList();
    @Property(selector = "trackingView")
    public native UIView getTrackingView();
    @Property(selector = "setTrackingView:")
    public native void setTrackingView(UIView v);
    @Property(selector = "viewControllerForPresentation")
    public native UIViewController getViewControllerForPresentation();
    @Property(selector = "setViewControllerForPresentation:")
    public native void setViewControllerForPresentation(UIViewController v);
    @Property(selector = "videoViewContainer")
    public native UIView getVideoViewContainer();
    @Property(selector = "setVideoViewContainer:")
    public native void setVideoViewContainer(UIView v);
    @Property(selector = "targeting")
    public native FlurryAdTargeting getTargeting();
    @Property(selector = "setTargeting:")
    public native void setTargeting(FlurryAdTargeting v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSpace:")
    protected native @Pointer long init(String space);
    @Method(selector = "fetchAd")
    public native void fetchAd();
    @Method(selector = "assetListForType:")
    public native NSArray<FlurryAdNativeAsset> getAssetListForType(FlurryAdNativeAssetType type);
    @Method(selector = "removeTrackingView")
    public native void removeTrackingView();
    @Method(selector = "isVideoAd")
    public native boolean isVideoAd();
    @Method(selector = "setPencilViewToTrack:withExpandButton:andCTAButton:")
    public native void setPencilViewToTrack(UIView pencilView, UIButton expandButton, UIButton ctaButton);
    @Method(selector = "setExpandedViewToTrack:withExpandButton:andCTAButton:")
    public native void setExpandedViewToTrack(UIView expandedView, UIButton expandButton, UIButton ctaButton);
    /*</methods>*/
}
