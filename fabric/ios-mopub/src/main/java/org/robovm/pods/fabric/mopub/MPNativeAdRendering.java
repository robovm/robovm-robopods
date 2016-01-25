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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MPNativeAdRendering/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "nativeMainTextLabel")
    UILabel getNativeMainTextLabel();
    @Method(selector = "nativeTitleTextLabel")
    UILabel getNativeTitleTextLabel();
    @Method(selector = "nativeIconImageView")
    UIImageView getNativeIconImageView();
    @Method(selector = "nativeMainImageView")
    UIImageView getNativeMainImageView();
    @Method(selector = "nativeVideoView")
    UIView getNativeVideoView();
    @Method(selector = "nativeCallToActionTextLabel")
    UILabel getNativeCallToActionTextLabel();
    @Method(selector = "nativePrivacyInformationIconImageView")
    UIImageView getNativePrivacyInformationIconImageView();
    @Method(selector = "layoutStarRating:")
    void layoutStarRating(NSNumber starRating);
    @Method(selector = "layoutCustomAssetsWithProperties:imageLoader:")
    void layoutCustomAssets(NSDictionary<?, ?> customProperties, MPNativeAdRenderingImageLoader imageLoader);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
