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
package org.robovm.pods.fabric.crashlytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSReport/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CLSCrashReport/*</implements>*/ {

    /*<ptr>*/public static class CLSReportPtr extends Ptr<CLSReport, CLSReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSReport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLSReport() {}
    protected CLSReport(Handle h, long handle) { super(h, handle); }
    protected CLSReport(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "customKeys")
    public native NSDictionary<?, ?> getCustomKeys();
    @Property(selector = "bundleVersion")
    public native String getBundleVersion();
    @Property(selector = "bundleShortVersionString")
    public native String getBundleShortVersionString();
    @Property(selector = "dateCreated")
    public native NSDate getDateCreated();
    @Property(selector = "OSVersion")
    public native String getOSVersion();
    @Property(selector = "OSBuildVersion")
    public native String getOSBuildVersion();
    @Property(selector = "isCrash")
    public native boolean isCrash();
    @Property(selector = "userIdentifier")
    public native String getUserIdentifier();
    @Property(selector = "setUserIdentifier:")
    public native void setUserIdentifier(String v);
    @Property(selector = "userName")
    public native String getUserName();
    @Property(selector = "setUserName:")
    public native void setUserName(String v);
    @Property(selector = "userEmail")
    public native String getUserEmail();
    @Property(selector = "setUserEmail:")
    public native void setUserEmail(String v);
    @Property(selector = "crashedOnDate")
    public native NSDate getCrashedOnDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    public void put(String key, boolean value) {
        put0(NSNumber.valueOf(value), key);
    }
    public void put(String key, int value) {
        put0(NSNumber.valueOf(value), key);
    }
    public void put(String key, float value) {
        put0(NSNumber.valueOf(value), key);
    }
    public void put(String key, String value) {
        put0(new NSString(value), key);
    }
    public void put(String key, NSObject value) {
        put0(value, key);
    }
    /*<methods>*/
    @Method(selector = "setObjectValue:forKey:")
    private native void put0(NSObject value, String key);
    /*</methods>*/
}
