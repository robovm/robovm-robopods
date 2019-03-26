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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLVectorTileSource/*</name>*/ 
    extends /*<extends>*/MGLTileSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLVectorTileSourcePtr extends Ptr<MGLVectorTileSource, MGLVectorTileSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLVectorTileSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLVectorTileSource() {}
    protected MGLVectorTileSource(Handle h, long handle) { super(h, handle); }
    protected MGLVectorTileSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:configurationURL:")
    public MGLVectorTileSource(String identifier, NSURL configurationURL) { super((SkipInit) null); initObject(init(identifier, configurationURL)); }
    @Method(selector = "initWithIdentifier:tileURLTemplates:options:")
    public MGLVectorTileSource(String identifier, NSArray<NSString> tileURLTemplates, NSDictionary<NSString, ?> options) { super((SkipInit) null); initObject(init(identifier, tileURLTemplates, options)); }
    @Method(selector = "initWithIdentifier:")
    public MGLVectorTileSource(String identifier) { super(identifier); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:configurationURL:")
    protected native @Pointer long init(String identifier, NSURL configurationURL);
    @Method(selector = "initWithIdentifier:tileURLTemplates:options:")
    protected native @Pointer long init(String identifier, NSArray<NSString> tileURLTemplates, NSDictionary<NSString, ?> options);
    @Method(selector = "featuresInSourceLayersWithIdentifiers:predicate:")
    public native NSArray<?> featuresInSourceLayers(NSSet<NSString> sourceLayerIdentifiers, NSPredicate predicate);
    /*</methods>*/
}
