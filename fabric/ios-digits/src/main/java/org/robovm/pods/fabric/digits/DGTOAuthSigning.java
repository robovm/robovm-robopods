/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTOAuthSigning/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTOAuthSigningPtr extends Ptr<DGTOAuthSigning, DGTOAuthSigningPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTOAuthSigning.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected DGTOAuthSigning(Handle h, long handle) { super(h, handle); }
    protected DGTOAuthSigning(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAuthConfig:authSession:")
    public DGTOAuthSigning(TWTRAuthConfig authConfig, DGTSession authSession) { super((SkipInit) null); initObject(init(authConfig, authSession)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthConfig:authSession:")
    protected native @Pointer long init(TWTRAuthConfig authConfig, DGTSession authSession);
    @Method(selector = "OAuthEchoHeadersToVerifyCredentialsWithParams:")
    public native TWTROAuthEchoHeaders getOAuthEchoHeadersToVerifyCredentials(NSDictionary<?, ?> params);
    /*</methods>*/
}
