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
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFTextField/*</name>*/ 
    extends /*<extends>*/UITextField/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFTextFieldPtr extends Ptr<PFTextField, PFTextFieldPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFTextField.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFTextField() {}
    protected PFTextField(Handle h, long handle) { super(h, handle); }
    protected PFTextField(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:separatorStyle:")
    public PFTextField(@ByVal CGRect frame, PFTextFieldSeparatorStyle separatorStyle) { super((SkipInit) null); initObject(init(frame, separatorStyle)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "separatorStyle")
    public native PFTextFieldSeparatorStyle getSeparatorStyle();
    @Property(selector = "setSeparatorStyle:")
    public native void setSeparatorStyle(PFTextFieldSeparatorStyle v);
    @Property(selector = "separatorColor")
    public native UIColor getSeparatorColor();
    @Property(selector = "setSeparatorColor:")
    public native void setSeparatorColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:separatorStyle:")
    protected native @Pointer long init(@ByVal CGRect frame, PFTextFieldSeparatorStyle separatorStyle);
    /*</methods>*/
}
