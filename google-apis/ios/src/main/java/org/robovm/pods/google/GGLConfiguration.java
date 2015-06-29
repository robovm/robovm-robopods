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
package org.robovm.pods.google;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GGLConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GGLConfigurationPtr extends Ptr<GGLConfiguration, GGLConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GGLConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GGLConfiguration() {}
    protected GGLConfiguration(SkipInit skipInit) { super(skipInit); }
    public GGLConfiguration(String apiKey, String clientID, NSArray<?> identityProviders, String trackingID, String widgetURL, String bannerAdUnitID, String interstitialAdUnitID, String gcmSenderID, String androidClientID) { super((SkipInit) null); initObject(init(apiKey, clientID, identityProviders, trackingID, widgetURL, bannerAdUnitID, interstitialAdUnitID, gcmSenderID, androidClientID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "apiKey")
    public native String getApiKey();
    @Property(selector = "clientID")
    public native String getClientID();
    @Property(selector = "identityProviders")
    public native NSArray<?> getIdentityProviders();
    @Property(selector = "trackingID")
    public native String getTrackingID();
    @Property(selector = "widgetURL")
    public native String getWidgetURL();
    @Property(selector = "bannerAdUnitID")
    public native String getBannerAdUnitID();
    @Property(selector = "interstitialAdUnitID")
    public native String getInterstitialAdUnitID();
    @Property(selector = "gcmSenderID")
    public native String getGcmSenderID();
    @Property(selector = "androidClientID")
    public native String getAndroidClientID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithAPIKey:clientID:identityProviders:trackingID:widgetURL:bannerAdUnitID:interstitialAdUnitID:gcmSenderID:androidClientID:")
    protected native @Pointer long init(String apiKey, String clientID, NSArray<?> identityProviders, String trackingID, String widgetURL, String bannerAdUnitID, String interstitialAdUnitID, String gcmSenderID, String androidClientID);
    /*</methods>*/
}
