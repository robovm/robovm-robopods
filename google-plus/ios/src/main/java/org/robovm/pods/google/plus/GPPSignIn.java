/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.google.plus;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.pods.google.opensource.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPPSignIn/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPPSignInPtr extends Ptr<GPPSignIn, GPPSignInPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPPSignIn.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPPSignIn() {}
    protected GPPSignIn(Handle h, long handle) { super(h, handle); }
    protected GPPSignIn(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authentication")
    public native GTMOAuth2Authentication getAuthentication();
    @Property(selector = "idToken")
    public native String getIdToken();
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "userEmail")
    public native String getUserEmail();
    @Property(selector = "googlePlusUser")
    public native GTLPlusPerson getGooglePlusUser();
    @Property(selector = "delegate")
    public native GPPSignInDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GPPSignInDelegate v);
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "setClientID:")
    public native void setClientID(String v);
    @Property(selector = "homeServerClientID")
    public native String getHomeServerClientID();
    @Property(selector = "setHomeServerClientID:")
    public native void setHomeServerClientID(String v);
    @Property(selector = "homeServerAuthorizationCode")
    public native String getHomeServerAuthorizationCode();
    @Property(selector = "openIDRealm")
    public native String getOpenIDRealm();
    @Property(selector = "setOpenIDRealm:")
    public native void setOpenIDRealm(String v);
    @Property(selector = "scopes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getScopes();
    @Property(selector = "setScopes:")
    public native void setScopes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "attemptSSO")
    public native boolean isAttemptSSO();
    @Property(selector = "setAttemptSSO:")
    public native void setAttemptSSO(boolean v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "keychainName")
    public native String getKeychainName();
    @Property(selector = "setKeychainName:")
    public native void setKeychainName(String v);
    @Property(selector = "actions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getActions();
    @Property(selector = "setActions:")
    public native void setActions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "shouldFetchGoogleUserEmail")
    public native boolean shouldFetchGoogleUserEmail();
    @Property(selector = "setShouldFetchGoogleUserEmail:")
    public native void setShouldFetchGoogleUserEmail(boolean v);
    @Property(selector = "shouldFetchGoogleUserID")
    public native boolean shouldFetchGoogleUserID();
    @Property(selector = "setShouldFetchGoogleUserID:")
    public native void setShouldFetchGoogleUserID(boolean v);
    @Property(selector = "shouldFetchGooglePlusUser")
    public native boolean shouldFetchGooglePlusUser();
    @Property(selector = "setShouldFetchGooglePlusUser:")
    public native void setShouldFetchGooglePlusUser(boolean v);
    @Property(selector = "useClientIDForURLScheme")
    public native boolean isUseClientIDForURLScheme();
    @Property(selector = "setUseClientIDForURLScheme:")
    public native void setUseClientIDForURLScheme(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "hasAuthInKeychain")
    public native boolean hasAuthInKeychain();
    @Method(selector = "trySilentAuthentication")
    public native boolean trySilentAuthentication();
    @Method(selector = "authenticate")
    public native void authenticate();
    @Method(selector = "handleURL:sourceApplication:annotation:")
    public native boolean handleURL(NSURL url, String sourceApplication, NSPropertyList annotation);
    @Method(selector = "signOut")
    public native void signOut();
    @Method(selector = "disconnect")
    public native void disconnect();
    @Method(selector = "plusService")
    public native GTLServicePlus getPlusService();
    @Method(selector = "sharedInstance")
    public static native GPPSignIn getSharedInstance();
    /*</methods>*/
}
