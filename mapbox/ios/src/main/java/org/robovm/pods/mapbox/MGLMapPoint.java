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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapPoint/*</name>*/ 
    extends /*<extends>*/Struct<MGLMapPoint>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMapPointPtr extends Ptr<MGLMapPoint, MGLMapPointPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(MGLMapPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMapPoint() {}
    public MGLMapPoint(@MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double zoomLevel) {
        this.setX(x);
        this.setY(y);
        this.setZoomLevel(zoomLevel);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getX();
    @StructMember(0) public native MGLMapPoint setX(@MachineSizedFloat double x);
    @StructMember(1) public native @MachineSizedFloat double getY();
    @StructMember(1) public native MGLMapPoint setY(@MachineSizedFloat double y);
    @StructMember(2) public native @MachineSizedFloat double getZoomLevel();
    @StructMember(2) public native MGLMapPoint setZoomLevel(@MachineSizedFloat double zoomLevel);
    /*</members>*/
    /*<methods>*/
    @Bridge(symbol="MGLMapPointForCoordinate", optional=true)
    public static native @ByVal MGLMapPoint forCoordinate(@ByVal CLLocationCoordinate2D coordinate, double zoomLevel);
    /*</methods>*/
}
