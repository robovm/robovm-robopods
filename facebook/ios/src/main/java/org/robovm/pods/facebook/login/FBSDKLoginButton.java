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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.accounts.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginButton/*</name>*/ 
    extends /*<extends>*/FBSDKButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginButtonPtr extends Ptr<FBSDKLoginButton, FBSDKLoginButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKLoginButton() {}
    protected FBSDKLoginButton(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "defaultAudience")
    public native FBSDKDefaultAudience getDefaultAudience();
    @Property(selector = "setDefaultAudience:")
    public native void setDefaultAudience(FBSDKDefaultAudience v);
    @Property(selector = "delegate")
    public native FBSDKLoginButtonDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKLoginButtonDelegate v);
    @Property(selector = "loginBehavior")
    public native FBSDKLoginBehavior getLoginBehavior();
    @Property(selector = "setLoginBehavior:")
    public native void setLoginBehavior(FBSDKLoginBehavior v);
    @Property(selector = "publishPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPublishPermissions();
    @Property(selector = "setPublishPermissions:")
    public native void setPublishPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class)List<String> v);
    @Property(selector = "readPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getReadPermissions();
    @Property(selector = "setReadPermissions:")
    public native void setReadPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class)List<String> v);
    @Property(selector = "tooltipBehavior")
    public native FBSDKLoginButtonTooltipBehavior getTooltipBehavior();
    @Property(selector = "setTooltipBehavior:")
    public native void setTooltipBehavior(FBSDKLoginButtonTooltipBehavior v);
    @Property(selector = "tooltipColorStyle")
    public native FBSDKTooltipColorStyle getTooltipColorStyle();
    @Property(selector = "setTooltipColorStyle:")
    public native void setTooltipColorStyle(FBSDKTooltipColorStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
