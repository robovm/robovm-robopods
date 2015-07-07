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
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.bolts.*;
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/PFSignUpFields/*</name>*/ extends Bits</*<name>*/PFSignUpFields/*</name>*/> {
    /*<values>*/
    public static final PFSignUpFields None = new PFSignUpFields(0L);
    public static final PFSignUpFields UsernameAndPassword = new PFSignUpFields(0L);
    public static final PFSignUpFields Email = new PFSignUpFields(1L);
    public static final PFSignUpFields Additional = new PFSignUpFields(2L);
    public static final PFSignUpFields SignUpButton = new PFSignUpFields(4L);
    public static final PFSignUpFields DismissButton = new PFSignUpFields(8L);
    public static final PFSignUpFields Default = new PFSignUpFields(13L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/PFSignUpFields/*</name>*/[] values = _values(/*<name>*/PFSignUpFields/*</name>*/.class);

    public /*<name>*/PFSignUpFields/*</name>*/(long value) { super(value); }
    private /*<name>*/PFSignUpFields/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/PFSignUpFields/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/PFSignUpFields/*</name>*/(value, mask);
    }
    protected /*<name>*/PFSignUpFields/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/PFSignUpFields/*</name>*/[] values() {
        return values.clone();
    }
}
