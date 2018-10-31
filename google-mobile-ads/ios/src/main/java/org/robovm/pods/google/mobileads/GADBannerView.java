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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADBannerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADBannerViewPtr extends Ptr<GADBannerView, GADBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADBannerView() {}
    protected GADBannerView(Handle h, long handle) { super(h, handle); }
    protected GADBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdSize:origin:")
    public GADBannerView(@ByVal GADAdSize adSize, @ByVal CGPoint origin) { super((SkipInit) null); initObject(init(adSize, origin)); }
    @Method(selector = "initWithAdSize:")
    public GADBannerView(@ByVal GADAdSize adSize) { super((SkipInit) null); initObject(init(adSize)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "setAdUnitID:")
    public native void setAdUnitID(String v);
    @Property(selector = "rootViewController")
    public native UIViewController getRootViewController();
    @Property(selector = "setRootViewController:", strongRef = true)
    public native void setRootViewController(UIViewController v);
    @Property(selector = "adSize")
    public native @ByVal GADAdSize getAdSize();
    @Property(selector = "setAdSize:")
    public native void setAdSize(@ByVal GADAdSize v);
    @Property(selector = "delegate")
    public native GADBannerViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GADBannerViewDelegate v);
    @Property(selector = "adSizeDelegate")
    public native GADAdSizeDelegate getAdSizeDelegate();
    @Property(selector = "setAdSizeDelegate:", strongRef = true)
    public native void setAdSizeDelegate(GADAdSizeDelegate v);
    @Property(selector = "isAutoloadEnabled")
    public native boolean isAutoloadEnabled();
    @Property(selector = "setAutoloadEnabled:")
    public native void setAutoloadEnabled(boolean v);
    @Property(selector = "adNetworkClassName")
    public native String getAdNetworkClassName();
    @Property(selector = "inAppPurchaseDelegate")
    public native GADInAppPurchaseDelegate getInAppPurchaseDelegate();
    @Property(selector = "setInAppPurchaseDelegate:", strongRef = true)
    public native void setInAppPurchaseDelegate(GADInAppPurchaseDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdSize:origin:")
    protected native @Pointer long init(@ByVal GADAdSize adSize, @ByVal CGPoint origin);
    @Method(selector = "initWithAdSize:")
    protected native @Pointer long init(@ByVal GADAdSize adSize);
    @Method(selector = "loadRequest:")
    public native void loadRequest(GADRequest request);
    /*</methods>*/
}
