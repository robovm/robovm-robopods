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
    @Method(selector = "initWithFrame:")
    public FBMediaView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public FBMediaView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBMediaViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBMediaViewDelegate v);
    @Property(selector = "videoRenderer")
    public native FBMediaViewVideoRenderer getVideoRenderer();
    @Property(selector = "setVideoRenderer:")
    public native void setVideoRenderer(FBMediaViewVideoRenderer v);
    @Property(selector = "volume")
    public native float getVolume();
    @Property(selector = "isAutoplayEnabled")
    public native boolean isAutoplayEnabled();
    @Property(selector = "aspectRatio")
    public native @MachineSizedFloat double getAspectRatio();
    @Property(selector = "nativeAdViewTag")
    public native FBNativeAdViewTag getNativeAdViewTag();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "applyNaturalWidth")
    public native void applyNaturalWidth();
    @Method(selector = "applyNaturalHeight")
    public native void applyNaturalHeight();
    /*</methods>*/
}
