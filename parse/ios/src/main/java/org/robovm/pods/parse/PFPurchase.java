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
package org.robovm.pods.parse;

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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
@Availability({ @PlatformVersion(platform = Platform.iOS), @PlatformVersion(platform = Platform.tvOS) })
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFPurchase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFPurchasePtr extends Ptr<PFPurchase, PFPurchasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFPurchase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFPurchase() {}
    protected PFPurchase(Handle h, long handle) { super(h, handle); }
    protected PFPurchase(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addObserverForProduct:block:")
    public static native void addProductObserver(String productIdentifier, @Block PFProductObserver block);
    @Method(selector = "buyProduct:block:")
    public static native void buyProduct(String productIdentifier, @Block PFProductPurchaseCallback block);
    @Method(selector = "downloadAssetForTransaction:completion:")
    public static native void downloadAsset(SKPaymentTransaction transaction, @Block PFAssetDownloadCallback completion);
    @Method(selector = "downloadAssetForTransaction:completion:progress:")
    public static native void downloadAsset(SKPaymentTransaction transaction, @Block PFAssetDownloadCallback completion, @Block PFProgressCallback progress);
    @Method(selector = "restore")
    public static native void restore();
    @Method(selector = "assetContentPathForProduct:")
    public static native String getAssetContentPath(PFProduct product);
    /*</methods>*/
}
