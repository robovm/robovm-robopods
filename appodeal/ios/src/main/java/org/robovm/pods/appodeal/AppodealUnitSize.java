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
package org.robovm.pods.appodeal;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppodealUnitSize/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(AppodealUnitSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kAppodealUnitSize_320x50", optional=true)
    public static native @ByVal CGSize Size_320x50();
    @GlobalValue(symbol="kAppodealUnitSize_300x250", optional=true)
    public static native @ByVal CGSize Size_300x250();
    @GlobalValue(symbol="kAppodealUnitSize_728x90", optional=true)
    public static native @ByVal CGSize Size_728x90();
    
    @Bridge(symbol="AppodealAvailableUnitSizes", optional=true)
    public static native NSArray<?> availableUnitSizes();
    @Bridge(symbol="AppodealIsUnitSizeSupported", optional=true)
    public static native boolean isUnitSizeSupported(@ByVal CGSize size, NSArray<?> supportedSizes);
    @Bridge(symbol="AppodealIsUnitSizeAvailable", optional=true)
    public static native boolean isUnitSizeAvailable(@ByVal CGSize size);
    @Bridge(symbol="AppodealNearestUnitSizeForSize", optional=true)
    public static native @ByVal CGSize nearestUnitSizeForSize(@ByVal CGSize size);
    /*</methods>*/
}
