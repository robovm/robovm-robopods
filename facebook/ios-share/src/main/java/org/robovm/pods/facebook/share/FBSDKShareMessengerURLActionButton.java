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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareMessengerURLActionButton/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareMessengerActionButton/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareMessengerURLActionButtonPtr extends Ptr<FBSDKShareMessengerURLActionButton, FBSDKShareMessengerURLActionButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareMessengerURLActionButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareMessengerURLActionButton() {}
    protected FBSDKShareMessengerURLActionButton(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareMessengerURLActionButton(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareMessengerURLActionButton(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(NSURL v);
    @Property(selector = "webviewHeightRatio")
    public native FBSDKShareMessengerURLActionButtonWebviewHeightRatio getWebviewHeightRatio();
    @Property(selector = "setWebviewHeightRatio:")
    public native void setWebviewHeightRatio(FBSDKShareMessengerURLActionButtonWebviewHeightRatio v);
    @Property(selector = "isMessengerExtensionURL")
    public native boolean isMessengerExtensionURL();
    @Property(selector = "setIsMessengerExtensionURL:")
    public native void setIsMessengerExtensionURL(boolean v);
    @Property(selector = "fallbackURL")
    public native NSURL getFallbackURL();
    @Property(selector = "setFallbackURL:")
    public native void setFallbackURL(NSURL v);
    @Property(selector = "shouldHideWebviewShareButton")
    public native boolean shouldHideWebviewShareButton();
    @Property(selector = "setShouldHideWebviewShareButton:")
    public native void setShouldHideWebviewShareButton(boolean v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
