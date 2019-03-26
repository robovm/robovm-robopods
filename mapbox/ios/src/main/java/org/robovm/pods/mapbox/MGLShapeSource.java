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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLShapeSource/*</name>*/ 
    extends /*<extends>*/MGLSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLShapeSourcePtr extends Ptr<MGLShapeSource, MGLShapeSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLShapeSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLShapeSource() {}
    protected MGLShapeSource(Handle h, long handle) { super(h, handle); }
    protected MGLShapeSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:URL:options:")
    public MGLShapeSource(String identifier, NSURL url, NSDictionary<MGLShapeSource.Option, ?> options) { super((SkipInit) null); initObject(init(identifier, url, options)); }
    @Method(selector = "initWithIdentifier:shape:options:")
    public MGLShapeSource(String identifier, MGLShape shape, NSDictionary<MGLShapeSource.Option, ?> options) { super((SkipInit) null); initObject(init(identifier, shape, options)); }
    @Method(selector = "initWithIdentifier:shapes:options:")
    public MGLShapeSource(String identifier, NSArray<MGLShape> shapes, NSDictionary<MGLShapeSource.Option, ?> options) { super((SkipInit) null); initObject(initShapes(identifier, shapes, options)); }
    @Method(selector = "initWithIdentifier:")
    public MGLShapeSource(String identifier) { super(identifier); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shape")
    public native MGLShape getShape();
    @Property(selector = "setShape:")
    public native void setShape(MGLShape v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLShapeSourceOptionClustered", optional=true)
    public static native Option Clustered();
    @GlobalValue(symbol="MGLShapeSourceOptionClusterRadius", optional=true)
    public static native Option ClusterRadius();
    @GlobalValue(symbol="MGLShapeSourceOptionMaximumZoomLevelForClustering", optional=true)
    public static native Option MaximumZoomLevelForClustering();
    @GlobalValue(symbol="MGLShapeSourceOptionMinimumZoomLevel", optional=true)
    public static native Option MinimumZoomLevel();
    @GlobalValue(symbol="MGLShapeSourceOptionMaximumZoomLevel", optional=true)
    public static native Option MaximumZoomLevel();
    @GlobalValue(symbol="MGLShapeSourceOptionBuffer", optional=true)
    public static native Option Buffer();
    @GlobalValue(symbol="MGLShapeSourceOptionSimplificationTolerance", optional=true)
    public static native Option SimplificationTolerance();
    @GlobalValue(symbol="MGLShapeSourceOptionLineDistanceMetrics", optional=true)
    public static native Option LineDistanceMetrics();
    @GlobalValue(symbol="MGLShapeSourceOptionWrapsCoordinates", optional=true)
    public static native Option WrapsCoordinates();
    @GlobalValue(symbol="MGLShapeSourceOptionClipsCoordinates", optional=true)
    public static native Option ClipsCoordinates();
    
    @Method(selector = "initWithIdentifier:URL:options:")
    protected native @Pointer long init(String identifier, NSURL url, NSDictionary<MGLShapeSource.Option, ?> options);
    @Method(selector = "initWithIdentifier:shape:options:")
    protected native @Pointer long init(String identifier, MGLShape shape, NSDictionary<MGLShapeSource.Option, ?> options);
    @Method(selector = "initWithIdentifier:shapes:options:")
    protected native @Pointer long initShapes(String identifier, NSArray<MGLShape> shapes, NSDictionary<MGLShapeSource.Option, ?> options);
    @Method(selector = "featuresMatchingPredicate:")
    public native NSArray<?> featuresMatchingPredicate(NSPredicate predicate);
    @Method(selector = "leavesOfCluster:offset:limit:")
    public native NSArray<?> leaves(MGLPointFeatureCluster cluster, @MachineSizedUInt long offset, @MachineSizedUInt long limit);
    @Method(selector = "childrenOfCluster:")
    public native NSArray<?> childrenOfCluster(MGLPointFeatureCluster cluster);
    @Method(selector = "zoomLevelForExpandingCluster:")
    public native double zoomLevelForExpandingCluster(MGLPointFeatureCluster cluster);
    /*</methods>*/

    public abstract static class Option extends NSObject {
    }
}
