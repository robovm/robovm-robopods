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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLImageSource/*</name>*/ 
    extends /*<extends>*/MGLSource/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLImageSourcePtr extends Ptr<MGLImageSource, MGLImageSourcePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLImageSource.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLImageSource() {}
    protected MGLImageSource(Handle h, long handle) { super(h, handle); }
    protected MGLImageSource(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:coordinateQuad:URL:")
    public MGLImageSource(String identifier, @ByVal MGLCoordinateQuad coordinateQuad, NSURL url) { super((SkipInit) null); initObject(init(identifier, coordinateQuad, url)); }
    @Method(selector = "initWithIdentifier:coordinateQuad:image:")
    public MGLImageSource(String identifier, @ByVal MGLCoordinateQuad coordinateQuad, UIImage image) { super((SkipInit) null); initObject(init(identifier, coordinateQuad, image)); }
    @Method(selector = "initWithIdentifier:")
    public MGLImageSource(String identifier) { super(identifier); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(UIImage v);
    @Property(selector = "coordinates")
    public native @ByVal MGLCoordinateQuad getCoordinates();
    @Property(selector = "setCoordinates:")
    public native void setCoordinates(@ByVal MGLCoordinateQuad v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:coordinateQuad:URL:")
    protected native @Pointer long init(String identifier, @ByVal MGLCoordinateQuad coordinateQuad, NSURL url);
    @Method(selector = "initWithIdentifier:coordinateQuad:image:")
    protected native @Pointer long init(String identifier, @ByVal MGLCoordinateQuad coordinateQuad, UIImage image);
    /*</methods>*/
}
