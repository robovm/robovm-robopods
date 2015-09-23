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
package org.robovm.pods.google.cloudmessaging;

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
public enum /*<name>*/GCMServiceErrorCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    CodeInvalidRequest(0L),
    CodeAuthentication(1L),
    CodeNoAccess(2L),
    CodeTimeout(3L),
    CodeNetwork(4L),
    CodeOperationInProgress(5L),
    CodeUnknown(7L),
    CodeUpstreamServiceNotAvailable(1001L),
    CodeInvalidParameters(1002L),
    CodeMissingTo(1003L),
    Save(1004L),
    SizeExceeded(1005L),
    CodeAlreadyConnected(2001L),
    CodePubSubAlreadySubscribed(3001L),
    CodePubSubAlreadyUnsubscribed(3002L),
    CodePubSubInvalidTopic(3003L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/GCMServiceErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/GCMServiceErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/GCMServiceErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/GCMServiceErrorCode/*</name>*/.class.getName());
    }
}
