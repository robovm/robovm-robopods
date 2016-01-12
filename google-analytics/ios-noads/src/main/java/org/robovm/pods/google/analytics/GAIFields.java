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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GAIFields/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GAIFieldsPtr extends Ptr<GAIFields, GAIFieldsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GAIFields.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GAIFields() {}
    protected GAIFields(Handle h, long handle) { super(h, handle); }
    protected GAIFields(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGAIUseSecure", optional=true)
    public static native String UseSecure();
    @GlobalValue(symbol="kGAIHitType", optional=true)
    public static native String HitType();
    @GlobalValue(symbol="kGAITrackingId", optional=true)
    public static native String TrackingId();
    @GlobalValue(symbol="kGAIClientId", optional=true)
    public static native String ClientId();
    @GlobalValue(symbol="kGAIDataSource", optional=true)
    public static native String DataSource();
    @GlobalValue(symbol="kGAIAnonymizeIp", optional=true)
    public static native String AnonymizeIp();
    @GlobalValue(symbol="kGAISessionControl", optional=true)
    public static native String SessionControl();
    @GlobalValue(symbol="kGAIDeviceModelVersion", optional=true)
    public static native String DeviceModelVersion();
    @GlobalValue(symbol="kGAIScreenResolution", optional=true)
    public static native String ScreenResolution();
    @GlobalValue(symbol="kGAIViewportSize", optional=true)
    public static native String ViewportSize();
    @GlobalValue(symbol="kGAIEncoding", optional=true)
    public static native String Encoding();
    @GlobalValue(symbol="kGAIScreenColors", optional=true)
    public static native String ScreenColors();
    @GlobalValue(symbol="kGAILanguage", optional=true)
    public static native String Language();
    @GlobalValue(symbol="kGAIJavaEnabled", optional=true)
    public static native String JavaEnabled();
    @GlobalValue(symbol="kGAIFlashVersion", optional=true)
    public static native String FlashVersion();
    @GlobalValue(symbol="kGAINonInteraction", optional=true)
    public static native String NonInteraction();
    @GlobalValue(symbol="kGAIReferrer", optional=true)
    public static native String Referrer();
    @GlobalValue(symbol="kGAILocation", optional=true)
    public static native String Location();
    @GlobalValue(symbol="kGAIHostname", optional=true)
    public static native String Hostname();
    @GlobalValue(symbol="kGAIPage", optional=true)
    public static native String Page();
    @GlobalValue(symbol="kGAIDescription", optional=true)
    public static native String Description();
    @GlobalValue(symbol="kGAIScreenName", optional=true)
    public static native String ScreenName();
    @GlobalValue(symbol="kGAITitle", optional=true)
    public static native String Title();
    @GlobalValue(symbol="kGAIAdMobHitId", optional=true)
    public static native String AdMobHitId();
    @GlobalValue(symbol="kGAIAppName", optional=true)
    public static native String AppName();
    @GlobalValue(symbol="kGAIAppVersion", optional=true)
    public static native String AppVersion();
    @GlobalValue(symbol="kGAIAppId", optional=true)
    public static native String AppId();
    @GlobalValue(symbol="kGAIAppInstallerId", optional=true)
    public static native String AppInstallerId();
    @GlobalValue(symbol="kGAIUserId", optional=true)
    public static native String UserId();
    @GlobalValue(symbol="kGAIEventCategory", optional=true)
    public static native String EventCategory();
    @GlobalValue(symbol="kGAIEventAction", optional=true)
    public static native String EventAction();
    @GlobalValue(symbol="kGAIEventLabel", optional=true)
    public static native String EventLabel();
    @GlobalValue(symbol="kGAIEventValue", optional=true)
    public static native String EventValue();
    @GlobalValue(symbol="kGAISocialNetwork", optional=true)
    public static native String SocialNetwork();
    @GlobalValue(symbol="kGAISocialAction", optional=true)
    public static native String SocialAction();
    @GlobalValue(symbol="kGAISocialTarget", optional=true)
    public static native String SocialTarget();
    @GlobalValue(symbol="kGAITransactionId", optional=true)
    public static native String TransactionId();
    @GlobalValue(symbol="kGAITransactionAffiliation", optional=true)
    public static native String TransactionAffiliation();
    @GlobalValue(symbol="kGAITransactionRevenue", optional=true)
    public static native String TransactionRevenue();
    @GlobalValue(symbol="kGAITransactionShipping", optional=true)
    public static native String TransactionShipping();
    @GlobalValue(symbol="kGAITransactionTax", optional=true)
    public static native String TransactionTax();
    @GlobalValue(symbol="kGAICurrencyCode", optional=true)
    public static native String CurrencyCode();
    @GlobalValue(symbol="kGAIItemPrice", optional=true)
    public static native String ItemPrice();
    @GlobalValue(symbol="kGAIItemQuantity", optional=true)
    public static native String ItemQuantity();
    @GlobalValue(symbol="kGAIItemSku", optional=true)
    public static native String ItemSku();
    @GlobalValue(symbol="kGAIItemName", optional=true)
    public static native String ItemName();
    @GlobalValue(symbol="kGAIItemCategory", optional=true)
    public static native String ItemCategory();
    @GlobalValue(symbol="kGAICampaignSource", optional=true)
    public static native String CampaignSource();
    @GlobalValue(symbol="kGAICampaignMedium", optional=true)
    public static native String CampaignMedium();
    @GlobalValue(symbol="kGAICampaignName", optional=true)
    public static native String CampaignName();
    @GlobalValue(symbol="kGAICampaignKeyword", optional=true)
    public static native String CampaignKeyword();
    @GlobalValue(symbol="kGAICampaignContent", optional=true)
    public static native String CampaignContent();
    @GlobalValue(symbol="kGAICampaignId", optional=true)
    public static native String CampaignId();
    @GlobalValue(symbol="kGAICampaignAdNetworkClickId", optional=true)
    public static native String CampaignAdNetworkClickId();
    @GlobalValue(symbol="kGAICampaignAdNetworkId", optional=true)
    public static native String CampaignAdNetworkId();
    @GlobalValue(symbol="kGAITimingCategory", optional=true)
    public static native String TimingCategory();
    @GlobalValue(symbol="kGAITimingVar", optional=true)
    public static native String TimingVar();
    @GlobalValue(symbol="kGAITimingValue", optional=true)
    public static native String TimingValue();
    @GlobalValue(symbol="kGAITimingLabel", optional=true)
    public static native String TimingLabel();
    @GlobalValue(symbol="kGAIExDescription", optional=true)
    public static native String ExDescription();
    @GlobalValue(symbol="kGAIExFatal", optional=true)
    public static native String ExFatal();
    @GlobalValue(symbol="kGAISampleRate", optional=true)
    public static native String SampleRate();
    @GlobalValue(symbol="kGAIIdfa", optional=true)
    public static native String Idfa();
    @GlobalValue(symbol="kGAIAdTargetingEnabled", optional=true)
    public static native String AdTargetingEnabled();
    @GlobalValue(symbol="kGAIScreenView", optional=true)
    public static native String ScreenView();
    @GlobalValue(symbol="kGAIEvent", optional=true)
    public static native String Event();
    @GlobalValue(symbol="kGAISocial", optional=true)
    public static native String Social();
    @GlobalValue(symbol="kGAITransaction", optional=true)
    public static native String Transaction();
    @GlobalValue(symbol="kGAIItem", optional=true)
    public static native String Item();
    @GlobalValue(symbol="kGAIException", optional=true)
    public static native String Exception();
    @GlobalValue(symbol="kGAITiming", optional=true)
    public static native String Timing();
    
    @Method(selector = "contentGroupForIndex:")
    public static native String createContentGroupField(@MachineSizedUInt long index);
    @Method(selector = "customDimensionForIndex:")
    public static native String createCustomDimensionField(@MachineSizedUInt long index);
    @Method(selector = "customMetricForIndex:")
    public static native String createCustomMetricField(@MachineSizedUInt long index);
    /*</methods>*/
}
