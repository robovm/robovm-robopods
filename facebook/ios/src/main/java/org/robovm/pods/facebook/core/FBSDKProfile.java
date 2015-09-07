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
package org.robovm.pods.facebook.core;

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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKProfile/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        public static NSObject observeCurrentProfileDidChange(final VoidBlock1<FBSDKProfileChangeNotification> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidChangeNotification(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    NSDictionary<?, ?> userInfo = a.getUserInfo();
                    FBSDKProfileChangeNotification notif = null;
                    if (userInfo != null) {
                        notif = new FBSDKProfileChangeNotification(userInfo);
                    }
                    block.invoke(notif);
                }
            });
        }
    }
    
    /*<ptr>*/public static class FBSDKProfilePtr extends Ptr<FBSDKProfile, FBSDKProfilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKProfile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKProfile() {}
    protected FBSDKProfile(SkipInit skipInit) { super(skipInit); }
    public FBSDKProfile(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate) { super((SkipInit) null); initObject(init(userID, firstName, middleName, lastName, name, linkURL, refreshDate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    @Property(selector = "firstName")
    public native String getFirstName();
    @Property(selector = "middleName")
    public native String getMiddleName();
    @Property(selector = "lastName")
    public native String getLastName();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "linkURL")
    public native NSURL getLinkURL();
    @Property(selector = "refreshDate")
    public native NSDate getRefreshDate();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKProfileDidChangeNotification", optional=true)
    public static native NSString DidChangeNotification();
    
    @Method(selector = "initWithUserID:firstName:middleName:lastName:name:linkURL:refreshDate:")
    protected native @Pointer long init(String userID, String firstName, String middleName, String lastName, String name, NSURL linkURL, NSDate refreshDate);
    @Method(selector = "imagePathForPictureMode:size:")
    public native String getImagePath(FBSDKProfilePictureMode mode, @ByVal CGSize size);
    @Method(selector = "isEqualToProfile:")
    public native boolean equalsTo(FBSDKProfile profile);
    @Method(selector = "currentProfile")
    public static native FBSDKProfile getCurrentProfile();
    @Method(selector = "setCurrentProfile:")
    public static native void setCurrentProfile(FBSDKProfile profile);
    @Method(selector = "enableUpdatesOnAccessTokenChange:")
    public static native void enableUpdatesOnAccessTokenChange(boolean enable);
    /*</methods>*/
}
