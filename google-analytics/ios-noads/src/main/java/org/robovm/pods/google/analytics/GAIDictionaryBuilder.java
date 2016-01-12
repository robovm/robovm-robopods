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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAIDictionaryBuilder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIDictionaryBuilderPtr extends Ptr<GAIDictionaryBuilder, GAIDictionaryBuilderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAIDictionaryBuilder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAIDictionaryBuilder() {}
    protected GAIDictionaryBuilder(Handle h, long handle) { super(h, handle); }
    protected GAIDictionaryBuilder(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public GAIDictionaryBuilder put(String key, String value) {
        return put0(value, key);
    }
    /*<methods>*/
    @Method(selector = "set:forKey:")
    private native GAIDictionaryBuilder put0(String value, String key);
    @Method(selector = "setAll:")
    public native GAIDictionaryBuilder putAll(NSDictionary<?, ?> params);
    @Method(selector = "get:")
    public native String get(String paramName);
    @Method(selector = "build")
    public native NSMutableDictionary<?, ?> build();
    @Method(selector = "setCampaignParametersFromUrl:")
    public native GAIDictionaryBuilder setCampaignParametersFromUrl(String urlString);
    @Method(selector = "setProductAction:")
    public native GAIDictionaryBuilder setProductAction(GAIEcommerceProductAction productAction);
    @Method(selector = "addProduct:")
    public native GAIDictionaryBuilder addProduct(GAIEcommerceProduct product);
    @Method(selector = "addProductImpression:impressionList:impressionSource:")
    public native GAIDictionaryBuilder addProductImpression(GAIEcommerceProduct product, String name, String source);
    @Method(selector = "addPromotion:")
    public native GAIDictionaryBuilder addPromotion(GAIEcommercePromotion promotion);
    @Method(selector = "createScreenView")
    public static native GAIDictionaryBuilder createScreenView();
    @Method(selector = "createEventWithCategory:action:label:value:")
    public static native GAIDictionaryBuilder createEvent(String category, String action, String label, NSNumber value);
    @Method(selector = "createExceptionWithDescription:withFatal:")
    public static native GAIDictionaryBuilder createException(String description, NSNumber fatal);
    @Method(selector = "createItemWithTransactionId:name:sku:category:price:quantity:currencyCode:")
    public static native GAIDictionaryBuilder createItem(String transactionId, String name, String sku, String category, NSNumber price, NSNumber quantity, String currencyCode);
    @Method(selector = "createSocialWithNetwork:action:target:")
    public static native GAIDictionaryBuilder createSocial(String network, String action, String target);
    @Method(selector = "createTimingWithCategory:interval:name:label:")
    public static native GAIDictionaryBuilder createTiming(String category, NSNumber intervalMillis, String name, String label);
    @Method(selector = "createTransactionWithId:affiliation:revenue:tax:shipping:currencyCode:")
    public static native GAIDictionaryBuilder createTransaction(String transactionId, String affiliation, NSNumber revenue, NSNumber tax, NSNumber shipping, String currencyCode);
    /*</methods>*/
}
