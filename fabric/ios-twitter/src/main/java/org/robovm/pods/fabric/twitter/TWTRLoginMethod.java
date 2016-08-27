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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/TWTRLoginMethod/*</name>*/ extends Bits</*<name>*/TWTRLoginMethod/*</name>*/> {
    /*<values>*/
    public static final TWTRLoginMethod None = new TWTRLoginMethod(0L);
    public static final TWTRLoginMethod SystemAccounts = new TWTRLoginMethod(1L);
    public static final TWTRLoginMethod WebBased = new TWTRLoginMethod(2L);
    public static final TWTRLoginMethod WebBasedForceLogin = new TWTRLoginMethod(4L);
    public static final TWTRLoginMethod All = new TWTRLoginMethod(3L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/TWTRLoginMethod/*</name>*/[] values = _values(/*<name>*/TWTRLoginMethod/*</name>*/.class);

    public /*<name>*/TWTRLoginMethod/*</name>*/(long value) { super(value); }
    private /*<name>*/TWTRLoginMethod/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/TWTRLoginMethod/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/TWTRLoginMethod/*</name>*/(value, mask);
    }
    protected /*<name>*/TWTRLoginMethod/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/TWTRLoginMethod/*</name>*/[] values() {
        return values.clone();
    }
}
