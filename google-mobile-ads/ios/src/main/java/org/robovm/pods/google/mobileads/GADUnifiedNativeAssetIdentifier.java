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
@Marshaler(/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADUnifiedNativeAssetIdentifier toObject(Class<GADUnifiedNativeAssetIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADUnifiedNativeAssetIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADUnifiedNativeAssetIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADUnifiedNativeAssetIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADUnifiedNativeAssetIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADUnifiedNativeAssetIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADUnifiedNativeAssetIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADUnifiedNativeAssetIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADUnifiedNativeAssetIdentifier Headline = new GADUnifiedNativeAssetIdentifier("Headline");
    public static final GADUnifiedNativeAssetIdentifier CallToAction = new GADUnifiedNativeAssetIdentifier("CallToAction");
    public static final GADUnifiedNativeAssetIdentifier Icon = new GADUnifiedNativeAssetIdentifier("Icon");
    public static final GADUnifiedNativeAssetIdentifier Body = new GADUnifiedNativeAssetIdentifier("Body");
    public static final GADUnifiedNativeAssetIdentifier Store = new GADUnifiedNativeAssetIdentifier("Store");
    public static final GADUnifiedNativeAssetIdentifier Price = new GADUnifiedNativeAssetIdentifier("Price");
    public static final GADUnifiedNativeAssetIdentifier Image = new GADUnifiedNativeAssetIdentifier("Image");
    public static final GADUnifiedNativeAssetIdentifier StarRating = new GADUnifiedNativeAssetIdentifier("StarRating");
    public static final GADUnifiedNativeAssetIdentifier Advertiser = new GADUnifiedNativeAssetIdentifier("Advertiser");
    public static final GADUnifiedNativeAssetIdentifier MediaView = new GADUnifiedNativeAssetIdentifier("MediaView");
    public static final GADUnifiedNativeAssetIdentifier AdChoicesView = new GADUnifiedNativeAssetIdentifier("AdChoicesView");
    /*</constants>*/
    
    private static /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/[] values = new /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/[] {/*<value_list>*/Headline, CallToAction, Icon, Body, Store, Price, Image, StarRating, Advertiser, MediaView, AdChoicesView/*</value_list>*/};
    
    /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADUnifiedNativeAssetIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="GADUnifiedNativeHeadlineAsset", optional=true)
        public static native NSString Headline();
        @GlobalValue(symbol="GADUnifiedNativeCallToActionAsset", optional=true)
        public static native NSString CallToAction();
        @GlobalValue(symbol="GADUnifiedNativeIconAsset", optional=true)
        public static native NSString Icon();
        @GlobalValue(symbol="GADUnifiedNativeBodyAsset", optional=true)
        public static native NSString Body();
        @GlobalValue(symbol="GADUnifiedNativeStoreAsset", optional=true)
        public static native NSString Store();
        @GlobalValue(symbol="GADUnifiedNativePriceAsset", optional=true)
        public static native NSString Price();
        @GlobalValue(symbol="GADUnifiedNativeImageAsset", optional=true)
        public static native NSString Image();
        @GlobalValue(symbol="GADUnifiedNativeStarRatingAsset", optional=true)
        public static native NSString StarRating();
        @GlobalValue(symbol="GADUnifiedNativeAdvertiserAsset", optional=true)
        public static native NSString Advertiser();
        @GlobalValue(symbol="GADUnifiedNativeMediaViewAsset", optional=true)
        public static native NSString MediaView();
        @GlobalValue(symbol="GADUnifiedNativeAdChoicesViewAsset", optional=true)
        public static native NSString AdChoicesView();
        /*</values>*/
    }
}
