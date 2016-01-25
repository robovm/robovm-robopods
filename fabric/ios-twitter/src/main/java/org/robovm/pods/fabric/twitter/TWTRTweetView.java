/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRTweetView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements UIAppearanceContainer/*</implements>*/ {

    /*<ptr>*/public static class TWTRTweetViewPtr extends Ptr<TWTRTweetView, TWTRTweetViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRTweetView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRTweetView() {}
    protected TWTRTweetView(Handle h, long handle) { super(h, handle); }
    protected TWTRTweetView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTweet:")
    public TWTRTweetView(TWTRTweet tweet) { super((SkipInit) null); initObject(init(tweet)); }
    @Method(selector = "initWithTweet:style:")
    public TWTRTweetView(TWTRTweet tweet, TWTRTweetViewStyle style) { super((SkipInit) null); initObject(init(tweet, style)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @Property(selector = "primaryTextColor")
    public native UIColor getPrimaryTextColor();
    @Property(selector = "setPrimaryTextColor:")
    public native void setPrimaryTextColor(UIColor v);
    @Property(selector = "linkTextColor")
    public native UIColor getLinkTextColor();
    @Property(selector = "setLinkTextColor:")
    public native void setLinkTextColor(UIColor v);
    @Property(selector = "showBorder")
    public native boolean showsBorder();
    @Property(selector = "setShowBorder:")
    public native void setShowsBorder(boolean v);
    @Property(selector = "showActionButtons")
    public native boolean showsActionButtons();
    @Property(selector = "setShowActionButtons:")
    public native void setShowsActionButtons(boolean v);
    @Property(selector = "theme")
    public native TWTRTweetViewTheme getTheme();
    @Property(selector = "setTheme:")
    public native void setTheme(TWTRTweetViewTheme v);
    @Property(selector = "style")
    public native TWTRTweetViewStyle getStyle();
    @Property(selector = "delegate")
    public native TWTRTweetViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(TWTRTweetViewDelegate v);
    @Property(selector = "presenterViewController")
    public native UIViewController getPresenterViewController();
    @Property(selector = "setPresenterViewController:", strongRef = true)
    public native void setPresenterViewController(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTweet:")
    protected native @Pointer long init(TWTRTweet tweet);
    @Method(selector = "initWithTweet:style:")
    protected native @Pointer long init(TWTRTweet tweet, TWTRTweetViewStyle style);
    @Method(selector = "sizeThatFits:")
    public native @ByVal CGSize getSizeThatFits(@ByVal CGSize size);
    @Method(selector = "configureWithTweet:")
    public native void configure(TWTRTweet tweet);
    /*</methods>*/
}
