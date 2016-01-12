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
package org.robovm.pods.google.analytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAIEcommerceProductAction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIEcommerceProductActionPtr extends Ptr<GAIEcommerceProductAction, GAIEcommerceProductActionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAIEcommerceProductAction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAIEcommerceProductAction() {}
    protected GAIEcommerceProductAction(Handle h, long handle) { super(h, handle); }
    protected GAIEcommerceProductAction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setAction:")
    public native GAIEcommerceProductAction setAction(String productAction);
    @Method(selector = "setTransactionId:")
    public native GAIEcommerceProductAction setTransactionId(String transactionId);
    @Method(selector = "setAffiliation:")
    public native GAIEcommerceProductAction setAffiliation(String affiliation);
    @Method(selector = "setRevenue:")
    public native GAIEcommerceProductAction setRevenue(NSNumber revenue);
    @Method(selector = "setTax:")
    public native GAIEcommerceProductAction setTax(NSNumber tax);
    @Method(selector = "setShipping:")
    public native GAIEcommerceProductAction setShipping(NSNumber shipping);
    @Method(selector = "setCouponCode:")
    public native GAIEcommerceProductAction setCouponCode(String couponCode);
    @Method(selector = "setCheckoutStep:")
    public native GAIEcommerceProductAction setCheckoutStep(NSNumber checkoutStep);
    @Method(selector = "setCheckoutOption:")
    public native GAIEcommerceProductAction setCheckoutOption(String checkoutOption);
    @Method(selector = "setProductActionList:")
    public native GAIEcommerceProductAction setProductActionList(String productActionList);
    @Method(selector = "setProductListSource:")
    public native GAIEcommerceProductAction setProductListSource(String productListSource);
    @Method(selector = "build")
    public native NSDictionary<?, ?> build();
    /*</methods>*/
}
