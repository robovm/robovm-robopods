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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppGroupAddDialog/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKAppGroupAddDialogPtr extends Ptr<FBSDKAppGroupAddDialog, FBSDKAppGroupAddDialogPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKAppGroupAddDialog.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKAppGroupAddDialog() {}
    protected FBSDKAppGroupAddDialog(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBSDKAppGroupAddDialogDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKAppGroupAddDialogDelegate v);
    @Property(selector = "content")
    public native FBSDKAppGroupContent getContent();
    @Property(selector = "setContent:")
    public native void setContent(FBSDKAppGroupContent v);
    /*</properties>*/
    /*<members>*//*</members>*/
    private static FBSDKAppGroupAddDialogDelegate delegate;
    
    public static FBSDKAppGroupAddDialog show(FBSDKAppGroupContent content, FBSDKAppGroupAddDialogDelegate delegate) {
        FBSDKAppGroupAddDialog.delegate = delegate;
        return show0(content, delegate);
    }
    
    /*<methods>*/
    @Method(selector = "canShow")
    public native boolean canShow();
    @Method(selector = "show")
    public native boolean show();
    public boolean validate() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = validate(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "validateWithError:")
    private native boolean validate(NSError.NSErrorPtr errorRef);
    @Method(selector = "showWithContent:delegate:")
    private static native FBSDKAppGroupAddDialog show0(FBSDKAppGroupContent content, FBSDKAppGroupAddDialogDelegate delegate);
    /*</methods>*/
}
