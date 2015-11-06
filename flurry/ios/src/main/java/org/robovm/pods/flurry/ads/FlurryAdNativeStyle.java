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
package org.robovm.pods.flurry.ads;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FlurryAdNativeStyle/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FlurryAdNativeStylePtr extends Ptr<FlurryAdNativeStyle, FlurryAdNativeStylePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FlurryAdNativeStyle.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FlurryAdNativeStyle() {}
    protected FlurryAdNativeStyle(Handle h, long handle) { super(h, handle); }
    protected FlurryAdNativeStyle(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStyle:")
    public FlurryAdNativeStyle(int styleNum) { super((SkipInit) null); initObject(init(styleNum)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native String getStyle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="STYLE1_SMALL", optional=true)
    public static native int STYLE1_SMALL();
    @GlobalValue(symbol="STYLE1_MEDIUM", optional=true)
    public static native int STYLE1_MEDIUM();
    @GlobalValue(symbol="STYLE1_LARGE", optional=true)
    public static native int STYLE1_LARGE();
    @GlobalValue(symbol="STYLE1_XLARGE", optional=true)
    public static native int STYLE1_XLARGE();
    @GlobalValue(symbol="STYLE2_SMALL", optional=true)
    public static native int STYLE2_SMALL();
    @GlobalValue(symbol="STYLE2_MEDIUM", optional=true)
    public static native int STYLE2_MEDIUM();
    
    @Method(selector = "initWithStyle:")
    protected native @Pointer long init(int styleNum);
    /*</methods>*/
}
