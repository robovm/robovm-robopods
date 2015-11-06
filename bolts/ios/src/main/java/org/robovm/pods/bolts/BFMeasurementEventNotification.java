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
package org.robovm.pods.bolts;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/BFMeasurementEventNotification/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFMeasurementEventNotification/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static BFMeasurementEventNotification toObject(Class<BFMeasurementEventNotification> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new BFMeasurementEventNotification(o);
        }
        @MarshalsPointer
        public static long toNative(BFMeasurementEventNotification o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<BFMeasurementEventNotification> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<BFMeasurementEventNotification> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new BFMeasurementEventNotification(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<BFMeasurementEventNotification> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (BFMeasurementEventNotification i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    BFMeasurementEventNotification(NSDictionary data) {
        super(data);
    }
    public BFMeasurementEventNotification() {}
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
    public BFMeasurementEventNotification set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    public BFAppLinkEventName getEventName() {
        if (has(Keys.EventName())) {
            NSString val = (NSString) get(Keys.EventName());
            return BFAppLinkEventName.valueOf(val);
        }
        return null;
    }
    public BFMeasurementEventNotification setEventName(BFAppLinkEventName eventName) {
        set(Keys.EventName(), eventName.value());
        return this;
    }
    public NSDictionary<NSString, NSObject> getEventArgs() {
        if (has(Keys.EventArgs())) {
            NSDictionary<NSString, NSObject> val = (NSDictionary<NSString, NSObject>) get(Keys.EventArgs());
            return val;
        }
        return null;
    }
    public BFMeasurementEventNotification setEventArgs(NSDictionary<NSString, NSObject> eventArgs) {
        set(Keys.EventArgs(), eventArgs);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="BFMeasurementEventNameKey", optional=true)
        public static native NSString EventName();
        @GlobalValue(symbol="BFMeasurementEventArgsKey", optional=true)
        public static native NSString EventArgs();
    }
    /*</keys>*/
}
