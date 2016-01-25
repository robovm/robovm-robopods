/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/TWTROAuthEchoHeaders/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTROAuthEchoHeaders/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static TWTROAuthEchoHeaders toObject(Class<TWTROAuthEchoHeaders> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new TWTROAuthEchoHeaders(o);
        }
        @MarshalsPointer
        public static long toNative(TWTROAuthEchoHeaders o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<TWTROAuthEchoHeaders> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<TWTROAuthEchoHeaders> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new TWTROAuthEchoHeaders(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<TWTROAuthEchoHeaders> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (TWTROAuthEchoHeaders i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    TWTROAuthEchoHeaders(NSDictionary data) {
        super(data);
    }
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    

    public String getRequestURL() {
        if (has(Keys.RequestURLString())) {
            NSString val = (NSString) get(Keys.RequestURLString());
            return val.toString();
        }
        return null;
    }
    public String getAuthorizationHeader() {
        if (has(Keys.AuthorizationHeader())) {
            NSString val = (NSString) get(Keys.AuthorizationHeader());
            return val.toString();
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="TWTROAuthEchoRequestURLStringKey", optional=true)
        public static native NSString RequestURLString();
        @GlobalValue(symbol="TWTROAuthEchoAuthorizationHeaderKey", optional=true)
        public static native NSString AuthorizationHeader();
    }
    /*</keys>*/
}
