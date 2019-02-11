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
@Marshaler(/*<name>*/FBSDKAppEventParameterName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAppEventParameterName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKAppEventParameterName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKAppEventParameterName toObject(Class<FBSDKAppEventParameterName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKAppEventParameterName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKAppEventParameterName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKAppEventParameterName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKAppEventParameterName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKAppEventParameterName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKAppEventParameterName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKAppEventParameterName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKAppEventParameterName Content = new FBSDKAppEventParameterName("Content");
    public static final FBSDKAppEventParameterName ContentID = new FBSDKAppEventParameterName("ContentID");
    public static final FBSDKAppEventParameterName ContentType = new FBSDKAppEventParameterName("ContentType");
    public static final FBSDKAppEventParameterName Currency = new FBSDKAppEventParameterName("Currency");
    public static final FBSDKAppEventParameterName Description = new FBSDKAppEventParameterName("Description");
    public static final FBSDKAppEventParameterName Level = new FBSDKAppEventParameterName("Level");
    public static final FBSDKAppEventParameterName MaxRatingValue = new FBSDKAppEventParameterName("MaxRatingValue");
    public static final FBSDKAppEventParameterName NumItems = new FBSDKAppEventParameterName("NumItems");
    public static final FBSDKAppEventParameterName PaymentInfoAvailable = new FBSDKAppEventParameterName("PaymentInfoAvailable");
    public static final FBSDKAppEventParameterName RegistrationMethod = new FBSDKAppEventParameterName("RegistrationMethod");
    public static final FBSDKAppEventParameterName SearchString = new FBSDKAppEventParameterName("SearchString");
    public static final FBSDKAppEventParameterName Success = new FBSDKAppEventParameterName("Success");
    public static final FBSDKAppEventParameterName AdType = new FBSDKAppEventParameterName("AdType");
    public static final FBSDKAppEventParameterName OrderID = new FBSDKAppEventParameterName("OrderID");
    /*</constants>*/
    
    private static /*<name>*/FBSDKAppEventParameterName/*</name>*/[] values = new /*<name>*/FBSDKAppEventParameterName/*</name>*/[] {/*<value_list>*/Content, ContentID, ContentType, Currency, Description, Level, MaxRatingValue, NumItems, PaymentInfoAvailable, RegistrationMethod, SearchString, Success, AdType, OrderID/*</value_list>*/};
    
    /*<name>*/FBSDKAppEventParameterName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKAppEventParameterName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKAppEventParameterName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKAppEventParameterName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKAppEventParameterNameContent", optional=true)
        public static native NSString Content();
        @GlobalValue(symbol="FBSDKAppEventParameterNameContentID", optional=true)
        public static native NSString ContentID();
        @GlobalValue(symbol="FBSDKAppEventParameterNameContentType", optional=true)
        public static native NSString ContentType();
        @GlobalValue(symbol="FBSDKAppEventParameterNameCurrency", optional=true)
        public static native NSString Currency();
        @GlobalValue(symbol="FBSDKAppEventParameterNameDescription", optional=true)
        public static native NSString Description();
        @GlobalValue(symbol="FBSDKAppEventParameterNameLevel", optional=true)
        public static native NSString Level();
        @GlobalValue(symbol="FBSDKAppEventParameterNameMaxRatingValue", optional=true)
        public static native NSString MaxRatingValue();
        @GlobalValue(symbol="FBSDKAppEventParameterNameNumItems", optional=true)
        public static native NSString NumItems();
        @GlobalValue(symbol="FBSDKAppEventParameterNamePaymentInfoAvailable", optional=true)
        public static native NSString PaymentInfoAvailable();
        @GlobalValue(symbol="FBSDKAppEventParameterNameRegistrationMethod", optional=true)
        public static native NSString RegistrationMethod();
        @GlobalValue(symbol="FBSDKAppEventParameterNameSearchString", optional=true)
        public static native NSString SearchString();
        @GlobalValue(symbol="FBSDKAppEventParameterNameSuccess", optional=true)
        public static native NSString Success();
        @GlobalValue(symbol="FBSDKAppEventParameterNameAdType", optional=true)
        public static native NSString AdType();
        @GlobalValue(symbol="FBSDKAppEventParameterNameOrderID", optional=true)
        public static native NSString OrderID();
        /*</values>*/
    }
}
