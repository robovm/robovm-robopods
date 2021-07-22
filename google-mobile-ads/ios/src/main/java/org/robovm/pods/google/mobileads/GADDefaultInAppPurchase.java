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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADDefaultInAppPurchase/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADDefaultInAppPurchasePtr extends Ptr<GADDefaultInAppPurchase, GADDefaultInAppPurchasePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADDefaultInAppPurchase.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADDefaultInAppPurchase() {}
    protected GADDefaultInAppPurchase(Handle h, long handle) { super(h, handle); }
    protected GADDefaultInAppPurchase(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "productID")
    public native String getProductID();
    @Property(selector = "quantity")
    public native @MachineSizedSInt long getQuantity();
    @Property(selector = "paymentTransaction")
    public native SKPaymentTransaction getPaymentTransaction();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "finishTransaction")
    public native void finishTransaction();
    @Method(selector = "enableDefaultPurchaseFlowWithDelegate:")
    public static native void enableDefaultPurchaseFlow(GADDefaultInAppPurchaseDelegate delegate);
    @Method(selector = "disableDefaultPurchaseFlow")
    public static native void disableDefaultPurchaseFlow();
    /*</methods>*/
}
