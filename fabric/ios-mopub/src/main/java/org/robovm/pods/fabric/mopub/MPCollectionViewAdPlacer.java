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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPCollectionViewAdPlacer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPCollectionViewAdPlacerPtr extends Ptr<MPCollectionViewAdPlacer, MPCollectionViewAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPCollectionViewAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPCollectionViewAdPlacer() {}
    protected MPCollectionViewAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MPCollectionViewAdPlacer(SkipInit skipInit) { super(skipInit); }
    public MPCollectionViewAdPlacer(UICollectionView collectionView, UIViewController controller, NSArray<?> rendererConfigurations) { super((Handle) null, create(collectionView, controller, rendererConfigurations)); retain(getHandle()); }
    public MPCollectionViewAdPlacer(UICollectionView collectionView, UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations) { super((Handle) null, create(collectionView, controller, positioning, rendererConfigurations)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPCollectionViewAdPlacerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPCollectionViewAdPlacerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAdsForAdUnitID:")
    public native void loadAds(String adUnitID);
    @Method(selector = "loadAdsForAdUnitID:targeting:")
    public native void loadAds(String adUnitID, MPNativeAdRequestTargeting targeting);
    @Method(selector = "placerWithCollectionView:viewController:rendererConfigurations:")
    protected static native @Pointer long create(UICollectionView collectionView, UIViewController controller, NSArray<?> rendererConfigurations);
    @Method(selector = "placerWithCollectionView:viewController:adPositioning:rendererConfigurations:")
    protected static native @Pointer long create(UICollectionView collectionView, UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations);
    /*</methods>*/
}
