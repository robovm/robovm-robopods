/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.mopub;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPInterstitialCustomEventDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "location")
    CLLocation getLocation();
    @Method(selector = "interstitialCustomEvent:didLoadAd:")
    void didLoadAd(MPInterstitialCustomEvent customEvent, NSObject ad);
    @Method(selector = "interstitialCustomEvent:didFailToLoadAdWithError:")
    void didFailToLoadAd(MPInterstitialCustomEvent customEvent, NSError error);
    @Method(selector = "interstitialCustomEventDidExpire:")
    void didExpire(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillAppear:")
    void willAppear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidAppear:")
    void didAppear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillDisappear:")
    void willDisappear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidDisappear:")
    void didDisappear(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventDidReceiveTapEvent:")
    void didReceiveTapEvent(MPInterstitialCustomEvent customEvent);
    @Method(selector = "interstitialCustomEventWillLeaveApplication:")
    void willLeaveApplication(MPInterstitialCustomEvent customEvent);
    @Method(selector = "trackImpression")
    void trackImpression();
    @Method(selector = "trackClick")
    void trackClick();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
