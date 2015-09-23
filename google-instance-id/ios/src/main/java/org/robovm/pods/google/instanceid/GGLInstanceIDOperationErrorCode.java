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
package org.robovm.pods.google.instanceid;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/GGLInstanceIDOperationErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    InvalidRequest(0L),
    Authentication(1L),
    NoAccess(2L),
    Timeout(3L),
    Network(4L),
    OperationInProgress(5L),
    Unknown(7L),
    MissingAPNSToken(1001L),
    MissingAPNSServerType(1002L),
    InvalidAuthorizedEntity(1003L),
    InvalidScope(1004L),
    InvalidStart(1005L),
    InvalidKeyPair(1006L),
    MissingKeyPair(2001L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/GGLInstanceIDOperationErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GGLInstanceIDOperationErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GGLInstanceIDOperationErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/GGLInstanceIDOperationErrorCode/*</name>*/.class.getName());
    }
}
