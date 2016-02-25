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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDGoogleUser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GIDGoogleUserPtr extends Ptr<GIDGoogleUser, GIDGoogleUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDGoogleUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GIDGoogleUser() {}
    protected GIDGoogleUser(Handle h, long handle) { super(h, handle); }
    protected GIDGoogleUser(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public GIDGoogleUser(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "profile")
    public native GIDProfileData getProfile();
    @Property(selector = "authentication")
    public native GIDAuthentication getAuthentication();
    @Property(selector = "accessibleScopes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAccessibleScopes();
    @Property(selector = "hostedDomain")
    public native String getHostedDomain();
    @Property(selector = "serverAuthCode")
    public native String getServerAuthCode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
