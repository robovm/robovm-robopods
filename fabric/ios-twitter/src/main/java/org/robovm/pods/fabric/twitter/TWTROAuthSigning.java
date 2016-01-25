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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTROAuthSigning/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTROAuthSigningPtr extends Ptr<TWTROAuthSigning, TWTROAuthSigningPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTROAuthSigning.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTROAuthSigning(Handle h, long handle) { super(h, handle); }
    protected TWTROAuthSigning(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAuthConfig:authSession:")
    public TWTROAuthSigning(TWTRAuthConfig authConfig, TWTRSession authSession) { super((SkipInit) null); initObject(init(authConfig, authSession)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthConfig:authSession:")
    protected native @Pointer long init(TWTRAuthConfig authConfig, TWTRSession authSession);
    /*</methods>*/
}
