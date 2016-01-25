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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRSessionStore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TWTRSessionStoreProtocol/*</implements>*/ {

    /*<ptr>*/public static class TWTRSessionStorePtr extends Ptr<TWTRSessionStore, TWTRSessionStorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRSessionStore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRSessionStore(Handle h, long handle) { super(h, handle); }
    protected TWTRSessionStore(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authConfig")
    public native TWTRAuthConfig getAuthConfig();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reloadSessionStore")
    public native void reloadSessionStore();
    @Method(selector = "saveSession:completion:")
    public native void saveSession(TWTRAuthSession session, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "saveSessionWithAuthToken:authTokenSecret:completion:")
    public native void saveSession(String authToken, String authTokenSecret, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "sessionForUserID:")
    public native TWTRAuthSession getSessionForUserID(String userID);
    @Method(selector = "existingUserSessions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<TWTRAuthSession> getExistingUserSessions();
    @Method(selector = "session")
    public native TWTRAuthSession getSession();
    @Method(selector = "logOutUserID:")
    public native void logOutUserID(String userID);
    @Method(selector = "fetchGuestSessionWithCompletion:")
    public native void fetchGuestSession(@Block VoidBlock2<TWTRGuestSession, NSError> completion);
    @Method(selector = "refreshSessionClass:sessionID:completion:")
    public native void refreshSessionClass(Class<? extends TWTRAuthSession> sessionClass, String sessionID, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "isExpiredSession:response:")
    public native boolean isSessionExpired(TWTRAuthSession session, NSHTTPURLResponse response);
    @Method(selector = "isExpiredSession:error:")
    public native boolean isSessionExpired(TWTRAuthSession session, NSError error);
    /*</methods>*/
}
