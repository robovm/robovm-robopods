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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGPlayer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGPlayerPtr extends Ptr<GPGPlayer, GPGPlayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGPlayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGPlayer() {}
    protected GPGPlayer(Handle h, long handle) { super(h, handle); }
    protected GPGPlayer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "imageUrl")
    public native NSURL getImageUrl();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "playerId")
    public native String getPlayerId();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "currentExperiencePoints")
    public native long getCurrentExperiencePoints();
    @Property(selector = "lastLevelUpTimestamp")
    public native long getLastLevelUpTimestamp();
    @Property(selector = "currentLevel")
    public native GPGPlayerLevel getCurrentLevel();
    @Property(selector = "nextLevel")
    public native GPGPlayerLevel getNextLevel();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "localPlayerWithCompletionHandler:")
    public static native void getLocalPlayer(@Block GPGPlayerGetCallback completionHandler);
    @Method(selector = "localPlayerFromDataSource:completionHandler:")
    public static native void getLocalPlayer(GPGDataSource dataSource, @Block GPGPlayerGetCallback completionHandler);
    @Method(selector = "recentlyPlayedPlayersWithCompletionHandler:")
    public static native void getRecentlyPlayedPlayers(@Block GPGPlayerGetMultipleCallback completionHandler);
    @Method(selector = "recentlyPlayedPlayersFromDataSource:completionHandler:")
    public static native void getRecentlyPlayedPlayers(GPGDataSource dataSource, @Block GPGPlayerGetMultipleCallback completionHandler);
    @Method(selector = "connectedPlayersWithCompletionHandler:")
    public static native void getConnectedPlayers(@Block GPGPlayerGetMultipleCallback completionHandler);
    @Method(selector = "connectedPlayersFromDataSource:completionHandler:")
    public static native void getConnectedPlayers(GPGDataSource dataSource, @Block GPGPlayerGetMultipleCallback completionHandler);
    /*</methods>*/
}
