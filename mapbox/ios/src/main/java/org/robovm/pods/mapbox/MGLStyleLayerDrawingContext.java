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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLStyleLayerDrawingContext/*</name>*/ 
    extends /*<extends>*/Struct<MGLStyleLayerDrawingContext>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLStyleLayerDrawingContextPtr extends Ptr<MGLStyleLayerDrawingContext, MGLStyleLayerDrawingContextPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLStyleLayerDrawingContext() {}
    public MGLStyleLayerDrawingContext(CGSize size, CLLocationCoordinate2D centerCoordinate, double zoomLevel, double direction, @MachineSizedFloat double pitch, @MachineSizedFloat double fieldOfView, MGLMatrix4 projectionMatrix) {
        this.setSize(size);
        this.setCenterCoordinate(centerCoordinate);
        this.setZoomLevel(zoomLevel);
        this.setDirection(direction);
        this.setPitch(pitch);
        this.setFieldOfView(fieldOfView);
        this.setProjectionMatrix(projectionMatrix);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal CGSize getSize();
    @StructMember(0) public native MGLStyleLayerDrawingContext setSize(@ByVal CGSize size);
    @StructMember(1) public native @ByVal CLLocationCoordinate2D getCenterCoordinate();
    @StructMember(1) public native MGLStyleLayerDrawingContext setCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate);
    @StructMember(2) public native double getZoomLevel();
    @StructMember(2) public native MGLStyleLayerDrawingContext setZoomLevel(double zoomLevel);
    @StructMember(3) public native double getDirection();
    @StructMember(3) public native MGLStyleLayerDrawingContext setDirection(double direction);
    @StructMember(4) public native @MachineSizedFloat double getPitch();
    @StructMember(4) public native MGLStyleLayerDrawingContext setPitch(@MachineSizedFloat double pitch);
    @StructMember(5) public native @MachineSizedFloat double getFieldOfView();
    @StructMember(5) public native MGLStyleLayerDrawingContext setFieldOfView(@MachineSizedFloat double fieldOfView);
    @StructMember(6) public native @ByVal MGLMatrix4 getProjectionMatrix();
    @StructMember(6) public native MGLStyleLayerDrawingContext setProjectionMatrix(@ByVal MGLMatrix4 projectionMatrix);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
