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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLDateTime/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLDateTimePtr extends Ptr<GTLDateTime, GTLDateTimePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLDateTime.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLDateTime() {}
    protected GTLDateTime(Handle h, long handle) { super(h, handle); }
    protected GTLDateTime(SkipInit skipInit) { super(skipInit); }
    public GTLDateTime(String rfc3339) { super((Handle) null, create(rfc3339)); retain(getHandle()); }
    public GTLDateTime(NSDate date, NSTimeZone tz) { super((Handle) null, create(date, tz)); retain(getHandle()); }
    public GTLDateTime(NSDate date) { super((Handle) null, create(date)); retain(getHandle()); }
    public GTLDateTime(NSDateComponents date) { super((Handle) null, create(date)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "date")
    public native NSDate getDate();
    @Property(selector = "calendar")
    public native NSCalendar getCalendar();
    @Property(selector = "RFC3339String")
    public native String getRFC3339String();
    @Property(selector = "stringValue")
    public native String getStringValue();
    @Property(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @Property(selector = "dateComponents")
    public native NSDateComponents getDateComponents();
    @Property(selector = "milliseconds")
    public native @MachineSizedSInt long getMilliseconds();
    @Property(selector = "hasTime")
    public native boolean hasTime();
    @Property(selector = "offsetSeconds")
    public native @MachineSizedSInt long getOffsetSeconds();
    @Property(selector = "isUniversalTime")
    public native boolean isUniversalTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "dateTimeWithRFC3339String:")
    protected static native @Pointer long create(String rfc3339);
    @Method(selector = "dateTimeWithDate:timeZone:")
    protected static native @Pointer long create(NSDate date, NSTimeZone tz);
    @Method(selector = "dateTimeForAllDayWithDate:")
    protected static native @Pointer long create(NSDate date);
    @Method(selector = "dateTimeWithDateComponents:")
    protected static native @Pointer long create(NSDateComponents date);
    /*</methods>*/
}
