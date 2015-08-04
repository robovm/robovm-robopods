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
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.bolts.*;
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFImageView/*</name>*/ 
    extends /*<extends>*/UIImageView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFImageViewPtr extends Ptr<PFImageView, PFImageViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFImageView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFImageView() {}
    protected PFImageView(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public PFImageView(CGRect frame) {
        super(frame);
    }
    /*<properties>*/
    @Property(selector = "file")
    public native PFFile getFile();
    @Property(selector = "setFile:")
    public native void setFile(PFFile v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "loadInBackground")
    public native BFTask<UIImage> loadInBackground();
    @Method(selector = "loadInBackground:")
    public native void loadInBackground(@Block PFImageDownloadCallback completion);
    @Method(selector = "loadInBackground:progressBlock:")
    public native void loadInBackground(@Block PFImageDownloadCallback completion, @Block PFProgressCallback progressBlock);
    /*</methods>*/
}
