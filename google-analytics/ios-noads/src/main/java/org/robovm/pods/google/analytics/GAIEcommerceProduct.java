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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAIEcommerceProduct/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIEcommerceProductPtr extends Ptr<GAIEcommerceProduct, GAIEcommerceProductPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAIEcommerceProduct.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAIEcommerceProduct() {}
    protected GAIEcommerceProduct(Handle h, long handle) { super(h, handle); }
    protected GAIEcommerceProduct(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setId:")
    public native GAIEcommerceProduct setId(String productId);
    @Method(selector = "setName:")
    public native GAIEcommerceProduct setName(String productName);
    @Method(selector = "setBrand:")
    public native GAIEcommerceProduct setBrand(String productBrand);
    @Method(selector = "setCategory:")
    public native GAIEcommerceProduct setCategory(String productCategory);
    @Method(selector = "setVariant:")
    public native GAIEcommerceProduct setVariant(String productVariant);
    @Method(selector = "setPrice:")
    public native GAIEcommerceProduct setPrice(NSNumber productPrice);
    @Method(selector = "setQuantity:")
    public native GAIEcommerceProduct setQuantity(NSNumber productQuantity);
    @Method(selector = "setCouponCode:")
    public native GAIEcommerceProduct setCouponCode(String productCouponCode);
    @Method(selector = "setPosition:")
    public native GAIEcommerceProduct setPosition(NSNumber productPosition);
    @Method(selector = "setCustomDimension:value:")
    public native GAIEcommerceProduct setCustomDimension(@MachineSizedUInt long index, String value);
    @Method(selector = "setCustomMetric:value:")
    public native GAIEcommerceProduct setCustomMetric(@MachineSizedUInt long index, NSNumber value);
    @Method(selector = "buildWithIndex:")
    public native NSDictionary<?, ?> build(@MachineSizedUInt long index);
    @Method(selector = "buildWithListIndex:index:")
    public native NSDictionary<?, ?> build(@MachineSizedUInt long lIndex, @MachineSizedUInt long index);
    /*</methods>*/
}
