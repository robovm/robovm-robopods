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
package org.robovm.pods.google.analytics;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAI/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIPtr extends Ptr<GAI, GAIPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAI.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAI() {}
    protected GAI(Handle h, long handle) { super(h, handle); }
    protected GAI(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /**
     * Use this method in {@link UIApplicationDelegate#didFinishLaunching(UIApplication, UIApplicationLaunchOptions)} to install 
     * the crash reporting signal handler of Google Analytics.
     */
    public void enableCrashReporting() {
        Signals.installSignals(new Signals.InstallSignalsCallback() {
            @Override
            public void install() {
                setTracksUncaughtExceptions(true);
            }
        });
    }
    /*<properties>*/
    @Property(selector = "defaultTracker")
    public native GAITracker getDefaultTracker();
    @Property(selector = "setDefaultTracker:", strongRef = true)
    public native void setDefaultTracker(GAITracker v);
    @Property(selector = "logger")
    public native GAILogger getLogger();
    @Property(selector = "setLogger:")
    public native void setLogger(GAILogger v);
    @Property(selector = "optOut")
    public native boolean isOptOut();
    @Property(selector = "setOptOut:")
    public native void setOptOut(boolean v);
    @Property(selector = "dispatchInterval")
    public native double getDispatchInterval();
    @Property(selector = "setDispatchInterval:")
    public native void setDispatchInterval(double v);
    @Property(selector = "trackUncaughtExceptions")
    public native boolean tracksUncaughtExceptions();
    @Property(selector = "setTrackUncaughtExceptions:")
    public native void setTracksUncaughtExceptions(boolean v);
    @Property(selector = "dryRun")
    public native boolean isDryRun();
    @Property(selector = "setDryRun:")
    public native void setDryRun(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGAIProduct", optional=true)
    public static native String getProductString();
    @GlobalValue(symbol="kGAIVersion", optional=true)
    public static native String getVersionString();
    
    @Method(selector = "trackerWithName:trackingId:")
    public native GAITracker getTracker(String name, String trackingId);
    @Method(selector = "trackerWithTrackingId:")
    public native GAITracker getTracker(String trackingId);
    @Method(selector = "removeTrackerByName:")
    public native void removeTracker(String name);
    @Method(selector = "dispatch")
    public native void dispatch();
    @Method(selector = "dispatchWithCompletionHandler:")
    public native void dispatch(@Block VoidBlock1<GAIDispatchResult> completionHandler);
    @Method(selector = "sharedInstance")
    public static native GAI getSharedInstance();
    /*</methods>*/
}
