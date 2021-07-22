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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADSearchBannerView/*</name>*/ 
    extends /*<extends>*/GADBannerView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADSearchBannerViewPtr extends Ptr<GADSearchBannerView, GADSearchBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADSearchBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADSearchBannerView() {}
    protected GADSearchBannerView(Handle h, long handle) { super(h, handle); }
    protected GADSearchBannerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdSize:origin:")
    public GADSearchBannerView(@ByVal GADAdSize adSize, @ByVal CGPoint origin) { super(adSize, origin); }
    @Method(selector = "initWithAdSize:")
    public GADSearchBannerView(@ByVal GADAdSize adSize) { super(adSize); }
    @Method(selector = "initWithFrame:")
    public GADSearchBannerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public GADSearchBannerView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "adSizeDelegate")
    public native GADAdSizeDelegate getAdSizeDelegate();
    @Property(selector = "setAdSizeDelegate:", strongRef = true)
    public native void setAdSizeDelegate(GADAdSizeDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
