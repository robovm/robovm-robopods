/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
@ForceLinkClass(TWTRAPIError.class)
public enum /*<name>*/TWTRAPIErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    CouldNotAuthenticate(32L),
    PageNotExist(34L),
    NotAuthorizedForEndpoint(37L),
    AccountSuspended(64L),
    APIVersionRetired(68L),
    RateLimitExceeded(88L),
    InvalidOrExpiredToken(89L),
    SSLInvalid(92L),
    OverCapacity(130L),
    InternalError(131L),
    CouldNotAuthenticateTimestampOutOfRange(135L),
    AlreadyFavorited(139L),
    CannotFollowOverLimit(161L),
    NotAuthorizedToSeeStatus(179L),
    OverDailyStatusUpdateLimit(185L),
    StatusIsDuplicate(187L),
    BadAuthenticationData(215L),
    RequestIsAutomated(226L),
    UserMustVerifyLogin(231L),
    BadGuestToken(239L),
    EndpointRetired(251L),
    ApplicationCannotPerformWriteAction(261L),
    CannotMuteSelf(271L),
    CannotMuteSpecifiedUser(272L),
    AlreadyRetweeted(327L),
    TooManyRequests(429L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/TWTRAPIErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/TWTRAPIErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/TWTRAPIErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/TWTRAPIErrorCode/*</name>*/.class.getName());
    }
}
