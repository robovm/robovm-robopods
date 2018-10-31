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
@Marshaler(/*<name>*/GADNativeAppInstallAssetID/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeAppInstallAssetID/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADNativeAppInstallAssetID/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADNativeAppInstallAssetID toObject(Class<GADNativeAppInstallAssetID> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADNativeAppInstallAssetID.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADNativeAppInstallAssetID o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADNativeAppInstallAssetID> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADNativeAppInstallAssetID> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADNativeAppInstallAssetID.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADNativeAppInstallAssetID> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADNativeAppInstallAssetID o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADNativeAppInstallAssetID Headline = new GADNativeAppInstallAssetID("Headline");
    public static final GADNativeAppInstallAssetID CallToAction = new GADNativeAppInstallAssetID("CallToAction");
    public static final GADNativeAppInstallAssetID Icon = new GADNativeAppInstallAssetID("Icon");
    public static final GADNativeAppInstallAssetID Body = new GADNativeAppInstallAssetID("Body");
    public static final GADNativeAppInstallAssetID Store = new GADNativeAppInstallAssetID("Store");
    public static final GADNativeAppInstallAssetID Price = new GADNativeAppInstallAssetID("Price");
    public static final GADNativeAppInstallAssetID Image = new GADNativeAppInstallAssetID("Image");
    public static final GADNativeAppInstallAssetID StarRating = new GADNativeAppInstallAssetID("StarRating");
    public static final GADNativeAppInstallAssetID AttributionIcon = new GADNativeAppInstallAssetID("AttributionIcon");
    public static final GADNativeAppInstallAssetID AttributionText = new GADNativeAppInstallAssetID("AttributionText");
    public static final GADNativeAppInstallAssetID MediaView = new GADNativeAppInstallAssetID("MediaView");
    public static final GADNativeAppInstallAssetID AdChoicesView = new GADNativeAppInstallAssetID("AdChoicesView");
    public static final GADNativeAppInstallAssetID Background = new GADNativeAppInstallAssetID("Background");
    /*</constants>*/
    
    private static /*<name>*/GADNativeAppInstallAssetID/*</name>*/[] values = new /*<name>*/GADNativeAppInstallAssetID/*</name>*/[] {/*<value_list>*/Headline, CallToAction, Icon, Body, Store, Price, Image, StarRating, AttributionIcon, AttributionText, MediaView, AdChoicesView, Background/*</value_list>*/};
    
    /*<name>*/GADNativeAppInstallAssetID/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADNativeAppInstallAssetID/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADNativeAppInstallAssetID/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADNativeAppInstallAssetID/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="GADNativeAppInstallHeadlineAsset", optional=true)
        public static native NSString Headline();
        @GlobalValue(symbol="GADNativeAppInstallCallToActionAsset", optional=true)
        public static native NSString CallToAction();
        @GlobalValue(symbol="GADNativeAppInstallIconAsset", optional=true)
        public static native NSString Icon();
        @GlobalValue(symbol="GADNativeAppInstallBodyAsset", optional=true)
        public static native NSString Body();
        @GlobalValue(symbol="GADNativeAppInstallStoreAsset", optional=true)
        public static native NSString Store();
        @GlobalValue(symbol="GADNativeAppInstallPriceAsset", optional=true)
        public static native NSString Price();
        @GlobalValue(symbol="GADNativeAppInstallImageAsset", optional=true)
        public static native NSString Image();
        @GlobalValue(symbol="GADNativeAppInstallStarRatingAsset", optional=true)
        public static native NSString StarRating();
        @GlobalValue(symbol="GADNativeAppInstallAttributionIconAsset", optional=true)
        public static native NSString AttributionIcon();
        @GlobalValue(symbol="GADNativeAppInstallAttributionTextAsset", optional=true)
        public static native NSString AttributionText();
        @GlobalValue(symbol="GADNativeAppInstallMediaViewAsset", optional=true)
        public static native NSString MediaView();
        @GlobalValue(symbol="GADNativeAppInstallAdChoicesViewAsset", optional=true)
        public static native NSString AdChoicesView();
        @GlobalValue(symbol="GADNativeAppInstallBackgroundAsset", optional=true)
        public static native NSString Background();
        /*</values>*/
    }
}
