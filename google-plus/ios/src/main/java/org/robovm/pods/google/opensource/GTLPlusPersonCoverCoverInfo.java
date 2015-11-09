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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusPersonCoverCoverInfo/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusPersonCoverCoverInfoPtr extends Ptr<GTLPlusPersonCoverCoverInfo, GTLPlusPersonCoverCoverInfoPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusPersonCoverCoverInfo.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusPersonCoverCoverInfo() {}
    protected GTLPlusPersonCoverCoverInfo(Handle h, long handle) { super(h, handle); }
    protected GTLPlusPersonCoverCoverInfo(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "leftImageOffset")
    public native NSNumber getLeftImageOffset();
    @Property(selector = "setLeftImageOffset:")
    public native void setLeftImageOffset(NSNumber v);
    @Property(selector = "topImageOffset")
    public native NSNumber getTopImageOffset();
    @Property(selector = "setTopImageOffset:")
    public native void setTopImageOffset(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
