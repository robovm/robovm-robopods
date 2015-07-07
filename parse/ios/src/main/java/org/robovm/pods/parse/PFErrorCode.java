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
package org.robovm.pods.parse;

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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
@ForceLinkClass(PFError.class)
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/PFErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    InternalServer(1L),
    ConnectionFailed(100L),
    ObjectNotFound(101L),
    InvalidQuery(102L),
    InvalidClassName(103L),
    MissingObjectId(104L),
    InvalidKeyName(105L),
    InvalidPointer(106L),
    InvalidJSON(107L),
    CommandUnavailable(108L),
    IncorrectType(111L),
    InvalidChannelName(112L),
    InvalidDeviceToken(114L),
    PushMisconfigured(115L),
    ObjectTooLarge(116L),
    OperationForbidden(119L),
    CacheMiss(120L),
    InvalidNestedKey(121L),
    InvalidFileName(122L),
    InvalidACL(123L),
    Timeout(124L),
    InvalidEmailAddress(125L),
    DuplicateValue(137L),
    InvalidRoleName(139L),
    ExceededQuota(140L),
    Script(141L),
    Validation(142L),
    ReceiptMissing(143L),
    InvalidPurchaseReceipt(144L),
    PaymentDisabled(145L),
    InvalidProductIdentifier(146L),
    ProductNotFoundInAppStore(147L),
    InvalidServerResponse(148L),
    ProductDownloadFileSystemFailure(149L),
    InvalidImageData(150L),
    UnsavedFile(151L),
    FileDeleteFailure(153L),
    RequestLimitExceeded(155L),
    InvalidEventName(160L),
    UsernameMissing(200L),
    UserPasswordMissing(201L),
    UsernameTaken(202L),
    UserEmailTaken(203L),
    UserEmailMissing(204L),
    UserWithEmailNotFound(205L),
    UserCannotBeAlteredWithoutSession(206L),
    UserCanOnlyBeCreatedThroughSignUp(207L),
    FacebookAccountAlreadyLinked(208L),
    AccountAlreadyLinked(208L),
    InvalidSessionToken(209L),
    UserIdMismatch(209L),
    FacebookIdMissing(250L),
    LinkedIdMissing(250L),
    FacebookInvalidSession(251L),
    InvalidLinkedSession(251L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/PFErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/PFErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/PFErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/PFErrorCode/*</name>*/.class.getName());
    }
}
