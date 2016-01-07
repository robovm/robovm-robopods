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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZMediatedNativeAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZMediatedNativeAdPtr extends Ptr<HZMediatedNativeAd, HZMediatedNativeAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZMediatedNativeAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZMediatedNativeAd() {}
    protected HZMediatedNativeAd(Handle h, long handle) { super(h, handle); }
    protected HZMediatedNativeAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "body")
    public native String getBody();
    @Property(selector = "callToAction")
    public native String getCallToAction();
    @Property(selector = "iconImage")
    public native HZNativeAdImage getIconImage();
    @Property(selector = "presentingViewController")
    public native IntPtr getPresentingViewController();
    @Property(selector = "setPresentingViewController:", strongRef = true)
    public native void setPresentingViewController(IntPtr v);
    @Property(selector = "mediatedNetwork")
    public native String getMediatedNetwork();
    @Property(selector = "adType")
    public native HZMediatedNativeAdType getAdType();
    @Property(selector = "underlyingNativeAd")
    public native NSObject getUnderlyingNativeAd();
    @Property(selector = "hasHadImpression")
    public native boolean hasHadImpression();
    @Property(selector = "hasBeenClicked")
    public native boolean hasBeenClicked();
    @Property(selector = "tag")
    public native String getTag();
    @Property(selector = "shouldShowFacebookAdChoicesView")
    public native boolean shouldShowFacebookAdChoicesView();
    @Property(selector = "setShouldShowFacebookAdChoicesView:")
    public native void setShouldShowFacebookAdChoicesView(boolean v);
    @Property(selector = "facebookAdChoicesViewCorner")
    public native int getFacebookAdChoicesViewCorner();
    @Property(selector = "setFacebookAdChoicesViewCorner:")
    public native void setFacebookAdChoicesViewCorner(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "coverImageWithPreferredOrientation:")
    public native HZNativeAdImage getCoverImage(HZPreferredImageOrientation preferredOrientation);
    @Method(selector = "registerViews:")
    public native void registerViews(@Block VoidBlock1<HZMediatedNativeAdViewRegisterer> block);
    @Method(selector = "wrapperView")
    public native UIView getWrapperView();
    /*</methods>*/
}
