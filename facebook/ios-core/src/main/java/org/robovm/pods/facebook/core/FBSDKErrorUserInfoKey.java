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
@Marshaler(/*<name>*/FBSDKErrorUserInfoKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKErrorUserInfoKey/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKErrorUserInfoKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKErrorUserInfoKey toObject(Class<FBSDKErrorUserInfoKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKErrorUserInfoKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKErrorUserInfoKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKErrorUserInfoKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKErrorUserInfoKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKErrorUserInfoKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKErrorUserInfoKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKErrorUserInfoKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKErrorUserInfoKey ArgumentCollection = new FBSDKErrorUserInfoKey("ArgumentCollection");
    public static final FBSDKErrorUserInfoKey ArgumentName = new FBSDKErrorUserInfoKey("ArgumentName");
    public static final FBSDKErrorUserInfoKey ArgumentValue = new FBSDKErrorUserInfoKey("ArgumentValue");
    public static final FBSDKErrorUserInfoKey DeveloperMessage = new FBSDKErrorUserInfoKey("DeveloperMessage");
    public static final FBSDKErrorUserInfoKey LocalizedDescription = new FBSDKErrorUserInfoKey("LocalizedDescription");
    public static final FBSDKErrorUserInfoKey LocalizedTitle = new FBSDKErrorUserInfoKey("LocalizedTitle");
    /*</constants>*/
    
    private static /*<name>*/FBSDKErrorUserInfoKey/*</name>*/[] values = new /*<name>*/FBSDKErrorUserInfoKey/*</name>*/[] {/*<value_list>*/ArgumentCollection, ArgumentName, ArgumentValue, DeveloperMessage, LocalizedDescription, LocalizedTitle/*</value_list>*/};
    
    /*<name>*/FBSDKErrorUserInfoKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKErrorUserInfoKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKErrorUserInfoKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKErrorUserInfoKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKErrorArgumentCollectionKey", optional=true)
        public static native NSString ArgumentCollection();
        @GlobalValue(symbol="FBSDKErrorArgumentNameKey", optional=true)
        public static native NSString ArgumentName();
        @GlobalValue(symbol="FBSDKErrorArgumentValueKey", optional=true)
        public static native NSString ArgumentValue();
        @GlobalValue(symbol="FBSDKErrorDeveloperMessageKey", optional=true)
        public static native NSString DeveloperMessage();
        @GlobalValue(symbol="FBSDKErrorLocalizedDescriptionKey", optional=true)
        public static native NSString LocalizedDescription();
        @GlobalValue(symbol="FBSDKErrorLocalizedTitleKey", optional=true)
        public static native NSString LocalizedTitle();
        /*</values>*/
    }
}
