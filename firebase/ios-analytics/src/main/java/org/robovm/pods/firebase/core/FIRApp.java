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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRApp/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRAppPtr extends Ptr<FIRApp, FIRAppPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRApp.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FIRApp() {}
    protected FIRApp(Handle h, long handle) { super(h, handle); }
    protected FIRApp(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "allApps")
    public static native NSDictionary<NSString, FIRApp> getAllApps();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "options")
    public native FIROptions getOptions();
    @Property(selector = "isDataCollectionDefaultEnabled")
    public native boolean isDataCollectionDefaultEnabled();
    @Property(selector = "setDataCollectionDefaultEnabled:")
    public native void setDataCollectionDefaultEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "deleteApp:")
    public native void deleteApp(@Block VoidBooleanBlock completion);
    @Method(selector = "configure")
    public static native void configure();
    @Method(selector = "configureWithOptions:")
    public static native void configure(FIROptions options);
    @Method(selector = "configureWithName:options:")
    public static native void configure(String name, FIROptions options);
    @Method(selector = "defaultApp")
    public static native FIRApp defaultApp();
    @Method(selector = "appNamed:")
    public static native FIRApp app(String name);
    /*</methods>*/
}
