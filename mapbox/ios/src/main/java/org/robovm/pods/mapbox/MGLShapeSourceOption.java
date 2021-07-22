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
package org.robovm.pods.mapbox;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
@Marshaler(/*<name>*/MGLShapeSourceOption/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLShapeSourceOption/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static MGLShapeSourceOption toObject(Class<MGLShapeSourceOption> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new MGLShapeSourceOption(o);
        }
        @MarshalsPointer
        public static long toNative(MGLShapeSourceOption o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<MGLShapeSourceOption> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<MGLShapeSourceOption> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new MGLShapeSourceOption(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<MGLShapeSourceOption> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (MGLShapeSourceOption i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    MGLShapeSourceOption(NSDictionary data) {
        super(data);
    }
    public MGLShapeSourceOption() {}
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
    public MGLShapeSourceOption set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library(Library.INTERNAL)
    public static class Keys {
        static { Bro.bind(Keys.class); }
        @GlobalValue(symbol="MGLShapeSourceOptionClustered", optional=true)
        public static native NSString Clustered();
        @GlobalValue(symbol="MGLShapeSourceOptionClusterRadius", optional=true)
        public static native NSString ClusterRadius();
        @GlobalValue(symbol="MGLShapeSourceOptionClusterProperties", optional=true)
        public static native NSString ClusterProperties();
        @GlobalValue(symbol="MGLShapeSourceOptionMaximumZoomLevelForClustering", optional=true)
        public static native NSString MaximumZoomLevelForClustering();
        @GlobalValue(symbol="MGLShapeSourceOptionMinimumZoomLevel", optional=true)
        public static native NSString MinimumZoomLevel();
        @GlobalValue(symbol="MGLShapeSourceOptionMaximumZoomLevel", optional=true)
        public static native NSString MaximumZoomLevel();
        @GlobalValue(symbol="MGLShapeSourceOptionBuffer", optional=true)
        public static native NSString Buffer();
        @GlobalValue(symbol="MGLShapeSourceOptionSimplificationTolerance", optional=true)
        public static native NSString SimplificationTolerance();
        @GlobalValue(symbol="MGLShapeSourceOptionLineDistanceMetrics", optional=true)
        public static native NSString LineDistanceMetrics();
        @GlobalValue(symbol="MGLShapeSourceOptionWrapsCoordinates", optional=true)
        public static native NSString WrapsCoordinates();
        @GlobalValue(symbol="MGLShapeSourceOptionClipsCoordinates", optional=true)
        public static native NSString ClipsCoordinates();
    }
    /*</keys>*/
}
