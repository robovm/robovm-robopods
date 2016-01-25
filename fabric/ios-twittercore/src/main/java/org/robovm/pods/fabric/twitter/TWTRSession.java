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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRSession/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRAuthSession/*</implements>*/ {

    /*<ptr>*/public static class TWTRSessionPtr extends Ptr<TWTRSession, TWTRSessionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRSession.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRSession(Handle h, long handle) { super(h, handle); }
    protected TWTRSession(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSessionDictionary:")
    public TWTRSession(NSDictionary<?, ?> sessionDictionary) { super((SkipInit) null); initObject(init(sessionDictionary)); }
    @Method(selector = "initWithAuthToken:authTokenSecret:userName:userID:")
    public TWTRSession(String authToken, String authTokenSecret, String userName, String userID) { super((SkipInit) null); initObject(init(authToken, authTokenSecret, userName, userID)); }
    @Method(selector = "initWithCoder:")
    public TWTRSession(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "authTokenSecret")
    public native String getAuthTokenSecret();
    @Property(selector = "userName")
    public native String getUserName();
    @Property(selector = "userID")
    public native String getUserID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSessionDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> sessionDictionary);
    @Method(selector = "initWithAuthToken:authTokenSecret:userName:userID:")
    protected native @Pointer long init(String authToken, String authTokenSecret, String userName, String userID);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
