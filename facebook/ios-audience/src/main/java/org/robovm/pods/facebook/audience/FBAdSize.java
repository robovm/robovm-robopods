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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdSize/*</name>*/ 
    extends /*<extends>*/Struct<FBAdSize>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdSizePtr extends Ptr<FBAdSize, FBAdSizePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(FBAdSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdSize() {}
    public FBAdSize(CGSize size) {
        this.setSize(size);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native @ByVal CGSize getSize();
    @StructMember(0) public native FBAdSize setSize(@ByVal CGSize size);
    /*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kFBAdSize320x50", optional=true)
    public static native @ByVal FBAdSize _320x50();
    @GlobalValue(symbol="kFBAdSizeHeight50Banner", optional=true)
    public static native @ByVal FBAdSize Height50Banner();
    @GlobalValue(symbol="kFBAdSizeHeight90Banner", optional=true)
    public static native @ByVal FBAdSize Height90Banner();
    @GlobalValue(symbol="kFBAdSizeInterstitial", optional=true)
    public static native @ByVal FBAdSize Interstitial();
    @GlobalValue(symbol="kFBAdSizeHeight250Rectangle", optional=true)
    public static native @ByVal FBAdSize Height250Rectangle();
    /*</methods>*/
}
