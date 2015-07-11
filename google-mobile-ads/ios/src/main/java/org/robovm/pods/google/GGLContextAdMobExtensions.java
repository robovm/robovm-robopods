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
package org.robovm.pods.google;

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
import org.robovm.pods.google.*;
import org.robovm.pods.google.mobileads.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*//*</visibility>*/ class /*<name>*/GGLContextAdMobExtensions/*</name>*/ 
    extends /*<extends>*/NSExtensions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GGLContextAdMobExtensions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    private GGLContextAdMobExtensions() {}
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitIDForBannerTest")
    public static native String getAdUnitIDForBannerTest(GGLContext thiz);
    @Property(selector = "adUnitIDForInterstitialTest")
    public static native String getAdUnitIDForInterstitialTest(GGLContext thiz);
    @Property(selector = "bannerView")
    public static native GADBannerView getBannerView(GGLContext thiz);
    @Property(selector = "setBannerView:")
    public static native void setBannerView(GGLContext thiz, GADBannerView v);
    @Property(selector = "interstitialView")
    public static native GADInterstitial getInterstitialView(GGLContext thiz);
    @Property(selector = "setInterstitialView:")
    public static native void setInterstitialView(GGLContext thiz, GADInterstitial v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
