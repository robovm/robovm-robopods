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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLTileSource/*</name>*/ 
    extends /*<extends>*/MGLSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLTileSourcePtr extends Ptr<MGLTileSource, MGLTileSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLTileSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLTileSource() {}
    protected MGLTileSource(Handle h, long handle) { super(h, handle); }
    protected MGLTileSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public MGLTileSource(String identifier) { super(identifier); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "configurationURL")
    public native NSURL getConfigurationURL();
    @Property(selector = "attributionInfos")
    public native NSArray<MGLAttributionInfo> getAttributionInfos();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLTileSourceOptionMinimumZoomLevel", optional=true)
    public static native Option MinimumZoomLevel();
    @GlobalValue(symbol="MGLTileSourceOptionMaximumZoomLevel", optional=true)
    public static native Option MaximumZoomLevel();
    @GlobalValue(symbol="MGLTileSourceOptionCoordinateBounds", optional=true)
    public static native Option CoordinateBounds();
    @GlobalValue(symbol="MGLTileSourceOptionAttributionHTMLString", optional=true)
    public static native Option AttributionHTMLString();
    @GlobalValue(symbol="MGLTileSourceOptionAttributionInfos", optional=true)
    public static native Option AttributionInfos();
    @GlobalValue(symbol="MGLTileSourceOptionTileCoordinateSystem", optional=true)
    public static native Option TileCoordinateSystem();
    @GlobalValue(symbol="MGLTileSourceOptionTileSize", optional=true)
    public static native Option TileSize();
    @GlobalValue(symbol="MGLTileSourceOptionDEMEncoding", optional=true)
    public static native Option DEMEncoding();
    
    
    /*</methods>*/
    public abstract static class Option extends NSObject {
    }
}
