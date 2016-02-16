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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/FBSDKAppEventName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKAppEventName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKAppEventName toObject(Class<FBSDKAppEventName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKAppEventName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKAppEventName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKAppEventName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKAppEventName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKAppEventName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKAppEventName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKAppEventName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKAppEventName AchievedLevel = new FBSDKAppEventName("AchievedLevel");
    public static final FBSDKAppEventName AddedPaymentInfo = new FBSDKAppEventName("AddedPaymentInfo");
    public static final FBSDKAppEventName AddedToCart = new FBSDKAppEventName("AddedToCart");
    public static final FBSDKAppEventName AddedToWishlist = new FBSDKAppEventName("AddedToWishlist");
    public static final FBSDKAppEventName CompletedRegistration = new FBSDKAppEventName("CompletedRegistration");
    public static final FBSDKAppEventName CompletedTutorial = new FBSDKAppEventName("CompletedTutorial");
    public static final FBSDKAppEventName InitiatedCheckout = new FBSDKAppEventName("InitiatedCheckout");
    public static final FBSDKAppEventName Rated = new FBSDKAppEventName("Rated");
    public static final FBSDKAppEventName Searched = new FBSDKAppEventName("Searched");
    public static final FBSDKAppEventName SpentCredits = new FBSDKAppEventName("SpentCredits");
    public static final FBSDKAppEventName UnlockedAchievement = new FBSDKAppEventName("UnlockedAchievement");
    public static final FBSDKAppEventName ViewedContent = new FBSDKAppEventName("ViewedContent");
    /*</constants>*/
    
    private static /*<name>*/FBSDKAppEventName/*</name>*/[] values = new /*<name>*/FBSDKAppEventName/*</name>*/[] {/*<value_list>*/AchievedLevel, AddedPaymentInfo, AddedToCart, AddedToWishlist, CompletedRegistration, CompletedTutorial, InitiatedCheckout, Rated, Searched, SpentCredits, UnlockedAchievement, ViewedContent/*</value_list>*/};
    
    /*<name>*/FBSDKAppEventName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKAppEventName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKAppEventName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKAppEventName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKAppEventNameAchievedLevel", optional=true)
        public static native NSString AchievedLevel();
        @GlobalValue(symbol="FBSDKAppEventNameAddedPaymentInfo", optional=true)
        public static native NSString AddedPaymentInfo();
        @GlobalValue(symbol="FBSDKAppEventNameAddedToCart", optional=true)
        public static native NSString AddedToCart();
        @GlobalValue(symbol="FBSDKAppEventNameAddedToWishlist", optional=true)
        public static native NSString AddedToWishlist();
        @GlobalValue(symbol="FBSDKAppEventNameCompletedRegistration", optional=true)
        public static native NSString CompletedRegistration();
        @GlobalValue(symbol="FBSDKAppEventNameCompletedTutorial", optional=true)
        public static native NSString CompletedTutorial();
        @GlobalValue(symbol="FBSDKAppEventNameInitiatedCheckout", optional=true)
        public static native NSString InitiatedCheckout();
        @GlobalValue(symbol="FBSDKAppEventNameRated", optional=true)
        public static native NSString Rated();
        @GlobalValue(symbol="FBSDKAppEventNameSearched", optional=true)
        public static native NSString Searched();
        @GlobalValue(symbol="FBSDKAppEventNameSpentCredits", optional=true)
        public static native NSString SpentCredits();
        @GlobalValue(symbol="FBSDKAppEventNameUnlockedAchievement", optional=true)
        public static native NSString UnlockedAchievement();
        @GlobalValue(symbol="FBSDKAppEventNameViewedContent", optional=true)
        public static native NSString ViewedContent();
        /*</values>*/
    }
}
