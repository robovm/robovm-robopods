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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFAppLinkReturnToRefererView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFAppLinkReturnToRefererViewPtr extends Ptr<BFAppLinkReturnToRefererView, BFAppLinkReturnToRefererViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFAppLinkReturnToRefererView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFAppLinkReturnToRefererView() {}
    protected BFAppLinkReturnToRefererView(Handle h, long handle) { super(h, handle); }
    protected BFAppLinkReturnToRefererView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public BFAppLinkReturnToRefererView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public BFAppLinkReturnToRefererView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native BFAppLinkReturnToRefererViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(BFAppLinkReturnToRefererViewDelegate v);
    @Property(selector = "textColor")
    public native UIColor getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @Property(selector = "refererAppLink")
    public native BFAppLink getRefererAppLink();
    @Property(selector = "setRefererAppLink:")
    public native void setRefererAppLink(BFAppLink v);
    @Property(selector = "includeStatusBarInSize")
    public native BFIncludeStatusBarInSize getIncludeStatusBarInSize();
    @Property(selector = "setIncludeStatusBarInSize:")
    public native void setIncludeStatusBarInSize(BFIncludeStatusBarInSize v);
    @Property(selector = "closed")
    public native boolean isClosed();
    @Property(selector = "setClosed:")
    public native void setClosed(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
