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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMAdNetworkConnectorAdapter/*</name>*/ 
    extends /*<extends>*/GADMediationAdRequestAdapter/*</extends>*/ 
    /*<implements>*/implements GADMAdNetworkConnector/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("viewControllerForPresentingModalView")
    public UIViewController viewControllerForPresentingModalView() { return null; }
    @NotImplemented("adVolume")
    public float adVolume() { return 0; }
    @NotImplemented("adMuted")
    public boolean adMuted() { return false; }
    @NotImplemented("adapter:didFailAd:")
    public void didFailAd(GADMAdNetworkAdapter adapter, NSError error) {}
    @NotImplemented("adapter:didReceiveAdView:")
    public void didReceiveAdView(GADMAdNetworkAdapter adapter, UIView view) {}
    @NotImplemented("adapterDidReceiveInterstitial:")
    public void adapterDidReceiveInterstitial(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapter:didReceiveMediatedNativeAd:")
    public void didReceiveMediatedNativeAd(GADMAdNetworkAdapter adapter, GADMediatedNativeAd mediatedNativeAd) {}
    @NotImplemented("adapter:didReceiveMediatedUnifiedNativeAd:")
    public void didReceiveMediatedUnifiedNativeAd(GADMAdNetworkAdapter adapter, GADMediatedUnifiedNativeAd mediatedUnifiedNativeAd) {}
    @NotImplemented("adapterDidGetAdClick:")
    public void adapterDidGetAdClick(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterWillLeaveApplication:")
    public void adapterWillLeaveApplication(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterWillPresentFullScreenModal:")
    public void adapterWillPresentFullScreenModal(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterWillDismissFullScreenModal:")
    public void adapterWillDismissFullScreenModal(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterDidDismissFullScreenModal:")
    public void adapterDidDismissFullScreenModal(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterWillPresentInterstitial:")
    public void adapterWillPresentInterstitial(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterWillDismissInterstitial:")
    public void adapterWillDismissInterstitial(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapterDidDismissInterstitial:")
    public void adapterDidDismissInterstitial(GADMAdNetworkAdapter adapter) {}
    @NotImplemented("adapter:didReceiveInterstitial:")
    public void didReceiveInterstitial(GADMAdNetworkAdapter adapter, NSObject interstitial) {}
    @NotImplemented("adapter:clickDidOccurInBanner:")
    public void clickDidOccurInBanner(GADMAdNetworkAdapter adapter, UIView view) {}
    @NotImplemented("adapter:didFailInterstitial:")
    public void didFailInterstitial(GADMAdNetworkAdapter adapter, NSError error) {}
    /*</methods>*/
}
