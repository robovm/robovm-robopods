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

import org.robovm.apple.foundation.*;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.VoidBlock3;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequestConnection/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKGraphRequestConnectionPtr extends Ptr<FBSDKGraphRequestConnection, FBSDKGraphRequestConnectionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGraphRequestConnection.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKGraphRequestConnection() {}
    protected FBSDKGraphRequestConnection(long handle) { super(handle); }
    protected FBSDKGraphRequestConnection(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBSDKGraphRequestConnectionDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKGraphRequestConnectionDelegate v);
    @Property(selector = "timeout")
    public native double getTimeout();
    @Property(selector = "setTimeout:")
    public native void setTimeout(double v);
    @Property(selector = "URLResponse")
    public native NSHTTPURLResponse getURLResponse();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addRequest:completionHandler:")
    public native void addRequest(FBSDKGraphRequest request, @Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> handler);
    @Method(selector = "addRequest:completionHandler:batchEntryName:")
    public native void addRequest(FBSDKGraphRequest request, @Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> handler, String name);
    @Method(selector = "addRequest:completionHandler:batchParameters:")
    public native void addRequest(FBSDKGraphRequest request, @Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> handler, NSDictionary<?, ?> batchParameters);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "start")
    public native void start();
    @Method(selector = "setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue queue);
    @Method(selector = "overrideVersionPartWith:")
    public native void overrideVersionPart(String version);
    @Method(selector = "setDefaultConnectionTimeout:")
    public static native void setDefaultConnectionTimeout(double defaultConnectionTimeout);
    /*</methods>*/
}
