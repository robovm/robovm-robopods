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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFRole/*</name>*/ 
    extends /*<extends>*/PFObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFRolePtr extends Ptr<PFRole, PFRolePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFRole.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFRole() {}
    protected PFRole(Handle h, long handle) { super(h, handle); }
    protected PFRole(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithName:")
    public PFRole(String name) { super((SkipInit) null); initObject(init(name)); }
    @Method(selector = "initWithName:acl:")
    public PFRole(String name, PFACL acl) { super((SkipInit) null); initObject(init(name, acl)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "users")
    public native PFRelation<PFUser> getUsers();
    @Property(selector = "roles")
    public native PFRelation<PFRole> getRoles();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithName:")
    protected native @Pointer long init(String name);
    @Method(selector = "initWithName:acl:")
    protected native @Pointer long init(String name, PFACL acl);
    /*</methods>*/
}
