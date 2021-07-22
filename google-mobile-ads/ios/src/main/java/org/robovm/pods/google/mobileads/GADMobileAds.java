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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADMobileAds/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADMobileAdsPtr extends Ptr<GADMobileAds, GADMobileAdsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADMobileAds.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADMobileAds() {}
    protected GADMobileAds(Handle h, long handle) { super(h, handle); }
    protected GADMobileAds(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "applicationVolume")
    public native float getApplicationVolume();
    @Property(selector = "setApplicationVolume:")
    public native void setApplicationVolume(float v);
    @Property(selector = "applicationMuted")
    public native boolean isApplicationMuted();
    @Property(selector = "setApplicationMuted:")
    public native void setApplicationMuted(boolean v);
    @Property(selector = "audioVideoManager")
    public native GADAudioVideoManager getAudioVideoManager();
    @Property(selector = "requestConfiguration")
    public native GADRequestConfiguration getRequestConfiguration();
    @Property(selector = "initializationStatus")
    public native GADInitializationStatus getInitializationStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isSDKVersionAtLeastMajor:minor:patch:")
    public native boolean isSDKVersionAtLeast(@MachineSizedSInt long major, @MachineSizedSInt long minor, @MachineSizedSInt long patch);
    @Method(selector = "startWithCompletionHandler:")
    public native void start(@Block VoidBlock1<GADInitializationStatus> completionHandler);
    @Method(selector = "sharedInstance")
    public static native GADMobileAds sharedInstance();
    @Method(selector = "disableAutomatedInAppPurchaseReporting")
    public static native void disableAutomatedInAppPurchaseReporting();
    @Method(selector = "disableSDKCrashReporting")
    public static native void disableSDKCrashReporting();
    @Method(selector = "configureWithApplicationID:")
    public static native void configure(String applicationID);
    /*</methods>*/
}
