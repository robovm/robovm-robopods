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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLComputedShapeSource/*</name>*/ 
    extends /*<extends>*/MGLSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLComputedShapeSourcePtr extends Ptr<MGLComputedShapeSource, MGLComputedShapeSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLComputedShapeSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLComputedShapeSource() {}
    protected MGLComputedShapeSource(Handle h, long handle) { super(h, handle); }
    protected MGLComputedShapeSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:options:")
    public MGLComputedShapeSource(String identifier, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(identifier, options)); }
    @Method(selector = "initWithIdentifier:dataSource:options:")
    public MGLComputedShapeSource(String identifier, MGLComputedShapeSourceDataSource dataSource, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(identifier, dataSource, options)); }
    @Method(selector = "initWithIdentifier:")
    public MGLComputedShapeSource(String identifier) { super(identifier); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSource")
    public native MGLComputedShapeSourceDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(MGLComputedShapeSourceDataSource v);
    @Property(selector = "requestQueue")
    public native NSOperationQueue getRequestQueue();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:options:")
    protected native @Pointer long init(String identifier, NSDictionary<NSString, ?> options);
    @Method(selector = "initWithIdentifier:dataSource:options:")
    protected native @Pointer long init(String identifier, MGLComputedShapeSourceDataSource dataSource, NSDictionary<NSString, ?> options);
    @Method(selector = "invalidateBounds:")
    public native void invalidateBounds(@ByVal MGLCoordinateBounds bounds);
    @Method(selector = "invalidateTileAtX:y:zoomLevel:")
    public native void invalidateTile(@MachineSizedUInt long x, @MachineSizedUInt long y, @MachineSizedUInt long zoomLevel);
    @Method(selector = "setFeatures:inTileAtX:y:zoomLevel:")
    public native void setFeatures(NSArray<?> features, @MachineSizedUInt long x, @MachineSizedUInt long y, @MachineSizedUInt long zoomLevel);
    /*</methods>*/
}
