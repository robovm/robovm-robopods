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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFTwitterUtils/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFTwitterUtilsPtr extends Ptr<PFTwitterUtils, PFTwitterUtilsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFTwitterUtils.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFTwitterUtils() {}
    protected PFTwitterUtils(Handle h, long handle) { super(h, handle); }
    protected PFTwitterUtils(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "twitter")
    public static native PFTwitter getTwitter();
    @Method(selector = "initializeWithConsumerKey:consumerSecret:")
    public static native void initialize(String consumerKey, String consumerSecret);
    @Method(selector = "isLinkedWithUser:")
    public static native boolean isLinked(PFUser user);
    @Method(selector = "logInInBackground")
    public static native BFTask<PFUser> logInInBackground();
    @Method(selector = "logInWithBlock:")
    public static native void logIn(@Block PFLogInCallback block);
    @Method(selector = "logInWithTarget:selector:")
    public static native void logIn(NSObject target, Selector selector);
    @Method(selector = "logInWithTwitterIdInBackground:screenName:authToken:authTokenSecret:")
    public static native BFTask<PFUser> logIn(String twitterId, String screenName, String authToken, String authTokenSecret);
    @Method(selector = "logInWithTwitterId:screenName:authToken:authTokenSecret:block:")
    public static native void logIn(String twitterId, String screenName, String authToken, String authTokenSecret, @Block PFLogInCallback block);
    @Method(selector = "logInWithTwitterId:screenName:authToken:authTokenSecret:target:selector:")
    public static native void logIn(String twitterId, String screenName, String authToken, String authTokenSecret, NSObject target, Selector selector);
    @Method(selector = "linkUserInBackground:")
    public static native BFTask<Void> linkInBackground(PFUser user);
    @Method(selector = "linkUser:block:")
    public static native void link(PFUser user, @Block PFSaveCallback block);
    @Method(selector = "linkUser:target:selector:")
    public static native void link(PFUser user, NSObject target, Selector selector);
    @Method(selector = "linkUserInBackground:twitterId:screenName:authToken:authTokenSecret:")
    public static native BFTask<Void> linkInBackground(PFUser user, String twitterId, String screenName, String authToken, String authTokenSecret);
    @Method(selector = "linkUser:twitterId:screenName:authToken:authTokenSecret:block:")
    public static native void link(PFUser user, String twitterId, String screenName, String authToken, String authTokenSecret, @Block PFSaveCallback block);
    @Method(selector = "linkUser:twitterId:screenName:authToken:authTokenSecret:target:selector:")
    public static native void link(PFUser user, String twitterId, String screenName, String authToken, String authTokenSecret, NSObject target, Selector selector);
    public static boolean unlink(PFUser user) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unlink(user, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unlinkUser:error:")
    private static native boolean unlink(PFUser user, NSError.NSErrorPtr error);
    @Method(selector = "unlinkUserInBackground:")
    public static native BFTask<Void> unlinkInBackground(PFUser user);
    @Method(selector = "unlinkUserInBackground:block:")
    public static native void unlinkInBackground(PFUser user, @Block PFSaveCallback block);
    @Method(selector = "unlinkUserInBackground:target:selector:")
    public static native void unlinkInBackground(PFUser user, NSObject target, Selector selector);
    /*</methods>*/
}
