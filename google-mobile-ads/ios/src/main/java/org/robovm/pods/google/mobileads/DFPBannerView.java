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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DFPBannerView/*</name>*/ 
    extends /*<extends>*/GADBannerView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DFPBannerViewPtr extends Ptr<DFPBannerView, DFPBannerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DFPBannerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DFPBannerView() {}
    protected DFPBannerView(Handle h, long handle) { super(h, handle); }
    protected DFPBannerView(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/

    public List<GADAdSize> getValidAdSizes() {
        List<GADAdSize> result = new ArrayList<>();
        NSArray<NSValue> adSizes = getValidAdSizes0();
        for (NSValue adSize : adSizes) {
            result.add(GADAdSize.fromValue(adSize));
        }
        return result;
    }
    public void setValidAdSizes(List<GADAdSize> v) {
        NSArray<NSValue> adSizes = new NSMutableArray<>();
        for (GADAdSize adSize : v) {
            adSizes.add(GADAdSize.toValue(adSize));
        }
        setValidAdSizes0(adSizes);
    }
    /*<properties>*/
    @Property(selector = "adUnitID")
    public native String getAdUnitID();
    @Property(selector = "setAdUnitID:")
    public native void setAdUnitID(String v);
    @Property(selector = "appEventDelegate")
    public native GADAppEventDelegate getAppEventDelegate();
    @Property(selector = "setAppEventDelegate:", strongRef = true)
    public native void setAppEventDelegate(GADAppEventDelegate v);
    @Property(selector = "adSizeDelegate")
    public native GADAdSizeDelegate getAdSizeDelegate();
    @Property(selector = "setAdSizeDelegate:", strongRef = true)
    public native void setAdSizeDelegate(GADAdSizeDelegate v);
    @Property(selector = "validAdSizes")
    private native NSArray<NSValue> getValidAdSizes0();
    @Property(selector = "setValidAdSizes:")
    private native void setValidAdSizes0(NSArray<NSValue> v);
    @Property(selector = "correlator")
    public native GADCorrelator getCorrelator();
    @Property(selector = "setCorrelator:")
    public native void setCorrelator(GADCorrelator v);
    @Property(selector = "enableManualImpressions")
    public native boolean areManualImpressionsEnabled();
    @Property(selector = "setEnableManualImpressions:")
    public native void setManualImpressionsEnabled(boolean v);
    @Property(selector = "customRenderedBannerViewDelegate")
    public native DFPCustomRenderedBannerViewDelegate getCustomRenderedBannerViewDelegate();
    @Property(selector = "setCustomRenderedBannerViewDelegate:", strongRef = true)
    public native void setCustomRenderedBannerViewDelegate(DFPCustomRenderedBannerViewDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "recordImpression")
    public native void recordImpression();
    @Method(selector = "resize:")
    public native void resize(@ByVal GADAdSize size);
    /*</methods>*/
}
