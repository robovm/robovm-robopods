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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLBackgroundStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLBackgroundStyleLayerPtr extends Ptr<MGLBackgroundStyleLayer, MGLBackgroundStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLBackgroundStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLBackgroundStyleLayer() {}
    protected MGLBackgroundStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLBackgroundStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public MGLBackgroundStyleLayer(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundColor")
    public native NSExpression getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(NSExpression v);
    @Property(selector = "backgroundColorTransition")
    public native @ByVal MGLTransition getBackgroundColorTransition();
    @Property(selector = "setBackgroundColorTransition:")
    public native void setBackgroundColorTransition(@ByVal MGLTransition v);
    @Property(selector = "backgroundOpacity")
    public native NSExpression getBackgroundOpacity();
    @Property(selector = "setBackgroundOpacity:")
    public native void setBackgroundOpacity(NSExpression v);
    @Property(selector = "backgroundOpacityTransition")
    public native @ByVal MGLTransition getBackgroundOpacityTransition();
    @Property(selector = "setBackgroundOpacityTransition:")
    public native void setBackgroundOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "backgroundPattern")
    public native NSExpression getBackgroundPattern();
    @Property(selector = "setBackgroundPattern:")
    public native void setBackgroundPattern(NSExpression v);
    @Property(selector = "backgroundPatternTransition")
    public native @ByVal MGLTransition getBackgroundPatternTransition();
    @Property(selector = "setBackgroundPatternTransition:")
    public native void setBackgroundPatternTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:")
    protected native @Pointer long init(String identifier);
    /*</methods>*/
}
