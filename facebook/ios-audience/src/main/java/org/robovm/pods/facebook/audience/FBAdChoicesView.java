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
    public FBAdChoicesView(FBNativeAd nativeAd) { super((SkipInit) null); initObject(init(nativeAd)); }
    @Method(selector = "initWithNativeAd:expandable:")
    public FBAdChoicesView(FBNativeAd nativeAd, boolean expandable) { super((SkipInit) null); initObject(init(nativeAd, expandable)); }
    @Method(selector = "initWithViewController:adChoicesIcon:adChoicesLinkURL:attributes:")
    public FBAdChoicesView(UIViewController viewController, FBAdImage adChoicesIcon, NSURL adChoicesLinkURL, FBNativeAdViewAttributes attributes) { super((SkipInit) null); initObject(init(viewController, adChoicesIcon, adChoicesLinkURL, attributes)); }
    @Method(selector = "initWithViewController:adChoicesIcon:adChoicesLinkURL:attributes:expandable:")
    public FBAdChoicesView(UIViewController viewController, FBAdImage adChoicesIcon, NSURL adChoicesLinkURL, FBNativeAdViewAttributes attributes, boolean expandable) { super((SkipInit) null); initObject(init(viewController, adChoicesIcon, adChoicesLinkURL, attributes, expandable)); }
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
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNativeAd:")
    protected native @Pointer long init(FBNativeAd nativeAd);
    @Method(selector = "initWithNativeAd:expandable:")
    protected native @Pointer long init(FBNativeAd nativeAd, boolean expandable);
    @Method(selector = "initWithViewController:adChoicesIcon:adChoicesLinkURL:attributes:")
    protected native @Pointer long init(UIViewController viewController, FBAdImage adChoicesIcon, NSURL adChoicesLinkURL, FBNativeAdViewAttributes attributes);
    @Method(selector = "initWithViewController:adChoicesIcon:adChoicesLinkURL:attributes:expandable:")
    protected native @Pointer long init(UIViewController viewController, FBAdImage adChoicesIcon, NSURL adChoicesLinkURL, FBNativeAdViewAttributes attributes, boolean expandable);
    @Method(selector = "updateFrameFromSuperview")
    public native void updateFrameFromSuperview();
    @Method(selector = "updateFrameFromSuperview:")
    public native void updateFrameFromSuperview(UIRectCorner corner);
    /*</methods>*/
}
