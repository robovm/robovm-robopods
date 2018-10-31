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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLCompassDirectionFormatter/*</name>*/ 
    extends /*<extends>*/NSFormatter/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLCompassDirectionFormatterPtr extends Ptr<MGLCompassDirectionFormatter, MGLCompassDirectionFormatterPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLCompassDirectionFormatter.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLCompassDirectionFormatter() {}
    protected MGLCompassDirectionFormatter(Handle h, long handle) { super(h, handle); }
    protected MGLCompassDirectionFormatter(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "unitStyle")
    public native NSFormattingUnitStyle getUnitStyle();
    @Property(selector = "setUnitStyle:")
    public native void setUnitStyle(NSFormattingUnitStyle v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stringFromDirection:")
    public native String stringFromDirection(double direction);
    @Method(selector = "getObjectValue:forString:errorDescription:")
    public native boolean getObjectValue(NSObject obj, String string, NSString.NSStringPtr error);
    /*</methods>*/
}
