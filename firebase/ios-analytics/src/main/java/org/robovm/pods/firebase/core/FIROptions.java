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
package org.robovm.pods.firebase.core;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIROptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIROptionsPtr extends Ptr<FIROptions, FIROptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIROptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIROptions() {}
    protected FIROptions(Handle h, long handle) { super(h, handle); }
    protected FIROptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContentsOfFile:")
    public FIROptions(String plistPath) { super((SkipInit) null); initObject(init(plistPath)); }
    @Method(selector = "initWithGoogleAppID:GCMSenderID:")
    public FIROptions(String googleAppID, String GCMSenderID) { super((SkipInit) null); initObject(init(googleAppID, GCMSenderID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "APIKey")
    public native String getAPIKey();
    @Property(selector = "setAPIKey:")
    public native void setAPIKey(String v);
    @Property(selector = "bundleID")
    public native String getBundleID();
    @Property(selector = "setBundleID:")
    public native void setBundleID(String v);
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "setClientID:")
    public native void setClientID(String v);
    @Property(selector = "trackingID")
    public native String getTrackingID();
    @Property(selector = "setTrackingID:")
    public native void setTrackingID(String v);
    @Property(selector = "GCMSenderID")
    public native String getGCMSenderID();
    @Property(selector = "setGCMSenderID:")
    public native void setGCMSenderID(String v);
    @Property(selector = "projectID")
    public native String getProjectID();
    @Property(selector = "setProjectID:")
    public native void setProjectID(String v);
    @Property(selector = "androidClientID")
    public native String getAndroidClientID();
    @Property(selector = "setAndroidClientID:")
    public native void setAndroidClientID(String v);
    @Property(selector = "googleAppID")
    public native String getGoogleAppID();
    @Property(selector = "setGoogleAppID:")
    public native void setGoogleAppID(String v);
    @Property(selector = "databaseURL")
    public native String getDatabaseURL();
    @Property(selector = "setDatabaseURL:")
    public native void setDatabaseURL(String v);
    @Property(selector = "deepLinkURLScheme")
    public native String getDeepLinkURLScheme();
    @Property(selector = "setDeepLinkURLScheme:")
    public native void setDeepLinkURLScheme(String v);
    @Property(selector = "storageBucket")
    public native String getStorageBucket();
    @Property(selector = "setStorageBucket:")
    public native void setStorageBucket(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContentsOfFile:")
    protected native @Pointer long init(String plistPath);
    @Method(selector = "initWithGoogleAppID:GCMSenderID:")
    protected native @Pointer long init(String googleAppID, String GCMSenderID);
    @Method(selector = "defaultOptions")
    public static native FIROptions defaultOptions();
    /*</methods>*/
}
