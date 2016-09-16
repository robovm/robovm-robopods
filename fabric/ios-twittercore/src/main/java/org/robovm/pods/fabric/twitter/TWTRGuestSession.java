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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRGuestSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRBaseSession/*</implements>*/ {

    /*<ptr>*/public static class TWTRGuestSessionPtr extends Ptr<TWTRGuestSession, TWTRGuestSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRGuestSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRGuestSession(Handle h, long handle) { super(h, handle); }
    protected TWTRGuestSession(SkipInit skipInit) { super(skipInit); }
    public TWTRGuestSession(NSDictionary<?, ?> sessionDictionary) { super((SkipInit) null); initObject(init(sessionDictionary)); }
    public TWTRGuestSession(String accessToken, String guestToken) { super((SkipInit) null); initObject(init(accessToken, guestToken)); }
    public TWTRGuestSession(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "accessToken")
    public native String getAccessToken();
    @Property(selector = "guestToken")
    public native String getGuestToken();
    @Property(selector = "probablyNeedsRefreshing")
    public native boolean probablyNeedsRefreshing();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSessionDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> sessionDictionary);
    @Method(selector = "initWithAccessToken:guestToken:")
    protected native @Pointer long init(String accessToken, String guestToken);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
