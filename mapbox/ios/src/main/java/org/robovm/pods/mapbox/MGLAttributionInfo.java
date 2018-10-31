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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLAttributionInfo/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLAttributionInfoPtr extends Ptr<MGLAttributionInfo, MGLAttributionInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLAttributionInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLAttributionInfo() {}
    protected MGLAttributionInfo(Handle h, long handle) { super(h, handle); }
    protected MGLAttributionInfo(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTitle:URL:")
    public MGLAttributionInfo(NSAttributedString title, NSURL URL) { super((SkipInit) null); initObject(init(title, URL)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "title")
    public native NSAttributedString getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(NSAttributedString v);
    @Property(selector = "URL")
    public native NSURL getURL();
    @Property(selector = "setURL:")
    public native void setURL(NSURL v);
    @Property(selector = "isFeedbackLink")
    public native boolean isFeedbackLink();
    @Property(selector = "setFeedbackLink:")
    public native void setFeedbackLink(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithTitle:URL:")
    protected native @Pointer long init(NSAttributedString title, NSURL URL);
    @Method(selector = "feedbackURLAtCenterCoordinate:zoomLevel:")
    public native NSURL feedbackURLAtCenterCoordinate(@ByVal CLLocationCoordinate2D centerCoordinate, double zoomLevel);
    @Method(selector = "titleWithStyle:")
    public native NSAttributedString title(MGLAttributionInfoStyle style);
    /*</methods>*/
}
