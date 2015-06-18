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
package org.robovm.pods.chartboost;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBNewsfeedUI/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBNewsfeedUIPtr extends Ptr<CBNewsfeedUI, CBNewsfeedUIPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBNewsfeedUI.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CBNewsfeedUI() {}
    protected CBNewsfeedUI(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getNewsfeedUISize")
    public static native @ByVal CGSize getNewsfeedUISize();
    @Method(selector = "setNewsfeedUIPortraitPosition:")
    public static native void setNewsfeedUIPortraitPosition(CBNewsfeedUIPosition position);
    @Method(selector = "setNewsfeedUILandscapePosition:")
    public static native void setNewsfeedUILandscapePosition(CBNewsfeedUIPosition position);
    @Method(selector = "setPortraitDisplayAnimation:")
    public static native void setPortraitDisplayAnimation(CBNewsfeedAnimationType animation);
    @Method(selector = "setPortraitDismissAnimation:")
    public static native void setPortraitDismissAnimation(CBNewsfeedAnimationType animation);
    @Method(selector = "setLandscapeDisplayAnimation:")
    public static native void setLandscapeDisplayAnimation(CBNewsfeedAnimationType animation);
    @Method(selector = "setLandscapeDismissAnimation:")
    public static native void setLandscapeDismissAnimation(CBNewsfeedAnimationType animation);
    @Method(selector = "setNotificationUIClickAction:")
    public static native void setNotificationUIClickAction(CBNotificationUIClickAction action);
    @Method(selector = "setNewsfeedBackgroundColor:")
    public static native void setNewsfeedBackgroundColor(UIColor color);
    @Method(selector = "setNewsfeedMessageCellBackgroundColor:")
    public static native void setNewsfeedMessageCellBackgroundColor(UIColor color);
    @Method(selector = "setNewsfeedHeaderCellBackgroundColor:")
    public static native void setNewsfeedHeaderCellBackgroundColor(UIColor color);
    @Method(selector = "setNewsfeedMessageCellTextColor:")
    public static native void setNewsfeedMessageCellTextColor(UIColor color);
    @Method(selector = "setNewsfeedHeaderCellTextColor:")
    public static native void setNewsfeedHeaderCellTextColor(UIColor color);
    @Method(selector = "setNewsfeedHeaderCellText:")
    public static native void setNewsfeedHeaderCellText(String text);
    @Method(selector = "setNotificationTextColor:")
    public static native void setNotificationTextColor(UIColor color);
    @Method(selector = "setNotificationBackgroundColor:")
    public static native void setNotificationBackgroundColor(UIColor color);
    @Method(selector = "setNotificationTextFont:")
    public static native void setNotificationTextFont(UIFont font);
    @Method(selector = "setCustomNewsfeedHeaderView:")
    public static native void setCustomNewsfeedHeaderView(UIView view);
    @Method(selector = "getNewsfeedBackgroundColor")
    public static native UIColor getNewsfeedBackgroundColor();
    @Method(selector = "getNewsfeedMessageCellBackgroundColor")
    public static native UIColor getNewsfeedMessageCellBackgroundColor();
    @Method(selector = "getNewsfeedHeaderCellBackgroundColor")
    public static native UIColor getNewsfeedHeaderCellBackgroundColor();
    @Method(selector = "getNewsfeedMessageCellTextColor")
    public static native UIColor getNewsfeedMessageCellTextColor();
    @Method(selector = "getNewsfeedHeaderCellTextColor")
    public static native UIColor getNewsfeedHeaderCellTextColor();
    @Method(selector = "getNewsfeedHeaderCellText")
    public static native String getNewsfeedHeaderCellText();
    @Method(selector = "getNotificationTextColor")
    public static native UIColor getNotificationTextColor();
    @Method(selector = "getNotificationBackgroundColor")
    public static native UIColor getNotificationBackgroundColor();
    @Method(selector = "getNotificationTextFont")
    public static native UIFont getNotificationTextFont();
    @Method(selector = "getCustomNewsfeedHeaderView")
    public static native UIView getCustomNewsfeedHeaderView();
    @Method(selector = "getOrientation")
    public static native UIInterfaceOrientation getOrientation();
    /*</methods>*/
}
