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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRComposerViewController/*</name>*/ 
    extends /*<extends>*/UIViewController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRComposerViewControllerPtr extends Ptr<TWTRComposerViewController, TWTRComposerViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRComposerViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected TWTRComposerViewController(Handle h, long handle) { super(h, handle); }
    protected TWTRComposerViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserID:")
    public TWTRComposerViewController(String userID) { super((SkipInit) null); initObject(init(userID)); }
    @Method(selector = "initWithUserID:cardConfiguration:")
    public TWTRComposerViewController(String userID, TWTRCardConfiguration cardConfig) { super((SkipInit) null); initObject(init(userID, cardConfig)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native TWTRComposerViewControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(TWTRComposerViewControllerDelegate v);
    @Property(selector = "theme")
    public native TWTRComposerTheme getTheme();
    @Property(selector = "setTheme:")
    public native void setTheme(TWTRComposerTheme v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserID:")
    protected native @Pointer long init(String userID);
    @Method(selector = "initWithUserID:cardConfiguration:")
    protected native @Pointer long init(String userID, TWTRCardConfiguration cardConfig);
    /*</methods>*/
}
