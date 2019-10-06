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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapCamera/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MGLMapCameraPtr extends Ptr<MGLMapCamera, MGLMapCameraPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMapCamera.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMapCamera() {}
    protected MGLMapCamera(Handle h, long handle) { super(h, handle); }
    protected MGLMapCamera(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public MGLMapCamera(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "centerCoordinate")
    public native @ByVal CLLocationCoordinate2D getCenterCoordinate();
    @Property(selector = "setCenterCoordinate:")
    public native void setCenterCoordinate(@ByVal CLLocationCoordinate2D v);
    @Property(selector = "heading")
    public native double getHeading();
    @Property(selector = "setHeading:")
    public native void setHeading(double v);
    @Property(selector = "pitch")
    public native @MachineSizedFloat double getPitch();
    @Property(selector = "setPitch:")
    public native void setPitch(@MachineSizedFloat double v);
    @Property(selector = "altitude")
    public native double getAltitude();
    @Property(selector = "setAltitude:")
    public native void setAltitude(double v);
    @Property(selector = "viewingDistance")
    public native double getViewingDistance();
    @Property(selector = "setViewingDistance:")
    public native void setViewingDistance(double v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToMapCamera:")
    public native boolean isEqualToMapCamera(MGLMapCamera otherCamera);
    @Method(selector = "camera")
    public static native MGLMapCamera camera();
    @Method(selector = "cameraLookingAtCenterCoordinate:fromEyeCoordinate:eyeAltitude:")
    public static native MGLMapCamera cameraLookingAtCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, @ByVal CLLocationCoordinate2D eyeCoordinate, double eyeAltitude);
    @Method(selector = "cameraLookingAtCenterCoordinate:acrossDistance:pitch:heading:")
    public static native MGLMapCamera cameraLookingAtCenterCoordinatAcrossDistance(@ByVal CLLocationCoordinate2D centerCoordinate, double distance, @MachineSizedFloat double pitch, double heading);
    @Method(selector = "cameraLookingAtCenterCoordinate:altitude:pitch:heading:")
    public static native MGLMapCamera cameraLookingAtCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, double altitude, @MachineSizedFloat double pitch, double heading);
    /**
     * @deprecated Use -cameraLookingAtCenterCoordinate:acrossDistance:pitch:heading: 
                          or -cameraLookingAtCenterCoordinate:altitude:pitch:heading:.
     */
    @Deprecated
    @Method(selector = "cameraLookingAtCenterCoordinate:fromDistance:pitch:heading:")
    public static native MGLMapCamera cameraLookingAtCenterCoordinateFromDistance(@ByVal CLLocationCoordinate2D centerCoordinate, double distance, @MachineSizedFloat double pitch, double heading);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
