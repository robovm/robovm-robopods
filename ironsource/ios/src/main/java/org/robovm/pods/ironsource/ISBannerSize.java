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
package org.robovm.pods.ironsource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISBannerSize/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISBannerSizePtr extends Ptr<ISBannerSize, ISBannerSizePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISBannerSize.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISBannerSize() {}
    protected ISBannerSize(Handle h, long handle) { super(h, handle); }
    protected ISBannerSize(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithWidth:andHeight:")
    public ISBannerSize(@MachineSizedSInt long width, @MachineSizedSInt long height) { super((SkipInit) null); initObject(init(width, height)); }
    @Method(selector = "initWithDescription:")
    public ISBannerSize(String description) { super((SkipInit) null); initObject(init(description)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sizeDescription")
    public native String getSizeDescription();
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithWidth:andHeight:")
    protected native @Pointer long init(@MachineSizedSInt long width, @MachineSizedSInt long height);
    @Method(selector = "initWithDescription:")
    protected native @Pointer long init(String description);
    /*</methods>*/
}
