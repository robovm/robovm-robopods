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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGScoreReport/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGScoreReportPtr extends Ptr<GPGScoreReport, GPGScoreReportPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGScoreReport.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGScoreReport() {}
    protected GPGScoreReport(Handle h, long handle) { super(h, handle); }
    protected GPGScoreReport(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isHighScoreForLocalPlayerToday")
    public native boolean isHighScoreForLocalPlayerToday();
    @Property(selector = "isHighScoreForLocalPlayerThisWeek")
    public native boolean isHighScoreForLocalPlayerThisWeek();
    @Property(selector = "isHighScoreForLocalPlayerAllTime")
    public native boolean isHighScoreForLocalPlayerAllTime();
    @Property(selector = "leaderboardId")
    public native String getLeaderboardId();
    @Property(selector = "reportedScoreValue")
    public native long getReportedScoreValue();
    @Property(selector = "highScoreForLocalPlayerToday")
    public native GPGScore getHighScoreForLocalPlayerToday();
    @Property(selector = "highScoreForLocalPlayerThisWeek")
    public native GPGScore getHighScoreForLocalPlayerThisWeek();
    @Property(selector = "highScoreForLocalPlayerAllTime")
    public native GPGScore getHighScoreForLocalPlayerAllTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
