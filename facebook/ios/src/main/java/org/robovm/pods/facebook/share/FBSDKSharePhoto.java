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
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKSharePhoto/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying/*</implements>*/ {

    /*<ptr>*/public static class FBSDKSharePhotoPtr extends Ptr<FBSDKSharePhoto, FBSDKSharePhotoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKSharePhoto.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKSharePhoto() {}
    protected FBSDKSharePhoto(SkipInit skipInit) { super(skipInit); }
    public FBSDKSharePhoto(UIImage image, boolean userGenerated) { super(create(image, userGenerated)); retain(getHandle()); }
    public FBSDKSharePhoto(NSURL imageURL, boolean userGenerated) { super(create(imageURL, userGenerated)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "setImageURL:")
    public native void setImageURL(NSURL v);
    @Property(selector = "isUserGenerated")
    public native boolean isUserGenerated();
    @Property(selector = "setUserGenerated:")
    public native void setUserGenerated(boolean v);
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToSharePhoto:")
    public native boolean equalsTo(FBSDKSharePhoto photo);
    @Method(selector = "photoWithImage:userGenerated:")
    protected static native @Pointer long create(UIImage image, boolean userGenerated);
    @Method(selector = "photoWithImageURL:userGenerated:")
    protected static native @Pointer long create(NSURL imageURL, boolean userGenerated);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
