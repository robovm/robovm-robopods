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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLSphericalPosition/*</name>*/ 
    extends /*<extends>*/Struct<MGLSphericalPosition>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLSphericalPositionPtr extends Ptr<MGLSphericalPosition, MGLSphericalPositionPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLSphericalPosition() {}
    public MGLSphericalPosition(@MachineSizedFloat double radial, double azimuthal, double polar) {
        this.setRadial(radial);
        this.setAzimuthal(azimuthal);
        this.setPolar(polar);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @MachineSizedFloat double getRadial();
    @StructMember(0) public native MGLSphericalPosition setRadial(@MachineSizedFloat double radial);
    @StructMember(1) public native double getAzimuthal();
    @StructMember(1) public native MGLSphericalPosition setAzimuthal(double azimuthal);
    @StructMember(2) public native double getPolar();
    @StructMember(2) public native MGLSphericalPosition setPolar(double polar);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
