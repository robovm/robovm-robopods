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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGQuest/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGQuestPtr extends Ptr<GPGQuest, GPGQuestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGQuest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGQuest() {}
    protected GPGQuest(Handle h, long handle) { super(h, handle); }
    protected GPGQuest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "questId")
    public native String getQuestId();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "questDescription")
    public native String getQuestDescription();
    @Property(selector = "iconUrl")
    public native NSURL getIconUrl();
    @Property(selector = "bannerUrl")
    public native NSURL getBannerUrl();
    @Property(selector = "currentMilestone")
    public native GPGQuestMilestone getCurrentMilestone();
    @Property(selector = "state")
    public native GPGQuestState getState();
    @Property(selector = "startTimestamp")
    public native long getStartTimestamp();
    @Property(selector = "expirationTimestamp")
    public native long getExpirationTimestamp();
    @Property(selector = "acceptedTimestamp")
    public native long getAcceptedTimestamp();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "acceptWithCompletionHandler:")
    public native void accept(@Block GPGQuestCompletionCallback completionHandler);
    @Method(selector = "fetchQuestWithId:completionHandler:")
    public static native void getQuest(String questId, @Block GPGQuestGetCallback completionHandler);
    @Method(selector = "allQuestsWithCompletionHandler:")
    public static native void getAllQuests(@Block GPGQuestGetAllCallback completionHandler);
    @Method(selector = "allQuestsFromDataSource:completionHandler:")
    public static native void getAllQuests(GPGDataSource dataSource, @Block GPGQuestGetAllCallback completionHandler);
    @Method(selector = "questsForState:completionHandler:")
    public static native void getQuestsForState(GPGQuestState state, @Block GPGQuestGetAllCallback completionHandler);
    /*</methods>*/
}
