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
package org.robovm.pods.appodeal;

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
public final class /*<name>*/AppodealAdType/*</name>*/ extends Bits</*<name>*/AppodealAdType/*</name>*/> {
    /*<values>*/
    public static final AppodealAdType None = new AppodealAdType(0L);
    public static final AppodealAdType Interstitial = new AppodealAdType(1L);
    public static final AppodealAdType SkippableVideo = new AppodealAdType(2L);
    public static final AppodealAdType Banner = new AppodealAdType(4L);
    public static final AppodealAdType NativeAd = new AppodealAdType(8L);
    public static final AppodealAdType RewardedVideo = new AppodealAdType(16L);
    public static final AppodealAdType MREC = new AppodealAdType(32L);
    public static final AppodealAdType NonSkippableVideo = new AppodealAdType(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/AppodealAdType/*</name>*/[] values = _values(/*<name>*/AppodealAdType/*</name>*/.class);

    public /*<name>*/AppodealAdType/*</name>*/(long value) { super(value); }
    private /*<name>*/AppodealAdType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/AppodealAdType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/AppodealAdType/*</name>*/(value, mask);
    }
    protected /*<name>*/AppodealAdType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/AppodealAdType/*</name>*/[] values() {
        return values.clone();
    }
}
