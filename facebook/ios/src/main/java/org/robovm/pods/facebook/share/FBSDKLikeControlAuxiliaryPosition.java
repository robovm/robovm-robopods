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
package org.robovm.pods.facebook.share;

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
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/FBSDKLikeControlAuxiliaryPosition/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Inline(0L),
    Top(1L),
    Bottom(2L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(FBSDKLikeControlAuxiliaryPosition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="NSStringFromFBSDKLikeControlAuxiliaryPosition", optional=true)
    public static native String toString(FBSDKLikeControlAuxiliaryPosition auxiliaryPosition);
    /*</methods>*/
    public String toString() {
        return toString(this);
    }

    private final long n;

    private /*<name>*/FBSDKLikeControlAuxiliaryPosition/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKLikeControlAuxiliaryPosition/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKLikeControlAuxiliaryPosition/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBSDKLikeControlAuxiliaryPosition/*</name>*/.class.getName());
    }
}
