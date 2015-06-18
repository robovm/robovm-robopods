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
package org.robovm.pods.chartboost;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBStory/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBStoryPtr extends Ptr<CBStory, CBStoryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBStory.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CBStory() {}
    protected CBStory(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "storyID")
    public native String getID();
    @Property(selector = "storySent")
    public native @MachineSizedUInt long getSentTime();
    @Property(selector = "storyTitle")
    public native String getTitle();
    @Property(selector = "storyContent")
    public native String getContent();
    @Property(selector = "storyImageURL")
    public native String getImageURL();
    @Property(selector = "storyViews")
    public native @MachineSizedUInt long getViews();
    @Property(selector = "storyClicks")
    public native @MachineSizedUInt long getClicks();
    @Property(selector = "storyExpires")
    public native @MachineSizedUInt long getExpireTime();
    @Property(selector = "storyMaxClicks")
    public native @MachineSizedUInt long getMaxClicks();
    @Property(selector = "storyMaxViews")
    public native @MachineSizedUInt long getMaxViews();
    @Property(selector = "storyLink")
    public native String getLink();
    @Property(selector = "storyShowNotification")
    public native boolean showsNotification();
    @Property(selector = "storyShowExpiration")
    public native boolean showsExpiration();
    @Property(selector = "storyViewed")
    public native @MachineSizedUInt long getViewedTime();
    @Property(selector = "storyExpiresHours")
    public native @MachineSizedUInt long getHoursUntilExpiration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "markViewedWithSuccessBlock:withFailureBlock:")
    public native void markViewed(@Block VoidBlock1<CBStory> successBlock, @Block VoidBlock2<NSError, NSDictionary<?, ?>> failureBlock);
    @Method(selector = "markClickedWithSuccessBlock:withFailureBlock:")
    public native void markClicked(@Block VoidBlock1<CBStory> successBlock, @Block VoidBlock2<NSError, NSDictionary<?, ?>> failureBlock);
    @Method(selector = "markNotificationClickedWithSuccessBlock:withFailureBlock:")
    public native void markNotificationClicked(@Block VoidBlock1<CBStory> successBlock, @Block VoidBlock2<NSError, NSDictionary<?, ?>> failureBlock);
    @Method(selector = "markNotificationViewedWithSuccessBlock:withFailureBlock:")
    public native void markNotificationViewed(@Block VoidBlock1<CBStory> successBlock, @Block VoidBlock2<NSError, NSDictionary<?, ?>> failureBlock);
    /*</methods>*/
}
