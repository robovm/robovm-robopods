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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLLight/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLLightPtr extends Ptr<MGLLight, MGLLightPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLLight.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLLight() {}
    protected MGLLight(Handle h, long handle) { super(h, handle); }
    protected MGLLight(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "anchor")
    public native NSExpression getAnchor();
    @Property(selector = "setAnchor:")
    public native void setAnchor(NSExpression v);
    @Property(selector = "position")
    public native NSExpression getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(NSExpression v);
    @Property(selector = "positionTransition")
    public native @ByVal MGLTransition getPositionTransition();
    @Property(selector = "setPositionTransition:")
    public native void setPositionTransition(@ByVal MGLTransition v);
    @Property(selector = "color")
    public native NSExpression getColor();
    @Property(selector = "setColor:")
    public native void setColor(NSExpression v);
    @Property(selector = "colorTransition")
    public native @ByVal MGLTransition getColorTransition();
    @Property(selector = "setColorTransition:")
    public native void setColorTransition(@ByVal MGLTransition v);
    @Property(selector = "intensity")
    public native NSExpression getIntensity();
    @Property(selector = "setIntensity:")
    public native void setIntensity(NSExpression v);
    @Property(selector = "intensityTransition")
    public native @ByVal MGLTransition getIntensityTransition();
    @Property(selector = "setIntensityTransition:")
    public native void setIntensityTransition(@ByVal MGLTransition v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
