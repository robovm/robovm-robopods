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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBInterstitialAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBInterstitialAdPtr extends Ptr<FBInterstitialAd, FBInterstitialAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBInterstitialAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBInterstitialAd() {}
    protected FBInterstitialAd(Handle h, long handle) { super(h, handle); }
    protected FBInterstitialAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPlacementID:")
    public FBInterstitialAd(String placementID) { super((SkipInit) null); initObject(init(placementID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "placementID")
    public native String getPlacementID();
    @Property(selector = "delegate")
    public native FBInterstitialAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBInterstitialAdDelegate v);
    @Property(selector = "extraHint")
    public native FBAdExtraHint getExtraHint();
    @Property(selector = "setExtraHint:")
    public native void setExtraHint(FBAdExtraHint v);
    @Property(selector = "isAdValid")
    public native boolean isAdValid();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPlacementID:")
    protected native @Pointer long init(String placementID);
    @Method(selector = "loadAd")
    public native void loadAd();
    @Method(selector = "loadAdWithBidPayload:")
    public native void loadAd(String bidPayload);
    @Method(selector = "showAdFromRootViewController:")
    public native boolean showAd(UIViewController rootViewController);
    /*</methods>*/
}
