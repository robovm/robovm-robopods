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
package org.robovm.pods.mapbox;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapSnapshotter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MGLStylable/*</implements>*/ {

    /*<ptr>*/public static class MGLMapSnapshotterPtr extends Ptr<MGLMapSnapshotter, MGLMapSnapshotterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMapSnapshotter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLMapSnapshotter() {}
    protected MGLMapSnapshotter(Handle h, long handle) { super(h, handle); }
    protected MGLMapSnapshotter(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOptions:")
    public MGLMapSnapshotter(MGLMapSnapshotOptions options) { super((SkipInit) null); initObject(init(options)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "options")
    public native MGLMapSnapshotOptions getOptions();
    @Property(selector = "setOptions:")
    public native void setOptions(MGLMapSnapshotOptions v);
    @Property(selector = "isLoading")
    public native boolean isLoading();
    @Property(selector = "delegate")
    public native MGLMapSnapshotterDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MGLMapSnapshotterDelegate v);
    @Property(selector = "style")
    public native MGLStyle getStyle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOptions:")
    protected native @Pointer long init(MGLMapSnapshotOptions options);
    @Method(selector = "startWithCompletionHandler:")
    public native void start(@Block VoidBlock2<MGLMapSnapshot, NSError> completionHandler);
    @Method(selector = "startWithQueue:completionHandler:")
    public native void start(DispatchQueue queue, @Block VoidBlock2<MGLMapSnapshot, NSError> completionHandler);
    @Method(selector = "startWithOverlayHandler:completionHandler:")
    public native void start(@Block VoidBlock1<MGLMapSnapshotOverlay> overlayHandler, @Block VoidBlock2<MGLMapSnapshot, NSError> completionHandler);
    @Method(selector = "cancel")
    public native void cancel();
    /*</methods>*/
}
