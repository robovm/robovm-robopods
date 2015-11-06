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
package org.robovm.pods.flurry.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAdTargeting/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryAdTargetingPtr extends Ptr<FlurryAdTargeting, FlurryAdTargetingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryAdTargeting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryAdTargeting() {}
    protected FlurryAdTargeting(Handle h, long handle) { super(h, handle); }
    protected FlurryAdTargeting(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "location")
    public native CLLocation getLocation();
    @WeaklyLinked
    @Property(selector = "setLocation:")
    public native void setLocation(CLLocation v);
    @Property(selector = "userCookies")
    public native NSDictionary<?, ?> getUserCookies();
    @Property(selector = "setUserCookies:")
    public native void setUserCookies(NSDictionary<?, ?> v);
    @Property(selector = "keywords")
    public native NSDictionary<?, ?> getKeywords();
    @Property(selector = "setKeywords:")
    public native void setKeywords(NSDictionary<?, ?> v);
    @Property(selector = "testAdsEnabled")
    public native boolean areTestAdsEnabled();
    @Property(selector = "setTestAdsEnabled:")
    public native void setTestAdsEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "targeting")
    public static native FlurryAdTargeting create();
    /*</methods>*/
}
