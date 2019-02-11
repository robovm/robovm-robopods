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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKGraphRequestPtr extends Ptr<FBSDKGraphRequest, FBSDKGraphRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGraphRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKGraphRequest() {}
    protected FBSDKGraphRequest(Handle h, long handle) { super(h, handle); }
    protected FBSDKGraphRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithGraphPath:parameters:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<?, ?> parameters) { super((SkipInit) null); initObject(init(graphPath, parameters)); }
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<?, ?> parameters, String HTTPMethod) { super((SkipInit) null); initObject(init(graphPath, parameters, HTTPMethod)); }
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    public FBSDKGraphRequest(String graphPath, NSDictionary<?, ?> parameters, String tokenString, String version, String HTTPMethod) { super((SkipInit) null); initObject(init(graphPath, parameters, tokenString, version, HTTPMethod)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "parameters")
    public native NSMutableDictionary<?, ?> getParameters();
    @Property(selector = "tokenString")
    public native String getTokenString();
    @Property(selector = "graphPath")
    public native String getGraphPath();
    @Property(selector = "HTTPMethod")
    public native String getHTTPMethod();
    @Property(selector = "version")
    public native String getVersion();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithGraphPath:parameters:")
    protected native @Pointer long init(String graphPath, NSDictionary<?, ?> parameters);
    @Method(selector = "initWithGraphPath:parameters:HTTPMethod:")
    protected native @Pointer long init(String graphPath, NSDictionary<?, ?> parameters, String HTTPMethod);
    @Method(selector = "initWithGraphPath:parameters:tokenString:version:HTTPMethod:")
    protected native @Pointer long init(String graphPath, NSDictionary<?, ?> parameters, String tokenString, String version, String HTTPMethod);
    @Method(selector = "setGraphErrorRecoveryDisabled:")
    public native void setGraphErrorRecoveryDisabled(boolean disable);
    @Method(selector = "startWithCompletionHandler:")
    public native FBSDKGraphRequestConnection start(@Block VoidBlock3<FBSDKGraphRequestConnection, NSObject, NSError> handler);
    /*</methods>*/
}
