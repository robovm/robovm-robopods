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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdChoicesView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdChoicesViewPtr extends Ptr<FBAdChoicesView, FBAdChoicesViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdChoicesView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdChoicesView() {}
    protected FBAdChoicesView(Handle h, long handle) { super(h, handle); }
    protected FBAdChoicesView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNativeAd:")
    public FBAdChoicesView(FBNativeAdBase nativeAd) { super((SkipInit) null); initObject(init(nativeAd)); }
    @Method(selector = "initWithNativeAd:expandable:")
    public FBAdChoicesView(FBNativeAdBase nativeAd, boolean expandable) { super((SkipInit) null); initObject(init(nativeAd, expandable)); }
    @Method(selector = "initWithNativeAd:expandable:attributes:")
    public FBAdChoicesView(FBNativeAdBase nativeAd, boolean expandable, FBNativeAdViewAttributes attributes) { super((SkipInit) null); initObject(init(nativeAd, expandable, attributes)); }
    @Method(selector = "initWithFrame:")
    public FBAdChoicesView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBAdChoicesView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "label")
    public native UILabel getLabel();
    @Property(selector = "isBackgroundShown")
    public native boolean isBackgroundShown();
    @Property(selector = "setBackgroundShown:")
    public native void setBackgroundShown(boolean v);
    @Property(selector = "isExpandable")
    public native boolean isExpandable();
    @Property(selector = "nativeAd")
    public native FBNativeAdBase getNativeAd();
    @Property(selector = "setNativeAd:", strongRef = true)
    public native void setNativeAd(FBNativeAdBase v);
    @Property(selector = "corner")
    public native UIRectCorner getCorner();
    @Property(selector = "setCorner:")
    public native void setCorner(UIRectCorner v);
    @Property(selector = "insets")
    public native @ByVal UIEdgeInsets getInsets();
    @Property(selector = "setInsets:")
    public native void setInsets(@ByVal UIEdgeInsets v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "nativeAdViewTag")
    public native FBNativeAdViewTag getNativeAdViewTag();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNativeAd:")
    protected native @Pointer long init(FBNativeAdBase nativeAd);
    @Method(selector = "initWithNativeAd:expandable:")
    protected native @Pointer long init(FBNativeAdBase nativeAd, boolean expandable);
    @Method(selector = "initWithNativeAd:expandable:attributes:")
    protected native @Pointer long init(FBNativeAdBase nativeAd, boolean expandable, FBNativeAdViewAttributes attributes);
    @Method(selector = "updateFrameFromSuperview")
    public native void updateFrameFromSuperview();
    @Method(selector = "updateFrameFromSuperview:")
    public native void updateFrameFromSuperview(UIRectCorner corner);
    @Method(selector = "updateFrameFromSuperview:insets:")
    public native void updateFrameFromSuperview(UIRectCorner corner, @ByVal UIEdgeInsets insets);
    /*</methods>*/
}
