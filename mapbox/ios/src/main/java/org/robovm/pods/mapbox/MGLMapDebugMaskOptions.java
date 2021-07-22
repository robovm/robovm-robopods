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
public final class /*<name>*/MGLMapDebugMaskOptions/*</name>*/ extends Bits</*<name>*/MGLMapDebugMaskOptions/*</name>*/> {
    /*<values>*/
    public static final MGLMapDebugMaskOptions None = new MGLMapDebugMaskOptions(0L);
    public static final MGLMapDebugMaskOptions TileBoundariesMask = new MGLMapDebugMaskOptions(2L);
    public static final MGLMapDebugMaskOptions TileInfoMask = new MGLMapDebugMaskOptions(4L);
    public static final MGLMapDebugMaskOptions TimestampsMask = new MGLMapDebugMaskOptions(8L);
    public static final MGLMapDebugMaskOptions CollisionBoxesMask = new MGLMapDebugMaskOptions(16L);
    public static final MGLMapDebugMaskOptions OverdrawVisualizationMask = new MGLMapDebugMaskOptions(32L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MGLMapDebugMaskOptions/*</name>*/[] values = _values(/*<name>*/MGLMapDebugMaskOptions/*</name>*/.class);

    public /*<name>*/MGLMapDebugMaskOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/MGLMapDebugMaskOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MGLMapDebugMaskOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MGLMapDebugMaskOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/MGLMapDebugMaskOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MGLMapDebugMaskOptions/*</name>*/[] values() {
        return values.clone();
    }
}
