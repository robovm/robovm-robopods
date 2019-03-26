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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLLineStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLLineStyleLayerPtr extends Ptr<MGLLineStyleLayer, MGLLineStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLLineStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLLineStyleLayer() {}
    protected MGLLineStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLLineStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLLineStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "lineCap")
    public native NSExpression getLineCap();
    @Property(selector = "setLineCap:")
    public native void setLineCap(NSExpression v);
    @Property(selector = "lineJoin")
    public native NSExpression getLineJoin();
    @Property(selector = "setLineJoin:")
    public native void setLineJoin(NSExpression v);
    @Property(selector = "lineMiterLimit")
    public native NSExpression getLineMiterLimit();
    @Property(selector = "setLineMiterLimit:")
    public native void setLineMiterLimit(NSExpression v);
    @Property(selector = "lineRoundLimit")
    public native NSExpression getLineRoundLimit();
    @Property(selector = "setLineRoundLimit:")
    public native void setLineRoundLimit(NSExpression v);
    @Property(selector = "lineBlur")
    public native NSExpression getLineBlur();
    @Property(selector = "setLineBlur:")
    public native void setLineBlur(NSExpression v);
    @Property(selector = "lineBlurTransition")
    public native @ByVal MGLTransition getLineBlurTransition();
    @Property(selector = "setLineBlurTransition:")
    public native void setLineBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "lineColor")
    public native NSExpression getLineColor();
    @Property(selector = "setLineColor:")
    public native void setLineColor(NSExpression v);
    @Property(selector = "lineColorTransition")
    public native @ByVal MGLTransition getLineColorTransition();
    @Property(selector = "setLineColorTransition:")
    public native void setLineColorTransition(@ByVal MGLTransition v);
    @Property(selector = "lineDashPattern")
    public native NSExpression getLineDashPattern();
    @Property(selector = "setLineDashPattern:")
    public native void setLineDashPattern(NSExpression v);
    @Property(selector = "lineDashPatternTransition")
    public native @ByVal MGLTransition getLineDashPatternTransition();
    @Property(selector = "setLineDashPatternTransition:")
    public native void setLineDashPatternTransition(@ByVal MGLTransition v);
    @Property(selector = "lineGapWidth")
    public native NSExpression getLineGapWidth();
    @Property(selector = "setLineGapWidth:")
    public native void setLineGapWidth(NSExpression v);
    @Property(selector = "lineGapWidthTransition")
    public native @ByVal MGLTransition getLineGapWidthTransition();
    @Property(selector = "setLineGapWidthTransition:")
    public native void setLineGapWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "lineGradient")
    public native NSExpression getLineGradient();
    @Property(selector = "setLineGradient:")
    public native void setLineGradient(NSExpression v);
    @Property(selector = "lineOffset")
    public native NSExpression getLineOffset();
    @Property(selector = "setLineOffset:")
    public native void setLineOffset(NSExpression v);
    @Property(selector = "lineOffsetTransition")
    public native @ByVal MGLTransition getLineOffsetTransition();
    @Property(selector = "setLineOffsetTransition:")
    public native void setLineOffsetTransition(@ByVal MGLTransition v);
    @Property(selector = "lineOpacity")
    public native NSExpression getLineOpacity();
    @Property(selector = "setLineOpacity:")
    public native void setLineOpacity(NSExpression v);
    @Property(selector = "lineOpacityTransition")
    public native @ByVal MGLTransition getLineOpacityTransition();
    @Property(selector = "setLineOpacityTransition:")
    public native void setLineOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "linePattern")
    public native NSExpression getLinePattern();
    @Property(selector = "setLinePattern:")
    public native void setLinePattern(NSExpression v);
    @Property(selector = "linePatternTransition")
    public native @ByVal MGLTransition getLinePatternTransition();
    @Property(selector = "setLinePatternTransition:")
    public native void setLinePatternTransition(@ByVal MGLTransition v);
    @Property(selector = "lineTranslation")
    public native NSExpression getLineTranslation();
    @Property(selector = "setLineTranslation:")
    public native void setLineTranslation(NSExpression v);
    @Property(selector = "lineTranslationTransition")
    public native @ByVal MGLTransition getLineTranslationTransition();
    @Property(selector = "setLineTranslationTransition:")
    public native void setLineTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "lineTranslationAnchor")
    public native NSExpression getLineTranslationAnchor();
    @Property(selector = "setLineTranslationAnchor:")
    public native void setLineTranslationAnchor(NSExpression v);
    @Property(selector = "lineWidth")
    public native NSExpression getLineWidth();
    @Property(selector = "setLineWidth:")
    public native void setLineWidth(NSExpression v);
    @Property(selector = "lineWidthTransition")
    public native @ByVal MGLTransition getLineWidthTransition();
    @Property(selector = "setLineWidthTransition:")
    public native void setLineWidthTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
