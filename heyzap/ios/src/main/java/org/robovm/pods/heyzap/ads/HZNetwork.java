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
package org.robovm.pods.heyzap.ads;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZNetwork/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(HZNetwork.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="HZNetworkHeyzap", optional=true)
    public static native String Heyzap();
    @GlobalValue(symbol="HZNetworkCrossPromo", optional=true)
    public static native String CrossPromo();
    @GlobalValue(symbol="HZNetworkFacebook", optional=true)
    public static native String Facebook();
    @GlobalValue(symbol="HZNetworkUnityAds", optional=true)
    public static native String UnityAds();
    @GlobalValue(symbol="HZNetworkAppLovin", optional=true)
    public static native String AppLovin();
    @GlobalValue(symbol="HZNetworkVungle", optional=true)
    public static native String Vungle();
    @GlobalValue(symbol="HZNetworkChartboost", optional=true)
    public static native String Chartboost();
    @GlobalValue(symbol="HZNetworkAdColony", optional=true)
    public static native String AdColony();
    @GlobalValue(symbol="HZNetworkAdMob", optional=true)
    public static native String AdMob();
    @GlobalValue(symbol="HZNetworkIAd", optional=true)
    public static native String IAd();
    @GlobalValue(symbol="HZNetworkHyprMX", optional=true)
    public static native String HyprMX();
    @GlobalValue(symbol="HZNetworkHeyzapExchange", optional=true)
    public static native String HeyzapExchange();
    @GlobalValue(symbol="HZNetworkLeadbolt", optional=true)
    public static native String Leadbolt();
    /*</methods>*/
}
