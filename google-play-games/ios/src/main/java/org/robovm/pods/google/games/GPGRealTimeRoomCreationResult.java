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
package org.robovm.pods.google.games;

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
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/GPGRealTimeRoomCreationResult/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Success(0L),
    FailedMissingCreationData(1L),
    FailedMissingDelegate(2L),
    FailedInvalidVariant(3L),
    FailedInvalidAutoMatchCount(4L),
    FailedInvalidPlayerCount(5L),
    FailedRoomNotInviting(6L),
    FailedMultiplayerNotEnabled(7L),
    FailedNotSignedIn(8L),
    FailedNotOnline(9L),
    FailedUnknown(10L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/GPGRealTimeRoomCreationResult/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GPGRealTimeRoomCreationResult/*</name>*/ valueOf(long n) {
        for (/*<name>*/GPGRealTimeRoomCreationResult/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/GPGRealTimeRoomCreationResult/*</name>*/.class.getName());
    }
}
