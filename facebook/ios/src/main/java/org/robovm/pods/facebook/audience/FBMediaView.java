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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBMediaView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBMediaViewPtr extends Ptr<FBMediaView, FBMediaViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBMediaView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBMediaView() {}
    protected FBMediaView(Handle h, long handle) { super(h, handle); }
    protected FBMediaView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithNativeAd:")
    public FBMediaView(FBNativeAd nativeAd) { super((SkipInit) null); initObject(init(nativeAd)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBMediaViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBMediaViewDelegate v);
    @Property(selector = "nativeAd")
    public native FBNativeAd getNativeAd();
    @Property(selector = "setNativeAd:")
    public native void setNativeAd(FBNativeAd v);
    @Property(selector = "isAutoplayEnabled")
    public native boolean isAutoplayEnabled();
    @Property(selector = "setAutoplayEnabled:")
    public native void setAutoplayEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithNativeAd:")
    protected native @Pointer long init(FBNativeAd nativeAd);
    /*</methods>*/
}
