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
package org.robovm.pods.google.opensource;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusPersonName/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusPersonNamePtr extends Ptr<GTLPlusPersonName, GTLPlusPersonNamePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusPersonName.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusPersonName() {}
    protected GTLPlusPersonName(Handle h, long handle) { super(h, handle); }
    protected GTLPlusPersonName(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "familyName")
    public native String getFamilyName();
    @Property(selector = "setFamilyName:")
    public native void setFamilyName(String v);
    @Property(selector = "formatted")
    public native String getFormatted();
    @Property(selector = "setFormatted:")
    public native void setFormatted(String v);
    @Property(selector = "givenName")
    public native String getGivenName();
    @Property(selector = "setGivenName:")
    public native void setGivenName(String v);
    @Property(selector = "honorificPrefix")
    public native String getHonorificPrefix();
    @Property(selector = "setHonorificPrefix:")
    public native void setHonorificPrefix(String v);
    @Property(selector = "honorificSuffix")
    public native String getHonorificSuffix();
    @Property(selector = "setHonorificSuffix:")
    public native void setHonorificSuffix(String v);
    @Property(selector = "middleName")
    public native String getMiddleName();
    @Property(selector = "setMiddleName:")
    public native void setMiddleName(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
