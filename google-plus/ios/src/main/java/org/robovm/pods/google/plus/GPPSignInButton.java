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
package org.robovm.pods.google.plus;

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
import org.robovm.pods.google.opensource.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPPSignInButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPPSignInButtonPtr extends Ptr<GPPSignInButton, GPPSignInButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPPSignInButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPPSignInButton() {}
    protected GPPSignInButton(Handle h, long handle) { super(h, handle); }
    protected GPPSignInButton(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native GPPSignInButtonStyle getStyle();
    @Property(selector = "setStyle:", strongRef = true)
    public native void setStyle(GPPSignInButtonStyle v);
    @Property(selector = "colorScheme")
    public native GPPSignInButtonColorScheme getColorScheme();
    @Property(selector = "setColorScheme:", strongRef = true)
    public native void setColorScheme(GPPSignInButtonColorScheme v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
