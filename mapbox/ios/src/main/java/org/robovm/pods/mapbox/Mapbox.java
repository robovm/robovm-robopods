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
package org.robovm.pods.mapbox;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Mapbox/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(Mapbox.class); }/*</bind>*/
    /*<constants>*/
    public static final int LOGGING_ENABLE_DEBUG = 1;
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLClusterIdentifierInvalid", optional=true)
    public static native @MachineSizedUInt long MGLClusterIdentifierInvalid();
    @GlobalValue(symbol="MGLAbstractClassException", optional=true)
    public static native String AbstractClassException();
    @GlobalValue(symbol="MGLMissingLocationServicesUsageDescriptionException", optional=true)
    public static native String MissingLocationServicesUsageDescriptionException();
    @GlobalValue(symbol="MGLUserLocationAnnotationTypeException", optional=true)
    public static native String UserLocationAnnotationTypeException();
    @GlobalValue(symbol="MGLInvalidOfflinePackException", optional=true)
    public static native String InvalidOfflinePackException();
    @GlobalValue(symbol="MGLUnsupportedRegionTypeException", optional=true)
    public static native String UnsupportedRegionTypeException();
    @GlobalValue(symbol="MGLInvalidStyleLayerException", optional=true)
    public static native String InvalidStyleLayerException();
    @GlobalValue(symbol="MGLInvalidStyleURLException", optional=true)
    public static native String InvalidStyleURLException();
    @GlobalValue(symbol="MGLRedundantLayerException", optional=true)
    public static native String RedundantLayerException();
    @GlobalValue(symbol="MGLRedundantLayerIdentifierException", optional=true)
    public static native String RedundantLayerIdentifierException();
    @GlobalValue(symbol="MGLRedundantSourceException", optional=true)
    public static native String RedundantSourceException();
    @GlobalValue(symbol="MGLRedundantSourceIdentifierException", optional=true)
    public static native String RedundantSourceIdentifierException();
    @GlobalValue(symbol="MGLInvalidDatasourceException", optional=true)
    public static native String InvalidDatasourceException();
    @GlobalValue(symbol="MGLExpressionInterpolationModeLinear", optional=true)
    public static native String MGLExpressionInterpolationModeLinear();
    @GlobalValue(symbol="MGLExpressionInterpolationModeExponential", optional=true)
    public static native String MGLExpressionInterpolationModeExponential();
    @GlobalValue(symbol="MGLExpressionInterpolationModeCubicBezier", optional=true)
    public static native String MGLExpressionInterpolationModeCubicBezier();
    @GlobalValue(symbol="MGLFontNamesAttribute", optional=true)
    public static native String MGLFontNamesAttribute();
    @GlobalValue(symbol="MGLFontScaleAttribute", optional=true)
    public static native String MGLFontScaleAttribute();
    @GlobalValue(symbol="MGLFontColorAttribute", optional=true)
    public static native String MGLFontColorAttribute();
    /*</methods>*/
}
