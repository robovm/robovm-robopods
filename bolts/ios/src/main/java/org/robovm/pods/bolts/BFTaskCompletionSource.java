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
package org.robovm.pods.bolts;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFTaskCompletionSource/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFTaskCompletionSourcePtr extends Ptr<BFTaskCompletionSource, BFTaskCompletionSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFTaskCompletionSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFTaskCompletionSource() {}
    protected BFTaskCompletionSource(Handle h, long handle) { super(h, handle); }
    protected BFTaskCompletionSource(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "task")
    public native BFTask<?> getTask();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setResult:")
    public native void setResult(NSObject result);
    @Method(selector = "setError:")
    public native void setError(NSError error);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "trySetResult:")
    public native boolean trySetResult(NSObject result);
    @Method(selector = "trySetError:")
    public native boolean trySetError(NSError error);
    @Method(selector = "trySetCancelled")
    public native boolean trySetCancelled();
    /*</methods>*/
}
