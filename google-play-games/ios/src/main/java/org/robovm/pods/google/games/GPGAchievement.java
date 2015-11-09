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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGAchievement/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGAchievementPtr extends Ptr<GPGAchievement, GPGAchievementPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGAchievement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGAchievement() {}
    protected GPGAchievement(Handle h, long handle) { super(h, handle); }
    protected GPGAchievement(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAchievementId:")
    public GPGAchievement(String achievementId) { super((SkipInit) null); initObject(init(achievementId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "achievementId")
    public native String getAchievementId();
    @Property(selector = "showsCompletionNotification")
    public native boolean showsCompletionNotification();
    @Property(selector = "setShowsCompletionNotification:")
    public native void setShowsCompletionNotification(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAchievementId:")
    protected native @Pointer long init(String achievementId);
    @Method(selector = "unlockAchievementWithCompletionHandler:")
    public native void unlock(@Block GPGAchievementUnlockCallback completionHandler);
    @Method(selector = "revealAchievementWithCompletionHandler:")
    public native void reveal(@Block GPGAchievementRevealCallback completionHandler);
    @Method(selector = "incrementAchievementNumSteps:completionHandler:")
    public native void incrementSteps(@MachineSizedSInt long steps, @Block GPGAchievementIncrementStepsCallback completionHandler);
    @Method(selector = "setSteps:completionHandler:")
    public native void setSteps(@MachineSizedSInt long steps, @Block GPGAchievementSetStepsCallback completionHandler);
    @Method(selector = "resetAchievementWithCompletionHandler:")
    public native void reset(@Block GPGAchievementResetCallback completionHandler);
    @Method(selector = "resetAllAchievementsWithCompletionHandler:")
    public static native void resetAll(@Block GPGAchievementResetAllCallback completionHandler);
    /*</methods>*/
}
