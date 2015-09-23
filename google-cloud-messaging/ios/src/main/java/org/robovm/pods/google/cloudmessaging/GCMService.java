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
package org.robovm.pods.google.cloudmessaging;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GCMService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GCMServicePtr extends Ptr<GCMService, GCMServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GCMService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GCMService() {}
    protected GCMService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithConfig:")
    public native void start(GCMConfig config);
    @Method(selector = "teardown")
    public native void teardown();
    @Method(selector = "appDidReceiveMessage:")
    public native void appDidReceiveMessage(NSDictionary message);
    @Method(selector = "connectWithHandler:")
    public native void connect(@Block GCMServiceConnectionCallback handler);
    @Method(selector = "disconnect")
    public native void disconnect();
    @Method(selector = "sendMessage:to:withId:")
    public native void sendMessage(NSDictionary message, String to, String msgId);
    @Method(selector = "sendMessage:to:timeToLive:withId:")
    public native void sendMessage(NSDictionary message, String to, long ttl, String msgId);
    @Method(selector = "sharedInstance")
    public static native GCMService getSharedInstance();
    /*</methods>*/
}
