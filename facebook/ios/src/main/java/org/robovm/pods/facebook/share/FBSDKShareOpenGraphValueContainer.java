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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareOpenGraphValueContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKShareOpenGraphValueContaining/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareOpenGraphValueContainerPtr extends Ptr<FBSDKShareOpenGraphValueContainer, FBSDKShareOpenGraphValueContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareOpenGraphValueContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareOpenGraphValueContainer() {}
    protected FBSDKShareOpenGraphValueContainer(long handle) { super(handle); }
    protected FBSDKShareOpenGraphValueContainer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public void putArray(String key, NSArray<?> array) {
        setArray0(array, key);
    }
    public void putNumber(String key, NSNumber number) {
        setNumber0(number, key);
    }
    public void putObject(String key, FBSDKShareOpenGraphObject object) {
        setObject0(object, key);
    }
    public void putPhoto(String key, FBSDKSharePhoto photo) {
        setPhoto0(photo, key);
    }
    public void putString(String key, String string) {
        setString0(key, string);
    }
    public void putURL(String key, NSURL URL) {
        setURL0(URL, key);
    }
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
    /*</methods>*/
    @Method(selector = "setArray:forKey:")
    private native void setArray0(NSArray<?> array, String key);
    @Method(selector = "setNumber:forKey:")
    private native void setNumber0(NSNumber number, String key);
    @Method(selector = "setObject:forKey:")
    private native void setObject0(FBSDKShareOpenGraphObject object, String key);
    @Method(selector = "setPhoto:forKey:")
    private native void setPhoto0(FBSDKSharePhoto photo, String key);
    @Method(selector = "setString:forKey:")
    private native void setString0(String string, String key);
    @Method(selector = "setURL:forKey:")
    private native void setURL0(NSURL URL, String key);
}
