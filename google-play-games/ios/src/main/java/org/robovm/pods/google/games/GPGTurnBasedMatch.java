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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGTurnBasedMatch/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGTurnBasedMatchPtr extends Ptr<GPGTurnBasedMatch, GPGTurnBasedMatchPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGTurnBasedMatch.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGTurnBasedMatch() {}
    protected GPGTurnBasedMatch(Handle h, long handle) { super(h, handle); }
    protected GPGTurnBasedMatch(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "matchConfig")
    public native GPGMultiplayerConfig getMatchConfig();
    @Property(selector = "creationTimestamp")
    public native long getCreationTimestamp();
    @Property(selector = "creationParticipant")
    public native GPGTurnBasedParticipant getCreationParticipant();
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "dataAvailable")
    public native boolean isDataAvailable();
    @Property(selector = "inviterParticipant")
    public native GPGTurnBasedParticipant getInviterParticipant();
    @Property(selector = "lastUpdateTimestamp")
    public native long getLastUpdateTimestamp();
    @Property(selector = "lastUpdateParticipant")
    public native GPGTurnBasedParticipant getLastUpdateParticipant();
    @Property(selector = "matchDescription")
    public native String getMatchDescription();
    @Property(selector = "matchId")
    public native String getMatchId();
    @Property(selector = "matchNumber")
    public native int getMatchNumber();
    @Property(selector = "matchVersion")
    public native int getMatchVersion();
    @Property(selector = "participants")
    public native NSArray<GPGTurnBasedParticipant> getParticipants();
    @Property(selector = "pendingParticipant")
    public native GPGTurnBasedParticipant getPendingParticipant();
    @Property(selector = "previousMatchData")
    public native NSData getPreviousMatchData();
    @Property(selector = "previousMatchDataAvailable")
    public native boolean isPreviousMatchDataAvailable();
    @Property(selector = "rematchId")
    public native String getRematchId();
    @Property(selector = "results")
    public native NSArray<GPGTurnBasedParticipantResult> getResults();
    @Property(selector = "status")
    public native GPGTurnBasedMatchStatus getStatus();
    @Property(selector = "userMatchStatus")
    public native GPGTurnBasedUserMatchStatus getUserMatchStatus();
    @Property(selector = "localParticipantId")
    public native String getLocalParticipantId();
    @Property(selector = "localParticipant")
    public native GPGTurnBasedParticipant getLocalParticipant();
    @Property(selector = "pendingPlayer")
    public native GPGPlayer getPendingPlayer();
    @Property(selector = "isMyTurn")
    public native boolean isMyTurn();
    @Property(selector = "myResult")
    public native GPGTurnBasedParticipantResult getMyResult();
    @Property(selector = "myStatus")
    public native GPGTurnBasedParticipantStatus getMyStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGPGTurnBasedMinPlayers", optional=true)
    public static native int getMinPlayers();
    @GlobalValue(symbol="kGPGTurnBasedMaxPlayers", optional=true)
    public static native int getMaxPlayers();
    
    @Method(selector = "canParticipantTakeTurn:")
    public native boolean canParticipantTakeTurn(String participantId);
    @Method(selector = "participantIdForPlayerId:")
    public native String getParticipantIdForPlayerId(String playerId);
    @Method(selector = "participantForId:")
    public native GPGTurnBasedParticipant findParticipantById(String participantId);
    @Method(selector = "resultForParticipantId:")
    public native GPGTurnBasedParticipantResult getParticipantResult(String participantId);
    @Method(selector = "statusForPlayerId:")
    public native GPGTurnBasedParticipantStatus getPlayerStatus(String playerId);
    @Method(selector = "cancelWithCompletionHandler:")
    public native void cancel(@Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "declineWithCompletionHandler:")
    public native void decline(@Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "dismissWithCompletionHandler:")
    public native void dismiss(@Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "finishWithData:results:completionHandler:")
    public native void finish(NSData data, NSArray<GPGTurnBasedParticipantResult> results, @Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "joinWithCompletionHandler:")
    public native void join(@Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "leaveOutOfTurnWithCompletionHandler:")
    public native void leaveOutOfTurn(@Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "leaveDuringTurnWithNextParticipantId:completionHandler:")
    public native void leaveDuringTurn(String nextParticipantId, @Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "rematchWithCompletionHandler:")
    public native void rematch(@Block GPGTurnBasedMatchRematchCallback completionHandler);
    @Method(selector = "takeTurnWithNextParticipantId:data:results:completionHandler:")
    public native void takeTurn(String nextParticipantId, NSData data, NSArray<GPGTurnBasedParticipantResult> results, @Block GPGTurnBasedMatchCompletionCallback completionHandler);
    @Method(selector = "createMatchWithConfig:completionHandler:")
    public static native GPGTurnBasedMatchCreationResult create(GPGMultiplayerConfig config, @Block GPGTurnBasedMatchCreateCallback completionHandler);
    @Method(selector = "fetchMatchWithId:includeMatchData:completionHandler:")
    public static native void getMatch(String matchId, boolean includeMatchData, @Block GPGTurnBasedMatchGetCallback completionHandler);
    @Method(selector = "listForIncludeMatchData:maxCompletedMatches:maxResults:pageToken:completionHandler:")
    public static native void getMatchList(boolean includeMatchData, int maxCompletedMatches, int maxResults, String pageToken, @Block GPGTurnBasedMatchGetListCallback completionHandler);
    @Method(selector = "allMatchesWithCompletionHandler:")
    public static native void getAllMatches(@Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    @Method(selector = "allMatchesFromDataSource:completionHandler:")
    public static native void getAllMatches(GPGDataSource dataSource, @Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    @Method(selector = "matchesForMatchStatus:completionHandler:")
    public static native void getMatchesForStatus(GPGTurnBasedMatchStatus status, @Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    @Method(selector = "matchesForMatchStatus:dataSource:completionHandler:")
    public static native void getMatchesForStatus(GPGTurnBasedMatchStatus status, GPGDataSource dataSource, @Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    @Method(selector = "matchesForUserMatchStatus:completionHandler:")
    public static native void getMatchesForUserStatus(GPGTurnBasedUserMatchStatus status, @Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    @Method(selector = "matchesForUserMatchStatus:dataSource:completionHandler:")
    public static native void getMatchesForUserStatus(GPGTurnBasedUserMatchStatus status, GPGDataSource dataSource, @Block GPGTurnBasedMatchGetMultipleCallback completionHandler);
    /*</methods>*/
}
