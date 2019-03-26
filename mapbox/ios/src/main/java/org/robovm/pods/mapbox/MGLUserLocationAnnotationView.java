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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLUserLocationAnnotationView/*</name>*/ 
    extends /*<extends>*/MGLAnnotationView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLUserLocationAnnotationViewPtr extends Ptr<MGLUserLocationAnnotationView, MGLUserLocationAnnotationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLUserLocationAnnotationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLUserLocationAnnotationView() {}
    protected MGLUserLocationAnnotationView(Handle h, long handle) { super(h, handle); }
    protected MGLUserLocationAnnotationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithReuseIdentifier:")
    public MGLUserLocationAnnotationView(String reuseIdentifier) { super(reuseIdentifier); }
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    public MGLUserLocationAnnotationView(MGLAnnotation annotation, String reuseIdentifier) { super(annotation, reuseIdentifier); }
    @Method(selector = "initWithFrame:")
    public MGLUserLocationAnnotationView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MGLUserLocationAnnotationView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "mapView")
    public native MGLMapView getMapView();
    @Property(selector = "userLocation")
    public native MGLUserLocation getUserLocation();
    @Property(selector = "hitTestLayer")
    public native CALayer getHitTestLayer();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "update")
    public native void update();
    /*</methods>*/
}
