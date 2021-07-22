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
package org.robovm.pods.facebook.login;

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
import org.robovm.apple.accounts.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKDeviceLoginManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSNetServiceDelegate/*</implements>*/ {

    /*<ptr>*/public static class FBSDKDeviceLoginManagerPtr extends Ptr<FBSDKDeviceLoginManager, FBSDKDeviceLoginManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKDeviceLoginManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected FBSDKDeviceLoginManager() {}
    protected FBSDKDeviceLoginManager(Handle h, long handle) { super(h, handle); }
    protected FBSDKDeviceLoginManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPermissions:enableSmartLogin:")
    public FBSDKDeviceLoginManager(NSArray<NSString> permissions, boolean enableSmartLogin) { super((SkipInit) null); initObject(initWithPermissions(permissions, enableSmartLogin)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBSDKDeviceLoginManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBSDKDeviceLoginManagerDelegate v);
    @Property(selector = "permissions")
    public native NSArray<NSString> getPermissions();
    @Property(selector = "redirectURL")
    public native NSURL getRedirectURL();
    @Property(selector = "setRedirectURL:")
    public native void setRedirectURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPermissions:enableSmartLogin:")
    protected native @Pointer long initWithPermissions(NSArray<NSString> permissions, boolean enableSmartLogin);
    @Method(selector = "start")
    public native void start();
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "netServiceWillPublish:")
    public native void willPublish(NSNetService sender);
    @Method(selector = "netServiceDidPublish:")
    public native void didPublish(NSNetService sender);
    @Method(selector = "netService:didNotPublish:")
    public native void didNotPublish(NSNetService sender, NSNetServiceErrorUserInfo errorDict);
    @Method(selector = "netServiceWillResolve:")
    public native void willResolve(NSNetService sender);
    @Method(selector = "netServiceDidResolveAddress:")
    public native void didResolve(NSNetService sender);
    @Method(selector = "netService:didNotResolve:")
    public native void didNotResolve(NSNetService sender, NSNetServiceErrorUserInfo errorDict);
    @Method(selector = "netServiceDidStop:")
    public native void didStop(NSNetService sender);
    @Method(selector = "netService:didUpdateTXTRecordData:")
    public native void didUpdateTXTRecordData(NSNetService sender, NSData data);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Method(selector = "netService:didAcceptConnectionWithInputStream:outputStream:")
    public native void didAcceptConnection(NSNetService sender, NSInputStream inputStream, NSOutputStream outputStream);
    /*</methods>*/
}
