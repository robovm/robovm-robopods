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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMultiPoint/*</name>*/ 
    extends /*<extends>*/MGLShape/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMultiPointPtr extends Ptr<MGLMultiPoint, MGLMultiPointPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLMultiPoint.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMultiPoint() {}
    protected MGLMultiPoint(Handle h, long handle) { super(h, handle); }
    protected MGLMultiPoint(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "coordinates")
    protected native CLLocationCoordinate2D getNativeCoordinates();
    @Property(selector = "pointCount")
    public native @MachineSizedUInt long getPointCount();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "getCoordinates:range:")
    protected native void nativeGetCoordinates(CLLocationCoordinate2D coords, @ByVal NSRange range);
    @Method(selector = "setCoordinates:count:")
    protected native void nativeSetCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "insertCoordinates:count:atIndex:")
    protected native void nativeInsertCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count, @MachineSizedUInt long index);
    @Method(selector = "appendCoordinates:count:")
    protected native void nativeAppendCoordinates(CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "replaceCoordinatesInRange:withCoordinates:")
    protected native void nativeReplaceCoordinates(@ByVal NSRange range, CLLocationCoordinate2D coords);
    @Method(selector = "replaceCoordinatesInRange:withCoordinates:count:")
    protected native void nativeReplaceCoordinates(@ByVal NSRange range, CLLocationCoordinate2D coords, @MachineSizedUInt long count);
    @Method(selector = "removeCoordinatesInRange:")
    protected native void nativeRemoveCoordinates(@ByVal NSRange range);
    /*</methods>*/

    public CLLocationCoordinate2D[] getCoordinates(int start, int count) {
        int available = (int)getPointCount() - start;
        if(available > count)
            available = count;
        if(available <= 0)
            return new CLLocationCoordinate2D[0];
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, available);
        nativeGetCoordinates(value, new NSRange(start, available));
        return value.toArray(available);
    }

    public CLLocationCoordinate2D[] getCoordinates() {
        return getCoordinates(0, (int)getPointCount());
    }

    public void setCoordinates(CLLocationCoordinate2D[] coords) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        value.update(coords);
        nativeSetCoordinates(value, coords.length);
    }

    public void insertCoordinates(CLLocationCoordinate2D[] coords, int position) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        value.update(coords);
        nativeInsertCoordinates(value, coords.length, position);
    }

    public void appendCoordinates(CLLocationCoordinate2D[] coords) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        value.update(coords);
        nativeAppendCoordinates(value, coords.length);
    }

    public void replaceCoordinates(CLLocationCoordinate2D[] coords, int position, int length) {
        CLLocationCoordinate2D value = Struct.allocate(CLLocationCoordinate2D.class, coords.length);
        value.update(coords);
        nativeReplaceCoordinates(new NSRange(position, length), value, coords.length);
    }

    public void removeCoordinates(int position, int length) {
        nativeRemoveCoordinates(new NSRange(position, length));
    }
}
