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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapViewDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MGLMapViewDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("mapView:shouldChangeFromCamera:toCamera:")
    public boolean shouldChange(MGLMapView mapView, MGLMapCamera oldCamera, MGLMapCamera newCamera) { return false; }
    @NotImplemented("mapView:shouldChangeFromCamera:toCamera:reason:")
    public boolean shouldChange(MGLMapView mapView, MGLMapCamera oldCamera, MGLMapCamera newCamera, MGLCameraChangeReason reason) { return false; }
    @NotImplemented("mapView:regionWillChangeAnimated:")
    public void regionWillChangeAnimated(MGLMapView mapView, boolean animated) {}
    @NotImplemented("mapView:regionWillChangeWithReason:animated:")
    public void regionWillChange(MGLMapView mapView, MGLCameraChangeReason reason, boolean animated) {}
    @NotImplemented("mapViewRegionIsChanging:")
    public void mapViewRegionIsChanging(MGLMapView mapView) {}
    @NotImplemented("mapView:regionIsChangingWithReason:")
    public void regionIsChanging(MGLMapView mapView, MGLCameraChangeReason reason) {}
    @NotImplemented("mapView:regionDidChangeAnimated:")
    public void regionDidChange(MGLMapView mapView, boolean animated) {}
    @NotImplemented("mapView:regionDidChangeWithReason:animated:")
    public void regionDidChange(MGLMapView mapView, MGLCameraChangeReason reason, boolean animated) {}
    @NotImplemented("mapViewWillStartLoadingMap:")
    public void mapViewWillStartLoadingMap(MGLMapView mapView) {}
    @NotImplemented("mapViewDidFinishLoadingMap:")
    public void mapViewDidFinishLoadingMap(MGLMapView mapView) {}
    @NotImplemented("mapViewDidFailLoadingMap:withError:")
    public void didFailLoadingMap(MGLMapView mapView, NSError error) {}
    @NotImplemented("mapViewWillStartRenderingMap:")
    public void mapViewWillStartRenderingMap(MGLMapView mapView) {}
    @NotImplemented("mapViewDidFinishRenderingMap:fullyRendered:")
    public void didFinishRenderingMap(MGLMapView mapView, boolean fullyRendered) {}
    @NotImplemented("mapViewWillStartRenderingFrame:")
    public void mapViewWillStartRenderingFrame(MGLMapView mapView) {}
    @NotImplemented("mapViewDidFinishRenderingFrame:fullyRendered:")
    public void didFinishRenderingFrame(MGLMapView mapView, boolean fullyRendered) {}
    @NotImplemented("mapViewDidBecomeIdle:")
    public void mapViewDidBecomeIdle(MGLMapView mapView) {}
    @NotImplemented("mapView:didFinishLoadingStyle:")
    public void didFinishLoadingStyle(MGLMapView mapView, MGLStyle style) {}
    @NotImplemented("mapView:didFailToLoadImage:")
    public UIImage didFailToLoadImage(MGLMapView mapView, String imageName) { return null; }
    @NotImplemented("mapView:shouldRemoveStyleImage:")
    public boolean shouldRemoveStyleImage(MGLMapView mapView, String imageName) { return false; }
    @NotImplemented("mapViewWillStartLocatingUser:")
    public void mapViewWillStartLocatingUser(MGLMapView mapView) {}
    @NotImplemented("mapViewDidStopLocatingUser:")
    public void mapViewDidStopLocatingUser(MGLMapView mapView) {}
    @NotImplemented("mapView:didUpdateUserLocation:")
    public void didUpdateUserLocation(MGLMapView mapView, MGLUserLocation userLocation) {}
    @NotImplemented("mapView:didFailToLocateUserWithError:")
    public void didFailToLocateUser(MGLMapView mapView, NSError error) {}
    @NotImplemented("mapView:didChangeUserTrackingMode:animated:")
    public void didChangeUserTrackingMode(MGLMapView mapView, MGLUserTrackingMode mode, boolean animated) {}
    @NotImplemented("mapViewUserLocationAnchorPoint:")
    public @ByVal CGPoint mapViewUserLocationAnchorPoint(MGLMapView mapView) { return null; }
    @NotImplemented("mapView:imageForAnnotation:")
    public MGLAnnotationImage imageForAnnotation(MGLMapView mapView, MGLAnnotation annotation) { return null; }
    @NotImplemented("mapView:alphaForShapeAnnotation:")
    public @MachineSizedFloat double alphaForShapeAnnotation(MGLMapView mapView, MGLShape annotation) { return 0; }
    @NotImplemented("mapView:strokeColorForShapeAnnotation:")
    public UIColor strokeColorForShapeAnnotation(MGLMapView mapView, MGLShape annotation) { return null; }
    @NotImplemented("mapView:fillColorForPolygonAnnotation:")
    public UIColor fillColorForPolygonAnnotation(MGLMapView mapView, MGLPolygon annotation) { return null; }
    @NotImplemented("mapView:lineWidthForPolylineAnnotation:")
    public @MachineSizedFloat double lineWidthForPolylineAnnotation(MGLMapView mapView, MGLPolyline annotation) { return 0; }
    @NotImplemented("mapView:viewForAnnotation:")
    public MGLAnnotationView viewForAnnotation(MGLMapView mapView, MGLAnnotation annotation) { return null; }
    @NotImplemented("mapView:didAddAnnotationViews:")
    public void didAddAnnotationViews(MGLMapView mapView, NSArray<MGLAnnotationView> annotationViews) {}
    @NotImplemented("mapView:shapeAnnotationIsEnabled:")
    public boolean shapeAnnotationIsEnabled(MGLMapView mapView, MGLShape annotation) { return false; }
    @NotImplemented("mapView:didSelectAnnotation:")
    public void didSelectAnnotation(MGLMapView mapView, MGLAnnotation annotation) {}
    @NotImplemented("mapView:didDeselectAnnotation:")
    public void didDeselectAnnotation(MGLMapView mapView, MGLAnnotation annotation) {}
    @NotImplemented("mapView:didSelectAnnotationView:")
    public void didSelectAnnotationView(MGLMapView mapView, MGLAnnotationView annotationView) {}
    @NotImplemented("mapView:didDeselectAnnotationView:")
    public void didDeselectAnnotationView(MGLMapView mapView, MGLAnnotationView annotationView) {}
    @NotImplemented("mapView:annotationCanShowCallout:")
    public boolean annotationCanShowCallout(MGLMapView mapView, MGLAnnotation annotation) { return false; }
    @NotImplemented("mapView:calloutViewForAnnotation:")
    public MGLCalloutView calloutViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation) { return null; }
    @NotImplemented("mapView:leftCalloutAccessoryViewForAnnotation:")
    public UIView leftCalloutAccessoryViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation) { return null; }
    @NotImplemented("mapView:rightCalloutAccessoryViewForAnnotation:")
    public UIView rightCalloutAccessoryViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation) { return null; }
    @NotImplemented("mapView:annotation:calloutAccessoryControlTapped:")
    public void annotation(MGLMapView mapView, MGLAnnotation annotation, UIControl control) {}
    @NotImplemented("mapView:tapOnCalloutForAnnotation:")
    public void tapOnCalloutForAnnotation(MGLMapView mapView, MGLAnnotation annotation) {}
    /*</methods>*/
}
