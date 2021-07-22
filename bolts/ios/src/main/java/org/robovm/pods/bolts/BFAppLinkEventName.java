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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/BFAppLinkEventName/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFAppLinkEventName/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/BFAppLinkEventName/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static BFAppLinkEventName toObject(Class<BFAppLinkEventName> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return BFAppLinkEventName.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(BFAppLinkEventName o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<BFAppLinkEventName> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<BFAppLinkEventName> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(BFAppLinkEventName.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<BFAppLinkEventName> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (BFAppLinkEventName o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final BFAppLinkEventName Parse = new BFAppLinkEventName("Parse");
    public static final BFAppLinkEventName NavigateIn = new BFAppLinkEventName("NavigateIn");
    public static final BFAppLinkEventName NavigateOut = new BFAppLinkEventName("NavigateOut");
    public static final BFAppLinkEventName NavigateBackToReferrer = new BFAppLinkEventName("NavigateBackToReferrer");
    /*</constants>*/
    
    private static /*<name>*/BFAppLinkEventName/*</name>*/[] values = new /*<name>*/BFAppLinkEventName/*</name>*/[] {/*<value_list>*/Parse, NavigateIn, NavigateOut, NavigateBackToReferrer/*</value_list>*/};
    
    /*<name>*/BFAppLinkEventName/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/BFAppLinkEventName/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/BFAppLinkEventName/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/BFAppLinkEventName/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="BFAppLinkParseEventName", optional=true)
        public static native NSString Parse();
        @GlobalValue(symbol="BFAppLinkNavigateInEventName", optional=true)
        public static native NSString NavigateIn();
        @GlobalValue(symbol="BFAppLinkNavigateOutEventName", optional=true)
        public static native NSString NavigateOut();
        @GlobalValue(symbol="BFAppLinkNavigateBackToReferrerEventName", optional=true)
        public static native NSString NavigateBackToReferrer();
        /*</values>*/
    }
}
