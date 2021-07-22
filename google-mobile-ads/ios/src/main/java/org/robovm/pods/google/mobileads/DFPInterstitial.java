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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DFPInterstitial/*</name>*/ 
    extends /*<extends>*/GADInterstitial/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DFPInterstitialPtr extends Ptr<DFPInterstitial, DFPInterstitialPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DFPInterstitial.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DFPInterstitial() {}
    protected DFPInterstitial(Handle h, long handle) { super(h, handle); }
    protected DFPInterstitial(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithAdUnitID:")
    public DFPInterstitial(String adUnitID) { super((SkipInit) null); initObject(init(adUnitID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "correlator")
    public native GADCorrelator getCorrelator();
    @Property(selector = "setCorrelator:")
    public native void setCorrelator(GADCorrelator v);
    @Property(selector = "appEventDelegate")
    public native GADAppEventDelegate getAppEventDelegate();
    @Property(selector = "setAppEventDelegate:", strongRef = true)
    public native void setAppEventDelegate(GADAppEventDelegate v);
    @Property(selector = "customRenderedInterstitialDelegate")
    public native DFPCustomRenderedInterstitialDelegate getCustomRenderedInterstitialDelegate();
    @Property(selector = "setCustomRenderedInterstitialDelegate:", strongRef = true)
    public native void setCustomRenderedInterstitialDelegate(DFPCustomRenderedInterstitialDelegate v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAdUnitID:")
    protected native @Pointer long init(String adUnitID);
    /*</methods>*/
}
