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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMapViewPtr extends Ptr<MGLMapView, MGLMapViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMapView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMapView() {}
    protected MGLMapView(Handle h, long handle) { super(h, handle); }
    protected MGLMapView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public MGLMapView(@ByVal CGRect frame) { super((SkipInit) null); initObject(init(frame)); }
    @Method(selector = "initWithFrame:styleURL:")
    public MGLMapView(@ByVal CGRect frame, NSURL styleURL) { super((SkipInit) null); initObject(init(frame, styleURL)); }
    @Method(selector = "initWithCoder:")
    public MGLMapView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native MGLMapViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MGLMapViewDelegate v);
    @Property(selector = "style")
    public native MGLStyle getStyle();
    @Property(selector = "styleURL")
    public native NSURL getStyleURL();
    @Property(selector = "setStyleURL:")
    public native void setStyleURL(NSURL v);
    @Property(selector = "showsScale")
    public native boolean showsScale();
    @Property(selector = "setShowsScale:")
    public native void setShowsScale(boolean v);
    @Property(selector = "scaleBar")
    public native UIView getScaleBar();
    @Property(selector = "scaleBarPosition")
    public native MGLOrnamentPosition getScaleBarPosition();
    @Property(selector = "setScaleBarPosition:")
    public native void setScaleBarPosition(MGLOrnamentPosition v);
    @Property(selector = "scaleBarMargins")
    public native @ByVal CGPoint getScaleBarMargins();
    @Property(selector = "setScaleBarMargins:")
    public native void setScaleBarMargins(@ByVal CGPoint v);
    @Property(selector = "compassView")
    public native MGLCompassButton getCompassView();
    @Property(selector = "compassViewPosition")
    public native MGLOrnamentPosition getCompassViewPosition();
    @Property(selector = "setCompassViewPosition:")
    public native void setCompassViewPosition(MGLOrnamentPosition v);
    @Property(selector = "compassViewMargins")
    public native @ByVal CGPoint getCompassViewMargins();
    @Property(selector = "setCompassViewMargins:")
    public native void setCompassViewMargins(@ByVal CGPoint v);
    @Property(selector = "logoView")
    public native UIImageView getLogoView();
    @Property(selector = "logoViewPosition")
    public native MGLOrnamentPosition getLogoViewPosition();
    @Property(selector = "setLogoViewPosition:")
    public native void setLogoViewPosition(MGLOrnamentPosition v);
    @Property(selector = "logoViewMargins")
    public native @ByVal CGPoint getLogoViewMargins();
    @Property(selector = "setLogoViewMargins:")
    public native void setLogoViewMargins(@ByVal CGPoint v);
    @Property(selector = "attributionButton")
    public native UIButton getAttributionButton();
    @Property(selector = "attributionButtonPosition")
    public native MGLOrnamentPosition getAttributionButtonPosition();
    @Property(selector = "setAttributionButtonPosition:")
    public native void setAttributionButtonPosition(MGLOrnamentPosition v);
    @Property(selector = "attributionButtonMargins")
    public native @ByVal CGPoint getAttributionButtonMargins();
    @Property(selector = "setAttributionButtonMargins:")
    public native void setAttributionButtonMargins(@ByVal CGPoint v);
    @Property(selector = "preferredFramesPerSecond")
    public native @MachineSizedSInt long getPreferredFramesPerSecond();
    @Property(selector = "setPreferredFramesPerSecond:")
    public native void setPreferredFramesPerSecond(@MachineSizedSInt long v);
    @Property(selector = "prefetchesTiles")
    public native boolean isPrefetchesTiles();
    @Property(selector = "setPrefetchesTiles:")
    public native void setPrefetchesTiles(boolean v);
    @Property(selector = "locationManager")
    public native MGLLocationManager getLocationManager();
    @Property(selector = "setLocationManager:")
    public native void setLocationManager(MGLLocationManager v);
    @Property(selector = "showsUserLocation")
    public native boolean showsUserLocation();
    @Property(selector = "setShowsUserLocation:")
    public native void setShowsUserLocation(boolean v);
    @Property(selector = "isUserLocationVisible")
    public native boolean isUserLocationVisible();
    @Property(selector = "userLocation")
    public native MGLUserLocation getUserLocation();
    @Property(selector = "userTrackingMode")
    public native MGLUserTrackingMode getUserTrackingMode();
    @Property(selector = "setUserTrackingMode:")
    public native void setUserTrackingMode(MGLUserTrackingMode v);
    /**
     * @deprecated Use `-[MGLMapViewDelegate mapViewUserLocationAnchorPoint:]` instead.
     */
    @Deprecated
    @Property(selector = "userLocationVerticalAlignment")
    public native MGLAnnotationVerticalAlignment getUserLocationVerticalAlignment();
    /**
     * @deprecated Use `-[MGLMapViewDelegate mapViewUserLocationAnchorPoint:]` instead.
     */
    @Deprecated
    @Property(selector = "setUserLocationVerticalAlignment:")
    public native void setUserLocationVerticalAlignment(MGLAnnotationVerticalAlignment v);
    @Property(selector = "showsUserHeadingIndicator")
    public native boolean showsUserHeadingIndicator();
    @Property(selector = "setShowsUserHeadingIndicator:")
    public native void setShowsUserHeadingIndicator(boolean v);
    @Property(selector = "displayHeadingCalibration")
    public native boolean isDisplayHeadingCalibration();
    @Property(selector = "setDisplayHeadingCalibration:")
    public native void setDisplayHeadingCalibration(boolean v);
    @Property(selector = "targetCoordinate")
    public native @ByVal CLLocationCoordinate2D getTargetCoordinate();
    @Property(selector = "setTargetCoordinate:")
    public native void setTargetCoordinate(@ByVal CLLocationCoordinate2D v);
    @Property(selector = "isZoomEnabled")
    public native boolean isZoomEnabled();
    @Property(selector = "setZoomEnabled:")
    public native void setZoomEnabled(boolean v);
    @Property(selector = "isScrollEnabled")
    public native boolean isScrollEnabled();
    @Property(selector = "setScrollEnabled:")
    public native void setScrollEnabled(boolean v);
    @Property(selector = "isRotateEnabled")
    public native boolean isRotateEnabled();
    @Property(selector = "setRotateEnabled:")
    public native void setRotateEnabled(boolean v);
    @Property(selector = "isPitchEnabled")
    public native boolean isPitchEnabled();
    @Property(selector = "setPitchEnabled:")
    public native void setPitchEnabled(boolean v);
    @Property(selector = "isHapticFeedbackEnabled")
    public native boolean isHapticFeedbackEnabled();
    @Property(selector = "setHapticFeedbackEnabled:")
    public native void setHapticFeedbackEnabled(boolean v);
    @Property(selector = "decelerationRate")
    public native @MachineSizedFloat double getDecelerationRate();
    @Property(selector = "setDecelerationRate:")
    public native void setDecelerationRate(@MachineSizedFloat double v);
    @Property(selector = "centerCoordinate")
    public native @ByVal CLLocationCoordinate2D getCenterCoordinate();
    @Property(selector = "setCenterCoordinate:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D v);
    @Property(selector = "zoomLevel")
    public native double getZoomLevel();
    @Property(selector = "setZoomLevel:")
    public native void setZoomLevel(double v);
    @Property(selector = "minimumZoomLevel")
    public native double getMinimumZoomLevel();
    @Property(selector = "setMinimumZoomLevel:")
    public native void setMinimumZoomLevel(double v);
    @Property(selector = "maximumZoomLevel")
    public native double getMaximumZoomLevel();
    @Property(selector = "setMaximumZoomLevel:")
    public native void setMaximumZoomLevel(double v);
    @Property(selector = "direction")
    public native double getDirection();
    @Property(selector = "setDirection:")
    public native void setDirection(double v);
    @Property(selector = "visibleCoordinateBounds")
    public native @ByVal MGLCoordinateBounds getVisibleCoordinateBounds();
    @Property(selector = "setVisibleCoordinateBounds:")
    public native void setVisibleCoordinateBounds(@ByVal MGLCoordinateBounds v);
    @Property(selector = "camera")
    public native MGLMapCamera getCamera();
    @Property(selector = "setCamera:")
    public native void setCamera(MGLMapCamera v);
    @Property(selector = "contentInset")
    public native @ByVal UIEdgeInsets getContentInset();
    @Property(selector = "setContentInset:")
    public native void setContentInset(@ByVal UIEdgeInsets v);
    @Property(selector = "annotations")
    public native NSArray<?> getAnnotations();
    @Property(selector = "visibleAnnotations")
    public native NSArray<?> getVisibleAnnotations();
    @Property(selector = "selectedAnnotations")
    public native NSArray<?> getSelectedAnnotations();
    @Property(selector = "setSelectedAnnotations:")
    public native void setSelectedAnnotations(NSArray<?> v);
    @Property(selector = "overlays")
    public native NSArray<?> getOverlays();
    @Property(selector = "debugMask")
    public native MGLMapDebugMaskOptions getDebugMask();
    @Property(selector = "setDebugMask:")
    public native void setDebugMask(MGLMapDebugMaskOptions v);
    @Property(selector = "latitude")
    public native double getLatitude();
    @Property(selector = "setLatitude:")
    public native void setLatitude(double v);
    @Property(selector = "longitude")
    public native double getLongitude();
    @Property(selector = "setLongitude:")
    public native void setLongitude(double v);
    @Property(selector = "allowsZooming")
    public native boolean allowsZooming();
    @Property(selector = "setAllowsZooming:")
    public native void setAllowsZooming(boolean v);
    @Property(selector = "allowsScrolling")
    public native boolean allowsScrolling();
    @Property(selector = "setAllowsScrolling:")
    public native void setAllowsScrolling(boolean v);
    @Property(selector = "allowsRotating")
    public native boolean allowsRotating();
    @Property(selector = "setAllowsRotating:")
    public native void setAllowsRotating(boolean v);
    @Property(selector = "allowsTilting")
    public native boolean allowsTilting();
    @Property(selector = "setAllowsTilting:")
    public native void setAllowsTilting(boolean v);
    @Property(selector = "showsHeading")
    public native boolean showsHeading();
    @Property(selector = "setShowsHeading:")
    public native void setShowsHeading(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLMapViewDecelerationRateNormal", optional=true)
    public static native @MachineSizedFloat double DecelerationRateNormal();
    @GlobalValue(symbol="MGLMapViewDecelerationRateFast", optional=true)
    public static native @MachineSizedFloat double DecelerationRateFast();
    @GlobalValue(symbol="MGLMapViewDecelerationRateImmediate", optional=true)
    public static native @MachineSizedFloat double DecelerationRateImmediate();
    @GlobalValue(symbol="MGLMapViewPreferredFramesPerSecondDefault", optional=true)
    public static native @MachineSizedSInt long PreferredFramesPerSecondDefault();
    @GlobalValue(symbol="MGLMapViewPreferredFramesPerSecondLowPower", optional=true)
    public static native @MachineSizedSInt long PreferredFramesPerSecondLowPower();
    @GlobalValue(symbol="MGLMapViewPreferredFramesPerSecondMaximum", optional=true)
    public static native @MachineSizedSInt long PreferredFramesPerSecondMaximum();
    
    @Method(selector = "initWithFrame:")
    protected native @Pointer long init(@ByVal CGRect frame);
    @Method(selector = "initWithFrame:styleURL:")
    protected native @Pointer long init(@ByVal CGRect frame, NSURL styleURL);
    @Method(selector = "reloadStyle:")
    public native void reloadStyle(NSObject sender);
    @Method(selector = "showAttribution:")
    public native void showAttribution(NSObject sender);
    /**
     * @deprecated Use `-setUserTrackingMode:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "setUserTrackingMode:animated:")
    public native void setUserTrackingMode(MGLUserTrackingMode mode, boolean animated);
    @Method(selector = "setUserTrackingMode:animated:completionHandler:")
    public native void setUserTrackingMode(MGLUserTrackingMode mode, boolean animated, @Block Runnable completion);
    /**
     * @deprecated Use `-[MGLMapViewDelegate mapViewUserLocationAnchorPoint:]` instead.
     */
    @Deprecated
    @Method(selector = "setUserLocationVerticalAlignment:animated:")
    public native void setUserLocationVerticalAlignment(MGLAnnotationVerticalAlignment alignment, boolean animated);
    @Method(selector = "updateUserLocationAnnotationView")
    public native void updateUserLocationAnnotationView();
    @Method(selector = "updateUserLocationAnnotationViewAnimatedWithDuration:")
    public native void updateUserLocationAnnotationViewAnimated(double duration);
    /**
     * @deprecated Use `-setTargetCoordinate:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "setTargetCoordinate:animated:")
    public native void setTargetCoordinate(@ByVal CLLocationCoordinate2D targetCoordinate, boolean animated);
    @Method(selector = "setTargetCoordinate:animated:completionHandler:")
    public native void setTargetCoordinate(@ByVal CLLocationCoordinate2D targetCoordinate, boolean animated, @Block Runnable completion);
    @Method(selector = "setCenterCoordinate:animated:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D coordinate, boolean animated);
    @Method(selector = "setCenterCoordinate:zoomLevel:animated:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, double zoomLevel, boolean animated);
    @Method(selector = "setCenterCoordinate:zoomLevel:direction:animated:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, double zoomLevel, double direction, boolean animated);
    @Method(selector = "setCenterCoordinate:zoomLevel:direction:animated:completionHandler:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, double zoomLevel, double direction, boolean animated, @Block Runnable completion);
    @Method(selector = "setZoomLevel:animated:")
    public native void setZoomLevel(double zoomLevel, boolean animated);
    @Method(selector = "setDirection:animated:")
    public native void setDirection(double direction, boolean animated);
    @Method(selector = "resetNorth")
    public native void resetNorth();
    @Method(selector = "resetPosition")
    public native void resetPosition();
    @Method(selector = "setVisibleCoordinateBounds:animated:")
    public native void setVisibleCoordinateBounds(@ByVal MGLCoordinateBounds bounds, boolean animated);
    /**
     * @deprecated Use `-setVisibleCoordinateBounds:edgePadding:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "setVisibleCoordinateBounds:edgePadding:animated:")
    public native void setVisibleCoordinateBounds(@ByVal MGLCoordinateBounds bounds, @ByVal UIEdgeInsets insets, boolean animated);
    @Method(selector = "setVisibleCoordinateBounds:edgePadding:animated:completionHandler:")
    public native void setVisibleCoordinateBounds(@ByVal MGLCoordinateBounds bounds, @ByVal UIEdgeInsets insets, boolean animated, @Block Runnable completion);
    @Method(selector = "setVisibleCoordinates:count:edgePadding:animated:")
    protected native void nativeSetVisibleCoordinates(CLLocationCoordinate2D coordinates, @MachineSizedUInt long count, @ByVal UIEdgeInsets insets, boolean animated);
    @Method(selector = "setVisibleCoordinates:count:edgePadding:direction:duration:animationTimingFunction:completionHandler:")
    protected native void nativeSetVisibleCoordinates(CLLocationCoordinate2D coordinates, @MachineSizedUInt long count, @ByVal UIEdgeInsets insets, double direction, double duration, CAMediaTimingFunction function, @Block Runnable completion);
    @Method(selector = "showAnnotations:animated:")
    public native void showAnnotations(NSArray<?> annotations, boolean animated);
    /**
     * @deprecated Use `-showAnnotations:edgePadding:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "showAnnotations:edgePadding:animated:")
    public native void showAnnotations(NSArray<?> annotations, @ByVal UIEdgeInsets insets, boolean animated);
    @Method(selector = "showAnnotations:edgePadding:animated:completionHandler:")
    public native void showAnnotations(NSArray<?> annotations, @ByVal UIEdgeInsets insets, boolean animated, @Block Runnable completion);
    @Method(selector = "setCamera:animated:")
    public native void setCamera(MGLMapCamera camera, boolean animated);
    @Method(selector = "setCamera:withDuration:animationTimingFunction:")
    public native void setCamera(MGLMapCamera camera, double duration, CAMediaTimingFunction function);
    @Method(selector = "setCamera:withDuration:animationTimingFunction:completionHandler:")
    public native void setCamera(MGLMapCamera camera, double duration, CAMediaTimingFunction function, @Block Runnable completion);
    @Method(selector = "setCamera:withDuration:animationTimingFunction:edgePadding:completionHandler:")
    public native void setCamera(MGLMapCamera camera, double duration, CAMediaTimingFunction function, @ByVal UIEdgeInsets edgePadding, @Block Runnable completion);
    @Method(selector = "flyToCamera:completionHandler:")
    public native void flyToCamera(MGLMapCamera camera, @Block Runnable completion);
    @Method(selector = "flyToCamera:withDuration:completionHandler:")
    public native void flyToCamera(MGLMapCamera camera, double duration, @Block Runnable completion);
    @Method(selector = "flyToCamera:withDuration:peakAltitude:completionHandler:")
    public native void flyToCamera(MGLMapCamera camera, double duration, double peakAltitude, @Block Runnable completion);
    @Method(selector = "cameraThatFitsCoordinateBounds:")
    public native MGLMapCamera cameraThatFitsCoordinateBounds(@ByVal MGLCoordinateBounds bounds);
    @Method(selector = "cameraThatFitsCoordinateBounds:edgePadding:")
    public native MGLMapCamera cameraThatFitsCoordinateBounds(@ByVal MGLCoordinateBounds bounds, @ByVal UIEdgeInsets insets);
    @Method(selector = "camera:fittingCoordinateBounds:edgePadding:")
    public native MGLMapCamera camera(MGLMapCamera camera, @ByVal MGLCoordinateBounds bounds, @ByVal UIEdgeInsets insets);
    @Method(selector = "camera:fittingShape:edgePadding:")
    public native MGLMapCamera camera(MGLMapCamera camera, MGLShape shape, @ByVal UIEdgeInsets insets);
    @Method(selector = "cameraThatFitsShape:direction:edgePadding:")
    public native MGLMapCamera cameraThatFitsShape(MGLShape shape, double direction, @ByVal UIEdgeInsets insets);
    @Method(selector = "anchorPointForGesture:")
    public native @ByVal CGPoint anchorPointForGesture(UIGestureRecognizer gesture);
    /**
     * @deprecated Use `-setContentInset:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "setContentInset:animated:")
    public native void setContentInset(@ByVal UIEdgeInsets contentInset, boolean animated);
    @Method(selector = "setContentInset:animated:completionHandler:")
    public native void setContentInset(@ByVal UIEdgeInsets contentInset, boolean animated, @Block Runnable completion);
    @Method(selector = "convertPoint:toCoordinateFromView:")
    public native @ByVal CLLocationCoordinate2D convertPoint(@ByVal CGPoint point, UIView view);
    @Method(selector = "convertCoordinate:toPointToView:")
    public native @ByVal CGPoint convertCoordinate(@ByVal CLLocationCoordinate2D coordinate, UIView view);
    @Method(selector = "convertRect:toCoordinateBoundsFromView:")
    public native @ByVal MGLCoordinateBounds convertRect(@ByVal CGRect rect, UIView view);
    @Method(selector = "convertCoordinateBounds:toRectToView:")
    public native @ByVal CGRect convertCoordinateBounds(@ByVal MGLCoordinateBounds bounds, UIView view);
    @Method(selector = "metersPerPointAtLatitude:")
    public native double metersPerPointAtLatitude(double latitude);
    @Method(selector = "addAnnotation:")
    public native void addAnnotation(MGLAnnotation annotation);
    @Method(selector = "addAnnotations:")
    public native void addAnnotations(NSArray<?> annotations);
    @Method(selector = "removeAnnotation:")
    public native void removeAnnotation(MGLAnnotation annotation);
    @Method(selector = "removeAnnotations:")
    public native void removeAnnotations(NSArray<?> annotations);
    @Method(selector = "viewForAnnotation:")
    public native MGLAnnotationView viewForAnnotation(MGLAnnotation annotation);
    @Method(selector = "dequeueReusableAnnotationImageWithIdentifier:")
    public native MGLAnnotationImage dequeueReusableAnnotationImage(String identifier);
    @Method(selector = "dequeueReusableAnnotationViewWithIdentifier:")
    public native MGLAnnotationView dequeueReusableAnnotationView(String identifier);
    @Method(selector = "visibleAnnotationsInRect:")
    public native NSArray<?> visibleAnnotationsInRect(@ByVal CGRect rect);
    /**
     * @deprecated Use `-selectAnnotation:animated:completionHandler:` instead.
     */
    @Deprecated
    @Method(selector = "selectAnnotation:animated:")
    public native void selectAnnotation(MGLAnnotation annotation, boolean animated);
    @Method(selector = "selectAnnotation:animated:completionHandler:")
    public native void selectAnnotation(MGLAnnotation annotation, boolean animated, @Block Runnable completion);
    @Method(selector = "selectAnnotation:moveIntoView:animateSelection:completionHandler:")
    public native void selectAnnotation(MGLAnnotation annotation, boolean moveIntoView, boolean animateSelection, @Block Runnable completion);
    @Method(selector = "deselectAnnotation:animated:")
    public native void deselectAnnotation(MGLAnnotation annotation, boolean animated);
    @Method(selector = "addOverlay:")
    public native void addOverlay(MGLOverlay overlay);
    @Method(selector = "addOverlays:")
    public native void addOverlays(NSArray<?> overlays);
    @Method(selector = "removeOverlay:")
    public native void removeOverlay(MGLOverlay overlay);
    @Method(selector = "removeOverlays:")
    public native void removeOverlays(NSArray<?> overlays);
    @Method(selector = "visibleFeaturesAtPoint:")
    public native NSArray<?> visibleFeaturesAtPoint(@ByVal CGPoint point);
    @Method(selector = "visibleFeaturesAtPoint:inStyleLayersWithIdentifiers:")
    public native NSArray<?> visibleFeatures(@ByVal CGPoint point, NSSet<NSString> styleLayerIdentifiers);
    @Method(selector = "visibleFeaturesAtPoint:inStyleLayersWithIdentifiers:predicate:")
    public native NSArray<?> visibleFeatures(@ByVal CGPoint point, NSSet<NSString> styleLayerIdentifiers, NSPredicate predicate);
    @Method(selector = "visibleFeaturesInRect:")
    public native NSArray<?> visibleFeaturesInRect(@ByVal CGRect rect);
    @Method(selector = "visibleFeaturesInRect:inStyleLayersWithIdentifiers:")
    public native NSArray<?> visibleFeatures(@ByVal CGRect rect, NSSet<NSString> styleLayerIdentifiers);
    @Method(selector = "visibleFeaturesInRect:inStyleLayersWithIdentifiers:predicate:")
    public native NSArray<?> visibleFeatures(@ByVal CGRect rect, NSSet<NSString> styleLayerIdentifiers, NSPredicate predicate);
    /*</methods>*/
    public void setVisibleCoordinates(CLLocationCoordinate2D[] coordinates, @ByVal UIEdgeInsets insets, boolean animated) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coordinates.length);
        value.update(coordinates);
        nativeSetVisibleCoordinates(value, coordinates.length, insets, animated);
    }
    public void setVisibleCoordinates(CLLocationCoordinate2D[] coordinates, @MachineSizedUInt long count, @ByVal UIEdgeInsets insets, double direction, double duration, CAMediaTimingFunction function, @Block Runnable completion) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coordinates.length);
        value.update(coordinates);
        nativeSetVisibleCoordinates(value, coordinates.length, insets, direction, duration, function, completion);
    }
}
