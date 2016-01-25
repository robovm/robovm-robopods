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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPVideoNativeAdView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements MPNativeAdRendering/*</implements>*/ {

    /*<ptr>*/public static class MPVideoNativeAdViewPtr extends Ptr<MPVideoNativeAdView, MPVideoNativeAdViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPVideoNativeAdView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPVideoNativeAdView() {}
    protected MPVideoNativeAdView(Handle h, long handle) { super(h, handle); }
    protected MPVideoNativeAdView(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "titleLabel")
    public native UILabel getTitleLabel();
    @Property(selector = "setTitleLabel:")
    public native void setTitleLabel(UILabel v);
    @Property(selector = "mainTextLabel")
    public native UILabel getMainTextLabel();
    @Property(selector = "setMainTextLabel:")
    public native void setMainTextLabel(UILabel v);
    @Property(selector = "iconImageView")
    public native UIImageView getIconImageView();
    @Property(selector = "setIconImageView:")
    public native void setIconImageView(UIImageView v);
    @Property(selector = "mainImageView")
    public native UIImageView getMainImageView();
    @Property(selector = "setMainImageView:")
    public native void setMainImageView(UIImageView v);
    @Property(selector = "videoView")
    public native UIView getVideoView();
    @Property(selector = "setVideoView:")
    public native void setVideoView(UIView v);
    @Property(selector = "privacyInformationIconImageView")
    public native UIImageView getPrivacyInformationIconImageView();
    @Property(selector = "setPrivacyInformationIconImageView:")
    public native void setPrivacyInformationIconImageView(UIImageView v);
    @Property(selector = "ctaLabel")
    public native UILabel getCtaLabel();
    @Property(selector = "setCtaLabel:")
    public native void setCtaLabel(UILabel v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "nativeMainTextLabel")
    public native UILabel getNativeMainTextLabel();
    @Method(selector = "nativeTitleTextLabel")
    public native UILabel getNativeTitleTextLabel();
    @Method(selector = "nativeIconImageView")
    public native UIImageView getNativeIconImageView();
    @Method(selector = "nativeMainImageView")
    public native UIImageView getNativeMainImageView();
    @Method(selector = "nativeVideoView")
    public native UIView getNativeVideoView();
    @Method(selector = "nativeCallToActionTextLabel")
    public native UILabel getNativeCallToActionTextLabel();
    @Method(selector = "nativePrivacyInformationIconImageView")
    public native UIImageView getNativePrivacyInformationIconImageView();
    @Method(selector = "layoutStarRating:")
    public native void layoutStarRating(NSNumber starRating);
    @Method(selector = "layoutCustomAssetsWithProperties:imageLoader:")
    public native void layoutCustomAssets(NSDictionary<?, ?> customProperties, MPNativeAdRenderingImageLoader imageLoader);
    @Method(selector = "nibForAd")
    public static native UINib getNibForAd();
    /*</methods>*/
}
