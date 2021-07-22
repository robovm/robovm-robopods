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
package org.robovm.pods.ironsource;

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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISImpressionData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISImpressionDataPtr extends Ptr<ISImpressionData, ISImpressionDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISImpressionData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISImpressionData() {}
    protected ISImpressionData(Handle h, long handle) { super(h, handle); }
    protected ISImpressionData(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:")
    public ISImpressionData(NSDictionary<?, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "auction_id")
    public native String getAuction_id();
    @Property(selector = "ad_unit")
    public native String getAd_unit();
    @Property(selector = "ad_network")
    public native String getAd_network();
    @Property(selector = "instance_name")
    public native String getInstance_name();
    @Property(selector = "instance_id")
    public native String getInstance_id();
    @Property(selector = "country")
    public native String getCountry();
    @Property(selector = "placement")
    public native String getPlacement();
    @Property(selector = "revenue")
    public native NSNumber getRevenue();
    @Property(selector = "precision")
    public native String getPrecision();
    @Property(selector = "ab")
    public native String getAb();
    @Property(selector = "segment_name")
    public native String getSegment_name();
    @Property(selector = "lifetime_revenue")
    public native NSNumber getLifetime_revenue();
    @Property(selector = "encrypted_cpm")
    public native String getEncrypted_cpm();
    @Property(selector = "conversion_value")
    public native NSNumber getConversion_value();
    @Property(selector = "all_data")
    public native NSDictionary<?, ?> getAll_data();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> dictionary);
    @Method(selector = "replacePlacementMacro:value:")
    public native void replacePlacementMacro(String macro, String value);
    /*</methods>*/
}
