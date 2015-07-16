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
/*<annotations>*//*</annotations>*/
@ForceLinkClass(GPGError.class)
public enum /*<name>*/GPGErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InvalidAuthentication(1L),
    NetworkUnavailable(2L),
    ServiceMethodFailed(3L),
    RevisionStale(4L),
    ExceedsMaxQueueCapacity(5L),
    RealTimeErrorCreationParameters(6L),
    TurnBasedErrorCreationParameters(7L),
    RealTimeErrorParticipantConnection(8L),
    PushNotificationParse(9L),
    PushNotificationRegister(10L),
    PushNotificationUnregister(11L),
    GameIsNotRealTimeEnabled(12L),
    GameIsNotTurnBasedEnabled(13L),
    NotSignedInToPlayGames(14L),
    HasPendingOperations(15L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/GPGErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GPGErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GPGErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/GPGErrorCode/*</name>*/.class.getName());
    }
}
