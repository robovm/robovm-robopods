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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLikeControl/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*/implements FBSDKLiking/*</implements>*/ {

    /*<ptr>*/public static class FBSDKLikeControlPtr extends Ptr<FBSDKLikeControl, FBSDKLikeControlPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLikeControl.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKLikeControl() {}
    protected FBSDKLikeControl(Handle h, long handle) { super(h, handle); }
    protected FBSDKLikeControl(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public FBSDKLikeControl(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBSDKLikeControl(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "foregroundColor")
    public native UIColor getForegroundColor();
    @Property(selector = "setForegroundColor:")
    public native void setForegroundColor(UIColor v);
    @Property(selector = "likeControlAuxiliaryPosition")
    public native FBSDKLikeControlAuxiliaryPosition getLikeControlAuxiliaryPosition();
    @Property(selector = "setLikeControlAuxiliaryPosition:")
    public native void setLikeControlAuxiliaryPosition(FBSDKLikeControlAuxiliaryPosition v);
    @Property(selector = "likeControlHorizontalAlignment")
    public native FBSDKLikeControlHorizontalAlignment getLikeControlHorizontalAlignment();
    @Property(selector = "setLikeControlHorizontalAlignment:")
    public native void setLikeControlHorizontalAlignment(FBSDKLikeControlHorizontalAlignment v);
    @Property(selector = "likeControlStyle")
    public native FBSDKLikeControlStyle getLikeControlStyle();
    @Property(selector = "setLikeControlStyle:")
    public native void setLikeControlStyle(FBSDKLikeControlStyle v);
    @Property(selector = "preferredMaxLayoutWidth")
    public native @MachineSizedFloat double getPreferredMaxLayoutWidth();
    @Property(selector = "setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(@MachineSizedFloat double v);
    @Property(selector = "isSoundEnabled")
    public native boolean isSoundEnabled();
    @Property(selector = "setSoundEnabled:")
    public native void setSoundEnabled(boolean v);
    @Property(selector = "objectID")
    public native String getObjectID();
    @Property(selector = "setObjectID:")
    public native void setObjectID(String v);
    @Property(selector = "objectType")
    public native FBSDKLikeObjectType getObjectType();
    @Property(selector = "setObjectType:")
    public native void setObjectType(FBSDKLikeObjectType v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
