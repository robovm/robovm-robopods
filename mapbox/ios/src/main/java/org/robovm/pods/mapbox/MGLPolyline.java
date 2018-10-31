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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLPolyline/*</name>*/ 
    extends /*<extends>*/MGLMultiPoint/*</extends>*/ 
    /*<implements>*/implements MGLOverlay/*</implements>*/ {

    /*<ptr>*/public static class MGLPolylinePtr extends Ptr<MGLPolyline, MGLPolylinePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLPolyline.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLPolyline() {}
    protected MGLPolyline(Handle h, long handle) { super(h, handle); }
    protected MGLPolyline(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "coordinate")
    public native @ByVal CLLocationCoordinate2D getCoordinate();
    @Property(selector = "overlayBounds")
    public native @ByVal MGLCoordinateBounds getOverlayBounds();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "polylineWithCoordinates:count:")
    protected static native MGLPolyline nativePolyline(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "intersectsOverlayBounds:")
    public native boolean intersectsOverlayBounds(@ByVal MGLCoordinateBounds overlayBounds);
    /*</methods>*/

    public static MGLPolyline polyLine(CLLocationCoordinate2D[] coords) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        value.update(coords);
        return nativePolyline(value, coords.length);
    }
}
