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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAIEcommerceFields/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIEcommerceFieldsPtr extends Ptr<GAIEcommerceFields, GAIEcommerceFieldsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAIEcommerceFields.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAIEcommerceFields() {}
    protected GAIEcommerceFields(Handle h, long handle) { super(h, handle); }
    protected GAIEcommerceFields(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGAIProductId", optional=true)
    public static native String ProductId();
    @GlobalValue(symbol="kGAIProductName", optional=true)
    public static native String ProductName();
    @GlobalValue(symbol="kGAIProductBrand", optional=true)
    public static native String ProductBrand();
    @GlobalValue(symbol="kGAIProductCategory", optional=true)
    public static native String ProductCategory();
    @GlobalValue(symbol="kGAIProductVariant", optional=true)
    public static native String ProductVariant();
    @GlobalValue(symbol="kGAIProductPrice", optional=true)
    public static native String ProductPrice();
    @GlobalValue(symbol="kGAIProductQuantity", optional=true)
    public static native String ProductQuantity();
    @GlobalValue(symbol="kGAIProductCouponCode", optional=true)
    public static native String ProductCouponCode();
    @GlobalValue(symbol="kGAIProductPosition", optional=true)
    public static native String ProductPosition();
    @GlobalValue(symbol="kGAIProductAction", optional=true)
    public static native String ProductAction();
    @GlobalValue(symbol="kGAIPADetail", optional=true)
    public static native String PADetail();
    @GlobalValue(symbol="kGAIPAClick", optional=true)
    public static native String PAClick();
    @GlobalValue(symbol="kGAIPAAdd", optional=true)
    public static native String PAAdd();
    @GlobalValue(symbol="kGAIPARemove", optional=true)
    public static native String PARemove();
    @GlobalValue(symbol="kGAIPACheckout", optional=true)
    public static native String PACheckout();
    @GlobalValue(symbol="kGAIPACheckoutOption", optional=true)
    public static native String PACheckoutOption();
    @GlobalValue(symbol="kGAIPAPurchase", optional=true)
    public static native String PAPurchase();
    @GlobalValue(symbol="kGAIPARefund", optional=true)
    public static native String PARefund();
    @GlobalValue(symbol="kGAIPATransactionId", optional=true)
    public static native String PATransactionId();
    @GlobalValue(symbol="kGAIPAAffiliation", optional=true)
    public static native String PAAffiliation();
    @GlobalValue(symbol="kGAIPARevenue", optional=true)
    public static native String PARevenue();
    @GlobalValue(symbol="kGAIPATax", optional=true)
    public static native String PATax();
    @GlobalValue(symbol="kGAIPAShipping", optional=true)
    public static native String PAShipping();
    @GlobalValue(symbol="kGAIPACouponCode", optional=true)
    public static native String PACouponCode();
    @GlobalValue(symbol="kGAICheckoutStep", optional=true)
    public static native String CheckoutStep();
    @GlobalValue(symbol="kGAICheckoutOption", optional=true)
    public static native String CheckoutOption();
    @GlobalValue(symbol="kGAIProductActionList", optional=true)
    public static native String ProductActionList();
    @GlobalValue(symbol="kGAIProductListSource", optional=true)
    public static native String ProductListSource();
    @GlobalValue(symbol="kGAIImpressionName", optional=true)
    public static native String ImpressionName();
    @GlobalValue(symbol="kGAIImpressionListSource", optional=true)
    public static native String ImpressionListSource();
    @GlobalValue(symbol="kGAIImpressionProduct", optional=true)
    public static native String ImpressionProduct();
    @GlobalValue(symbol="kGAIImpressionProductId", optional=true)
    public static native String ImpressionProductId();
    @GlobalValue(symbol="kGAIImpressionProductName", optional=true)
    public static native String ImpressionProductName();
    @GlobalValue(symbol="kGAIImpressionProductBrand", optional=true)
    public static native String ImpressionProductBrand();
    @GlobalValue(symbol="kGAIImpressionProductCategory", optional=true)
    public static native String ImpressionProductCategory();
    @GlobalValue(symbol="kGAIImpressionProductVariant", optional=true)
    public static native String ImpressionProductVariant();
    @GlobalValue(symbol="kGAIImpressionProductPosition", optional=true)
    public static native String ImpressionProductPosition();
    @GlobalValue(symbol="kGAIImpressionProductPrice", optional=true)
    public static native String ImpressionProductPrice();
    @GlobalValue(symbol="kGAIPromotionId", optional=true)
    public static native String PromotionId();
    @GlobalValue(symbol="kGAIPromotionName", optional=true)
    public static native String PromotionName();
    @GlobalValue(symbol="kGAIPromotionCreative", optional=true)
    public static native String PromotionCreative();
    @GlobalValue(symbol="kGAIPromotionPosition", optional=true)
    public static native String PromotionPosition();
    @GlobalValue(symbol="kGAIPromotionAction", optional=true)
    public static native String PromotionAction();
    @GlobalValue(symbol="kGAIPromotionView", optional=true)
    public static native String PromotionView();
    @GlobalValue(symbol="kGAIPromotionClick", optional=true)
    public static native String PromotionClick();
    
    @Method(selector = "productFieldForIndex:suffix:")
    public static native String createProductField(@MachineSizedUInt long index, String suffix);
    @Method(selector = "impressionListForIndex:")
    public static native String createImpressionListField(@MachineSizedUInt long index);
    @Method(selector = "productImpressionForList:index:suffix:")
    public static native String createProductImpressionField(String list, @MachineSizedUInt long index, String Suffix);
    @Method(selector = "promotionForIndex:suffix:")
    public static native String createPromotionField(@MachineSizedUInt long index, String suffix);
    /*</methods>*/
}
