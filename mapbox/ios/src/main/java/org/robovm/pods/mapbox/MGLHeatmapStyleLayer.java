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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLHeatmapStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLHeatmapStyleLayerPtr extends Ptr<MGLHeatmapStyleLayer, MGLHeatmapStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLHeatmapStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLHeatmapStyleLayer() {}
    protected MGLHeatmapStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLHeatmapStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLHeatmapStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "heatmapColor")
    public native NSExpression getHeatmapColor();
    @Property(selector = "setHeatmapColor:")
    public native void setHeatmapColor(NSExpression v);
    @Property(selector = "heatmapIntensity")
    public native NSExpression getHeatmapIntensity();
    @Property(selector = "setHeatmapIntensity:")
    public native void setHeatmapIntensity(NSExpression v);
    @Property(selector = "heatmapIntensityTransition")
    public native @ByVal MGLTransition getHeatmapIntensityTransition();
    @Property(selector = "setHeatmapIntensityTransition:")
    public native void setHeatmapIntensityTransition(@ByVal MGLTransition v);
    @Property(selector = "heatmapOpacity")
    public native NSExpression getHeatmapOpacity();
    @Property(selector = "setHeatmapOpacity:")
    public native void setHeatmapOpacity(NSExpression v);
    @Property(selector = "heatmapOpacityTransition")
    public native @ByVal MGLTransition getHeatmapOpacityTransition();
    @Property(selector = "setHeatmapOpacityTransition:")
    public native void setHeatmapOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "heatmapRadius")
    public native NSExpression getHeatmapRadius();
    @Property(selector = "setHeatmapRadius:")
    public native void setHeatmapRadius(NSExpression v);
    @Property(selector = "heatmapRadiusTransition")
    public native @ByVal MGLTransition getHeatmapRadiusTransition();
    @Property(selector = "setHeatmapRadiusTransition:")
    public native void setHeatmapRadiusTransition(@ByVal MGLTransition v);
    @Property(selector = "heatmapWeight")
    public native NSExpression getHeatmapWeight();
    @Property(selector = "setHeatmapWeight:")
    public native void setHeatmapWeight(NSExpression v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
