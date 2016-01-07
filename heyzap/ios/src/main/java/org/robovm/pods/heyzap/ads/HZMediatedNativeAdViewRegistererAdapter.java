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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZMediatedNativeAdViewRegistererAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements HZMediatedNativeAdViewRegisterer/*</implements>*/ {

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
    @NotImplemented("registerTitleView:tappable:")
    public void registerTitleView(UIView view, boolean tappable) {}
    @NotImplemented("registerBodyView:tappable:")
    public void registerBodyView(UIView view, boolean tappable) {}
    @NotImplemented("registerIconView:tappable:")
    public void registerIconView(UIView view, boolean tappable) {}
    @NotImplemented("registerCoverImageView:tappable:")
    public void registerCoverImageView(UIView view, boolean tappable) {}
    @NotImplemented("registerCallToActionView:")
    public void registerCallToActionView(UIView view) {}
    @NotImplemented("registerAdvertiserNameView:tappable:")
    public void registerAdvertiserNameView(UIView view, boolean tappable) {}
    @NotImplemented("registerOtherView:tappable:")
    public void registerOtherView(UIView view, boolean tappable) {}
    @NotImplemented("registerOtherViews:tappable:")
    public void registerOtherViews(NSArray<UIView> views, boolean tappable) {}
    /*</methods>*/
}
