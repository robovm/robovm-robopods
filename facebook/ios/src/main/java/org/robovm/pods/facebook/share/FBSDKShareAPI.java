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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareAPI/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharing/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareAPIPtr extends Ptr<FBSDKShareAPI, FBSDKShareAPIPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareAPI.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareAPI() {}
    protected FBSDKShareAPI(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "graphNode")
    public native String getGraphNode();
    @Property(selector = "setGraphNode:")
    public native void setGraphNode(String v);
    @Property(selector = "delegate")
    public native FBSDKSharingDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKSharingDelegate v);
    @Property(selector = "shareContent")
    public native FBSDKSharingContent getShareContent();
    @Property(selector = "setShareContent:")
    public native void setShareContent(FBSDKSharingContent v);
    @Property(selector = "shouldFailOnDataError")
    public native boolean shouldFailOnDataError();
    @Property(selector = "setShouldFailOnDataError:")
    public native void setShouldFailOnDataError(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public boolean validate() throws NSErrorException {
        NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
        boolean result = validate(ptr);
        if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
        return result;
     }
    @Method(selector = "validateWithError:")
    private native boolean validate(NSError.NSErrorPtr errorRef);
    
    private static FBSDKSharingDelegate delegate;
    
    public static FBSDKShareAPI share(FBSDKSharingContent content, FBSDKSharingDelegate delegate) {
        FBSDKShareAPI.delegate = delegate;
        return share0(content, delegate);
    }
    /*<methods>*/
    @Method(selector = "canShare")
    public native boolean canShare();
    @Method(selector = "createOpenGraphObject:")
    public native boolean createOpenGraphObject(FBSDKShareOpenGraphObject openGraphObject);
    @Method(selector = "share")
    public native boolean share();
    @Method(selector = "shareWithContent:delegate:")
    private static native FBSDKShareAPI share0(FBSDKSharingContent content, FBSDKSharingDelegate delegate);
    /*</methods>*/
}
