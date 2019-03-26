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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLStylePtr extends Ptr<MGLStyle, MGLStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLStyle() {}
    protected MGLStyle(Handle h, long handle) { super(h, handle); }
    protected MGLStyle(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "streetsStyleURL")
    public static native NSURL getStreetsStyleURL();
    @Property(selector = "outdoorsStyleURL")
    public static native NSURL getOutdoorsStyleURL();
    @Property(selector = "lightStyleURL")
    public static native NSURL getLightStyleURL();
    @Property(selector = "darkStyleURL")
    public static native NSURL getDarkStyleURL();
    @Property(selector = "satelliteStyleURL")
    public static native NSURL getSatelliteStyleURL();
    @Property(selector = "satelliteStreetsStyleURL")
    public static native NSURL getSatelliteStreetsStyleURL();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "sources")
    public native NSSet<MGLSource> getSources();
    @Property(selector = "setSources:")
    public native void setSources(NSSet<MGLSource> v);
    @Property(selector = "transition")
    public native @ByVal MGLTransition getTransition();
    @Property(selector = "setTransition:")
    public native void setTransition(@ByVal MGLTransition v);
    @Property(selector = "performsPlacementTransitions")
    public native boolean performsPlacementTransitions();
    @Property(selector = "setPerformsPlacementTransitions:")
    public native void setPerformsPlacementTransitions(boolean v);
    @Property(selector = "layers")
    public native NSArray<MGLStyleLayer> getLayers();
    @Property(selector = "setLayers:")
    public native void setLayers(NSArray<MGLStyleLayer> v);
    @Property(selector = "light")
    public native MGLLight getLight();
    @Property(selector = "setLight:")
    public native void setLight(MGLLight v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sourceWithIdentifier:")
    public native MGLSource source(String identifier);
    @Method(selector = "addSource:")
    public native void addSource(MGLSource source);
    @Method(selector = "removeSource:")
    public native void removeSource(MGLSource source);
    @Method(selector = "removeSource:error:")
    public native boolean remove(MGLSource source, NSError.NSErrorPtr outError);
    @Method(selector = "layerWithIdentifier:")
    public native MGLStyleLayer layer(String identifier);
    @Method(selector = "addLayer:")
    public native void addLayer(MGLStyleLayer layer);
    @Method(selector = "insertLayer:atIndex:")
    public native void insertLayer(MGLStyleLayer layer, @MachineSizedUInt long index);
    @Method(selector = "insertLayer:belowLayer:")
    public native void insertLayerBelow(MGLStyleLayer layer, MGLStyleLayer sibling);
    @Method(selector = "insertLayer:aboveLayer:")
    public native void insertLayerAbove(MGLStyleLayer layer, MGLStyleLayer sibling);
    @Method(selector = "removeLayer:")
    public native void removeLayer(MGLStyleLayer layer);
    @Method(selector = "imageForName:")
    public native UIImage image(String name);
    @Method(selector = "setImage:forName:")
    public native void setImage(UIImage image, String name);
    @Method(selector = "removeImageForName:")
    public native void removeImage(String name);
    @Method(selector = "localizeLabelsIntoLocale:")
    public native void localizeLabelsIntoLocale(NSLocale locale);
    @Method(selector = "streetsStyleURLWithVersion:")
    public static native NSURL streetsStyleURL(@MachineSizedSInt long version);
    @Method(selector = "outdoorsStyleURLWithVersion:")
    public static native NSURL outdoorsStyleURL(@MachineSizedSInt long version);
    @Method(selector = "lightStyleURLWithVersion:")
    public static native NSURL lightStyleURL(@MachineSizedSInt long version);
    @Method(selector = "darkStyleURLWithVersion:")
    public static native NSURL darkStyleURL(@MachineSizedSInt long version);
    @Method(selector = "satelliteStyleURLWithVersion:")
    public static native NSURL satelliteStyleURL(@MachineSizedSInt long version);
    @Method(selector = "satelliteStreetsStyleURLWithVersion:")
    public static native NSURL satelliteStreetsStyleURL(@MachineSizedSInt long version);
    /*</methods>*/

    /*
     * customised items
     */

    // declared as a constant, but may change
    @GlobalValue(symbol="MGLStyleDefaultVersion", optional=true)
    public static native int getDefaultVersion();
}
