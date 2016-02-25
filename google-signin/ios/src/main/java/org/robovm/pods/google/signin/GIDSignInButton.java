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
package org.robovm.pods.google.signin;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GIDSignInButton/*</name>*/ 
    extends /*<extends>*/UIControl/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GIDSignInButtonPtr extends Ptr<GIDSignInButton, GIDSignInButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GIDSignInButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GIDSignInButton() {}
    protected GIDSignInButton(Handle h, long handle) { super(h, handle); }
    protected GIDSignInButton(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "style")
    public native GIDSignInButtonStyle getStyle();
    @Property(selector = "setStyle:")
    public native void setStyle(GIDSignInButtonStyle v);
    @Property(selector = "colorScheme")
    public native GIDSignInButtonColorScheme getColorScheme();
    @Property(selector = "setColorScheme:")
    public native void setColorScheme(GIDSignInButtonColorScheme v);
    @Property(selector = "delegate")
    public native UIViewController getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIViewController v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
