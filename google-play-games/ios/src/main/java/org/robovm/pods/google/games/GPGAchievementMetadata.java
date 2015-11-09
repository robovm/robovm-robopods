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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGAchievementMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class GPGAchievementMetadataPtr extends Ptr<GPGAchievementMetadata, GPGAchievementMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGAchievementMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGAchievementMetadata() {}
    protected GPGAchievementMetadata(Handle h, long handle) { super(h, handle); }
    protected GPGAchievementMetadata(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public GPGAchievementMetadata(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "achievementId")
    public native String getAchievementId();
    @Property(selector = "state")
    public native GPGAchievementState getState();
    @Property(selector = "type")
    public native GPGAchievementType getType();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "achievementDescription")
    public native String getAchievementDescription();
    @Property(selector = "revealedIconUrl")
    public native NSURL getRevealedIconUrl();
    @Property(selector = "unlockedIconUrl")
    public native NSURL getUnlockedIconUrl();
    @Property(selector = "completedSteps")
    public native int getCompletedSteps();
    @Property(selector = "numberOfSteps")
    public native int getNumberOfSteps();
    @Property(selector = "formattedCompletedSteps")
    public native String getFormattedCompletedSteps();
    @Property(selector = "formattedNumberOfSteps")
    public native String getFormattedNumberOfSteps();
    @Property(selector = "lastUpdatedTimestamp")
    public native long getLastUpdatedTimestamp();
    @Property(selector = "progress")
    public native @MachineSizedFloat double getProgress();
    @Property(selector = "experiencePoints")
    public native int getExperiencePoints();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "metadataForAchievementId:completionHandler:")
    public static native void getMetadata(String achievementId, @Block GPGAchievementMetadataGetCallback completionHandler);
    @Method(selector = "metadataForAchievementId:dataSource:completionHandler:")
    public static native void getMetadata(String achievementId, GPGDataSource dataSource, @Block GPGAchievementMetadataGetCallback completionHandler);
    @Method(selector = "allMetadataWithCompletionHandler:")
    public static native void getAllMetadata(@Block GPGAchievementMetadataGetAllCallback completionHandler);
    @Method(selector = "allMetadataFromDataSource:completionHandler:")
    public static native void getAllMetadata(GPGDataSource dataSource, @Block GPGAchievementMetadataGetAllCallback completionHandler);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
