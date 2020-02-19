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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRewardedAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADRewardedAdPtr extends Ptr<GADRewardedAd, GADRewardedAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRewardedAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADRewardedAd() {}
    protected GADRewardedAd(Handle h, long handle) { super(h, handle); }
    protected GADRewardedAd(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:")
    public GADRewardedAd(String adUnitID) { super((SkipInit) null); initObject(init(adUnitID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "isReady")
    public native boolean isReady();
    @Property(selector = "adNetworkClassName")
    public native String getAdNetworkClassName();
    @Property(selector = "reward")
    public native GADAdReward getReward();
    @Property(selector = "serverSideVerificationOptions")
    public native GADServerSideVerificationOptions getServerSideVerificationOptions();
    @Property(selector = "setServerSideVerificationOptions:")
    public native void setServerSideVerificationOptions(GADServerSideVerificationOptions v);
    @Property(selector = "adMetadata")
    public native NSDictionary<NSString, ?> getAdMetadata();
    @Property(selector = "adMetadataDelegate")
    public native GADRewardedAdMetadataDelegate getAdMetadataDelegate();
    @Property(selector = "setAdMetadataDelegate:", strongRef = true)
    public native void setAdMetadataDelegate(GADRewardedAdMetadataDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:")
    protected native @Pointer long init(String adUnitID);
    @Method(selector = "loadRequest:completionHandler:")
    public native void loadRequest(GADRequest request, @Block VoidBlock1<GADRequestError> completionHandler);
    @Method(selector = "presentFromRootViewController:delegate:")
    public native void presentFromRootViewController(UIViewController viewController, GADRewardedAdDelegate delegate);
    /*</methods>*/
}
