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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLCalloutViewAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements MGLCalloutView/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("representedObject")
    public MGLAnnotation getRepresentedObject() { return null; }
    @NotImplemented("setRepresentedObject:")
    public void setRepresentedObject(MGLAnnotation v) {}
    @NotImplemented("leftAccessoryView")
    public UIView getLeftAccessoryView() { return null; }
    @NotImplemented("setLeftAccessoryView:")
    public void setLeftAccessoryView(UIView v) {}
    @NotImplemented("rightAccessoryView")
    public UIView getRightAccessoryView() { return null; }
    @NotImplemented("setRightAccessoryView:")
    public void setRightAccessoryView(UIView v) {}
    @NotImplemented("delegate")
    public MGLCalloutViewDelegate getDelegate() { return null; }
    @NotImplemented("setDelegate:")
    public void setDelegate(MGLCalloutViewDelegate v) {}
    @NotImplemented("isAnchoredToAnnotation")
    public boolean isAnchoredToAnnotation() { return false; }
    @NotImplemented("dismissesAutomatically")
    public boolean isDismissesAutomatically() { return false; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("presentCalloutFromRect:inView:constrainedToRect:animated:")
    public void presentCalloutFrom(@ByVal CGRect rect, UIView view, @ByVal CGRect constrainedRect, boolean animated) {}
    @NotImplemented("dismissCalloutAnimated:")
    public void dismissCalloutAnimated(boolean animated) {}
    @NotImplemented("marginInsetsHintForPresentationFromRect:")
    public @ByVal UIEdgeInsets marginInsetsHintForPresentationFromRect(@ByVal CGRect rect) { return null; }
    /*</methods>*/
}
