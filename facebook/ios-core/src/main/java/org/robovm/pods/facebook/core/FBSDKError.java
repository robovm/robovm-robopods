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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/FBSDKError/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Reserved(0L),
    Encryption(1L),
    InvalidArgument(2L),
    Unknown(3L),
    Network(4L),
    AppEventsFlush(5L),
    GraphRequestNonTextMimeTypeReturned(6L),
    GraphRequestProtocolMismatch(7L),
    GraphRequestGraphAPI(8L),
    DialogUnavailable(9L),
    AccessTokenRequired(10L),
    AppVersionUnsupported(11L),
    BrowserUnavailable(12L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(FBSDKError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/FBSDKError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKError/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/FBSDKError/*</name>*/.class.getName());
    }
}
