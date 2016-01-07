/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.heyzap.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/HZMediatedNativeAdViewRegisterer/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "registerTitleView:tappable:")
    void registerTitleView(UIView view, boolean tappable);
    @Method(selector = "registerBodyView:tappable:")
    void registerBodyView(UIView view, boolean tappable);
    @Method(selector = "registerIconView:tappable:")
    void registerIconView(UIView view, boolean tappable);
    @Method(selector = "registerCoverImageView:tappable:")
    void registerCoverImageView(UIView view, boolean tappable);
    @Method(selector = "registerCallToActionView:")
    void registerCallToActionView(UIView view);
    @Method(selector = "registerAdvertiserNameView:tappable:")
    void registerAdvertiserNameView(UIView view, boolean tappable);
    @Method(selector = "registerOtherView:tappable:")
    void registerOtherView(UIView view, boolean tappable);
    @Method(selector = "registerOtherViews:tappable:")
    void registerOtherViews(NSArray<UIView> views, boolean tappable);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
