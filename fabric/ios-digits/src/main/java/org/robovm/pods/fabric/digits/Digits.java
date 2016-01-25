/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Digits/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DigitsPtr extends Ptr<Digits, DigitsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Digits.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Digits() {}
    protected Digits(Handle h, long handle) { super(h, handle); }
    protected Digits(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "authConfig")
    public native TWTRAuthConfig getAuthConfig();
    @Property(selector = "sessionUpdateDelegate")
    public native DGTSessionUpdateDelegate getSessionUpdateDelegate();
    @Property(selector = "setSessionUpdateDelegate:", strongRef = true)
    public native void setSessionUpdateDelegate(DGTSessionUpdateDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "startWithConsumerKey:consumerSecret:")
    public native void start(String consumerKey, String consumerSecret);
    @Method(selector = "startWithConsumerKey:consumerSecret:accessGroup:")
    public native void start(String consumerKey, String consumerSecret, String accessGroup);
    @Method(selector = "session")
    public native DGTSession getSession();
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "authenticateWithCompletion:")
    public native void authenticate(@Block VoidBlock2<DGTSession, NSError> completion);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "authenticateWithViewController:configuration:completion:")
    public native void authenticate(UIViewController viewController, DGTAuthenticationConfiguration configuration, @Block VoidBlock2<DGTSession, NSError> completion);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Method(selector = "authenticateWithNavigationViewController:configuration:completionViewController:")
    public native void authenticate(UINavigationController navigationController, DGTAuthenticationConfiguration configuration, UIViewController completionViewController);
    @Method(selector = "logOut")
    public native void logOut();
    @Method(selector = "sharedInstance")
    public static native Digits getSharedInstance();
    /*</methods>*/
}
