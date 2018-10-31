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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/MGLCameraChangeReason/*</name>*/ extends Bits</*<name>*/MGLCameraChangeReason/*</name>*/> {
    /*<values>*/
    public static final MGLCameraChangeReason None = new MGLCameraChangeReason(0L);
    public static final MGLCameraChangeReason Programmatic = new MGLCameraChangeReason(1L);
    public static final MGLCameraChangeReason ResetNorth = new MGLCameraChangeReason(2L);
    public static final MGLCameraChangeReason GesturePan = new MGLCameraChangeReason(4L);
    public static final MGLCameraChangeReason GesturePinch = new MGLCameraChangeReason(8L);
    public static final MGLCameraChangeReason GestureRotate = new MGLCameraChangeReason(16L);
    public static final MGLCameraChangeReason GestureZoomIn = new MGLCameraChangeReason(32L);
    public static final MGLCameraChangeReason GestureZoomOut = new MGLCameraChangeReason(64L);
    public static final MGLCameraChangeReason GestureOneFingerZoom = new MGLCameraChangeReason(128L);
    public static final MGLCameraChangeReason GestureTilt = new MGLCameraChangeReason(256L);
    public static final MGLCameraChangeReason TransitionCancelled = new MGLCameraChangeReason(65536L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MGLCameraChangeReason/*</name>*/[] values = _values(/*<name>*/MGLCameraChangeReason/*</name>*/.class);

    public /*<name>*/MGLCameraChangeReason/*</name>*/(long value) { super(value); }
    private /*<name>*/MGLCameraChangeReason/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MGLCameraChangeReason/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MGLCameraChangeReason/*</name>*/(value, mask);
    }
    protected /*<name>*/MGLCameraChangeReason/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MGLCameraChangeReason/*</name>*/[] values() {
        return values.clone();
    }
}
