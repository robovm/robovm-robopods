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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLFillStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLFillStyleLayerPtr extends Ptr<MGLFillStyleLayer, MGLFillStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLFillStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLFillStyleLayer() {}
    protected MGLFillStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLFillStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLFillStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isFillAntialiased")
    public native NSExpression getFillAntialiased();
    @Property(selector = "setFillAntialiased:")
    public native void setFillAntialiased(NSExpression v);
    @Property(selector = "fillColor")
    public native NSExpression getFillColor();
    @Property(selector = "setFillColor:")
    public native void setFillColor(NSExpression v);
    @Property(selector = "fillColorTransition")
    public native @ByVal MGLTransition getFillColorTransition();
    @Property(selector = "setFillColorTransition:")
    public native void setFillColorTransition(@ByVal MGLTransition v);
    @Property(selector = "fillOpacity")
    public native NSExpression getFillOpacity();
    @Property(selector = "setFillOpacity:")
    public native void setFillOpacity(NSExpression v);
    @Property(selector = "fillOpacityTransition")
    public native @ByVal MGLTransition getFillOpacityTransition();
    @Property(selector = "setFillOpacityTransition:")
    public native void setFillOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "fillOutlineColor")
    public native NSExpression getFillOutlineColor();
    @Property(selector = "setFillOutlineColor:")
    public native void setFillOutlineColor(NSExpression v);
    @Property(selector = "fillOutlineColorTransition")
    public native @ByVal MGLTransition getFillOutlineColorTransition();
    @Property(selector = "setFillOutlineColorTransition:")
    public native void setFillOutlineColorTransition(@ByVal MGLTransition v);
    @Property(selector = "fillPattern")
    public native NSExpression getFillPattern();
    @Property(selector = "setFillPattern:")
    public native void setFillPattern(NSExpression v);
    @Property(selector = "fillPatternTransition")
    public native @ByVal MGLTransition getFillPatternTransition();
    @Property(selector = "setFillPatternTransition:")
    public native void setFillPatternTransition(@ByVal MGLTransition v);
    @Property(selector = "fillTranslation")
    public native NSExpression getFillTranslation();
    @Property(selector = "setFillTranslation:")
    public native void setFillTranslation(NSExpression v);
    @Property(selector = "fillTranslationTransition")
    public native @ByVal MGLTransition getFillTranslationTransition();
    @Property(selector = "setFillTranslationTransition:")
    public native void setFillTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "fillTranslationAnchor")
    public native NSExpression getFillTranslationAnchor();
    @Property(selector = "setFillTranslationAnchor:")
    public native void setFillTranslationAnchor(NSExpression v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
