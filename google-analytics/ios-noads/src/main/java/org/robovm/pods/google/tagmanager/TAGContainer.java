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
package org.robovm.pods.google.tagmanager;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TAGContainer/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TAGContainerPtr extends Ptr<TAGContainer, TAGContainerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TAGContainer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TAGContainer() {}
    protected TAGContainer(Handle h, long handle) { super(h, handle); }
    protected TAGContainer(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "containerId")
    public native String getContainerId();
    @Property(selector = "lastRefreshTime")
    public native double getLastRefreshTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "booleanForKey:")
    public native boolean getBoolean(String key);
    @Method(selector = "doubleForKey:")
    public native double getDouble(String key);
    @Method(selector = "int64ForKey:")
    public native long getLong(String key);
    @Method(selector = "stringForKey:")
    public native String getString(String key);
    @Method(selector = "refresh")
    public native void refresh();
    @Method(selector = "close")
    public native void close();
    @Method(selector = "isDefault")
    public native boolean isDefault();
    @Method(selector = "registerFunctionCallMacroHandler:forMacro:")
    public native void registerFunctionCallMacroHandler(TAGFunctionCallMacroHandler handler, String macroName);
    @Method(selector = "functionCallMacroHandlerForMacro:")
    public native TAGFunctionCallMacroHandler getFunctionCallMacroHandler(String functionCallMacroName);
    @Method(selector = "registerFunctionCallTagHandler:forTag:")
    public native void registerFunctionCallTagHandler(TAGFunctionCallTagHandler handler, String tagName);
    @Method(selector = "functionCallTagHandlerForTag:")
    public native TAGFunctionCallTagHandler getFunctionCallTagHandler(String functionCallTagName);
    /*</methods>*/
}
