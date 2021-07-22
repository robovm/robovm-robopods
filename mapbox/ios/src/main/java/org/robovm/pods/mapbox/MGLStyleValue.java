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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLStyleValue/*</name>*/ <T extends NSObject>
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLStyleValuePtr extends Ptr<MGLStyleValue, MGLStyleValuePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLStyleValue.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLStyleValue() {}
    protected MGLStyleValue(Handle h, long handle) { super(h, handle); }
    protected MGLStyleValue(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "valueWithRawValue:")
    public static native <U extends NSObject> MGLStyleValue<U> value(U rawValue);
    @Method(selector = "valueWithStops:")
    public static native <U extends NSObject> MGLStyleValue<U> value(NSDictionary<NSNumber, MGLStyleValue<U>> stops);
    @Method(selector = "valueWithInterpolationBase:stops:")
    public static native <U extends NSObject> MGLStyleValue<U> value(@MachineSizedFloat double interpolationBase, NSDictionary<NSNumber, MGLStyleValue<U>> stops);
    @Method(selector = "valueWithInterpolationMode:cameraStops:options:")
    public static native <U extends NSObject> MGLStyleValue<U> value(MGLInterpolationMode interpolationMode, NSDictionary<?, MGLStyleValue<U>> cameraStops, NSDictionary<MGLStyleFunction.Option, ?> options);
    @Method(selector = "valueWithInterpolationMode:sourceStops:attributeName:options:")
    public static native <U extends NSObject> MGLStyleValue<U> value(MGLInterpolationMode interpolationMode, NSDictionary<?, MGLStyleValue<U>> sourceStops, String attributeName, NSDictionary<MGLStyleFunction.Option, ?> options);
    @Method(selector = "valueWithInterpolationMode:compositeStops:attributeName:options:")
    public static native <U extends NSObject> MGLStyleValue<U> compositeValue(MGLInterpolationMode interpolationMode, NSDictionary<?, MGLStyleValue<U>> cameraStops, String attributeName, NSDictionary<MGLStyleFunction.Option, ?> options);
    /*</methods>*/
}
