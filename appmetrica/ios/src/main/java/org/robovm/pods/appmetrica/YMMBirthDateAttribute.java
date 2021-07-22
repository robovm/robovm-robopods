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
package org.robovm.pods.appmetrica;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/YMMBirthDateAttribute/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "withAge:")
    YMMUserProfileUpdate withAge(@MachineSizedUInt long value);
    @Method(selector = "withYear:")
    YMMUserProfileUpdate withYear(@MachineSizedUInt long year);
    @Method(selector = "withYear:month:")
    YMMUserProfileUpdate with(@MachineSizedUInt long year, @MachineSizedUInt long month);
    @Method(selector = "withYear:month:day:")
    YMMUserProfileUpdate with(@MachineSizedUInt long year, @MachineSizedUInt long month, @MachineSizedUInt long day);
    @Method(selector = "withDateComponents:")
    YMMUserProfileUpdate withDateComponents(NSDateComponents dateComponents);
    @Method(selector = "withValueReset")
    YMMUserProfileUpdate withValueReset();
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
