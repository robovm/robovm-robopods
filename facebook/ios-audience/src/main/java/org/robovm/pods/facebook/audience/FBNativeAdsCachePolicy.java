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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/FBNativeAdsCachePolicy/*</name>*/ extends Bits</*<name>*/FBNativeAdsCachePolicy/*</name>*/> {
    /*<values>*/
    public static final FBNativeAdsCachePolicy None = new FBNativeAdsCachePolicy(1L);
    public static final FBNativeAdsCachePolicy Icon = new FBNativeAdsCachePolicy(2L);
    public static final FBNativeAdsCachePolicy CoverImage = new FBNativeAdsCachePolicy(4L);
    public static final FBNativeAdsCachePolicy Video = new FBNativeAdsCachePolicy(8L);
    public static final FBNativeAdsCachePolicy All = new FBNativeAdsCachePolicy(14L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/FBNativeAdsCachePolicy/*</name>*/[] values = _values(/*<name>*/FBNativeAdsCachePolicy/*</name>*/.class);

    public /*<name>*/FBNativeAdsCachePolicy/*</name>*/(long value) { super(value); }
    private /*<name>*/FBNativeAdsCachePolicy/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/FBNativeAdsCachePolicy/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/FBNativeAdsCachePolicy/*</name>*/(value, mask);
    }
    protected /*<name>*/FBNativeAdsCachePolicy/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/FBNativeAdsCachePolicy/*</name>*/[] values() {
        return values.clone();
    }
}
