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
package org.robovm.pods.flurry.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAdBanner/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryAdBannerPtr extends Ptr<FlurryAdBanner, FlurryAdBannerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryAdBanner.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryAdBanner() {}
    protected FlurryAdBanner(Handle h, long handle) { super(h, handle); }
    protected FlurryAdBanner(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSpace:")
    public FlurryAdBanner(String space) { super((SkipInit) null); initObject(init(space)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "space")
    public native String getSpace();
    @Property(selector = "setSpace:")
    public native void setSpace(String v);
    @Property(selector = "targeting")
    public native FlurryAdTargeting getTargeting();
    @Property(selector = "setTargeting:")
    public native void setTargeting(FlurryAdTargeting v);
    @Property(selector = "adDelegate")
    public native FlurryAdBannerDelegate getAdDelegate();
    @Property(selector = "setAdDelegate:", strongRef = true)
    public native void setAdDelegate(FlurryAdBannerDelegate v);
    @Property(selector = "ready")
    public native boolean isReady();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSpace:")
    protected native @Pointer long init(String space);
    @Method(selector = "fetchAdForFrame:")
    public native void fetchAd(@ByVal CGRect frame);
    @Method(selector = "displayAdInView:viewControllerForPresentation:")
    public native void displayAd(UIView view, UIViewController viewController);
    @Method(selector = "fetchAndDisplayAdInView:viewControllerForPresentation:")
    public native void fetchAndDisplayAd(UIView view, UIViewController viewController);
    /*</methods>*/
}
