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
package org.robovm.pods.firebase.instanceid;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRInstanceID/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRInstanceIDPtr extends Ptr<FIRInstanceID, FIRInstanceIDPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRInstanceID.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRInstanceID() {}
    protected FIRInstanceID(Handle h, long handle) { super(h, handle); }
    protected FIRInstanceID(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "instanceIDWithHandler:")
    public native void instanceID(@Block VoidBlock2<FIRInstanceIDResult, NSError> handler);
    @Method(selector = "token")
    public native String token();
    @Method(selector = "tokenWithAuthorizedEntity:scope:options:handler:")
    public native void token(String authorizedEntity, String scope, NSDictionary<?, ?> options, @Block VoidBlock2<NSString, NSError> handler);
    @Method(selector = "deleteTokenWithAuthorizedEntity:scope:handler:")
    public native void deleteToken(String authorizedEntity, String scope, @Block VoidBlock1<NSError> handler);
    @Method(selector = "getIDWithHandler:")
    public native void getID(@Block VoidBlock2<NSString, NSError> handler);
    @Method(selector = "deleteIDWithHandler:")
    public native void deleteID(@Block VoidBlock1<NSError> handler);
    @Method(selector = "instanceID")
    public static native FIRInstanceID instanceID();
    /*</methods>*/
}
