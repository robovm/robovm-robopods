/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRCardConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRCardConfigurationPtr extends Ptr<TWTRCardConfiguration, TWTRCardConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRCardConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRCardConfiguration(Handle h, long handle) { super(h, handle); }
    protected TWTRCardConfiguration(SkipInit skipInit) { super(skipInit); }
    public TWTRCardConfiguration(UIImage promoImage, String iPhoneAppID, String iPadAppID, String googlePlayAppID) { super((Handle) null, create(promoImage, iPhoneAppID, iPadAppID, googlePlayAppID)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cardType")
    public native TWTRCardType getCardType();
    @Property(selector = "cardTitle")
    public native String getCardTitle();
    @Property(selector = "cardDescription")
    public native String getCardDescription();
    @Property(selector = "image")
    public native UIImage getImage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "appCardConfigurationWithPromoImage:iPhoneAppID:iPadAppID:googlePlayAppID:")
    protected static native @Pointer long create(UIImage promoImage, String iPhoneAppID, String iPadAppID, String googlePlayAppID);
    /*</methods>*/
}
