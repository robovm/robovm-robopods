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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Twitter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeUserDidLogOut(final VoidBlock1<String> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(UserDidLogOutNotification(), null,
                    NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                        @Override
                        public void invoke(NSNotification notification) {
                            NSDictionary<?, ?> userInfo = notification.getUserInfo();
                            String userId = null;
                            if (userInfo != null) {
                                userId = userInfo.getString(LoggedOutUserIDKey(), null);
                            }
                            block.invoke(userId);
                        }
                    });
        }
    }

    /*<ptr>*/public static class TwitterPtr extends Ptr<Twitter, TwitterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Twitter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Twitter() {}
    protected Twitter(Handle h, long handle) { super(h, handle); }
    protected Twitter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "version")
    public native String getVersion();
    @Property(selector = "authConfig")
    public native TWTRAuthConfig getAuthConfig();
    @Property(selector = "sessionStore")
    public native TWTRSessionStore getSessionStore();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="TWTRUserDidLogOutNotification", optional=true)
    public static native NSString UserDidLogOutNotification();
    @GlobalValue(symbol="TWTRLoggedOutUserIDKey", optional=true)
    protected static native NSString LoggedOutUserIDKey();
    
    @Method(selector = "startWithConsumerKey:consumerSecret:")
    public native void start(String consumerKey, String consumerSecret);
    @Method(selector = "startWithConsumerKey:consumerSecret:accessGroup:")
    public native void start(String consumerKey, String consumerSecret, String accessGroup);
    @Method(selector = "logInWithCompletion:")
    public native void logIn(@Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "logInWithViewController:completion:")
    public native void logIn(UIViewController viewController, @Block VoidBlock2<TWTRAuthSession, NSError> completion);
    @Method(selector = "sharedInstance")
    public static native Twitter getSharedInstance();
    /*</methods>*/
}
