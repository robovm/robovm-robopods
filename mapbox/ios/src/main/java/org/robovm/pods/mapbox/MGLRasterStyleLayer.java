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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLRasterStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLForegroundStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLRasterStyleLayerPtr extends Ptr<MGLRasterStyleLayer, MGLRasterStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLRasterStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLRasterStyleLayer() {}
    protected MGLRasterStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLRasterStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLRasterStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maximumRasterBrightness")
    public native NSExpression getMaximumRasterBrightness();
    @Property(selector = "setMaximumRasterBrightness:")
    public native void setMaximumRasterBrightness(NSExpression v);
    @Property(selector = "maximumRasterBrightnessTransition")
    public native @ByVal MGLTransition getMaximumRasterBrightnessTransition();
    @Property(selector = "setMaximumRasterBrightnessTransition:")
    public native void setMaximumRasterBrightnessTransition(@ByVal MGLTransition v);
    @Property(selector = "minimumRasterBrightness")
    public native NSExpression getMinimumRasterBrightness();
    @Property(selector = "setMinimumRasterBrightness:")
    public native void setMinimumRasterBrightness(NSExpression v);
    @Property(selector = "minimumRasterBrightnessTransition")
    public native @ByVal MGLTransition getMinimumRasterBrightnessTransition();
    @Property(selector = "setMinimumRasterBrightnessTransition:")
    public native void setMinimumRasterBrightnessTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterContrast")
    public native NSExpression getRasterContrast();
    @Property(selector = "setRasterContrast:")
    public native void setRasterContrast(NSExpression v);
    @Property(selector = "rasterContrastTransition")
    public native @ByVal MGLTransition getRasterContrastTransition();
    @Property(selector = "setRasterContrastTransition:")
    public native void setRasterContrastTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterFadeDuration")
    public native NSExpression getRasterFadeDuration();
    @Property(selector = "setRasterFadeDuration:")
    public native void setRasterFadeDuration(NSExpression v);
    @Property(selector = "rasterHueRotation")
    public native NSExpression getRasterHueRotation();
    @Property(selector = "setRasterHueRotation:")
    public native void setRasterHueRotation(NSExpression v);
    @Property(selector = "rasterHueRotationTransition")
    public native @ByVal MGLTransition getRasterHueRotationTransition();
    @Property(selector = "setRasterHueRotationTransition:")
    public native void setRasterHueRotationTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterOpacity")
    public native NSExpression getRasterOpacity();
    @Property(selector = "setRasterOpacity:")
    public native void setRasterOpacity(NSExpression v);
    @Property(selector = "rasterOpacityTransition")
    public native @ByVal MGLTransition getRasterOpacityTransition();
    @Property(selector = "setRasterOpacityTransition:")
    public native void setRasterOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "rasterResamplingMode")
    public native NSExpression getRasterResamplingMode();
    @Property(selector = "setRasterResamplingMode:")
    public native void setRasterResamplingMode(NSExpression v);
    @Property(selector = "rasterSaturation")
    public native NSExpression getRasterSaturation();
    @Property(selector = "setRasterSaturation:")
    public native void setRasterSaturation(NSExpression v);
    @Property(selector = "rasterSaturationTransition")
    public native @ByVal MGLTransition getRasterSaturationTransition();
    @Property(selector = "setRasterSaturationTransition:")
    public native void setRasterSaturationTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
