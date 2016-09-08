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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPTableViewAdPlacer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPTableViewAdPlacerPtr extends Ptr<MPTableViewAdPlacer, MPTableViewAdPlacerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPTableViewAdPlacer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPTableViewAdPlacer() {}
    protected MPTableViewAdPlacer(Handle h, long handle) { super(h, handle); }
    protected MPTableViewAdPlacer(SkipInit skipInit) { super(skipInit); }
    public MPTableViewAdPlacer(UITableView tableView, UIViewController controller, NSArray<?> rendererConfigurations) { super((Handle) null, create(tableView, controller, rendererConfigurations)); retain(getHandle()); }
    public MPTableViewAdPlacer(UITableView tableView, UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations) { super((Handle) null, create(tableView, controller, positioning, rendererConfigurations)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MPTableViewAdPlacerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MPTableViewAdPlacerDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadAdsForAdUnitID:")
    public native void loadAds(String adUnitID);
    @Method(selector = "loadAdsForAdUnitID:targeting:")
    public native void loadAds(String adUnitID, MPNativeAdRequestTargeting targeting);
    @Method(selector = "placerWithTableView:viewController:rendererConfigurations:")
    protected static native @Pointer long create(UITableView tableView, UIViewController controller, NSArray<?> rendererConfigurations);
    @Method(selector = "placerWithTableView:viewController:adPositioning:rendererConfigurations:")
    protected static native @Pointer long create(UITableView tableView, UIViewController controller, MPAdPositioning positioning, NSArray<?> rendererConfigurations);
    /*</methods>*/
}
