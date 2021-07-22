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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/FBAdTestAdType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Default(0L),
    Img_16_9_App_Install(1L),
    Img_16_9_Link(2L),
    Vid_HD_16_9_46s_App_Install(3L),
    Vid_HD_16_9_46s_Link(4L),
    Vid_HD_16_9_15s_App_Install(5L),
    Vid_HD_16_9_15s_Link(6L),
    Vid_HD_9_16_39s_App_Install(7L),
    Vid_HD_9_16_39s_Link(8L),
    Carousel_Img_Square_App_Install(9L),
    Carousel_Img_Square_Link(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/FBAdTestAdType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBAdTestAdType/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBAdTestAdType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBAdTestAdType/*</name>*/.class.getName());
    }
}
