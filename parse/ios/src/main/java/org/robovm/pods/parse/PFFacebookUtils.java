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
import org.robovm.pods.facebook.core.*;
import org.robovm.pods.facebook.login.*;
import org.robovm.pods.bolts.*;
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFFacebookUtils/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFFacebookUtilsPtr extends Ptr<PFFacebookUtils, PFFacebookUtilsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFFacebookUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFFacebookUtils() {}
    protected PFFacebookUtils(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initializeFacebookWithApplicationLaunchOptions:")
    public static native void initializeFacebook(UIApplicationLaunchOptions launchOptions);
    @Method(selector = "facebookLoginManager")
    public static native FBSDKLoginManager getFacebookLoginManager();
    @Method(selector = "logInInBackgroundWithReadPermissions:")
    public static native BFTask<PFUser> logInInBackgroundWithReadPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions);
    @Method(selector = "logInInBackgroundWithReadPermissions:block:")
    public static native void logInInBackgroundWithReadPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, @Block PFLogInCallback block);
    @Method(selector = "logInInBackgroundWithPublishPermissions:")
    public static native BFTask<PFUser> logInInBackgroundWithPublishPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions);
    @Method(selector = "logInInBackgroundWithPublishPermissions:block:")
    public static native void logInInBackgroundWithPublishPermissions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> permissions, @Block PFLogInCallback block);
    @Method(selector = "logInInBackgroundWithAccessToken:")
    public static native BFTask<PFUser> logInInBackground(FBSDKAccessToken accessToken);
    @Method(selector = "logInInBackgroundWithAccessToken:block:")
    public static native void logInInBackground(FBSDKAccessToken accessToken, @Block PFLogInCallback block);
    @Method(selector = "linkUserInBackground:withReadPermissions:")
    public static native BFTask<NSNumber> linkUserInBackgroundWithReadPermissions(PFUser user, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<String> permissions);
    @Method(selector = "linkUserInBackground:withReadPermissions:block:")
    public static native void linkUserInBackgroundWithReadPermissions(PFUser user, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<String> permissions, @Block PFSaveCallback block);
    @Method(selector = "linkUserInBackground:withPublishPermissions:")
    public static native BFTask<NSNumber> linkUserInBackgroundWithPublishPermissions(PFUser user, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<String> permissions);
    @Method(selector = "linkUserInBackground:withPublishPermissions:block:")
    public static native void linkUserInBackgroundWithPublishPermissions(PFUser user, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<String> permissions, @Block PFSaveCallback block);
    @Method(selector = "linkUserInBackground:withAccessToken:")
    public static native BFTask<NSNumber> linkUserInBackground(PFUser user, FBSDKAccessToken accessToken);
    @Method(selector = "linkUserInBackground:withAccessToken:block:")
    public static native void linkUserInBackground(PFUser user, FBSDKAccessToken accessToken, @Block PFSaveCallback block);
    @Method(selector = "unlinkUserInBackground:")
    public static native BFTask<NSNumber> unlinkUserInBackground(PFUser user);
    @Method(selector = "unlinkUserInBackground:block:")
    public static native void unlinkUserInBackground(PFUser user, @Block PFSaveCallback block);
    @Method(selector = "isLinkedWithUser:")
    public static native boolean isLinkedWithUser(PFUser user);
    /*</methods>*/
}
