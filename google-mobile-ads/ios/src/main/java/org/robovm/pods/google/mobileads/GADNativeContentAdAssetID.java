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
@Marshaler(/*<name>*/GADNativeContentAdAssetID/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADNativeContentAdAssetID/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/GADNativeContentAdAssetID/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static GADNativeContentAdAssetID toObject(Class<GADNativeContentAdAssetID> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return GADNativeContentAdAssetID.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(GADNativeContentAdAssetID o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<GADNativeContentAdAssetID> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<GADNativeContentAdAssetID> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(GADNativeContentAdAssetID.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<GADNativeContentAdAssetID> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (GADNativeContentAdAssetID o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final GADNativeContentAdAssetID Headline = new GADNativeContentAdAssetID("Headline");
    public static final GADNativeContentAdAssetID Body = new GADNativeContentAdAssetID("Body");
    public static final GADNativeContentAdAssetID CallToAction = new GADNativeContentAdAssetID("CallToAction");
    public static final GADNativeContentAdAssetID Advertiser = new GADNativeContentAdAssetID("Advertiser");
    public static final GADNativeContentAdAssetID Image = new GADNativeContentAdAssetID("Image");
    public static final GADNativeContentAdAssetID Logo = new GADNativeContentAdAssetID("Logo");
    public static final GADNativeContentAdAssetID AttributionIcon = new GADNativeContentAdAssetID("AttributionIcon");
    public static final GADNativeContentAdAssetID AttributionText = new GADNativeContentAdAssetID("AttributionText");
    public static final GADNativeContentAdAssetID MediaView = new GADNativeContentAdAssetID("MediaView");
    public static final GADNativeContentAdAssetID AdChoicesView = new GADNativeContentAdAssetID("AdChoicesView");
    public static final GADNativeContentAdAssetID Background = new GADNativeContentAdAssetID("Background");
    /*</constants>*/
    
    private static /*<name>*/GADNativeContentAdAssetID/*</name>*/[] values = new /*<name>*/GADNativeContentAdAssetID/*</name>*/[] {/*<value_list>*/Headline, Body, CallToAction, Advertiser, Image, Logo, AttributionIcon, AttributionText, MediaView, AdChoicesView, Background/*</value_list>*/};
    
    /*<name>*/GADNativeContentAdAssetID/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/GADNativeContentAdAssetID/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/GADNativeContentAdAssetID/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/GADNativeContentAdAssetID/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="GADNativeContentHeadlineAsset", optional=true)
        public static native NSString Headline();
        @GlobalValue(symbol="GADNativeContentBodyAsset", optional=true)
        public static native NSString Body();
        @GlobalValue(symbol="GADNativeContentCallToActionAsset", optional=true)
        public static native NSString CallToAction();
        @GlobalValue(symbol="GADNativeContentAdvertiserAsset", optional=true)
        public static native NSString Advertiser();
        @GlobalValue(symbol="GADNativeContentImageAsset", optional=true)
        public static native NSString Image();
        @GlobalValue(symbol="GADNativeContentLogoAsset", optional=true)
        public static native NSString Logo();
        @GlobalValue(symbol="GADNativeContentAttributionIconAsset", optional=true)
        public static native NSString AttributionIcon();
        @GlobalValue(symbol="GADNativeContentAttributionTextAsset", optional=true)
        public static native NSString AttributionText();
        @GlobalValue(symbol="GADNativeContentMediaViewAsset", optional=true)
        public static native NSString MediaView();
        @GlobalValue(symbol="GADNativeContentAdChoicesViewAsset", optional=true)
        public static native NSString AdChoicesView();
        @GlobalValue(symbol="GADNativeContentBackgroundAsset", optional=true)
        public static native NSString Background();
        /*</values>*/
    }
}
