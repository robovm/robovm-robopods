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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRShareEmailViewController/*</name>*/ 
    extends /*<extends>*/UINavigationController/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRShareEmailViewControllerPtr extends Ptr<TWTRShareEmailViewController, TWTRShareEmailViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRShareEmailViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRShareEmailViewController() {}
    protected TWTRShareEmailViewController(Handle h, long handle) { super(h, handle); }
    protected TWTRShareEmailViewController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletion:")
    public TWTRShareEmailViewController(@Block VoidBlock2<String, NSError> completion) { super((SkipInit) null); initObject(init(completion)); }
    @Method(selector = "initWithUserID:completion:")
    public TWTRShareEmailViewController(String userID, @Block VoidBlock2<String, NSError> completion) { super((SkipInit) null); initObject(init(userID, completion)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "completion")
    public native @Block VoidBlock2<String, NSError> getCompletion();
    @Property(selector = "setCompletion:")
    public native void setCompletion(@Block VoidBlock2<String, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCompletion:")
    protected native @Pointer long init(@Block VoidBlock2<String, NSError> completion);
    @Method(selector = "initWithUserID:completion:")
    protected native @Pointer long init(String userID, @Block VoidBlock2<String, NSError> completion);
    /*</methods>*/
}
