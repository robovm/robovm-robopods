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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRUserSessionStoreAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRUserSessionStore/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("saveSession:completion:")
    public void saveSession(TWTRAuthSession session, @Block VoidBlock2<TWTRAuthSession, NSError> completion) {}
    @NotImplemented("saveSessionWithAuthToken:authTokenSecret:completion:")
    public void saveSession(String authToken, String authTokenSecret, @Block VoidBlock2<TWTRAuthSession, NSError> completion) {}
    @NotImplemented("sessionForUserID:")
    public TWTRAuthSession getSessionForUserID(String userID) { return null; }
    @NotImplemented("existingUserSessions")
    public @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<TWTRAuthSession> getExistingUserSessions() { return null; }
    @NotImplemented("session")
    public TWTRAuthSession getSession() { return null; }
    @NotImplemented("logOutUserID:")
    public void logOutUserID(String userID) {}
    /*</methods>*/
}
