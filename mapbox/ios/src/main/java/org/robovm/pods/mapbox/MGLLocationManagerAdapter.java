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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLLocationManagerAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MGLLocationManager/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("delegate")
    public MGLLocationManagerDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(MGLLocationManagerDelegate v) {}
    @NotImplemented("authorizationStatus")
    public CLAuthorizationStatus getAuthorizationStatus() { return null; }
    @NotImplemented("headingOrientation")
    public CLDeviceOrientation getHeadingOrientation() { return null; }
    @NotImplemented("setHeadingOrientation:")
    public void setHeadingOrientation(CLDeviceOrientation v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("distanceFilter")
    public double distanceFilter() { return 0; }
    @NotImplemented("setDistanceFilter:")
    public void setDistanceFilter(double distanceFilter) {}
    @NotImplemented("desiredAccuracy")
    public double desiredAccuracy() { return 0; }
    @NotImplemented("setDesiredAccuracy:")
    public void setDesiredAccuracy(double desiredAccuracy) {}
    @NotImplemented("activityType")
    public CLActivityType activityType() { return null; }
    @NotImplemented("setActivityType:")
    public void setActivityType(CLActivityType activityType) {}
    @NotImplemented("requestAlwaysAuthorization")
    public void requestAlwaysAuthorization() {}
    @NotImplemented("requestWhenInUseAuthorization")
    public void requestWhenInUseAuthorization() {}
    @NotImplemented("startUpdatingLocation")
    public void startUpdatingLocation() {}
    @NotImplemented("stopUpdatingLocation")
    public void stopUpdatingLocation() {}
    @NotImplemented("startUpdatingHeading")
    public void startUpdatingHeading() {}
    @NotImplemented("stopUpdatingHeading")
    public void stopUpdatingHeading() {}
    @NotImplemented("dismissHeadingCalibrationDisplay")
    public void dismissHeadingCalibrationDisplay() {}
    /*</methods>*/
}
