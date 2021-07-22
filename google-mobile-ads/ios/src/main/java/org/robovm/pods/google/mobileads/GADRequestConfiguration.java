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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADRequestConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADRequestConfigurationPtr extends Ptr<GADRequestConfiguration, GADRequestConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADRequestConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADRequestConfiguration() {}
    protected GADRequestConfiguration(Handle h, long handle) { super(h, handle); }
    protected GADRequestConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "maxAdContentRating")
    public native String getMaxAdContentRating();
    @Property(selector = "setMaxAdContentRating:")
    public native void setMaxAdContentRating(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="GADMaxAdContentRatingGeneral", optional=true)
    public static native String getMaxAdContentRatingGeneral();
    @GlobalValue(symbol="GADMaxAdContentRatingParentalGuidance", optional=true)
    public static native String getMaxAdContentRatingParentalGuidance();
    @GlobalValue(symbol="GADMaxAdContentRatingTeen", optional=true)
    public static native String getMaxAdContentRatingTeen();
    @GlobalValue(symbol="GADMaxAdContentRatingMatureAudience", optional=true)
    public static native String getMaxAdContentRatingMatureAudience();
    
    @Method(selector = "tagForUnderAgeOfConsent:")
    public native void tagForUnderAgeOfConsent(boolean underAgeOfConsent);
    @Method(selector = "tagForChildDirectedTreatment:")
    public native void tagForChildDirectedTreatment(boolean childDirectedTreatment);
    /*</methods>*/
}
