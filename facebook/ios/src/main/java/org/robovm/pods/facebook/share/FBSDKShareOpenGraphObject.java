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
package org.robovm.pods.facebook.share;

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
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareOpenGraphObject/*</name>*/ 
    extends /*<extends>*/FBSDKShareOpenGraphValueContainer/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareOpenGraphObjectPtr extends Ptr<FBSDKShareOpenGraphObject, FBSDKShareOpenGraphObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareOpenGraphObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareOpenGraphObject() {}
    protected FBSDKShareOpenGraphObject(SkipInit skipInit) { super(skipInit); }
    public FBSDKShareOpenGraphObject(NSDictionary<?, ?> properties) { super(create(properties)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToShareOpenGraphObject:")
    public native boolean equalsTo(FBSDKShareOpenGraphObject object);
    @Method(selector = "objectWithProperties:")
    protected static native @Pointer long create(NSDictionary<?, ?> properties);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
