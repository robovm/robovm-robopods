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
package org.robovm.pods.parse;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFGeoPoint/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class PFGeoPointPtr extends Ptr<PFGeoPoint, PFGeoPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFGeoPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFGeoPoint() {}
    protected PFGeoPoint(SkipInit skipInit) { super(skipInit); }
    public PFGeoPoint(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    public PFGeoPoint(CLLocation location) {
        super(create(location));
        retain(getHandle());
    }
    public PFGeoPoint(double latitude, double longitude) {
        super(create(latitude, longitude));
        retain(getHandle());
    }
    /*<properties>*/
    @Property(selector = "latitude")
    public native double getLatitude();
    @Property(selector = "setLatitude:")
    public native void setLatitude(double v);
    @Property(selector = "longitude")
    public native double getLongitude();
    @Property(selector = "setLongitude:")
    public native void setLongitude(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "distanceInRadiansTo:")
    public native double distanceInRadiansTo(PFGeoPoint point);
    @Method(selector = "distanceInMilesTo:")
    public native double distanceInMilesTo(PFGeoPoint point);
    @Method(selector = "distanceInKilometersTo:")
    public native double distanceInKilometersTo(PFGeoPoint point);
    @Method(selector = "geoPointWithLocation:")
    protected static native @Pointer long create(CLLocation location);
    @Method(selector = "geoPointWithLatitude:longitude:")
    protected static native @Pointer long create(double latitude, double longitude);
    @Method(selector = "geoPointForCurrentLocationInBackground:")
    public static native void getCurrentLocationInBackground(@Block PFLocationCallback geoPointHandler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
