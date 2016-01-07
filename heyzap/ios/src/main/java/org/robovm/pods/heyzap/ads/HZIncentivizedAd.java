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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/HZIncentivizedAd/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class HZIncentivizedAdPtr extends Ptr<HZIncentivizedAd, HZIncentivizedAdPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(HZIncentivizedAd.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public HZIncentivizedAd() {}
    protected HZIncentivizedAd(Handle h, long handle) { super(h, handle); }
    protected HZIncentivizedAd(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    private static HZIncentivizedAdDelegate delegate;
    
    public static void setDelegate(HZIncentivizedAdDelegate delegate) {
        HZIncentivizedAd.delegate = delegate;
        setDelegate0(delegate);
    }
    /*<methods>*/
    @Method(selector = "setDelegate:")
    private static native void setDelegate0(HZIncentivizedAdDelegate delegate);
    @Method(selector = "show")
    public static native void show();
    @Method(selector = "showForTag:")
    public static native void show(String tag);
    @Method(selector = "showWithOptions:")
    public static native void show(HZShowOptions options);
    @Method(selector = "fetch")
    public static native void fetch();
    @Method(selector = "fetchForTag:")
    public static native void fetch(String tag);
    @Method(selector = "fetchWithCompletion:")
    public static native void fetch(@Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "fetchForTag:withCompletion:")
    public static native void fetch(String tag, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "fetchForTags:")
    public static native void fetch(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> tags);
    @Method(selector = "fetchForTags:withCompletion:")
    public static native void fetch(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> tags, @Block VoidBlock2<Boolean, NSError> completion);
    @Method(selector = "isAvailable")
    public static native boolean isAvailable();
    @Method(selector = "isAvailableForTag:")
    public static native boolean isAvailable(String tag);
    @Method(selector = "setUserIdentifier:")
    public static native void setUserIdentifier(String userIdentifier);
    @Method(selector = "setCreativeID:")
    public static native void setCreativeID(int creativeID);
    /*</methods>*/
}
