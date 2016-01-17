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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Crashlytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CrashlyticsPtr extends Ptr<Crashlytics, CrashlyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Crashlytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Crashlytics() {}
    protected Crashlytics(Handle h, long handle) { super(h, handle); }
    protected Crashlytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "APIKey")
    public native String getAPIKey();
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "debugMode")
    public native boolean isDebugMode();
    @Property(selector = "setDebugMode:")
    public native void setDebugMode(boolean v);
    @Property(selector = "delegate")
    public native CrashlyticsDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(CrashlyticsDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setObject(String key, NSObject value) {
        setObject0(value, key);
    }
    public void setString(String key, String value) {
        setObject0(new NSString(value), key);
    }
    public void setInt(String key, int value) {
        setInt0(value, key);
    }
    public void setBool(String key, boolean value) {
        setBool0(value, key);
    }
    public void setFloat(String key, float value) {
        setFloat0(value, key);
    }
    
    public static Crashlytics start(String apiKey, CrashlyticsDelegate delegate) {
        Crashlytics result = start0(apiKey, delegate);
        result.addStrongRef(delegate);
        return result;
    }
    /*<methods>*/
    @Method(selector = "crash")
    public native void crash();
    @Method(selector = "throwException")
    public native void throwException();
    @Method(selector = "setUserIdentifier:")
    public native void setUserIdentifier(String identifier);
    @Method(selector = "setUserName:")
    public native void setUserName(String name);
    @Method(selector = "setUserEmail:")
    public native void setUserEmail(String email);
    @Method(selector = "setObjectValue:forKey:")
    private native void setObject0(NSObject value, String key);
    @Method(selector = "setIntValue:forKey:")
    private native void setInt0(int value, String key);
    @Method(selector = "setBoolValue:forKey:")
    private native void setBool0(boolean value, String key);
    @Method(selector = "setFloatValue:forKey:")
    private native void setFloat0(float value, String key);
    @Method(selector = "recordCustomExceptionName:reason:frameArray:")
    public native void recordCustomException(String name, String reason, NSArray<CLSStackFrame> frameArray);
    @Method(selector = "recordError:")
    public native void recordError(NSError error);
    @Method(selector = "recordError:withAdditionalUserInfo:")
    public native void recordError(NSError error, NSDictionary<NSString, ?> userInfo);
    @Method(selector = "startWithAPIKey:")
    public static native Crashlytics start(String apiKey);
    @Method(selector = "startWithAPIKey:delegate:")
    private static native Crashlytics start0(String apiKey, CrashlyticsDelegate delegate);
    @Method(selector = "sharedInstance")
    public static native Crashlytics getSharedInstance();
    /*</methods>*/
}
