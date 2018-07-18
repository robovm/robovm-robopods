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
package org.robovm.pods.appodeal;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/APDNativeAdSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class APDNativeAdSettingsPtr extends Ptr<APDNativeAdSettings, APDNativeAdSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(APDNativeAdSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public APDNativeAdSettings() {}
    protected APDNativeAdSettings(Handle h, long handle) { super(h, handle); }
    protected APDNativeAdSettings(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adViewClass")
    public native Class<?> getAdViewClass();
    @Property(selector = "setAdViewClass:", strongRef = true)
    public native void setAdViewClass(Class<?> v);
    @Property(selector = "type")
    public native APDNativeAdType getType();
    @Property(selector = "setType:")
    public native void setType(APDNativeAdType v);
    @Property(selector = "autocacheMask")
    public native APDNativeResourceAutocacheMask getAutocacheMask();
    @Property(selector = "setAutocacheMask:")
    public native void setAutocacheMask(APDNativeResourceAutocacheMask v);
    @Property(selector = "nativeMediaViewPlaceholder")
    public native NSURL getNativeMediaViewPlaceholder();
    @Property(selector = "setNativeMediaViewPlaceholder:")
    public native void setNativeMediaViewPlaceholder(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "defaultSettings")
    public static native APDNativeAdSettings defaultSettings();
    /*</methods>*/
}
