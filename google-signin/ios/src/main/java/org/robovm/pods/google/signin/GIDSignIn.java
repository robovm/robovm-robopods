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
package org.robovm.pods.google.signin;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDSignIn/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GIDSignInPtr extends Ptr<GIDSignIn, GIDSignInPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDSignIn.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GIDSignIn() {}
    protected GIDSignIn(Handle h, long handle) { super(h, handle); }
    protected GIDSignIn(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "currentUser")
    public native GIDGoogleUser getCurrentUser();
    @Property(selector = "delegate")
    public native GIDSignInDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GIDSignInDelegate v);
    @Property(selector = "uiDelegate")
    public native GIDSignInUIDelegate getUiDelegate();
    @Property(selector = "setUiDelegate:", strongRef = true)
    public native void setUiDelegate(GIDSignInUIDelegate v);
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "setClientID:")
    public native void setClientID(String v);
    @Property(selector = "scopes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getScopes();
    @Property(selector = "setScopes:")
    public native void setScopes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "shouldFetchBasicProfile")
    public native boolean shouldFetchBasicProfile();
    @Property(selector = "setShouldFetchBasicProfile:")
    public native void setShouldFetchBasicProfile(boolean v);
    @Property(selector = "allowsSignInWithBrowser")
    public native boolean allowsSignInWithBrowser();
    @Property(selector = "setAllowsSignInWithBrowser:")
    public native void setAllowsSignInWithBrowser(boolean v);
    @Property(selector = "allowsSignInWithWebView")
    public native boolean allowsSignInWithWebView();
    @Property(selector = "setAllowsSignInWithWebView:")
    public native void setAllowsSignInWithWebView(boolean v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "serverClientID")
    public native String getServerClientID();
    @Property(selector = "setServerClientID:")
    public native void setServerClientID(String v);
    @Property(selector = "openIDRealm")
    public native String getOpenIDRealm();
    @Property(selector = "setOpenIDRealm:")
    public native void setOpenIDRealm(String v);
    @Property(selector = "hostedDomain")
    public native String getHostedDomain();
    @Property(selector = "setHostedDomain:")
    public native void setHostedDomain(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "handleURL:sourceApplication:annotation:")
    public native boolean handleURL(NSURL url, String sourceApplication, NSPropertyList annotation);
    @Method(selector = "hasAuthInKeychain")
    public native boolean hasAuthInKeychain();
    @Method(selector = "signInSilently")
    public native void signInSilently();
    @Method(selector = "signIn")
    public native void signIn();
    @Method(selector = "signOut")
    public native void signOut();
    @Method(selector = "disconnect")
    public native void disconnect();
    @Method(selector = "checkGoogleSignInAppInstalled:")
    public native void checkGoogleSignInAppInstalled(@Block VoidBooleanBlock callback);
    @Method(selector = "sharedInstance")
    public static native GIDSignIn getSharedInstance();
    /*</methods>*/
}
