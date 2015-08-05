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
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFACL/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class PFACLPtr extends Ptr<PFACL, PFACLPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFACL.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFACL() {}
    protected PFACL(SkipInit skipInit) { super(skipInit); }
    public PFACL(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    /*</constructors>*/
    public PFACL(PFUser user) {
        super(create(user));
        retain(getHandle());
    }
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setReadAccess(String userId, boolean allowed) {
        setReadAccess0(allowed, userId);
    }
    public void setWriteAccess(String userId, boolean allowed) {
        setWriteAccess0(allowed, userId);
    }
    public void setReadAccess(PFUser user, boolean allowed) {
        setReadAccess0(allowed, user);
    }
    public void setWriteAccess(PFUser user, boolean allowed) {
        setWriteAccess0(allowed, user);
    }
    public void setRoleReadAccess(String name, boolean allowed) {
        setRoleReadAccess0(allowed, name);
    }
    public void setRoleWriteAccess(String name, boolean allowed) {
        setRoleWriteAccess0(allowed, name);
    }
    public void setRoleReadAccess(PFRole role, boolean allowed) {
        setRoleReadAccess0(allowed, role);
    }
    public void setRoleWriteAccess(PFRole role, boolean allowed) {
        setRoleWriteAccess0(allowed, role);
    }
    /*<methods>*/
    @Method(selector = "setPublicReadAccess:")
    public native void setPublicReadAccess(boolean allowed);
    @Method(selector = "getPublicReadAccess")
    public native boolean getPublicReadAccess();
    @Method(selector = "setPublicWriteAccess:")
    public native void setPublicWriteAccess(boolean allowed);
    @Method(selector = "getPublicWriteAccess")
    public native boolean getPublicWriteAccess();
    @Method(selector = "setReadAccess:forUserId:")
    private native void setReadAccess0(boolean allowed, String userId);
    @Method(selector = "getReadAccessForUserId:")
    public native boolean getReadAccess(String userId);
    @Method(selector = "setWriteAccess:forUserId:")
    private native void setWriteAccess0(boolean allowed, String userId);
    @Method(selector = "getWriteAccessForUserId:")
    public native boolean getWriteAccess(String userId);
    @Method(selector = "setReadAccess:forUser:")
    private native void setReadAccess0(boolean allowed, PFUser user);
    @Method(selector = "getReadAccessForUser:")
    public native boolean getReadAccess(PFUser user);
    @Method(selector = "setWriteAccess:forUser:")
    private native void setWriteAccess0(boolean allowed, PFUser user);
    @Method(selector = "getWriteAccessForUser:")
    public native boolean getWriteAccess(PFUser user);
    @Method(selector = "getReadAccessForRoleWithName:")
    public native boolean getRoleReadAccess(String name);
    @Method(selector = "setReadAccess:forRoleWithName:")
    private native void setRoleReadAccess0(boolean allowed, String name);
    @Method(selector = "getWriteAccessForRoleWithName:")
    public native boolean getRoleWriteAccess(String name);
    @Method(selector = "setWriteAccess:forRoleWithName:")
    private native void setRoleWriteAccess0(boolean allowed, String name);
    @Method(selector = "getReadAccessForRole:")
    public native boolean getRoleReadAccess(PFRole role);
    @Method(selector = "setReadAccess:forRole:")
    private native void setRoleReadAccess0(boolean allowed, PFRole role);
    @Method(selector = "getWriteAccessForRole:")
    public native boolean getRoleWriteAccess(PFRole role);
    @Method(selector = "setWriteAccess:forRole:")
    private native void setRoleWriteAccess0(boolean allowed, PFRole role);
    @Method(selector = "ACLWithUser:")
    protected static native @Pointer long create(PFUser user);
    @Method(selector = "setDefaultACL:withAccessForCurrentUser:")
    public static native void setDefaultACL(PFACL acl, boolean currentUserAccess);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    /*</methods>*/
}
