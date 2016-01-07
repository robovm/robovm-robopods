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
package org.robovm.pods.heyzap.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/HZAdOptions/*</name>*/ extends Bits</*<name>*/HZAdOptions/*</name>*/> {
    /*<values>*/
    public static final HZAdOptions None = new HZAdOptions(0L);
    public static final HZAdOptions DisableAutoPrefetching = new HZAdOptions(1L);
    public static final HZAdOptions InstallTrackingOnly = new HZAdOptions(2L);
    public static final HZAdOptions AdvertiserOnly = new HZAdOptions(2L);
    public static final HZAdOptions Amazon = new HZAdOptions(4L);
    public static final HZAdOptions DisableMedation = new HZAdOptions(8L);
    public static final HZAdOptions DisableAutomaticIAPRecording = new HZAdOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/HZAdOptions/*</name>*/[] values = _values(/*<name>*/HZAdOptions/*</name>*/.class);

    public /*<name>*/HZAdOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/HZAdOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/HZAdOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/HZAdOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/HZAdOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/HZAdOptions/*</name>*/[] values() {
        return values.clone();
    }
}
