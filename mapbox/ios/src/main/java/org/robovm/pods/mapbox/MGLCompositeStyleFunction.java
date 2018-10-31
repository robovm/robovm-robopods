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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLCompositeStyleFunction/*</name>*/  <T extends NSObject>
    extends /*<extends>*/MGLStyleFunction/*</extends>*/ <T>
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLCompositeStyleFunctionPtr extends Ptr<MGLCompositeStyleFunction, MGLCompositeStyleFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLCompositeStyleFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLCompositeStyleFunction() {}
    protected MGLCompositeStyleFunction(Handle h, long handle) { super(h, handle); }
    protected MGLCompositeStyleFunction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "attributeName")
    public native String getAttributeName();
    @Property(selector = "setAttributeName:")
    public native void setAttributeName(String v);
    @Property(selector = "stops")
    public native NSDictionary<NSNumber, MGLStyleValue<T>> getStops();
    @Property(selector = "setStops:")
    public native void setStops(NSDictionary<NSNumber, MGLStyleValue<T>> v);
    @Property(selector = "defaultValue")
    public native MGLStyleValue getDefaultValue();
    @Property(selector = "setDefaultValue:")
    public native void setDefaultValue(MGLStyleValue v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "functionWithInterpolationMode:stops:attributeName:options:")
    public static native <U extends NSObject> MGLCompositeStyleFunction<U> function(MGLInterpolationMode interpolationMode, NSDictionary<?, MGLStyleValue<U>> stops, String attributeName, NSDictionary<MGLStyleFunction.Option, ?> options);
    /*</methods>*/
}
