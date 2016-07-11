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
package org.robovm.pods.facebook.share;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSURL;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.pods.facebook.core.FBSDKCopying;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppInviteContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying/*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppInviteContentPtr extends Ptr<FBSDKAppInviteContent, FBSDKAppInviteContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppInviteContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppInviteContent() {}
    protected FBSDKAppInviteContent(long handle) { super(handle); }
    protected FBSDKAppInviteContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "appInvitePreviewImageURL")
    public native NSURL getAppInvitePreviewImageURL();
    @Property(selector = "setAppInvitePreviewImageURL:")
    public native void setAppInvitePreviewImageURL(NSURL v);
    @Property(selector = "appLinkURL")
    public native NSURL getAppLinkURL();
    @Property(selector = "setAppLinkURL:")
    public native void setAppLinkURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToAppInviteContent:")
    public native boolean equalsTo(FBSDKAppInviteContent content);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
