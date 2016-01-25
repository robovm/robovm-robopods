/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
@ForceLinkClass(DGTError.class)
public enum /*<name>*/DGTErrorCode/*</name>*/ implements NSErrorCode {
    /*<values>*/
    UnspecifiedError(0L),
    UserCanceledAuthentication(1L),
    UnableToAuthenticateNumber(2L),
    UnableToConfirmNumber(3L),
    UnableToAuthenticatePin(4L),
    UserCanceledFindContacts(5L),
    UserDeniedAddressBookAccess(6L),
    FailedToReadAddressBook(7L),
    UnableToUploadContacts(8L),
    UnableToDeleteContacts(9L),
    UnableToLookupContactMatches(10L),
    UnableToCreateEmailAddress(11L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/DGTErrorCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/DGTErrorCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/DGTErrorCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/DGTErrorCode/*</name>*/.class.getName());
    }
}
