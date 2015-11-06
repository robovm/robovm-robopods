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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFTwitter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFTwitterPtr extends Ptr<PFTwitter, PFTwitterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFTwitter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFTwitter() {}
    protected PFTwitter(Handle h, long handle) { super(h, handle); }
    protected PFTwitter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "consumerKey")
    public native String getConsumerKey();
    @Property(selector = "setConsumerKey:")
    public native void setConsumerKey(String v);
    @Property(selector = "consumerSecret")
    public native String getConsumerSecret();
    @Property(selector = "setConsumerSecret:")
    public native void setConsumerSecret(String v);
    @Property(selector = "authToken")
    public native String getAuthToken();
    @Property(selector = "setAuthToken:")
    public native void setAuthToken(String v);
    @Property(selector = "authTokenSecret")
    public native String getAuthTokenSecret();
    @Property(selector = "setAuthTokenSecret:")
    public native void setAuthTokenSecret(String v);
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    @Property(selector = "screenName")
    public native String getScreenName();
    @Property(selector = "setScreenName:")
    public native void setScreenName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "authorizeInBackground")
    public native BFTask<Void> authorizeInBackground();
    @Method(selector = "authorizeWithSuccess:failure:cancel:")
    public native void authorize(@Block Runnable success, @Block VoidBlock1<NSError> failure, @Block Runnable cancel);
    @Method(selector = "signRequest:")
    public native void sign(NSMutableURLRequest request);
    /*</methods>*/
}
