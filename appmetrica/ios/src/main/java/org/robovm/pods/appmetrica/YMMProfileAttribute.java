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
package org.robovm.pods.appmetrica;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMMProfileAttribute/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMMProfileAttributePtr extends Ptr<YMMProfileAttribute, YMMProfileAttributePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMMProfileAttribute.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMMProfileAttribute() {}
    protected YMMProfileAttribute(Handle h, long handle) { super(h, handle); }
    protected YMMProfileAttribute(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "name")
    public static native YMMNameAttribute name();
    @Method(selector = "gender")
    public static native YMMGenderAttribute gender();
    @Method(selector = "birthDate")
    public static native YMMBirthDateAttribute birthDate();
    @Method(selector = "notificationsEnabled")
    public static native YMMNotificationsEnabledAttribute notificationsEnabled();
    @Method(selector = "customString:")
    public static native YMMCustomStringAttribute customString(String name);
    @Method(selector = "customNumber:")
    public static native YMMCustomNumberAttribute customNumber(String name);
    @Method(selector = "customCounter:")
    public static native YMMCustomCounterAttribute customCounter(String name);
    @Method(selector = "customBool:")
    public static native YMMCustomBoolAttribute customBool(String name);
    /*</methods>*/
}
