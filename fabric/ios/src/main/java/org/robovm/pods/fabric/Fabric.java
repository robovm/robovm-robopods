/*
 * Copyright (C) 2016 RoboVM AB
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
package org.robovm.pods.fabric;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Fabric/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FabricPtr extends Ptr<Fabric, FabricPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Fabric.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected Fabric(Handle h, long handle) { super(h, handle); }
    protected Fabric(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "debug")
    public native boolean isDebug();
    @Property(selector = "setDebug:")
    public native void setDebug(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    @SafeVarargs
    public static Fabric with(Class<? extends NSObject>...kitClasses) {
        return Fabric.with(Arrays.asList(kitClasses));
    }
    public static Fabric with(List<Class<? extends NSObject>> kitClasses) {
        List<ObjCClass> result = new ArrayList<>();
        for (Class<? extends NSObject> cls : kitClasses) {
            result.add(ObjCClass.getByType(cls));
        }
        return with0(result);
    }
    /*<methods>*/
    @Method(selector = "with:")
    private static native Fabric with0(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<ObjCClass> kitClasses);
    @Method(selector = "sharedSDK")
    public static native Fabric getSharedSDK();
    /*</methods>*/
}
