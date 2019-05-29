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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/YMMMutableRevenueInfo/*</name>*/ 
    extends /*<extends>*/YMMRevenueInfo/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class YMMMutableRevenueInfoPtr extends Ptr<YMMMutableRevenueInfo, YMMMutableRevenueInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(YMMMutableRevenueInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public YMMMutableRevenueInfo() {}
    protected YMMMutableRevenueInfo(Handle h, long handle) { super(h, handle); }
    protected YMMMutableRevenueInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "quantity")
    public native @MachineSizedUInt long getQuantity();
    @Property(selector = "setQuantity:")
    public native void setQuantity(@MachineSizedUInt long v);
    @Property(selector = "productID")
    public native String getProductID();
    @Property(selector = "setProductID:")
    public native void setProductID(String v);
    @Property(selector = "transactionID")
    public native String getTransactionID();
    @Property(selector = "setTransactionID:")
    public native void setTransactionID(String v);
    @Property(selector = "receiptData")
    public native NSData getReceiptData();
    @Property(selector = "setReceiptData:")
    public native void setReceiptData(NSData v);
    @Property(selector = "payload")
    public native NSDictionary<?, ?> getPayload();
    @Property(selector = "setPayload:")
    public native void setPayload(NSDictionary<?, ?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
