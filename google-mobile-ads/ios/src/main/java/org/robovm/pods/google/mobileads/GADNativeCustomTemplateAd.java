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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeCustomTemplateAd/*</name>*/ 
    extends /*<extends>*/GADNativeAd/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeCustomTemplateAdPtr extends Ptr<GADNativeCustomTemplateAd, GADNativeCustomTemplateAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeCustomTemplateAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADNativeCustomTemplateAd() {}
    protected GADNativeCustomTemplateAd(Handle h, long handle) { super(h, handle); }
    protected GADNativeCustomTemplateAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "templateID")
    public native String getTemplateID();
    @Property(selector = "availableAssetKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAvailableAssetKeys();
    @Property(selector = "videoController")
    public native GADVideoController getVideoController();
    @Property(selector = "mediaView")
    public native GADMediaView getMediaView();
    @Property(selector = "customClickHandler")
    public native @Block VoidBlock1<String> getCustomClickHandler();
    @Property(selector = "setCustomClickHandler:")
    public native void setCustomClickHandler(@Block VoidBlock1<String> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "imageForKey:")
    public native GADNativeAdImage getImage(String key);
    @Method(selector = "stringForKey:")
    public native String getString(String key);
    @Method(selector = "performClickOnAssetWithKey:")
    public native void performClickOnAssetWithKey(String assetKey);
    @Method(selector = "recordImpression")
    public native void recordImpression();
    @Method(selector = "performClickOnAssetWithKey:customClickHandler:")
    public native void performClickOnAsset(String assetKey, @Block Runnable customClickHandler);
    /*</methods>*/
}
