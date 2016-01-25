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
import org.robovm.apple.coredata.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRAuthConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRAuthConfigPtr extends Ptr<TWTRAuthConfig, TWTRAuthConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRAuthConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRAuthConfig(Handle h, long handle) { super(h, handle); }
    protected TWTRAuthConfig(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConsumerKey:consumerSecret:")
    public TWTRAuthConfig(String consumerKey, String consumerSecret) { super((SkipInit) null); initObject(init(consumerKey, consumerSecret)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consumerKey")
    public native String getConsumerKey();
    @Property(selector = "consumerSecret")
    public native String getConsumerSecret();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConsumerKey:consumerSecret:")
    protected native @Pointer long init(String consumerKey, String consumerSecret);
    /*</methods>*/
}
