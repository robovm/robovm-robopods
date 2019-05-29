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
package org.robovm.pods.appmetrica;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMMRevenueInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMMRevenueInfoPtr extends Ptr<YMMRevenueInfo, YMMRevenueInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMMRevenueInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected YMMRevenueInfo() {}
    protected YMMRevenueInfo(Handle h, long handle) { super(h, handle); }
    protected YMMRevenueInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithPrice:currency:")
    public YMMRevenueInfo(double price, String currency) { super((SkipInit) null); initObject(initWithPrice(price, currency)); }
    @Method(selector = "initWithPrice:currency:quantity:productID:transactionID:receiptData:payload:")
    public YMMRevenueInfo(double price, String currency, @MachineSizedUInt long quantity, String productID, String transactionID, NSData receiptData, NSDictionary<?, ?> payload) { super((SkipInit) null); initObject(initWithPrice(price, currency, quantity, productID, transactionID, receiptData, payload)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "price")
    public native double getPrice();
    @Property(selector = "currency")
    public native String getCurrency();
    @Property(selector = "quantity")
    public native @MachineSizedUInt long getQuantity();
    @Property(selector = "productID")
    public native String getProductID();
    @Property(selector = "transactionID")
    public native String getTransactionID();
    @Property(selector = "receiptData")
    public native NSData getReceiptData();
    @Property(selector = "payload")
    public native NSDictionary<?, ?> getPayload();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithPrice:currency:")
    protected native @Pointer long initWithPrice(double price, String currency);
    @Method(selector = "initWithPrice:currency:quantity:productID:transactionID:receiptData:payload:")
    protected native @Pointer long initWithPrice(double price, String currency, @MachineSizedUInt long quantity, String productID, String transactionID, NSData receiptData, NSDictionary<?, ?> payload);
    /*</methods>*/
}
