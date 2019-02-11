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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdScrollView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdScrollViewPtr extends Ptr<FBNativeAdScrollView, FBNativeAdScrollViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdScrollView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdScrollView() {}
    protected FBNativeAdScrollView(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdScrollView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNativeAdsManager:withType:")
    public FBNativeAdScrollView(FBNativeAdsManager manager, FBNativeAdViewType type) { super((SkipInit) null); initObject(init(manager, type)); }
    @Method(selector = "initWithNativeAdsManager:withType:withAttributes:")
    public FBNativeAdScrollView(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes) { super((SkipInit) null); initObject(init(manager, type, attributes)); }
    @Method(selector = "initWithNativeAdsManager:withType:withAttributes:withMaximum:")
    public FBNativeAdScrollView(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes, @MachineSizedUInt long maximumNativeAdCount) { super((SkipInit) null); initObject(init(manager, type, attributes, maximumNativeAdCount)); }
    @Method(selector = "initWithNativeAdsManager:withViewProvider:")
    public FBNativeAdScrollView(FBNativeAdsManager manager, @Block("(,@MachineSizedUInt)") Block2<FBNativeAd, Long, UIView> childViewProvider) { super((SkipInit) null); initObject(init(manager, childViewProvider)); }
    @Method(selector = "initWithNativeAdsManager:withViewProvider:withMaximum:")
    public FBNativeAdScrollView(FBNativeAdsManager manager, @Block("(,@MachineSizedUInt)") Block2<FBNativeAd, Long, UIView> childViewProvider, @MachineSizedUInt long maximumNativeAdCount) { super((SkipInit) null); initObject(init(manager, childViewProvider, maximumNativeAdCount)); }
    @Method(selector = "initWithFrame:")
    public FBNativeAdScrollView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBNativeAdScrollView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maximumNativeAdCount")
    public native @MachineSizedUInt long getMaximumNativeAdCount();
    @Property(selector = "isAnimationEnabled")
    public native boolean isAnimationEnabled();
    @Property(selector = "setAnimationEnabled:")
    public native void setAnimationEnabled(boolean v);
    @Property(selector = "xInset")
    public native @MachineSizedFloat double getXInset();
    @Property(selector = "setXInset:")
    public native void setXInset(@MachineSizedFloat double v);
    @Property(selector = "isAdPersistenceEnabled")
    public native boolean isAdPersistenceEnabled();
    @Property(selector = "setAdPersistenceEnabled:")
    public native void setAdPersistenceEnabled(boolean v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "delegate")
    public native FBNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBNativeAdDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNativeAdsManager:withType:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type);
    @Method(selector = "initWithNativeAdsManager:withType:withAttributes:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes);
    @Method(selector = "initWithNativeAdsManager:withType:withAttributes:withMaximum:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes, @MachineSizedUInt long maximumNativeAdCount);
    @Method(selector = "initWithNativeAdsManager:withViewProvider:")
    protected native @Pointer long init(FBNativeAdsManager manager, @Block("(,@MachineSizedUInt)") Block2<FBNativeAd, Long, UIView> childViewProvider);
    @Method(selector = "initWithNativeAdsManager:withViewProvider:withMaximum:")
    protected native @Pointer long init(FBNativeAdsManager manager, @Block("(,@MachineSizedUInt)") Block2<FBNativeAd, Long, UIView> childViewProvider, @MachineSizedUInt long maximumNativeAdCount);
    /*</methods>*/
}
