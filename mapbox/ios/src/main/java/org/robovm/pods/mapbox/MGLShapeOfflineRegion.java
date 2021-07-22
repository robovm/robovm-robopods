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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLShapeOfflineRegion/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MGLOfflineRegion, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MGLShapeOfflineRegionPtr extends Ptr<MGLShapeOfflineRegion, MGLShapeOfflineRegionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLShapeOfflineRegion.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLShapeOfflineRegion() {}
    protected MGLShapeOfflineRegion(Handle h, long handle) { super(h, handle); }
    protected MGLShapeOfflineRegion(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyleURL:shape:fromZoomLevel:toZoomLevel:")
    public MGLShapeOfflineRegion(NSURL styleURL, MGLShape shape, double minimumZoomLevel, double maximumZoomLevel) { super((SkipInit) null); initObject(init(styleURL, shape, minimumZoomLevel, maximumZoomLevel)); }
    @Method(selector = "initWithCoder:")
    public MGLShapeOfflineRegion(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shape")
    public native MGLShape getShape();
    @Property(selector = "minimumZoomLevel")
    public native double getMinimumZoomLevel();
    @Property(selector = "maximumZoomLevel")
    public native double getMaximumZoomLevel();
    @Property(selector = "styleURL")
    public native NSURL getStyleURL();
    @Property(selector = "includesIdeographicGlyphs")
    public native boolean includesIdeographicGlyphs();
    @Property(selector = "setIncludesIdeographicGlyphs:")
    public native void setIncludesIdeographicGlyphs(boolean v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyleURL:shape:fromZoomLevel:toZoomLevel:")
    protected native @Pointer long init(NSURL styleURL, MGLShape shape, double minimumZoomLevel, double maximumZoomLevel);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
