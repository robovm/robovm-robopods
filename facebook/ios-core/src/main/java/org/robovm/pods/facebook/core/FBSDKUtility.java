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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKUtility/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKUtilityPtr extends Ptr<FBSDKUtility, FBSDKUtilityPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKUtility.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKUtility() {}
    protected FBSDKUtility(Handle h, long handle) { super(h, handle); }
    protected FBSDKUtility(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dictionaryWithQueryString:")
    public static native NSDictionary<?, ?> parseQueryString(String queryString);
    public static String createQueryString(NSDictionary<?, ?> dictionary) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       String result = createQueryString(dictionary, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "queryStringWithDictionary:error:")
    private static native String createQueryString(NSDictionary<?, ?> dictionary, NSError.NSErrorPtr errorRef);
    @Method(selector = "URLDecode:")
    public static native String urlDecode(String value);
    @Method(selector = "URLEncode:")
    public static native String urlEncode(String value);
    @Method(selector = "startGCDTimerWithInterval:block:")
    public static native DispatchSource startGCDTimer(double interval, @Block Runnable block);
    @Method(selector = "stopGCDTimer:")
    public static native void stopGCDTimer(DispatchSource timer);
    @Method(selector = "SHA256Hash:")
    public static native String SHA256Hash(NSObject input);
    /*</methods>*/
}
