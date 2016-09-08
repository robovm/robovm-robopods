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
package org.robovm.pods.heyzap.ads;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZHeyzapExchangeBannerSize/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(HZHeyzapExchangeBannerSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="HZHeyzapExchangeBannerSizeFlexibleWidthHeight50", optional=true)
    public static native @ByVal CGSize SizeFlexibleWidthHeight50();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSizeFlexibleWidthHeight32", optional=true)
    public static native @ByVal CGSize SizeFlexibleWidthHeight32();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSizeFlexibleWidthHeight90", optional=true)
    public static native @ByVal CGSize SizeFlexibleWidthHeight90();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSizeFlexibleWidthHeight100", optional=true)
    public static native @ByVal CGSize SizeFlexibleWidthHeight100();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSize320x50", optional=true)
    public static native @ByVal CGSize Size320x50();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSize468x60", optional=true)
    public static native @ByVal CGSize Size468x60();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSize480x75", optional=true)
    public static native @ByVal CGSize Size480x75();
    @GlobalValue(symbol="HZHeyzapExchangeBannerSize728x90", optional=true)
    public static native @ByVal CGSize Size728x90();
    /*</methods>*/
}
