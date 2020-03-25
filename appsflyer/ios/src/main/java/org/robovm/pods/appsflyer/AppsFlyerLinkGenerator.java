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
package org.robovm.pods.appsflyer;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AppsFlyerLinkGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AppsFlyerLinkGeneratorPtr extends Ptr<AppsFlyerLinkGenerator, AppsFlyerLinkGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AppsFlyerLinkGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AppsFlyerLinkGenerator() {}
    protected AppsFlyerLinkGenerator(Handle h, long handle) { super(h, handle); }
    protected AppsFlyerLinkGenerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "brandDomain")
    public native String getBrandDomain();
    @Property(selector = "setBrandDomain:")
    public native void setBrandDomain(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setChannel:")
    public native void setChannel(String channel);
    @Method(selector = "setReferrerCustomerId:")
    public native void setReferrerCustomerId(String referrerCustomerId);
    @Method(selector = "setCampaign:")
    public native void setCampaign(String campaign);
    @Method(selector = "setReferrerUID:")
    public native void setReferrerUID(String referrerUID);
    @Method(selector = "setReferrerName:")
    public native void setReferrerName(String referrerName);
    @Method(selector = "setReferrerImageURL:")
    public native void setReferrerImageURL(String referrerImageURL);
    @Method(selector = "setAppleAppID:")
    public native void setAppleAppID(String appleAppID);
    @Method(selector = "setDeeplinkPath:")
    public native void setDeeplinkPath(String deeplinkPath);
    @Method(selector = "setBaseDeeplink:")
    public native void setBaseDeeplink(String baseDeeplink);
    @Method(selector = "addParameterValue:forKey:")
    public native void addParameterValue(String value, String key);
    @Method(selector = "addParameters:")
    public native void addParameters(NSDictionary<?, ?> parameters);
    /*</methods>*/
}
