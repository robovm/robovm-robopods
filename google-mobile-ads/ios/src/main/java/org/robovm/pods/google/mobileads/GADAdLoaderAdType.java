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
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/GADAdLoaderAdType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADAdLoaderAdType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADAdLoaderAdType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADAdLoaderAdType toObject(Class<GADAdLoaderAdType> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADAdLoaderAdType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADAdLoaderAdType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADAdLoaderAdType> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADAdLoaderAdType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADAdLoaderAdType.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADAdLoaderAdType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADAdLoaderAdType o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADAdLoaderAdType NativeAppInstall = new GADAdLoaderAdType("NativeAppInstall");
    public static final GADAdLoaderAdType NativeContent = new GADAdLoaderAdType("NativeContent");
    public static final GADAdLoaderAdType NativeCustomTemplate = new GADAdLoaderAdType("NativeCustomTemplate");
    public static final GADAdLoaderAdType DFPBanner = new GADAdLoaderAdType("DFPBanner");
    public static final GADAdLoaderAdType UnifiedNative = new GADAdLoaderAdType("UnifiedNative");
    /*</constants>*/
    
    private static /*<name>*/GADAdLoaderAdType/*</name>*/[] values = new /*<name>*/GADAdLoaderAdType/*</name>*/[] {/*<value_list>*/NativeAppInstall, NativeContent, NativeCustomTemplate, DFPBanner, UnifiedNative/*</value_list>*/};
    
    /*<name>*/GADAdLoaderAdType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADAdLoaderAdType/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADAdLoaderAdType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADAdLoaderAdType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kGADAdLoaderAdTypeNativeAppInstall", optional=true)
        public static native NSString NativeAppInstall();
        @GlobalValue(symbol="kGADAdLoaderAdTypeNativeContent", optional=true)
        public static native NSString NativeContent();
        @GlobalValue(symbol="kGADAdLoaderAdTypeNativeCustomTemplate", optional=true)
        public static native NSString NativeCustomTemplate();
        @GlobalValue(symbol="kGADAdLoaderAdTypeDFPBanner", optional=true)
        public static native NSString DFPBanner();
        @GlobalValue(symbol="kGADAdLoaderAdTypeUnifiedNative", optional=true)
        public static native NSString UnifiedNative();
        /*</values>*/
    }
}
