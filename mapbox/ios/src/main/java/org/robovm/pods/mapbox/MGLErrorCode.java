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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/MGLErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    MGLErrorCodeUnknown(-1L),
    MGLErrorCodeNotFound(1L),
    MGLErrorCodeBadServerResponse(2L),
    MGLErrorCodeConnectionFailed(3L),
    MGLErrorCodeParseStyleFailed(4L),
    MGLErrorCodeLoadStyleFailed(5L),
    MGLErrorCodeSnapshotFailed(6L),
    MGLErrorCodeSourceIsInUseCannotRemove(7L),
    MGLErrorCodeSourceIdentifierMismatch(8L),
    MGLErrorCodeModifyingOfflineStorageFailed(9L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MGLErrorCode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLErrorDomain", optional=true)
    public static native String getDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/MGLErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MGLErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MGLErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MGLErrorCode/*</name>*/.class.getName());
    }
}
