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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGLauncherController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGLauncherControllerPtr extends Ptr<GPGLauncherController, GPGLauncherControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGLauncherController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGLauncherController() {}
    protected GPGLauncherController(Handle h, long handle) { super(h, handle); }
    protected GPGLauncherController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "launcherDelegate")
    public native GPGLauncherDelegate getLauncherDelegate();
    @Property(selector = "setLauncherDelegate:", strongRef = true)
    public native void setLauncherDelegate(GPGLauncherDelegate v);
    @Property(selector = "playerPickerLauncherDelegate")
    public native GPGPlayerPickerLauncherDelegate getPlayerPickerLauncherDelegate();
    @Property(selector = "setPlayerPickerLauncherDelegate:", strongRef = true)
    public native void setPlayerPickerLauncherDelegate(GPGPlayerPickerLauncherDelegate v);
    @Property(selector = "turnBasedMatchListLauncherDelegate")
    public native GPGTurnBasedMatchListLauncherDelegate getTurnBasedMatchListLauncherDelegate();
    @Property(selector = "setTurnBasedMatchListLauncherDelegate:", strongRef = true)
    public native void setTurnBasedMatchListLauncherDelegate(GPGTurnBasedMatchListLauncherDelegate v);
    @Property(selector = "questListLauncherDelegate")
    public native GPGQuestListLauncherDelegate getQuestListLauncherDelegate();
    @Property(selector = "setQuestListLauncherDelegate:", strongRef = true)
    public native void setQuestListLauncherDelegate(GPGQuestListLauncherDelegate v);
    @Property(selector = "snapshotListLauncherDelegate")
    public native GPGSnapshotListLauncherDelegate getSnapshotListLauncherDelegate();
    @Property(selector = "setSnapshotListLauncherDelegate:", strongRef = true)
    public native void setSnapshotListLauncherDelegate(GPGSnapshotListLauncherDelegate v);
    @Property(selector = "presentingLauncherType")
    public native GPGLauncherType getPresentingLauncherType();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "presentPlayerPicker")
    public native void presentPlayerPicker();
    @Method(selector = "presentTurnBasedMatchList")
    public native void presentTurnBasedMatchList();
    @Method(selector = "presentTurnBasedMatchListWithMatches:")
    public native void presentTurnBasedMatchList(NSArray<GPGTurnBasedMatch> matches);
    @Method(selector = "presentQuestList")
    public native void presentQuestList();
    @Method(selector = "presentQuestListWithQuestId:")
    public native void presentQuestList(String questId);
    @Method(selector = "presentSnapshotList")
    public native void presentSnapshotList();
    @Method(selector = "presentLeaderboardWithLeaderboardId:")
    public native void presentLeaderboard(String leaderboardId);
    @Method(selector = "presentLeaderboardWithLeaderboardId:andTimeScope:")
    public native void presentLeaderboard(String leaderboardId, GPGLeaderboardTimeScope timeScope);
    @Method(selector = "presentLeaderboardList")
    public native void presentLeaderboardList();
    @Method(selector = "presentAchievementList")
    public native void presentAchievementList();
    @Method(selector = "presentRealTimeInvitesWithRoomDataList:")
    public native void presentRealTimeInvites(NSArray<GPGRealTimeRoomData> roomDataList);
    @Method(selector = "presentRealTimeInviteWithMinPlayers:maxPlayers:exclusiveBitMask:variant:")
    public native void presentRealTimeInvite(int minPlayers, int maxPlayers, long exclusiveBitMask, int variant);
    @Method(selector = "presentRealTimeInviteWithMinPlayers:maxPlayers:")
    public native void presentRealTimeInvite(int minPlayers, int maxPlayers);
    @Method(selector = "presentRealTimeWaitingRoomWithConfig:")
    public native void presentRealTimeWaitingRoom(GPGMultiplayerConfig config);
    @Method(selector = "presentRealTimeWaitingRoomWithRoomData:")
    public native void presentRealTimeWaitingRoom(GPGRealTimeRoomData roomData);
    @Method(selector = "presentSettings")
    public native void presentSettings();
    @Method(selector = "dismissAnimated:completionHandler:")
    public native void dismiss(boolean animated, @Block Runnable completionHandler);
    @Method(selector = "sharedInstance")
    public static native GPGLauncherController getSharedInstance();
    /*</methods>*/
}
