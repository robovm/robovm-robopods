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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLUserLocationAnnotationViewStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLUserLocationAnnotationViewStylePtr extends Ptr<MGLUserLocationAnnotationViewStyle, MGLUserLocationAnnotationViewStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLUserLocationAnnotationViewStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLUserLocationAnnotationViewStyle() {}
    protected MGLUserLocationAnnotationViewStyle(Handle h, long handle) { super(h, handle); }
    protected MGLUserLocationAnnotationViewStyle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "puckFillColor")
    public native UIColor getPuckFillColor();
    @Property(selector = "setPuckFillColor:")
    public native void setPuckFillColor(UIColor v);
    @Property(selector = "puckShadowColor")
    public native UIColor getPuckShadowColor();
    @Property(selector = "setPuckShadowColor:")
    public native void setPuckShadowColor(UIColor v);
    @Property(selector = "puckShadowOpacity")
    public native @MachineSizedFloat double getPuckShadowOpacity();
    @Property(selector = "setPuckShadowOpacity:")
    public native void setPuckShadowOpacity(@MachineSizedFloat double v);
    @Property(selector = "puckArrowFillColor")
    public native UIColor getPuckArrowFillColor();
    @Property(selector = "setPuckArrowFillColor:")
    public native void setPuckArrowFillColor(UIColor v);
    @Property(selector = "haloFillColor")
    public native UIColor getHaloFillColor();
    @Property(selector = "setHaloFillColor:")
    public native void setHaloFillColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
