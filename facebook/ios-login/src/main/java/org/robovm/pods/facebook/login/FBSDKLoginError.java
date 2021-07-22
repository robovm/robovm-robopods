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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.accounts.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/FBSDKLoginError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    Reserved(300L),
    Unknown(301L),
    PasswordChanged(302L),
    UserCheckpointed(303L),
    UserMismatch(304L),
    UnconfirmedUser(305L),
    SystemAccountAppDisabled(306L),
    SystemAccountUnavailable(307L),
    BadChallengeString(308L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(FBSDKLoginError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKLoginErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/

    private final long n;

    private /*<name>*/FBSDKLoginError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/FBSDKLoginError/*</name>*/ valueOf(long n) {
        for (/*<name>*/FBSDKLoginError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/FBSDKLoginError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/FBSDKLoginError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/FBSDKLoginError/*</name>*/.getClassDomain();
        }
    }
}
