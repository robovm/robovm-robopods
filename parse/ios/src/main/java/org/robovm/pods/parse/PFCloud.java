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
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFCloud/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFCloudPtr extends Ptr<PFCloud, PFCloudPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFCloud.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFCloud() {}
    protected PFCloud(Handle h, long handle) { super(h, handle); }
    protected PFCloud(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public static <T extends NSObject> void callFunctionInBackground(String function, NSDictionary<?, ?> parameters, PFFunctionCallback<T> block) {
        callFunctionInBackground0(function, parameters, (PFFunctionCallback<NSObject>) block);
    }

    /*<methods>*/
    @Method(selector = "callFunctionInBackground:withParameters:")
    public static native <T extends NSObject> BFTask<T> callFunctionInBackground(String function, NSDictionary<?, ?> parameters);
    @Method(selector = "callFunctionInBackground:withParameters:block:")
    protected static native void callFunctionInBackground0(String function, NSDictionary<?, ?> parameters, @Block PFFunctionCallback<NSObject> block);
    public static <T extends NSObject> T callFunction(String function, NSDictionary<?, ?> parameters) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       T result = callFunction(function, parameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "callFunction:withParameters:error:")
    private static native <T extends NSObject> T callFunction(String function, NSDictionary<?, ?> parameters, NSError.NSErrorPtr error);
    /*</methods>*/
}
