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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAdImageAdLoaderOptions/*</name>*/ 
    extends /*<extends>*/GADAdLoaderOptions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADNativeAdImageAdLoaderOptionsPtr extends Ptr<GADNativeAdImageAdLoaderOptions, GADNativeAdImageAdLoaderOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADNativeAdImageAdLoaderOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADNativeAdImageAdLoaderOptions() {}
    protected GADNativeAdImageAdLoaderOptions(Handle h, long handle) { super(h, handle); }
    protected GADNativeAdImageAdLoaderOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "disableImageLoading")
    public native boolean isImageLoadingDisabled();
    @Property(selector = "setDisableImageLoading:")
    public native void setImageLoadingDisabled(boolean v);
    @Property(selector = "shouldRequestMultipleImages")
    public native boolean shouldRequestMultipleImages();
    @Property(selector = "setShouldRequestMultipleImages:")
    public native void setShouldRequestMultipleImages(boolean v);
    @Property(selector = "preferredImageOrientation")
    public native GADNativeAdImageAdLoaderOptionsOrientation getPreferredImageOrientation();
    @Property(selector = "setPreferredImageOrientation:")
    public native void setPreferredImageOrientation(GADNativeAdImageAdLoaderOptionsOrientation v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
