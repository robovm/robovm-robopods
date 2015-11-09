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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGLeaderboard/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGLeaderboardPtr extends Ptr<GPGLeaderboard, GPGLeaderboardPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGLeaderboard.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGLeaderboard() {}
    protected GPGLeaderboard(Handle h, long handle) { super(h, handle); }
    protected GPGLeaderboard(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLeaderboardId:")
    public GPGLeaderboard(String leaderboardId) { super((SkipInit) null); initObject(init(leaderboardId)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "leaderboardId")
    public native String getLeaderboardId();
    @Property(selector = "isPersonalWindow")
    public native boolean isPersonalWindow();
    @Property(selector = "setPersonalWindow:")
    public native void setPersonalWindow(boolean v);
    @Property(selector = "timeScope")
    public native GPGLeaderboardTimeScope getTimeScope();
    @Property(selector = "setTimeScope:")
    public native void setTimeScope(GPGLeaderboardTimeScope v);
    @Property(selector = "isSocial")
    public native boolean isSocial();
    @Property(selector = "setSocial:")
    public native void setSocial(boolean v);
    @Property(selector = "isLoading")
    public native boolean isLoading();
    @Property(selector = "loadingPreviousPage")
    public native boolean isLoadingPreviousPage();
    @Property(selector = "loadingNextPage")
    public native boolean isLoadingNextPage();
    @Property(selector = "scores")
    public native NSArray<GPGScore> getScores();
    @Property(selector = "localPlayerScore")
    public native GPGLocalPlayerScore getLocalPlayerScore();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "hasPreviousPage")
    public native boolean hasPreviousPage();
    @Property(selector = "hasNextPage")
    public native boolean hasNextPage();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLeaderboardId:")
    protected native @Pointer long init(String leaderboardId);
    @Method(selector = "loadScoresWithCompletionHandler:")
    public native void loadScores(@Block GPGLeaderboardLoadScoresCallback completionHandler);
    @Method(selector = "loadScoresFromDataSource:completionHandler:")
    public native void loadScores(GPGDataSource dataSource, @Block GPGLeaderboardLoadScoresCallback completionHandler);
    @Method(selector = "loadNextPageOfScoresWithCompletionHandler:")
    public native void loadNextPageOfScores(@Block GPGLeaderboardLoadScoresCallback completionHandler);
    @Method(selector = "loadPreviousPageOfScoresWithCompletionHandler:")
    public native void loadPreviousPageOfScores(@Block GPGLeaderboardLoadScoresCallback completionHandler);
    @Method(selector = "resetScoreWithCompletionHandler:")
    public native void resetScore(@Block GPGLeaderboardScoreResetCallback completionHandler);
    @Method(selector = "leaderboardWithId:")
    public static native GPGLeaderboard getLeaderboard(String leaderboardId);
    /*</methods>*/
}
