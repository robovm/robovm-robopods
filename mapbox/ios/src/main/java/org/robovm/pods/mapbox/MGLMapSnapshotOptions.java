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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMapSnapshotOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMapSnapshotOptionsPtr extends Ptr<MGLMapSnapshotOptions, MGLMapSnapshotOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMapSnapshotOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMapSnapshotOptions() {}
    protected MGLMapSnapshotOptions(Handle h, long handle) { super(h, handle); }
    protected MGLMapSnapshotOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyleURL:camera:size:")
    public MGLMapSnapshotOptions(NSURL styleURL, MGLMapCamera camera, @ByVal CGSize size) { super((SkipInit) null); initObject(init(styleURL, camera, size)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "styleURL")
    public native NSURL getStyleURL();
    @Property(selector = "zoomLevel")
    public native double getZoomLevel();
    @Property(selector = "setZoomLevel:")
    public native void setZoomLevel(double v);
    @Property(selector = "camera")
    public native MGLMapCamera getCamera();
    @Property(selector = "setCamera:")
    public native void setCamera(MGLMapCamera v);
    @Property(selector = "coordinateBounds")
    public native @ByVal MGLCoordinateBounds getCoordinateBounds();
    @Property(selector = "setCoordinateBounds:")
    public native void setCoordinateBounds(@ByVal MGLCoordinateBounds v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "scale")
    public native @MachineSizedFloat double getScale();
    @Property(selector = "setScale:")
    public native void setScale(@MachineSizedFloat double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyleURL:camera:size:")
    protected native @Pointer long init(NSURL styleURL, MGLMapCamera camera, @ByVal CGSize size);
    /*</methods>*/
}
