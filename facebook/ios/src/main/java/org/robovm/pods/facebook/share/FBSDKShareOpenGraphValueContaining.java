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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/FBSDKShareOpenGraphValueContaining/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "arrayForKey:")
    NSArray<?> getArray(String key);
    @Method(selector = "enumerateKeysAndObjectsUsingBlock:")
    void enumerateKeysAndObjects(@Block VoidBlock3<NSString, NSObject, BooleanPtr> block);
    @Method(selector = "keyEnumerator")
    NSEnumerator<NSString> getKeyEnumerator();
    @Method(selector = "numberForKey:")
    NSNumber getNumber(String key);
    @Method(selector = "objectEnumerator")
    NSEnumerator<?> getObjectEnumerator();
    @Method(selector = "objectForKey:")
    FBSDKShareOpenGraphObject getGraphObject(String key);
    @Method(selector = "objectForKeyedSubscript:")
    NSObject getObject(String key);
    @Method(selector = "parseProperties:")
    void parseProperties(NSDictionary<?, ?> properties);
    @Method(selector = "photoForKey:")
    FBSDKSharePhoto getPhoto(String key);
    @Method(selector = "removeObjectForKey:")
    void removeObject(String key);
    @Method(selector = "stringForKey:")
    String getString(String key);
    @Method(selector = "URLForKey:")
    NSURL getURL(String key);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
