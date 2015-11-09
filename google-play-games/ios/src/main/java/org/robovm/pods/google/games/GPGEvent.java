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
package org.robovm.pods.google.games;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGEvent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGEventPtr extends Ptr<GPGEvent, GPGEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGEvent() {}
    protected GPGEvent(Handle h, long handle) { super(h, handle); }
    protected GPGEvent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "count")
    public native long getCount();
    @Property(selector = "eventDescription")
    public native String getEventDescription();
    @Property(selector = "eventId")
    public native String getEventId();
    @Property(selector = "imageUrl")
    public native NSURL getImageUrl();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "visible")
    public native boolean isVisible();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "increment")
    public native void increment();
    @Method(selector = "incrementBy:")
    public native void incrementBy(long steps);
    @Method(selector = "incrementWithCompletionHandler:")
    public native void increment(@Block GPGEventOperationCallback completionHandler);
    @Method(selector = "incrementBy:completionHandler:")
    public native void incrementBy(long steps, @Block GPGEventOperationCallback completionHandler);
    @Method(selector = "allEventsWithCompletionHandler:")
    public static native void getAllEvents(@Block GPGEventGetAllCallback completionHandler);
    @Method(selector = "eventForId:completionHandler:")
    public static native void getEvent(String eventId, @Block GPGEventOperationCallback completionHandler);
    /*</methods>*/
}
