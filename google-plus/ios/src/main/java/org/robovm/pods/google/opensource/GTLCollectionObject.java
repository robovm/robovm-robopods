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
package org.robovm.pods.google.opensource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLCollectionObject/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*/implements GTLCollectionProtocol, NSFastEnumeration/*</implements>*/ {

    /*<ptr>*/public static class GTLCollectionObjectPtr extends Ptr<GTLCollectionObject, GTLCollectionObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLCollectionObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLCollectionObject() {}
    protected GTLCollectionObject(Handle h, long handle) { super(h, handle); }
    protected GTLCollectionObject(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "setItems:")
    public native void setItems(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "itemAtIndex:")
    public native NSObject get(@MachineSizedUInt long idx);
    @Method(selector = "itemForIdentifier:")
    public native NSObject getItem(String key);
    @Method(selector = "resetIdentifierMap")
    public native void resetIdentifierMap();
    @Method(selector = "items")
    public native NSArray<?> getItems();
    /*</methods>*/
}
