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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdTableViewAdProvider/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdTableViewAdProviderPtr extends Ptr<FBNativeAdTableViewAdProvider, FBNativeAdTableViewAdProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdTableViewAdProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdTableViewAdProvider() {}
    protected FBNativeAdTableViewAdProvider(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdTableViewAdProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManager:")
    public FBNativeAdTableViewAdProvider(FBNativeAdsManager manager) { super((SkipInit) null); initObject(init(manager)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native FBNativeAdDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(FBNativeAdDelegate v);
    @Property(selector = "extraHint")
    public native FBAdExtraHint getExtraHint();
    @Property(selector = "setExtraHint:")
    public native void setExtraHint(FBAdExtraHint v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManager:")
    protected native @Pointer long init(FBNativeAdsManager manager);
    @Method(selector = "tableView:nativeAdForRowAtIndexPath:")
    public native FBNativeAd getNativeAdForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "isAdCellAtIndexPath:forStride:")
    public native boolean isAdCellAtIndexPath(NSIndexPath indexPath, @MachineSizedUInt long stride);
    @Method(selector = "adjustNonAdCellIndexPath:forStride:")
    public native NSIndexPath adjustNonAdCellIndexPath(NSIndexPath indexPath, @MachineSizedUInt long stride);
    @Method(selector = "adjustCount:forStride:")
    public native @MachineSizedUInt long adjustCount(@MachineSizedUInt long count, @MachineSizedUInt long stride);
    /*</methods>*/
}
