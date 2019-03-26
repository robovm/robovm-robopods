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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLHillshadeStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLForegroundStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLHillshadeStyleLayerPtr extends Ptr<MGLHillshadeStyleLayer, MGLHillshadeStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLHillshadeStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLHillshadeStyleLayer() {}
    protected MGLHillshadeStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLHillshadeStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLHillshadeStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "hillshadeAccentColor")
    public native NSExpression getHillshadeAccentColor();
    @Property(selector = "setHillshadeAccentColor:")
    public native void setHillshadeAccentColor(NSExpression v);
    @Property(selector = "hillshadeAccentColorTransition")
    public native @ByVal MGLTransition getHillshadeAccentColorTransition();
    @Property(selector = "setHillshadeAccentColorTransition:")
    public native void setHillshadeAccentColorTransition(@ByVal MGLTransition v);
    @Property(selector = "hillshadeExaggeration")
    public native NSExpression getHillshadeExaggeration();
    @Property(selector = "setHillshadeExaggeration:")
    public native void setHillshadeExaggeration(NSExpression v);
    @Property(selector = "hillshadeExaggerationTransition")
    public native @ByVal MGLTransition getHillshadeExaggerationTransition();
    @Property(selector = "setHillshadeExaggerationTransition:")
    public native void setHillshadeExaggerationTransition(@ByVal MGLTransition v);
    @Property(selector = "hillshadeHighlightColor")
    public native NSExpression getHillshadeHighlightColor();
    @Property(selector = "setHillshadeHighlightColor:")
    public native void setHillshadeHighlightColor(NSExpression v);
    @Property(selector = "hillshadeHighlightColorTransition")
    public native @ByVal MGLTransition getHillshadeHighlightColorTransition();
    @Property(selector = "setHillshadeHighlightColorTransition:")
    public native void setHillshadeHighlightColorTransition(@ByVal MGLTransition v);
    @Property(selector = "hillshadeIlluminationAnchor")
    public native NSExpression getHillshadeIlluminationAnchor();
    @Property(selector = "setHillshadeIlluminationAnchor:")
    public native void setHillshadeIlluminationAnchor(NSExpression v);
    @Property(selector = "hillshadeIlluminationDirection")
    public native NSExpression getHillshadeIlluminationDirection();
    @Property(selector = "setHillshadeIlluminationDirection:")
    public native void setHillshadeIlluminationDirection(NSExpression v);
    @Property(selector = "hillshadeShadowColor")
    public native NSExpression getHillshadeShadowColor();
    @Property(selector = "setHillshadeShadowColor:")
    public native void setHillshadeShadowColor(NSExpression v);
    @Property(selector = "hillshadeShadowColorTransition")
    public native @ByVal MGLTransition getHillshadeShadowColorTransition();
    @Property(selector = "setHillshadeShadowColorTransition:")
    public native void setHillshadeShadowColorTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
