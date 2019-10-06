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
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/MGLMapViewDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "mapView:shouldChangeFromCamera:toCamera:")
    boolean shouldChange(MGLMapView mapView, MGLMapCamera oldCamera, MGLMapCamera newCamera);
    @Method(selector = "mapView:shouldChangeFromCamera:toCamera:reason:")
    boolean shouldChange(MGLMapView mapView, MGLMapCamera oldCamera, MGLMapCamera newCamera, MGLCameraChangeReason reason);
    @Method(selector = "mapView:regionWillChangeAnimated:")
    void regionWillChangeAnimated(MGLMapView mapView, boolean animated);
    @Method(selector = "mapView:regionWillChangeWithReason:animated:")
    void regionWillChange(MGLMapView mapView, MGLCameraChangeReason reason, boolean animated);
    @Method(selector = "mapViewRegionIsChanging:")
    void mapViewRegionIsChanging(MGLMapView mapView);
    @Method(selector = "mapView:regionIsChangingWithReason:")
    void regionIsChanging(MGLMapView mapView, MGLCameraChangeReason reason);
    @Method(selector = "mapView:regionDidChangeAnimated:")
    void regionDidChange(MGLMapView mapView, boolean animated);
    @Method(selector = "mapView:regionDidChangeWithReason:animated:")
    void regionDidChange(MGLMapView mapView, MGLCameraChangeReason reason, boolean animated);
    @Method(selector = "mapViewWillStartLoadingMap:")
    void mapViewWillStartLoadingMap(MGLMapView mapView);
    @Method(selector = "mapViewDidFinishLoadingMap:")
    void mapViewDidFinishLoadingMap(MGLMapView mapView);
    @Method(selector = "mapViewDidFailLoadingMap:withError:")
    void didFailLoadingMap(MGLMapView mapView, NSError error);
    @Method(selector = "mapViewWillStartRenderingMap:")
    void mapViewWillStartRenderingMap(MGLMapView mapView);
    @Method(selector = "mapViewDidFinishRenderingMap:fullyRendered:")
    void didFinishRenderingMap(MGLMapView mapView, boolean fullyRendered);
    @Method(selector = "mapViewWillStartRenderingFrame:")
    void mapViewWillStartRenderingFrame(MGLMapView mapView);
    @Method(selector = "mapViewDidFinishRenderingFrame:fullyRendered:")
    void didFinishRenderingFrame(MGLMapView mapView, boolean fullyRendered);
    @Method(selector = "mapViewDidBecomeIdle:")
    void mapViewDidBecomeIdle(MGLMapView mapView);
    @Method(selector = "mapView:didFinishLoadingStyle:")
    void didFinishLoadingStyle(MGLMapView mapView, MGLStyle style);
    @Method(selector = "mapView:didFailToLoadImage:")
    UIImage didFailToLoadImage(MGLMapView mapView, String imageName);
    @Method(selector = "mapView:shouldRemoveStyleImage:")
    boolean shouldRemoveStyleImage(MGLMapView mapView, String imageName);
    @Method(selector = "mapViewWillStartLocatingUser:")
    void mapViewWillStartLocatingUser(MGLMapView mapView);
    @Method(selector = "mapViewDidStopLocatingUser:")
    void mapViewDidStopLocatingUser(MGLMapView mapView);
    @Method(selector = "mapView:didUpdateUserLocation:")
    void didUpdateUserLocation(MGLMapView mapView, MGLUserLocation userLocation);
    @Method(selector = "mapView:didFailToLocateUserWithError:")
    void didFailToLocateUser(MGLMapView mapView, NSError error);
    @Method(selector = "mapView:didChangeUserTrackingMode:animated:")
    void didChangeUserTrackingMode(MGLMapView mapView, MGLUserTrackingMode mode, boolean animated);
    @Method(selector = "mapViewUserLocationAnchorPoint:")
    @ByVal CGPoint mapViewUserLocationAnchorPoint(MGLMapView mapView);
    @Method(selector = "mapView:imageForAnnotation:")
    MGLAnnotationImage imageForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:alphaForShapeAnnotation:")
    @MachineSizedFloat double alphaForShapeAnnotation(MGLMapView mapView, MGLShape annotation);
    @Method(selector = "mapView:strokeColorForShapeAnnotation:")
    UIColor strokeColorForShapeAnnotation(MGLMapView mapView, MGLShape annotation);
    @Method(selector = "mapView:fillColorForPolygonAnnotation:")
    UIColor fillColorForPolygonAnnotation(MGLMapView mapView, MGLPolygon annotation);
    @Method(selector = "mapView:lineWidthForPolylineAnnotation:")
    @MachineSizedFloat double lineWidthForPolylineAnnotation(MGLMapView mapView, MGLPolyline annotation);
    @Method(selector = "mapView:viewForAnnotation:")
    MGLAnnotationView viewForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:didAddAnnotationViews:")
    void didAddAnnotationViews(MGLMapView mapView, NSArray<MGLAnnotationView> annotationViews);
    @Method(selector = "mapView:shapeAnnotationIsEnabled:")
    boolean shapeAnnotationIsEnabled(MGLMapView mapView, MGLShape annotation);
    @Method(selector = "mapView:didSelectAnnotation:")
    void didSelectAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:didDeselectAnnotation:")
    void didDeselectAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:didSelectAnnotationView:")
    void didSelectAnnotationView(MGLMapView mapView, MGLAnnotationView annotationView);
    @Method(selector = "mapView:didDeselectAnnotationView:")
    void didDeselectAnnotationView(MGLMapView mapView, MGLAnnotationView annotationView);
    @Method(selector = "mapView:annotationCanShowCallout:")
    boolean annotationCanShowCallout(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:calloutViewForAnnotation:")
    MGLCalloutView calloutViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:leftCalloutAccessoryViewForAnnotation:")
    UIView leftCalloutAccessoryViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:rightCalloutAccessoryViewForAnnotation:")
    UIView rightCalloutAccessoryViewForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    @Method(selector = "mapView:annotation:calloutAccessoryControlTapped:")
    void annotation(MGLMapView mapView, MGLAnnotation annotation, UIControl control);
    @Method(selector = "mapView:tapOnCalloutForAnnotation:")
    void tapOnCalloutForAnnotation(MGLMapView mapView, MGLAnnotation annotation);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
