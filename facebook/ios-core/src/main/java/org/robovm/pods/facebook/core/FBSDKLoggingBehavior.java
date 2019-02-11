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
package org.robovm.pods.facebook.core;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.webkit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/FBSDKLoggingBehavior/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKLoggingBehavior/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKLoggingBehavior/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKLoggingBehavior toObject(Class<FBSDKLoggingBehavior> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKLoggingBehavior.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKLoggingBehavior o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKLoggingBehavior> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKLoggingBehavior> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKLoggingBehavior.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKLoggingBehavior> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKLoggingBehavior o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKLoggingBehavior AccessTokens = new FBSDKLoggingBehavior("AccessTokens");
    public static final FBSDKLoggingBehavior PerformanceCharacteristics = new FBSDKLoggingBehavior("PerformanceCharacteristics");
    public static final FBSDKLoggingBehavior AppEvents = new FBSDKLoggingBehavior("AppEvents");
    public static final FBSDKLoggingBehavior Informational = new FBSDKLoggingBehavior("Informational");
    public static final FBSDKLoggingBehavior CacheErrors = new FBSDKLoggingBehavior("CacheErrors");
    public static final FBSDKLoggingBehavior UIControlErrors = new FBSDKLoggingBehavior("UIControlErrors");
    public static final FBSDKLoggingBehavior GraphAPIDebugWarning = new FBSDKLoggingBehavior("GraphAPIDebugWarning");
    public static final FBSDKLoggingBehavior GraphAPIDebugInfo = new FBSDKLoggingBehavior("GraphAPIDebugInfo");
    public static final FBSDKLoggingBehavior NetworkRequests = new FBSDKLoggingBehavior("NetworkRequests");
    public static final FBSDKLoggingBehavior DeveloperErrors = new FBSDKLoggingBehavior("DeveloperErrors");
    /*</constants>*/
    
    private static /*<name>*/FBSDKLoggingBehavior/*</name>*/[] values = new /*<name>*/FBSDKLoggingBehavior/*</name>*/[] {/*<value_list>*/AccessTokens, PerformanceCharacteristics, AppEvents, Informational, CacheErrors, UIControlErrors, GraphAPIDebugWarning, GraphAPIDebugInfo, NetworkRequests, DeveloperErrors/*</value_list>*/};
    
    /*<name>*/FBSDKLoggingBehavior/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKLoggingBehavior/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKLoggingBehavior/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKLoggingBehavior/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKLoggingBehaviorAccessTokens", optional=true)
        public static native NSString AccessTokens();
        @GlobalValue(symbol="FBSDKLoggingBehaviorPerformanceCharacteristics", optional=true)
        public static native NSString PerformanceCharacteristics();
        @GlobalValue(symbol="FBSDKLoggingBehaviorAppEvents", optional=true)
        public static native NSString AppEvents();
        @GlobalValue(symbol="FBSDKLoggingBehaviorInformational", optional=true)
        public static native NSString Informational();
        @GlobalValue(symbol="FBSDKLoggingBehaviorCacheErrors", optional=true)
        public static native NSString CacheErrors();
        @GlobalValue(symbol="FBSDKLoggingBehaviorUIControlErrors", optional=true)
        public static native NSString UIControlErrors();
        @GlobalValue(symbol="FBSDKLoggingBehaviorGraphAPIDebugWarning", optional=true)
        public static native NSString GraphAPIDebugWarning();
        @GlobalValue(symbol="FBSDKLoggingBehaviorGraphAPIDebugInfo", optional=true)
        public static native NSString GraphAPIDebugInfo();
        @GlobalValue(symbol="FBSDKLoggingBehaviorNetworkRequests", optional=true)
        public static native NSString NetworkRequests();
        @GlobalValue(symbol="FBSDKLoggingBehaviorDeveloperErrors", optional=true)
        public static native NSString DeveloperErrors();
        /*</values>*/
    }
}
