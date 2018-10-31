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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLStyleFunction/*</name>*/ <T extends NSObject>
    extends /*<extends>*/MGLStyleValue/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLStyleFunctionPtr extends Ptr<MGLStyleFunction, MGLStyleFunctionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLStyleFunction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLStyleFunction() {}
    protected MGLStyleFunction(Handle h, long handle) { super(h, handle); }
    protected MGLStyleFunction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInterpolationBase:stops:")
    public MGLStyleFunction(@MachineSizedFloat double interpolationBase, NSDictionary<NSNumber, MGLStyleValue<T>> stops) { super((SkipInit) null); initObject(init(interpolationBase, stops)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "interpolationMode")
    public native MGLInterpolationMode getInterpolationMode();
    @Property(selector = "setInterpolationMode:")
    public native void setInterpolationMode(MGLInterpolationMode v);
    @Property(selector = "stops")
    public native NSDictionary<NSNumber, MGLStyleValue<T>> getStops();
    @Property(selector = "setStops:")
    public native void setStops(NSDictionary<NSNumber, MGLStyleValue<T>> v);
    @Property(selector = "interpolationBase")
    public native @MachineSizedFloat double getInterpolationBase();
    @Property(selector = "setInterpolationBase:")
    public native void setInterpolationBase(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLStyleFunctionOptionInterpolationBase", optional=true)
    public static native Option InterpolationBase();
    @GlobalValue(symbol="MGLStyleFunctionOptionDefaultValue", optional=true)
    public static native Option DefaultValue();
    
    @Method(selector = "initWithInterpolationBase:stops:")
    protected native @Pointer long init(@MachineSizedFloat double interpolationBase, NSDictionary<NSNumber, MGLStyleValue<T>> stops);
    @Method(selector = "functionWithStops:")
    public static native <U extends NSObject> MGLStyleFunction<U> function(NSDictionary<NSNumber, MGLStyleValue<U>> stops);
    @Method(selector = "functionWithInterpolationBase:stops:")
    public static native <U extends NSObject> MGLStyleFunction<U> function(@MachineSizedFloat double interpolationBase, NSDictionary<NSNumber, MGLStyleValue<U>> stops);
    /*</methods>*/
    public abstract static class Option extends NSObject {
    }
}
