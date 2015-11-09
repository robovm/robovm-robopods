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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGManagerPtr extends Ptr<GPGManager, GPGManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGManager() {}
    protected GPGManager(Handle h, long handle) { super(h, handle); }
    protected GPGManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "turnBasedMatchDelegate")
    public native GPGTurnBasedMatchDelegate getTurnBasedMatchDelegate();
    @Property(selector = "setTurnBasedMatchDelegate:", strongRef = true)
    public native void setTurnBasedMatchDelegate(GPGTurnBasedMatchDelegate v);
    @Property(selector = "realTimeRoomDelegate")
    public native GPGRealTimeRoomDelegate getRealTimeRoomDelegate();
    @Property(selector = "setRealTimeRoomDelegate:", strongRef = true)
    public native void setRealTimeRoomDelegate(GPGRealTimeRoomDelegate v);
    @Property(selector = "statusDelegate")
    public native GPGStatusDelegate getStatusDelegate();
    @Property(selector = "setStatusDelegate:", strongRef = true)
    public native void setStatusDelegate(GPGStatusDelegate v);
    @Property(selector = "questDelegate")
    public native GPGQuestDelegate getQuestDelegate();
    @Property(selector = "setQuestDelegate:", strongRef = true)
    public native void setQuestDelegate(GPGQuestDelegate v);
    @Property(selector = "isSignedIn")
    public native boolean isSignedIn();
    @Property(selector = "snapshotsEnabled")
    public native boolean areSnapshotsEnabled();
    @Property(selector = "setSnapshotsEnabled:")
    public native void setSnapshotsEnabled(boolean v);
    @Property(selector = "sdkTag")
    public native @MachineSizedUInt long getSdkTag();
    @Property(selector = "setSdkTag:")
    public native void setSdkTag(@MachineSizedUInt long v);
    @Property(selector = "welcomeBackOffset")
    public native @MachineSizedUInt long getWelcomeBackOffset();
    @Property(selector = "setWelcomeBackOffset:")
    public native void setWelcomeBackOffset(@MachineSizedUInt long v);
    @Property(selector = "welcomeBackToastPlacement")
    public native GPGToastPlacement getWelcomeBackToastPlacement();
    @Property(selector = "setWelcomeBackToastPlacement:")
    public native void setWelcomeBackToastPlacement(GPGToastPlacement v);
    @Property(selector = "achievementUnlockedOffset")
    public native @MachineSizedUInt long getAchievementUnlockedOffset();
    @Property(selector = "setAchievementUnlockedOffset:")
    public native void setAchievementUnlockedOffset(@MachineSizedUInt long v);
    @Property(selector = "achievementUnlockedToastPlacement")
    public native GPGToastPlacement getAchievementUnlockedToastPlacement();
    @Property(selector = "setAchievementUnlockedToastPlacement:")
    public native void setAchievementUnlockedToastPlacement(GPGToastPlacement v);
    @Property(selector = "questCompletedOffset")
    public native @MachineSizedUInt long getQuestCompletedOffset();
    @Property(selector = "setQuestCompletedOffset:")
    public native void setQuestCompletedOffset(@MachineSizedUInt long v);
    @Property(selector = "questCompletedToastPlacement")
    public native GPGToastPlacement getQuestCompletedToastPlacement();
    @Property(selector = "setQuestCompletedToastPlacement:")
    public native void setQuestCompletedToastPlacement(GPGToastPlacement v);
    @Property(selector = "revisionStatus")
    public native GPGRevisionStatus getRevisionStatus();
    @Property(selector = "isRevisionValid")
    public native boolean isRevisionValid();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "signOut")
    public native void signOut();
    @Method(selector = "signIn")
    public native void signIn();
    @Method(selector = "signInWithClientID:silently:")
    public native boolean signIn(String clientID, boolean silently);
    @Method(selector = "signInWithClientID:silently:withExtraScopes:")
    public native boolean signIn(String clientID, boolean silently, @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> scopes);
    @Method(selector = "tryHandleRemoteNotification:")
    public native boolean tryHandleRemoteNotification(UIRemoteNotification userInfo);
    @Method(selector = "tryHandleRemoteNotification:forActionWithIdentifier:completionHandler:")
    public native boolean tryHandleRemoteNotification(UIRemoteNotification userInfo, String identifier, @Block Runnable completionHandler);
    @Method(selector = "registerDeviceToken:forEnvironment:")
    public native void registerDeviceToken(NSData deviceTokenData, GPGPushNotificationEnvironment environment);
    @Method(selector = "unregisterCurrentDeviceToken")
    public native void unregisterCurrentDeviceToken();
    @Method(selector = "refreshRevisionStatus:")
    public native void refreshRevisionStatus(@Block GPGManagerRevisionCheckCallback revisionCheckHandler);
    @Method(selector = "sharedInstance")
    public static native GPGManager getSharedInstance();
    @Method(selector = "registerForInteractiveGamesNotificationsWithType:")
    public static native void registerForInteractiveGamesNotifications(UIUserNotificationType type);
    /*</methods>*/
}
