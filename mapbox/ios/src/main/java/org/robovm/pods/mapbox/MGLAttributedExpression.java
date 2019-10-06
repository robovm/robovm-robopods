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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLAttributedExpression/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLAttributedExpressionPtr extends Ptr<MGLAttributedExpression, MGLAttributedExpressionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLAttributedExpression.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLAttributedExpression() {}
    protected MGLAttributedExpression(Handle h, long handle) { super(h, handle); }
    protected MGLAttributedExpression(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithExpression:")
    public MGLAttributedExpression(NSExpression expression) { super((SkipInit) null); initObject(init(expression)); }
    @Method(selector = "initWithExpression:attributes:")
    public MGLAttributedExpression(NSExpression expression, NSDictionary<NSString, NSExpression> attrs) { super((SkipInit) null); initObject(init(expression, attrs)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "expression")
    public native NSExpression getExpression();
    @Property(selector = "setExpression:")
    public native void setExpression(NSExpression v);
    @Property(selector = "attributes")
    public native NSDictionary<NSString, NSExpression> getAttributes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithExpression:")
    protected native @Pointer long init(NSExpression expression);
    @Method(selector = "initWithExpression:attributes:")
    protected native @Pointer long init(NSExpression expression, NSDictionary<NSString, NSExpression> attrs);
    @Method(selector = "attributedExpression:fontNames:fontScale:")
    public static native MGLAttributedExpression attributedExpression(NSExpression expression, NSArray<NSString> fontNames, NSNumber fontScale);
    @Method(selector = "attributedExpression:attributes:")
    public static native MGLAttributedExpression attributedExpression(NSExpression expression, NSDictionary<NSString, NSExpression> attrs);
    /*</methods>*/
}
