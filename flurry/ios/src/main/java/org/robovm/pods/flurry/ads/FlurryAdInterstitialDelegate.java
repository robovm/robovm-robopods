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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FlurryAdInterstitialDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "adInterstitialDidFetchAd:")
    void didFetchAd(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialDidRender:")
    void didRender(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialWillPresent:")
    void willPresent(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialWillLeaveApplication:")
    void willLeaveApplication(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialWillDismiss:")
    void willDismiss(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialDidDismiss:")
    void didDismiss(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialDidReceiveClick:")
    void didReceiveClick(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitialVideoDidFinish:")
    void videoDidFinish(FlurryAdInterstitial interstitialAd);
    @Method(selector = "adInterstitial:adError:errorDescription:")
    void didFail(FlurryAdInterstitial interstitialAd, FlurryAdError adError, NSError errorDescription);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
