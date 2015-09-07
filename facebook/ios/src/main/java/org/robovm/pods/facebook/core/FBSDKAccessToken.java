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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAccessToken/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying/*</implements>*/ {
    
    public static class Notifications {
        public static NSObject observeCurrentAccessTokenDidChange(final VoidBlock1<FBSDKAccessTokenChangeNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    FBSDKAccessTokenChangeNotification notif = null;
                    if (userInfo != null) {
                        notif = new FBSDKAccessTokenChangeNotification(userInfo);
                    }
                    block.invoke(notif);
                }
            });
        }
    }

    /*<ptr>*/public static class FBSDKAccessTokenPtr extends Ptr<FBSDKAccessToken, FBSDKAccessTokenPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAccessToken.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAccessToken() {}
    protected FBSDKAccessToken(SkipInit skipInit) { super(skipInit); }
    public FBSDKAccessToken(String tokenString, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> permissions, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> declinedPermissions, String appID, String userID, NSDate expirationDate, NSDate refreshDate) { super((SkipInit) null); initObject(init(tokenString, permissions, declinedPermissions, appID, userID, expirationDate, refreshDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appID")
    public native String getAppID();
    @Property(selector = "declinedPermissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getDeclinedPermissions();
    @Property(selector = "expirationDate")
    public native NSDate getExpirationDate();
    @Property(selector = "permissions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getPermissions();
    @Property(selector = "refreshDate")
    public native NSDate getRefreshDate();
    @Property(selector = "tokenString")
    public native String getTokenString();
    @Property(selector = "userID")
    public native String getUserID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKAccessTokenDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "initWithTokenString:permissions:declinedPermissions:appID:userID:expirationDate:refreshDate:")
    protected native @Pointer long init(String tokenString, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> permissions, @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> declinedPermissions, String appID, String userID, NSDate expirationDate, NSDate refreshDate);
    @Method(selector = "hasGranted:")
    public native boolean hasGranted(String permission);
    @Method(selector = "isEqualToAccessToken:")
    public native boolean equalsTo(FBSDKAccessToken token);
    @Method(selector = "currentAccessToken")
    public static native FBSDKAccessToken getCurrentAccessToken();
    @Method(selector = "setCurrentAccessToken:")
    public static native void setCurrentAccessToken(FBSDKAccessToken token);
    @Method(selector = "refreshCurrentAccessToken:")
    public static native void refreshCurrentAccessToken(@Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> completionHandler);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
