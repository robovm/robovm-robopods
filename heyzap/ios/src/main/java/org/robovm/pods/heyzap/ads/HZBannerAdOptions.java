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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZBannerAdOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZBannerAdOptionsPtr extends Ptr<HZBannerAdOptions, HZBannerAdOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZBannerAdOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZBannerAdOptions() {}
    protected HZBannerAdOptions(Handle h, long handle) { super(h, handle); }
    protected HZBannerAdOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "facebookBannerSize")
    public native HZFacebookBannerSize getFacebookBannerSize();
    @Property(selector = "setFacebookBannerSize:")
    public native void setFacebookBannerSize(HZFacebookBannerSize v);
    @Property(selector = "admobBannerSize")
    public native HZAdMobBannerSize getAdmobBannerSize();
    @Property(selector = "setAdmobBannerSize:")
    public native void setAdmobBannerSize(HZAdMobBannerSize v);
    @Property(selector = "inMobiBannerSize")
    public native @ByVal CGSize getInMobiBannerSize();
    @Property(selector = "setInMobiBannerSize:")
    public native void setInMobiBannerSize(@ByVal CGSize v);
    @Property(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @Property(selector = "setPresentingViewController:", strongRef = true)
    public native void setPresentingViewController(UIViewController v);
    @Property(selector = "tag")
    public native String getTag();
    @Property(selector = "setTag:")
    public native void setTag(String v);
    @Property(selector = "fetchTimeout")
    public native double getFetchTimeout();
    @Property(selector = "setFetchTimeout:")
    public native void setFetchTimeout(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
