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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MPAdViewDelegate/*</implements>*/ {

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
    @NotImplemented("adViewDidLoadAd:")
    public void didLoadAd(MPAdView view) {}
    @NotImplemented("adViewDidFailToLoadAd:")
    public void didFailToLoadAd(MPAdView view) {}
    @NotImplemented("willPresentModalViewForAd:")
    public void willPresentModalView(MPAdView view) {}
    @NotImplemented("didDismissModalViewForAd:")
    public void didDismissModalView(MPAdView view) {}
    @NotImplemented("willLeaveApplicationFromAd:")
    public void willLeaveApplication(MPAdView view) {}
    /*</methods>*/
}
