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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGScore/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GPGScorePtr extends Ptr<GPGScore, GPGScorePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGScore.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGScore() {}
    protected GPGScore(Handle h, long handle) { super(h, handle); }
    protected GPGScore(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLeaderboardId:")
    public GPGScore(String leaderboardId) { super((SkipInit) null); initObject(init(leaderboardId)); }
    @Method(selector = "initWithCoder:")
    public GPGScore(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "leaderboardId")
    public native String getLeaderboardId();
    @Property(selector = "value")
    public native long getValue();
    @Property(selector = "setValue:")
    public native void setValue(long v);
    @Property(selector = "scoreTag")
    public native String getScoreTag();
    @Property(selector = "setScoreTag:")
    public native void setScoreTag(String v);
    @Property(selector = "formattedRank")
    public native String getFormattedRank();
    @Property(selector = "formattedScore")
    public native String getFormattedScore();
    @Property(selector = "player")
    public native GPGPlayer getPlayer();
    @Property(selector = "rank")
    public native long getRank();
    @Property(selector = "timeSpan")
    public native String getTimeSpan();
    @Property(selector = "writeTimestamp")
    public native long getWriteTimestamp();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLeaderboardId:")
    protected native @Pointer long init(String leaderboardId);
    @Method(selector = "submitScoreWithCompletionHandler:")
    public native boolean submitScore(@Block GPGScoreReportCallback completionHandler);
    @Method(selector = "scoreWithLeaderboardId:")
    public static native GPGScore getScore(String leaderboardId);
    @Method(selector = "batchSubmitScores:completionHandler:")
    public static native void batchSubmitScores(NSArray<GPGScore> scores, @Block GPGScoreReportCallback completionHandler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
