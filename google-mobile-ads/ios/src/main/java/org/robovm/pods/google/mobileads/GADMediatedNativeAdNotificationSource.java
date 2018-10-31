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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMediatedNativeAdNotificationSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADMediatedNativeAdNotificationSourcePtr extends Ptr<GADMediatedNativeAdNotificationSource, GADMediatedNativeAdNotificationSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMediatedNativeAdNotificationSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMediatedNativeAdNotificationSource() {}
    protected GADMediatedNativeAdNotificationSource(Handle h, long handle) { super(h, handle); }
    protected GADMediatedNativeAdNotificationSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "mediatedNativeAdDidRecordImpression:")
    public static native void didRecordImpression(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdDidRecordClick:")
    public static native void didRecordClick(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdWillPresentScreen:")
    public static native void willPresentScreen(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdWillDismissScreen:")
    public static native void willDismissScreen(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdDidDismissScreen:")
    public static native void didDismissScreen(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdWillLeaveApplication:")
    public static native void willLeaveApplication(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdDidPlayVideo:")
    public static native void mediatedNativeAdDidPlayVideo(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdDidPauseVideo:")
    public static native void mediatedNativeAdDidPauseVideo(GADMediatedNativeAd mediatedNativeAd);
    @Method(selector = "mediatedNativeAdDidEndVideoPlayback:")
    public static native void mediatedNativeAdDidEndVideoPlayback(GADMediatedNativeAd mediatedNativeAd);
    /*</methods>*/
}
