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
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/FBSDKAccessTokenChangeNotification/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKAccessTokenChangeNotification/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static FBSDKAccessTokenChangeNotification toObject(Class<FBSDKAccessTokenChangeNotification> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new FBSDKAccessTokenChangeNotification(o);
        }
        @MarshalsPointer
        public static long toNative(FBSDKAccessTokenChangeNotification o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<FBSDKAccessTokenChangeNotification> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<FBSDKAccessTokenChangeNotification> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new FBSDKAccessTokenChangeNotification(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<FBSDKAccessTokenChangeNotification> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (FBSDKAccessTokenChangeNotification i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    FBSDKAccessTokenChangeNotification(NSDictionary data) {
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
    

    public boolean didChangeUserID() {
        if (has(Keys.DidChangeUserID())) {
            NSNumber val = (NSNumber) get(Keys.DidChangeUserID());
            return val.booleanValue();
        }
        return false;
    }
    public FBSDKAccessToken getOldToken() {
        if (has(Keys.ChangeOld())) {
            FBSDKAccessToken val = (FBSDKAccessToken) get(Keys.ChangeOld());
            return val;
        }
        return null;
    }
    public FBSDKAccessToken getNewToken() {
        if (has(Keys.ChangeNew())) {
            FBSDKAccessToken val = (FBSDKAccessToken) get(Keys.ChangeNew());
            return val;
        }
        return null;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="FBSDKAccessTokenDidChangeUserID", optional=true)
        public static native NSString DidChangeUserID();
        @GlobalValue(symbol="FBSDKAccessTokenChangeOldKey", optional=true)
        public static native NSString ChangeOld();
        @GlobalValue(symbol="FBSDKAccessTokenChangeNewKey", optional=true)
        public static native NSString ChangeNew();
    }
    /*</keys>*/
}
