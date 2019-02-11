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
@Marshaler(/*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/ 
    extends /*<extends>*/NSErrorUserInfoKey/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKGraphRequestErrorUserInfoKey toObject(Class<FBSDKGraphRequestErrorUserInfoKey> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return FBSDKGraphRequestErrorUserInfoKey.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKGraphRequestErrorUserInfoKey o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<FBSDKGraphRequestErrorUserInfoKey> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKGraphRequestErrorUserInfoKey> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(FBSDKGraphRequestErrorUserInfoKey.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKGraphRequestErrorUserInfoKey> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (FBSDKGraphRequestErrorUserInfoKey o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final FBSDKGraphRequestErrorUserInfoKey GraphErrorCode = new FBSDKGraphRequestErrorUserInfoKey("GraphErrorCode");
    public static final FBSDKGraphRequestErrorUserInfoKey GraphErrorSubcode = new FBSDKGraphRequestErrorUserInfoKey("GraphErrorSubcode");
    public static final FBSDKGraphRequestErrorUserInfoKey HTTPStatusCode = new FBSDKGraphRequestErrorUserInfoKey("HTTPStatusCode");
    public static final FBSDKGraphRequestErrorUserInfoKey ParsedJSONResponse = new FBSDKGraphRequestErrorUserInfoKey("ParsedJSONResponse");
    /*</constants>*/
    
    private static /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/[] values = new /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/[] {/*<value_list>*/GraphErrorCode, GraphErrorSubcode, HTTPStatusCode, ParsedJSONResponse/*</value_list>*/};
    
    /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/FBSDKGraphRequestErrorUserInfoKey/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="FBSDKGraphRequestErrorGraphErrorCodeKey", optional=true)
        public static native NSString GraphErrorCode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorGraphErrorSubcodeKey", optional=true)
        public static native NSString GraphErrorSubcode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorHTTPStatusCodeKey", optional=true)
        public static native NSString HTTPStatusCode();
        @GlobalValue(symbol="FBSDKGraphRequestErrorParsedJSONResponseKey", optional=true)
        public static native NSString ParsedJSONResponse();
        /*</values>*/
    }
}
