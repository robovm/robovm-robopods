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
package org.robovm.pods.mapbox;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLConstantStyleValue/*</name>*/  <T extends NSObject>
    extends /*<extends>*/MGLStyleValue/*</extends>*/<T>
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLConstantStyleValuePtr extends Ptr<MGLConstantStyleValue, MGLConstantStyleValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLConstantStyleValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLConstantStyleValue() {}
    protected MGLConstantStyleValue(Handle h, long handle) { super(h, handle); }
    protected MGLConstantStyleValue(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRawValue:")
    public MGLConstantStyleValue(NSObject rawValue) { super((SkipInit) null); initObject(initWithRawValue(rawValue)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rawValue")
    public native NSObject getRawValue();
    @Property(selector = "setRawValue:")
    public native void setRawValue(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRawValue:")
    protected native @Pointer long initWithRawValue(NSObject rawValue);
    @Method(selector = "valueWithRawValue:")
    public static native <U extends NSObject> MGLConstantStyleValue<U> value(U rawValue);
    /*</methods>*/
}
