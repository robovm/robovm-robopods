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
package org.robovm.pods.google.opensource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLObjectPtr extends Ptr<GTLObject, GTLObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLObject() {}
    protected GTLObject(Handle h, long handle) { super(h, handle); }
    protected GTLObject(SkipInit skipInit) { super(skipInit); }
    public GTLObject(NSMutableDictionary<?, ?> dict) { super((Handle) null, create(dict)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "JSON")
    public native NSMutableDictionary<?, ?> getJSON();
    @Property(selector = "setJSON:")
    public native void setJSON(NSMutableDictionary<?, ?> v);
    @Property(selector = "surrogates")
    public native NSDictionary<?, ?> getSurrogates();
    @Property(selector = "setSurrogates:")
    public native void setSurrogates(NSDictionary<?, ?> v);
    @Property(selector = "userProperties")
    public native NSMutableDictionary<?, ?> getUserProperties();
    @Property(selector = "setUserProperties:")
    public native void setUserProperties(NSMutableDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "copyWithZone:")
    public native NSObject copy(NSZone zone);
    @Method(selector = "JSONString")
    public native String getJSONString();
    @Method(selector = "setJSONValue:forKey:")
    private native void setJSONValue0(NSObject obj, String key);
    @Method(selector = "JSONValueForKey:")
    public native NSObject getJSONValue(String key);
    @Method(selector = "additionalJSONKeys")
    public native List<String> getAdditionalJSONKeys();
    @Method(selector = "additionalPropertyForName:")
    public native NSObject getAdditionalProperty(String name);
    @Method(selector = "setAdditionalProperty:forName:")
    private native void setAdditionalProperty0(NSObject obj, String name);
    @Method(selector = "additionalProperties")
    public native NSDictionary<?, ?> getAdditionalProperties();
    @Method(selector = "setProperty:forKey:")
    private native void setProperty0(NSObject obj, String key);
    @Method(selector = "propertyForKey:")
    public native NSObject getProperty(String key);
    @Method(selector = "setUserData:")
    public native void setUserData(NSObject obj);
    @Method(selector = "userData")
    public native NSObject getUserData();
    @Method(selector = "fieldsDescription")
    public native String getFieldsDescription();
    @Method(selector = "patchObjectFromOriginal:")
    public native NSObject getPatchObject(GTLObject original);
    @Method(selector = "objectWithJSON:")
    protected static native @Pointer long create(NSMutableDictionary<?, ?> dict);
    @Method(selector = "nullValue")
    public static native NSObject getNullValue();
    /*</methods>*/
}
