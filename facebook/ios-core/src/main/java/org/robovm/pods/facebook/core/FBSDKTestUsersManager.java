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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKTestUsersManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKTestUsersManagerPtr extends Ptr<FBSDKTestUsersManager, FBSDKTestUsersManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKTestUsersManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKTestUsersManager() {}
    protected FBSDKTestUsersManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKTestUsersManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "requestTestAccountTokensWithArraysOfPermissions:createIfNotFound:completionHandler:")
    public native void requestTestAccountTokens(NSArray<NSSet<NSString>> arraysOfPermissions, boolean createIfNotFound, @Block VoidBlock2<NSArray<FBSDKAccessToken>, NSError> handler);
    @Method(selector = "addTestAccountWithPermissions:completionHandler:")
    public native void addTestAccount(@org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> permissions, @Block VoidBlock2<NSArray<FBSDKAccessToken>, NSError> handler);
    @Method(selector = "removeTestAccount:completionHandler:")
    public native void removeTestAccount(String userId, @Block VoidBlock1<NSError> handler);
    @Method(selector = "makeFriendsWithFirst:second:callback:")
    public native void makeFriends(FBSDKAccessToken first, FBSDKAccessToken second, @Block VoidBlock1<NSError> callback);
    @Method(selector = "sharedInstanceForAppID:appSecret:")
    public static native FBSDKTestUsersManager getSharedInstance(String appID, String appSecret);
    /*</methods>*/
}
