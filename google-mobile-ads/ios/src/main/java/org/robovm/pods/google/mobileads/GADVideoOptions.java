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
package org.robovm.pods.google.mobileads;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADVideoOptions/*</name>*/ 
    extends /*<extends>*/GADAdLoaderOptions/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADVideoOptionsPtr extends Ptr<GADVideoOptions, GADVideoOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADVideoOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADVideoOptions() {}
    protected GADVideoOptions(Handle h, long handle) { super(h, handle); }
    protected GADVideoOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startMuted")
    public native boolean isStartMuted();
    @Property(selector = "setStartMuted:")
    public native void setStartMuted(boolean v);
    @Property(selector = "customControlsRequested")
    public native boolean isCustomControlsRequested();
    @Property(selector = "setCustomControlsRequested:")
    public native void setCustomControlsRequested(boolean v);
    @Property(selector = "clickToExpandRequested")
    public native boolean isClickToExpandRequested();
    @Property(selector = "setClickToExpandRequested:")
    public native void setClickToExpandRequested(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
