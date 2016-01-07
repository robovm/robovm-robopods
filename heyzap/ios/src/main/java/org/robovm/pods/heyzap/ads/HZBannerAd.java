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
package org.robovm.pods.heyzap.ads;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZBannerAd/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZBannerAdPtr extends Ptr<HZBannerAd, HZBannerAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZBannerAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZBannerAd() {}
    protected HZBannerAd(Handle h, long handle) { super(h, handle); }
    protected HZBannerAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native HZBannerAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(HZBannerAdDelegate v);
    @Property(selector = "options")
    public native HZBannerAdOptions getOptions();
    @Property(selector = "mediatedNetwork")
    public native String getMediatedNetwork();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dimensionsDescription")
    public native String getDimensionsDescription();
    @Method(selector = "placeBannerInView:position:options:success:failure:")
    public static native void placeBannerInView(UIView view, HZBannerPosition position, HZBannerAdOptions options, @Block VoidBlock1<HZBannerAd> success, @Block VoidBlock1<NSError> failure);
    @Method(selector = "requestBannerWithOptions:success:failure:")
    public static native void requestBanner(HZBannerAdOptions options, @Block VoidBlock1<HZBannerAd> success, @Block VoidBlock1<NSError> failure);
    /*</methods>*/
}
