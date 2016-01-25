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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPNativeAdAdapter/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "properties")
    NSDictionary<?, ?> getProperties();
    @Property(selector = "defaultActionURL")
    NSURL getDefaultActionURL();
    @Property(selector = "delegate")
    MPNativeAdAdapterDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    void setDelegate(MPNativeAdAdapterDelegate v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "displayContentForURL:rootViewController:")
    void displayContent(NSURL URL, UIViewController controller);
    @Method(selector = "enableThirdPartyClickTracking")
    boolean enableThirdPartyClickTracking();
    @Method(selector = "trackClick")
    void trackClick();
    @Method(selector = "willAttachToView:")
    void willAttachToView(UIView view);
    @Method(selector = "displayContentForDAAIconTap")
    void displayContentForDAAIconTap();
    @Method(selector = "privacyInformationIconView")
    UIView getPrivacyInformationIconView();
    @Method(selector = "mainMediaView")
    UIView getMainMediaView();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
