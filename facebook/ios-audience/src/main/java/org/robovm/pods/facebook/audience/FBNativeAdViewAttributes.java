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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdViewAttributes/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdViewAttributesPtr extends Ptr<FBNativeAdViewAttributes, FBNativeAdViewAttributesPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdViewAttributes.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdViewAttributes() {}
    protected FBNativeAdViewAttributes(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdViewAttributes(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:")
    public FBNativeAdViewAttributes(NSDictionary<?, ?> dict) { super((SkipInit) null); initObject(init(dict)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "titleColor")
    public native UIColor getTitleColor();
    @Property(selector = "setTitleColor:")
    public native void setTitleColor(UIColor v);
    @Property(selector = "titleFont")
    public native UIFont getTitleFont();
    @Property(selector = "setTitleFont:")
    public native void setTitleFont(UIFont v);
    @Property(selector = "descriptionColor")
    public native UIColor getDescriptionColor();
    @Property(selector = "setDescriptionColor:")
    public native void setDescriptionColor(UIColor v);
    @Property(selector = "descriptionFont")
    public native UIFont getDescriptionFont();
    @Property(selector = "setDescriptionFont:")
    public native void setDescriptionFont(UIFont v);
    @Property(selector = "buttonColor")
    public native UIColor getButtonColor();
    @Property(selector = "setButtonColor:")
    public native void setButtonColor(UIColor v);
    @Property(selector = "buttonTitleColor")
    public native UIColor getButtonTitleColor();
    @Property(selector = "setButtonTitleColor:")
    public native void setButtonTitleColor(UIColor v);
    @Property(selector = "buttonTitleFont")
    public native UIFont getButtonTitleFont();
    @Property(selector = "setButtonTitleFont:")
    public native void setButtonTitleFont(UIFont v);
    @Property(selector = "buttonBorderColor")
    public native UIColor getButtonBorderColor();
    @Property(selector = "setButtonBorderColor:")
    public native void setButtonBorderColor(UIColor v);
    @Property(selector = "isAutoplayEnabled")
    public native boolean isAutoplayEnabled();
    @Property(selector = "setAutoplayEnabled:")
    public native void setAutoplayEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> dict);
    @Method(selector = "defaultAttributesForType:")
    public static native FBNativeAdViewAttributes getDefaultAttributes(FBNativeAdViewType type);
    @Method(selector = "defaultAttributesForBannerType:")
    public static native FBNativeAdViewAttributes defaultAttributesForBannerType(FBNativeBannerAdViewType type);
    /*</methods>*/
}
