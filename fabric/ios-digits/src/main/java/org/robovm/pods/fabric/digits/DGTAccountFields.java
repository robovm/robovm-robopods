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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/DGTAccountFields/*</name>*/ extends Bits</*<name>*/DGTAccountFields/*</name>*/> {
    /*<values>*/
    public static final DGTAccountFields None = new DGTAccountFields(1L);
    public static final DGTAccountFields Email = new DGTAccountFields(2L);
    public static final DGTAccountFields DefaultOptionMask = new DGTAccountFields(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/DGTAccountFields/*</name>*/[] values = _values(/*<name>*/DGTAccountFields/*</name>*/.class);

    public /*<name>*/DGTAccountFields/*</name>*/(long value) { super(value); }
    private /*<name>*/DGTAccountFields/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/DGTAccountFields/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/DGTAccountFields/*</name>*/(value, mask);
    }
    protected /*<name>*/DGTAccountFields/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/DGTAccountFields/*</name>*/[] values() {
        return values.clone();
    }
}
