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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBNewsfeed/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBNewsfeedPtr extends Ptr<CBNewsfeed, CBNewsfeedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBNewsfeed.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CBNewsfeed() {}
    protected CBNewsfeed(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    private static CBNewsfeedDelegate delegate;
    
    public static void start(CBNewsfeedDelegate delegate) {
        CBNewsfeed.delegate = delegate;
        start0(delegate);
    }
    /*<methods>*/
    @Method(selector = "startWithDelegate:")
    private static native void start0(CBNewsfeedDelegate delegate);
    @Method(selector = "getMessages")
    public static native NSArray<CBStory> getMessages();
    @Method(selector = "getMessage:")
    public static native CBStory getMessage(String messageId);
    @Method(selector = "messageCount")
    public static native @MachineSizedUInt long getMessageCount();
    @Method(selector = "unreadMessageCount")
    public static native @MachineSizedUInt long getUnreadMessageCount();
    @Method(selector = "retrieveMessages")
    public static native void retrieveMessages();
    @Method(selector = "isNewsfeedUIVisible")
    public static native boolean isNewsfeedUIVisible();
    @Method(selector = "showNewsfeedUI")
    public static native void showNewsfeedUI();
    @Method(selector = "closeNewsfeedUI")
    public static native void closeNewsfeedUI();
    @Method(selector = "isNotificationUIVisible")
    public static native boolean isNotificationUIVisible();
    @Method(selector = "showNotificationUI")
    public static native void showNotificationUI();
    @Method(selector = "showNotificationUIForStory:")
    public static native void showNotificationUI(CBStory story);
    @Method(selector = "closeNotificationUI")
    public static native void closeNotificationUI();
    @Method(selector = "setFetchTime:")
    public static native void setFetchTime(@MachineSizedUInt long fetchTime);
    @Method(selector = "setUIClass:")
    public static native void setUIClass(Class<? extends CBNewsfeedUIProtocol> uiClass);
    @Method(selector = "setShouldPauseStoryClickForConfirmation:")
    public static native void setShouldPauseStoryClickForConfirmation(boolean shouldPause);
    @Method(selector = "didPassAgeGate:")
    public static native void didPassAgeGate(boolean pass);
    /*</methods>*/
}
