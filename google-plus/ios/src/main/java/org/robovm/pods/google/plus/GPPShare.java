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
package org.robovm.pods.google.plus;

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
import org.robovm.pods.google.opensource.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPPShare/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPPSharePtr extends Ptr<GPPShare, GPPSharePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPPShare.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPPShare() {}
    protected GPPShare(Handle h, long handle) { super(h, handle); }
    protected GPPShare(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native GPPShareDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(GPPShareDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "shareDialog")
    public native GPPShareBuilder getShareDialog();
    @Method(selector = "nativeShareDialog")
    public native GPPNativeShareBuilder getNativeShareDialog();
    @Method(selector = "closeActiveNativeShareDialog")
    public native void closeActiveNativeShareDialog();
    @Method(selector = "handleURL:sourceApplication:annotation:")
    public native boolean handleURL(NSURL url, String sourceApplication, NSPropertyList annotation);
    @Method(selector = "sharedInstance")
    public static native GPPShare getSharedInstance();
    /*</methods>*/
}
