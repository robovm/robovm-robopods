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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPInterstitialCustomEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPInterstitialCustomEventDelegate/*</implements>*/ {

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
    @NotImplemented("location")
    public CLLocation getLocation() { return null; }
    @NotImplemented("interstitialCustomEvent:didLoadAd:")
    public void didLoadAd(MPInterstitialCustomEvent customEvent, NSObject ad) {}
    @NotImplemented("interstitialCustomEvent:didFailToLoadAdWithError:")
    public void didFailToLoadAd(MPInterstitialCustomEvent customEvent, NSError error) {}
    @NotImplemented("interstitialCustomEventDidExpire:")
    public void didExpire(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillAppear:")
    public void willAppear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidAppear:")
    public void didAppear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillDisappear:")
    public void willDisappear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidDisappear:")
    public void didDisappear(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventDidReceiveTapEvent:")
    public void didReceiveTapEvent(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("interstitialCustomEventWillLeaveApplication:")
    public void willLeaveApplication(MPInterstitialCustomEvent customEvent) {}
    @NotImplemented("trackImpression")
    public void trackImpression() {}
    @NotImplemented("trackClick")
    public void trackClick() {}
    /*</methods>*/
}
