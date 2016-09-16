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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRMoPubAdConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRMoPubAdConfigurationPtr extends Ptr<TWTRMoPubAdConfiguration, TWTRMoPubAdConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRMoPubAdConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRMoPubAdConfiguration() {}
    protected TWTRMoPubAdConfiguration(Handle h, long handle) { super(h, handle); }
    protected TWTRMoPubAdConfiguration(SkipInit skipInit) { super(skipInit); }
    public TWTRMoPubAdConfiguration(String adUnitID, String keywords) { super((SkipInit) null); initObject(init(adUnitID, keywords)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "keywords")
    public native String getKeywords();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:keywords:")
    protected native @Pointer long init(String adUnitID, String keywords);
    /*</methods>*/
}
