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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdImage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdImagePtr extends Ptr<FBAdImage, FBAdImagePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdImage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdImage() {}
    protected FBAdImage(Handle h, long handle) { super(h, handle); }
    protected FBAdImage(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithURL:width:height:")
    public FBAdImage(NSURL url, @MachineSizedSInt long width, @MachineSizedSInt long height) { super((SkipInit) null); initObject(init(url, width, height)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "url")
    public native NSURL getUrl();
    @Property(selector = "width")
    public native @MachineSizedSInt long getWidth();
    @Property(selector = "height")
    public native @MachineSizedSInt long getHeight();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithURL:width:height:")
    protected native @Pointer long init(NSURL url, @MachineSizedSInt long width, @MachineSizedSInt long height);
    @Method(selector = "loadImageAsyncWithBlock:")
    public native void loadImageAsync(@Block VoidBlock1<UIImage> block);
    /*</methods>*/
}
