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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TAGManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TAGManagerPtr extends Ptr<TAGManager, TAGManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TAGManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TAGManager() {}
    protected TAGManager(Handle h, long handle) { super(h, handle); }
    protected TAGManager(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "logger")
    public native TAGLogger getLogger();
    @Property(selector = "setLogger:")
    public native void setLogger(TAGLogger v);
    @Property(selector = "refreshMode")
    public native TAGRefreshMode getRefreshMode();
    @Property(selector = "setRefreshMode:")
    public native void setRefreshMode(TAGRefreshMode v);
    @Property(selector = "dataLayer")
    public native TAGDataLayer getDataLayer();
    @Property(selector = "dispatchInterval")
    public native double getDispatchInterval();
    @Property(selector = "setDispatchInterval:")
    public native void setDispatchInterval(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "openContainerById:callback:")
    public native TAGContainer openContainer(String containerId, TAGContainerCallback callback);
    @Method(selector = "getContainerById:")
    public native TAGContainer getContainer(String containerId);
    @Method(selector = "previewWithUrl:")
    public native boolean preview(NSURL url);
    @Method(selector = "dispatch")
    public native void dispatch();
    @Method(selector = "dispatchWithCompletionHandler:")
    public native void dispatch(@Block VoidBlock1<TAGDispatchResult> completionHandler);
    @Method(selector = "instance")
    public static native TAGManager getInstance();
    /*</methods>*/
}
