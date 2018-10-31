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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLOfflinePack/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLOfflinePackPtr extends Ptr<MGLOfflinePack, MGLOfflinePackPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLOfflinePack.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLOfflinePack() {}
    protected MGLOfflinePack(Handle h, long handle) { super(h, handle); }
    protected MGLOfflinePack(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "region")
    public native MGLOfflineRegion getRegion();
    @Property(selector = "context")
    public native NSData getContext();
    @Property(selector = "state")
    public native MGLOfflinePackState getState();
    @Property(selector = "progress")
    public native @ByVal MGLOfflinePackProgress getProgress();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLOfflinePackProgressChangedNotification", optional=true)
    public static native String ProgressChanged();
    @GlobalValue(symbol="MGLOfflinePackErrorNotification", optional=true)
    public static native String Error();
    @GlobalValue(symbol="MGLOfflinePackMaximumMapboxTilesReachedNotification", optional=true)
    public static native String MaximumMapboxTilesReached();
    
    @Method(selector = "resume")
    public native void resume();
    @Method(selector = "suspend")
    public native void suspend();
    @Method(selector = "requestProgress")
    public native void requestProgress();
    /*</methods>*/
}
