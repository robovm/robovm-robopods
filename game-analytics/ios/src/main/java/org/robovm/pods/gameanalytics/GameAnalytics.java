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
package org.robovm.pods.gameanalytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GameAnalytics/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GameAnalyticsPtr extends Ptr<GameAnalytics, GameAnalyticsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GameAnalytics.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GameAnalytics() {}
    protected GameAnalytics(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configureAvailableCustomDimensions01:")
    public static native void configureAvailableCustomDimensions01(NSArray<?> customDimensions);
    @Method(selector = "configureAvailableCustomDimensions02:")
    public static native void configureAvailableCustomDimensions02(NSArray<?> customDimensions);
    @Method(selector = "configureAvailableCustomDimensions03:")
    public static native void configureAvailableCustomDimensions03(NSArray<?> customDimensions);
    @Method(selector = "configureAvailableResourceCurrencies:")
    public static native void configureAvailableResourceCurrencies(NSArray<?> resourceCurrencies);
    @Method(selector = "configureAvailableResourceItemTypes:")
    public static native void configureAvailableResourceItemTypes(NSArray<?> resourceItemTypes);
    @Method(selector = "configureBuild:")
    public static native void configureBuild(String build);
    @Method(selector = "configureSdkVersion:")
    public static native void configureSdkVersion(String wrapperSdkVersion);
    @Method(selector = "configureEngineVersion:")
    public static native void configureEngineVersion(String engineVersion);
    @Method(selector = "initializeWithGameKey:gameSecret:")
    public static native void init(String gameKey, String gameSecret);
    @Method(selector = "addBusinessEventWithCurrency:amount:itemType:itemId:cartType:receipt:")
    public static native void addBusinessEvent(String currency, @MachineSizedSInt long amount, String itemType, String itemId, String cartType, String receipt);
    @Method(selector = "addBusinessEventWithCurrency:amount:itemType:itemId:cartType:autoFetchReceipt:")
    public static native void addBusinessEvent(String currency, @MachineSizedSInt long amount, String itemType, String itemId, String cartType, boolean autoFetchReceipt);
    @Method(selector = "addResourceEventWithFlowType:currency:amount:itemType:itemId:")
    public static native void addResourceEvent(GAResourceFlowType flowType, String currency, NSNumber amount, String itemType, String itemId);
    @Method(selector = "addProgressionEventWithProgressionStatus:progression01:progression02:progression03:")
    public static native void addProgressionEvent(GAProgressionStatus progressionStatus, String progression01, String progression02, String progression03);
    @Method(selector = "addProgressionEventWithProgressionStatus:progression01:progression02:progression03:score:")
    public static native void addProgressionEvent(GAProgressionStatus progressionStatus, String progression01, String progression02, String progression03, @MachineSizedSInt long score);
    @Method(selector = "addDesignEventWithEventId:")
    public static native void addDesignEvent(String eventId);
    @Method(selector = "addDesignEventWithEventId:value:")
    public static native void addDesignEvent(String eventId, NSNumber value);
    @Method(selector = "addErrorEventWithSeverity:message:")
    public static native void addErrorEvent(GAErrorSeverity severity, String message);
    @Method(selector = "setEnabledInfoLog:")
    public static native void setEnabledInfoLog(boolean flag);
    @Method(selector = "setEnabledVerboseLog:")
    public static native void setEnabledVerboseLog(boolean flag);
    @Method(selector = "setCustomDimension01:")
    public static native void setCustomDimension01(String dimension01);
    @Method(selector = "setCustomDimension02:")
    public static native void setCustomDimension02(String dimension02);
    @Method(selector = "setCustomDimension03:")
    public static native void setCustomDimension03(String dimension03);
    @Method(selector = "setFacebookId:")
    public static native void setFacebookId(String facebookId);
    @Method(selector = "setGender:")
    public static native void setGender(String gender);
    @Method(selector = "setBirthYear:")
    public static native void setBirthYear(@MachineSizedSInt long birthYear);
    /*</methods>*/
}
