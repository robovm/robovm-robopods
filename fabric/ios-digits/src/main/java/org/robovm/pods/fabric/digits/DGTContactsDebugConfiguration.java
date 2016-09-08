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
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTContactsDebugConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTContactsDebugConfigurationPtr extends Ptr<DGTContactsDebugConfiguration, DGTContactsDebugConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTContactsDebugConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTContactsDebugConfiguration() {}
    protected DGTContactsDebugConfiguration(Handle h, long handle) { super(h, handle); }
    protected DGTContactsDebugConfiguration(SkipInit skipInit) { super(skipInit); }
    public DGTContactsDebugConfiguration(NSArray<DGTUser> contacts) { super((SkipInit) null); initObject(init(contacts)); }
    public DGTContactsDebugConfiguration(DGTErrorCode error) { super((SkipInit) null); initObject(init(error)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initSuccessStateWithContacts:")
    protected native @Pointer long init(NSArray<DGTUser> contacts);
    @Method(selector = "initErrorStateWithDigitsError:")
    protected native @Pointer long init(DGTErrorCode error);
    @Method(selector = "stubbedContactsWithDigitsUserIDs:")
    public static native NSArray<DGTUser> getStubbedContacts(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> digitsUserIDs);
    /*</methods>*/
}
