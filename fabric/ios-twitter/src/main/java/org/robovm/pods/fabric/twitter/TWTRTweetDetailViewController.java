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
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweetDetailViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRTweetDetailViewControllerPtr extends Ptr<TWTRTweetDetailViewController, TWTRTweetDetailViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTweetDetailViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTweetDetailViewController() {}
    protected TWTRTweetDetailViewController(SkipInit skipInit) { super(skipInit); }
    public TWTRTweetDetailViewController(TWTRTweet tweet) { super((SkipInit) null); initObject(init(tweet)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tweet")
    public native TWTRTweet getTweet();
    @Property(selector = "delegate")
    public native TWTRTweetDetailViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(TWTRTweetDetailViewControllerDelegate v);
    @Property(selector = "scrollView")
    public native UIScrollView getScrollView();
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "primaryTextColor")
    public native UIColor getPrimaryTextColor();
    @Property(selector = "setPrimaryTextColor:")
    public native void setPrimaryTextColor(UIColor v);
    @Property(selector = "secondaryTextColor")
    public native UIColor getSecondaryTextColor();
    @Property(selector = "setSecondaryTextColor:")
    public native void setSecondaryTextColor(UIColor v);
    @Property(selector = "linkTextColor")
    public native UIColor getLinkTextColor();
    @Property(selector = "setLinkTextColor:")
    public native void setLinkTextColor(UIColor v);
    @Property(selector = "actionBarInset")
    public native @MachineSizedFloat double getActionBarInset();
    @Property(selector = "setActionBarInset:")
    public native void setActionBarInset(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTweet:")
    protected native @Pointer long init(TWTRTweet tweet);
    /*</methods>*/
}
