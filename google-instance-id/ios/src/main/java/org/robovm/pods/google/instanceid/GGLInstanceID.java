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
package org.robovm.pods.google.instanceid;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GGLInstanceID/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GGLInstanceIDPtr extends Ptr<GGLInstanceID, GGLInstanceIDPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GGLInstanceID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GGLInstanceID() {}
    protected GGLInstanceID(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGGLInstanceIDRegisterAPNSOption", optional=true)
    public static native String getRegisterAPNSOption();
    @GlobalValue(symbol="kGGLInstanceIDAPNSServerTypeSandboxOption", optional=true)
    public static native String getAPNSServerTypeSandboxOption();
    @GlobalValue(symbol="kGGLInstanceIDScopeGCM", optional=true)
    public static native String getScopeGCM();
    
    @Method(selector = "startWithConfig:")
    public native void start(GGLInstanceIDConfig config);
    @Method(selector = "stopAllRequests")
    public native void stopAllRequests();
    @Method(selector = "tokenWithAuthorizedEntity:scope:options:handler:")
    public native void getToken(String authorizedEntity, String scope, NSDictionary options, @Block GGLInstanceIDGetTokenCallback handler);
    @Method(selector = "deleteTokenWithAuthorizedEntity:scope:handler:")
    public native void deleteToken(String authorizedEntity, String scope, @Block GGLInstanceIDDeleteTokenCallback handler);
    @Method(selector = "getIDWithHandler:")
    public native void getId(@Block GGLInstanceIDGetIDCallback handler);
    @Method(selector = "deleteIDWithHandler:")
    public native void deleteId(@Block GGLInstanceIDDeleteIdCallback handler);
    @Method(selector = "sharedInstance")
    public static native GGLInstanceID getSharedInstance();
    /*</methods>*/
}
