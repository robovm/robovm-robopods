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
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
@Availability({ @PlatformVersion(platform = Platform.iOS) })
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFInstallation/*</name>*/ 
    extends /*<extends>*/PFObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFInstallationPtr extends Ptr<PFInstallation, PFInstallationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFInstallation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFInstallation() {}
    protected PFInstallation(Handle h, long handle) { super(h, handle); }
    protected PFInstallation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "deviceType")
    public native String getDeviceType();
    @Property(selector = "installationId")
    public native String getInstallationId();
    @Property(selector = "deviceToken")
    public native String getDeviceToken();
    @Property(selector = "setDeviceToken:")
    public native void setDeviceToken(String v);
    @Property(selector = "badge")
    public native @MachineSizedSInt long getBadge();
    @Property(selector = "setBadge:")
    public native void setBadge(@MachineSizedSInt long v);
    @Property(selector = "timeZone")
    public native String getTimeZone();
    @Property(selector = "channels")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getChannels();
    @Property(selector = "setChannels:")
    public native void setChannels(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setDeviceTokenFromData:")
    public native void setDeviceToken(NSData deviceTokenData);
    @Method(selector = "currentInstallation")
    public static native PFInstallation getCurrentInstallation();
    @Method(selector = "query")
    public static native PFQuery<PFInstallation> getQuery();
    /*</methods>*/
}
