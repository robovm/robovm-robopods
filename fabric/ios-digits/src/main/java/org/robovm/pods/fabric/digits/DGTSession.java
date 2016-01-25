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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTSessionPtr extends Ptr<DGTSession, DGTSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTSession() {}
    protected DGTSession(Handle h, long handle) { super(h, handle); }
    protected DGTSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAuthToken:authTokenSecret:userID:phoneNumber:")
    public DGTSession(String authToken, String authTokenSecret, String userID, String phoneNumber) { super((SkipInit) null); initObject(init(authToken, authTokenSecret, userID, phoneNumber)); }
    @Method(selector = "initWithAuthToken:authTokenSecret:userID:phoneNumber:emailAddress:emailAddressIsVerified:")
    public DGTSession(String authToken, String authTokenSecret, String userID, String phoneNumber, String emailAddress, boolean emailAddressIsVerified) { super((SkipInit) null); initObject(init(authToken, authTokenSecret, userID, phoneNumber, emailAddress, emailAddressIsVerified)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "authTokenSecret")
    public native String getAuthTokenSecret();
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "phoneNumber")
    public native String getPhoneNumber();
    @Property(selector = "emailAddress")
    public native String getEmailAddress();
    @Property(selector = "emailAddressIsVerified")
    public native boolean isEmailAddressIsVerified();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAuthToken:authTokenSecret:userID:phoneNumber:")
    protected native @Pointer long init(String authToken, String authTokenSecret, String userID, String phoneNumber);
    @Method(selector = "initWithAuthToken:authTokenSecret:userID:phoneNumber:emailAddress:emailAddressIsVerified:")
    protected native @Pointer long init(String authToken, String authTokenSecret, String userID, String phoneNumber, String emailAddress, boolean emailAddressIsVerified);
    /*</methods>*/
}
