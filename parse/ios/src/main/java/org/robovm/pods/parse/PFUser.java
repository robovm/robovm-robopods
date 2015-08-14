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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFUser/*</name>*/ 
    extends /*<extends>*/PFObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFUserPtr extends Ptr<PFUser, PFUserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFUser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFUser() {}
    protected PFUser(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sessionToken")
    public native String getSessionToken();
    @Property(selector = "isNew")
    public native boolean isNew();
    @Property(selector = "username")
    public native String getUsername();
    @Property(selector = "setUsername:")
    public native void setUsername(String v);
    @Property(selector = "password")
    public native String getPassword();
    @Property(selector = "setPassword:")
    public native void setPassword(String v);
    @Property(selector = "email")
    public native String getEmail();
    @Property(selector = "setEmail:")
    public native void setEmail(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    @Method(selector = "query")
    public static native PFQuery<PFUser> getQuery();
    /*<methods>*/
    @Method(selector = "isAuthenticated")
    public native boolean isAuthenticated();
    public boolean signUp() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = signUp(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "signUp:")
    private native boolean signUp(NSError.NSErrorPtr error);
    @Method(selector = "signUpInBackground")
    public native BFTask<Void> signUpInBackground();
    @Method(selector = "signUpInBackgroundWithBlock:")
    public native void signUpInBackground(@Block PFSignUpCallback block);
    @Method(selector = "signUpInBackgroundWithTarget:selector:")
    public native void signUpInBackground(NSObject target, Selector selector);
    @Method(selector = "currentUser")
    public static native PFUser getCurrentUser();
    @Method(selector = "enableAutomaticUser")
    public static native void enableAutomaticUser();
    public static PFUser logIn(String username, String password) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       PFUser result = logIn(username, password, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "logInWithUsername:password:error:")
    private static native PFUser logIn(String username, String password, NSError.NSErrorPtr error);
    @Method(selector = "logInWithUsernameInBackground:password:")
    public static native BFTask<PFUser> logInInBackground(String username, String password);
    @Method(selector = "logInWithUsernameInBackground:password:target:selector:")
    public static native void logInInBackground(String username, String password, NSObject target, Selector selector);
    @Method(selector = "logInWithUsernameInBackground:password:block:")
    public static native void logInInBackground(String username, String password, @Block PFLogInCallback block);
    public static PFUser become(String sessionToken) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       PFUser result = become(sessionToken, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "become:error:")
    private static native PFUser become(String sessionToken, NSError.NSErrorPtr error);
    @Method(selector = "becomeInBackground:")
    public static native BFTask<PFUser> becomeInBackground(String sessionToken);
    @Method(selector = "becomeInBackground:target:selector:")
    public static native void becomeInBackground(String sessionToken, NSObject target, Selector selector);
    @Method(selector = "becomeInBackground:block:")
    public static native void becomeInBackground(String sessionToken, @Block PFLogInCallback block);
    @Method(selector = "enableRevocableSessionInBackground")
    public static native BFTask<Void> enableRevocableSessionInBackground();
    @Method(selector = "enableRevocableSessionInBackgroundWithBlock:")
    public static native void enableRevocableSessionInBackground(@Block PFUserSessionUpgradeCallback block);
    @Method(selector = "logOut")
    public static native void logOut();
    @Method(selector = "logOutInBackground")
    public static native BFTask<Void> logOutInBackground();
    @Method(selector = "logOutInBackgroundWithBlock:")
    public static native void logOutInBackground(@Block PFLogOutCallback block);
    public static boolean requestPasswordReset(String email) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = requestPasswordReset(email, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "requestPasswordResetForEmail:error:")
    private static native boolean requestPasswordReset(String email, NSError.NSErrorPtr error);
    @Method(selector = "requestPasswordResetForEmailInBackground:")
    public static native BFTask<Void> requestPasswordResetInBackground(String email);
    @Method(selector = "requestPasswordResetForEmailInBackground:target:selector:")
    public static native void requestPasswordResetInBackground(String email, NSObject target, Selector selector);
    @Method(selector = "requestPasswordResetForEmailInBackground:block:")
    public static native void requestPasswordResetInBackground(String email, @Block PFRequestPasswordResetCallback block);
    /*</methods>*/
}
