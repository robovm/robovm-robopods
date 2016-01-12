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
package org.robovm.pods.google.tagmanager;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TAGContainerOpener/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TAGContainerOpenerPtr extends Ptr<TAGContainerOpener, TAGContainerOpenerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TAGContainerOpener.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TAGContainerOpener() {}
    protected TAGContainerOpener(Handle h, long handle) { super(h, handle); }
    protected TAGContainerOpener(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public static void openContainer(String containerId, TAGManager tagManager, TAGOpenType openType, TAGContainerOpenerNotifier notifier) {
        openContainer(containerId, tagManager, openType, null, notifier);
    }
    public static void openContainer(String containerId, TAGManager tagManager, TAGOpenType openType, double timeout, TAGContainerOpenerNotifier notifier) {
        openContainer(containerId, tagManager, openType, new DoublePtr(timeout), notifier);
    }
    /*<methods>*/
    @Method(selector = "openContainerWithId:tagManager:openType:timeout:notifier:")
    private static native void openContainer(String containerId, TAGManager tagManager, TAGOpenType openType, DoublePtr timeout, TAGContainerOpenerNotifier notifier);
    @Method(selector = "defaultTimeout")
    public static native double getDefaultTimeout();
    /*</methods>*/
}
