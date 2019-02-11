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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareOpenGraphValueContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareOpenGraphValueContaining/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareOpenGraphValueContainerPtr extends Ptr<FBSDKShareOpenGraphValueContainer, FBSDKShareOpenGraphValueContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareOpenGraphValueContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareOpenGraphValueContainer() {}
    protected FBSDKShareOpenGraphValueContainer(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareOpenGraphValueContainer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareOpenGraphValueContainer(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "arrayForKey:")
    public native NSArray<?> getArray(String key);
    @Method(selector = "enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjects(@Block VoidBlock3<NSString, NSObject, BooleanPtr> block);
    @Method(selector = "keyEnumerator")
    public native NSEnumerator<NSString> getKeyEnumerator();
    @Method(selector = "numberForKey:")
    public native NSNumber getNumber(String key);
    @Method(selector = "objectEnumerator")
    public native NSEnumerator<?> getObjectEnumerator();
    @Method(selector = "objectForKey:")
    public native FBSDKShareOpenGraphObject getGraphObject(String key);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSObject getObject(String key);
    @Method(selector = "parseProperties:")
    public native void parseProperties(NSDictionary<?, ?> properties);
    @Method(selector = "photoForKey:")
    public native FBSDKSharePhoto getPhoto(String key);
    @Method(selector = "removeObjectForKey:")
    public native void removeObject(String key);
    @Method(selector = "stringForKey:")
    public native String getString(String key);
    @Method(selector = "URLForKey:")
    public native NSURL getURL(String key);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
