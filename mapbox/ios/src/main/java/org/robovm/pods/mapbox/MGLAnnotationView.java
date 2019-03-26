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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLAnnotationView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class MGLAnnotationViewPtr extends Ptr<MGLAnnotationView, MGLAnnotationViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLAnnotationView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLAnnotationView() {}
    protected MGLAnnotationView(Handle h, long handle) { super(h, handle); }
    protected MGLAnnotationView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithReuseIdentifier:")
    public MGLAnnotationView(String reuseIdentifier) { super((SkipInit) null); initObject(init(reuseIdentifier)); }
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    public MGLAnnotationView(MGLAnnotation annotation, String reuseIdentifier) { super((SkipInit) null); initObject(init(annotation, reuseIdentifier)); }
    @Method(selector = "initWithFrame:")
    public MGLAnnotationView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public MGLAnnotationView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "annotation")
    public native MGLAnnotation getAnnotation();
    @Property(selector = "setAnnotation:")
    public native void setAnnotation(MGLAnnotation v);
    @Property(selector = "reuseIdentifier")
    public native String getReuseIdentifier();
    @Property(selector = "centerOffset")
    public native @ByVal CGVector getCenterOffset();
    @Property(selector = "setCenterOffset:")
    public native void setCenterOffset(@ByVal CGVector v);
    @Property(selector = "scalesWithViewingDistance")
    public native boolean isScalesWithViewingDistance();
    @Property(selector = "setScalesWithViewingDistance:")
    public native void setScalesWithViewingDistance(boolean v);
    @Property(selector = "rotatesToMatchCamera")
    public native boolean isRotatesToMatchCamera();
    @Property(selector = "setRotatesToMatchCamera:")
    public native void setRotatesToMatchCamera(boolean v);
    @Property(selector = "isSelected")
    public native boolean isSelected();
    @Property(selector = "setSelected:")
    public native void setSelected(boolean v);
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "isDraggable")
    public native boolean isDraggable();
    @Property(selector = "setDraggable:")
    public native void setDraggable(boolean v);
    @Property(selector = "dragState")
    public native MGLAnnotationViewDragState getDragState();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithReuseIdentifier:")
    protected native @Pointer long init(String reuseIdentifier);
    @Method(selector = "initWithAnnotation:reuseIdentifier:")
    protected native @Pointer long init(MGLAnnotation annotation, String reuseIdentifier);
    @Method(selector = "prepareForReuse")
    public native void prepareForReuse();
    @Method(selector = "setSelected:animated:")
    public native void setSelected(boolean selected, boolean animated);
    @Method(selector = "setDragState:animated:")
    public native void setDragState(MGLAnnotationViewDragState dragState, boolean animated);
    /*</methods>*/
}
