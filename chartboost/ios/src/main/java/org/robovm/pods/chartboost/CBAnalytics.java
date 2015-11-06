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
package org.robovm.pods.chartboost;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CBAnalyticsPtr extends Ptr<CBAnalytics, CBAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CBAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CBAnalytics() {}
    protected CBAnalytics(Handle h, long handle) { super(h, handle); }
    protected CBAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "trackInAppPurchaseEvent:productTitle:productDescription:productPrice:productCurrency:productIdentifier:")
    public static native void trackInAppPurchaseEvent(NSData receipt, String productTitle, String productDescription, NSDecimalNumber productPrice, String productCurrency, String productIdentifier);
    @Method(selector = "trackInAppPurchaseEventWithString:productTitle:productDescription:productPrice:productCurrency:productIdentifier:")
    public static native void trackInAppPurchaseEvent(String receiptString, String productTitle, String productDescription, NSDecimalNumber productPrice, String productCurrency, String productIdentifier);
    @WeaklyLinked
    @Method(selector = "trackInAppPurchaseEvent:product:")
    public static native void trackInAppPurchaseEvent(NSData receipt, SKProduct product);
    @Method(selector = "trackLevelInfo:eventField:mainLevel:subLevel:description:")
    public static native void trackLevelInfo(String eventLabel, CBLevelType eventField, @MachineSizedUInt long mainLevel, @MachineSizedUInt long subLevel, String description);
    @Method(selector = "trackLevelInfo:eventField:mainLevel:description:")
    public static native void trackLevelInfo(String eventLabel, CBLevelType eventField, @MachineSizedUInt long mainLevel, String description);
    /*</methods>*/
}
