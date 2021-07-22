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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.accounts.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoginManagerLoginResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKLoginManagerLoginResultPtr extends Ptr<FBSDKLoginManagerLoginResult, FBSDKLoginManagerLoginResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKLoginManagerLoginResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKLoginManagerLoginResult() {}
    protected FBSDKLoginManagerLoginResult(Handle h, long handle) { super(h, handle); }
    protected FBSDKLoginManagerLoginResult(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithToken:isCancelled:grantedPermissions:declinedPermissions:")
    public FBSDKLoginManagerLoginResult(FBSDKAccessToken token, boolean isCancelled, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> grantedPermissions, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> declinedPermissions) { super((SkipInit) null); initObject(init(token, isCancelled, grantedPermissions, declinedPermissions)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "token")
    public native FBSDKAccessToken getToken();
    @Property(selector = "setToken:")
    public native void setToken(FBSDKAccessToken v);
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "grantedPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getGrantedPermissions();
    @Property(selector = "setGrantedPermissions:")
    public native void setGrantedPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> v);
    @Property(selector = "declinedPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getDeclinedPermissions();
    @Property(selector = "setDeclinedPermissions:")
    public native void setDeclinedPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithToken:isCancelled:grantedPermissions:declinedPermissions:")
    protected native @Pointer long init(FBSDKAccessToken token, boolean isCancelled, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> grantedPermissions, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> declinedPermissions);
    /*</methods>*/
}
