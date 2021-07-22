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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADSearchRequest/*</name>*/ 
    extends /*<extends>*/GADRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADSearchRequestPtr extends Ptr<GADSearchRequest, GADSearchRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADSearchRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADSearchRequest() {}
    protected GADSearchRequest(Handle h, long handle) { super(h, handle); }
    protected GADSearchRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native String getQuery();
    @Property(selector = "setQuery:")
    public native void setQuery(String v);
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "gradientFrom")
    public native UIColor getGradientFrom();
    @Property(selector = "gradientTo")
    public native UIColor getGradientTo();
    @Property(selector = "headerColor")
    public native UIColor getHeaderColor();
    @Property(selector = "setHeaderColor:")
    public native void setHeaderColor(UIColor v);
    @Property(selector = "descriptionTextColor")
    public native UIColor getDescriptionTextColor();
    @Property(selector = "setDescriptionTextColor:")
    public native void setDescriptionTextColor(UIColor v);
    @Property(selector = "anchorTextColor")
    public native UIColor getAnchorTextColor();
    @Property(selector = "setAnchorTextColor:")
    public native void setAnchorTextColor(UIColor v);
    @Property(selector = "fontFamily")
    public native String getFontFamily();
    @Property(selector = "setFontFamily:")
    public native void setFontFamily(String v);
    @Property(selector = "headerTextSize")
    public native @MachineSizedUInt long getHeaderTextSize();
    @Property(selector = "setHeaderTextSize:")
    public native void setHeaderTextSize(@MachineSizedUInt long v);
    @Property(selector = "borderColor")
    public native UIColor getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(UIColor v);
    @Property(selector = "borderType")
    public native GADSearchBorderType getBorderType();
    @Property(selector = "setBorderType:")
    public native void setBorderType(GADSearchBorderType v);
    @Property(selector = "borderThickness")
    public native @MachineSizedUInt long getBorderThickness();
    @Property(selector = "setBorderThickness:")
    public native void setBorderThickness(@MachineSizedUInt long v);
    @Property(selector = "customChannels")
    public native String getCustomChannels();
    @Property(selector = "setCustomChannels:")
    public native void setCustomChannels(String v);
    @Property(selector = "callButtonColor")
    public native GADSearchCallButtonColor getCallButtonColor();
    @Property(selector = "setCallButtonColor:")
    public native void setCallButtonColor(GADSearchCallButtonColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setBackgroundSolid:")
    public native void setBackgroundSolid(UIColor color);
    @Method(selector = "setBackgroundGradientFrom:toColor:")
    public native void setBackgroundGradient(UIColor from, UIColor toColor);
    /*</methods>*/
}
