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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPBannerCustomEventDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPBannerCustomEventDelegate/*</implements>*/ {

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
    public UIViewController getViewControllerForPresentingModalView() { return null; }
    @NotImplemented("location")
    public CLLocation getLocation() { return null; }
    @NotImplemented("bannerCustomEvent:didLoadAd:")
    public void didLoadAd(MPBannerCustomEvent event, UIView ad) {}
    @NotImplemented("bannerCustomEvent:didFailToLoadAdWithError:")
    public void didFailToLoadAd(MPBannerCustomEvent event, NSError error) {}
    @NotImplemented("bannerCustomEventWillBeginAction:")
    public void willBeginAction(MPBannerCustomEvent event) {}
    @NotImplemented("bannerCustomEventDidFinishAction:")
    public void didFinishAction(MPBannerCustomEvent event) {}
    @NotImplemented("bannerCustomEventWillLeaveApplication:")
    public void willLeaveApplication(MPBannerCustomEvent event) {}
    @NotImplemented("trackImpression")
    public void trackImpression() {}
    @NotImplemented("trackClick")
    public void trackClick() {}
    /*</methods>*/
}
