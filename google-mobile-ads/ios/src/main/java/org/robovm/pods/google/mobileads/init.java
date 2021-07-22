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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/init/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class initPtr extends Ptr<init, initPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(init.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public init() {}
    protected init(Handle h, long handle) { super(h, handle); }
    protected init(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithImage:")
    public init(UIImage image) { super((SkipInit) null); initObject(initWithImage(image)); }
    @Method(selector = "initWithURL:scale:")
    public init(NSURL URL, @MachineSizedFloat double scale) { super((SkipInit) null); initObject(initWithURL$scale$(URL, scale)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "image")
    public native UIImage getImage();
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "scale")
    public native @MachineSizedFloat double getScale();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithImage:")
    protected native @Pointer long initWithImage(UIImage image);
    @Method(selector = "initWithURL:scale:")
    protected native @Pointer long initWithURL$scale$(NSURL URL, @MachineSizedFloat double scale);
    /*</methods>*/
}
