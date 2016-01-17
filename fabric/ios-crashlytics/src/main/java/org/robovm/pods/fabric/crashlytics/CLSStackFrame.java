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
package org.robovm.pods.fabric.crashlytics;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSStackFrame/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSStackFramePtr extends Ptr<CLSStackFrame, CLSStackFramePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSStackFrame.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLSStackFrame(Handle h, long handle) { super(h, handle); }
    protected CLSStackFrame(SkipInit skipInit) { super(skipInit); }
    public CLSStackFrame() { super((Handle) null, create()); retain(getHandle()); }
    public CLSStackFrame(@MachineSizedUInt long address) { super((Handle) null, create(address)); retain(getHandle()); }
    public CLSStackFrame(String symbol) { super((Handle) null, create(symbol)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "symbol")
    public native String getSymbol();
    @Property(selector = "setSymbol:")
    public native void setSymbol(String v);
    @Property(selector = "library")
    public native String getLibrary();
    @Property(selector = "setLibrary:")
    public native void setLibrary(String v);
    @Property(selector = "fileName")
    public native String getFileName();
    @Property(selector = "setFileName:")
    public native void setFileName(String v);
    @Property(selector = "lineNumber")
    public native int getLineNumber();
    @Property(selector = "setLineNumber:")
    public native void setLineNumber(int v);
    @Property(selector = "offset")
    public native long getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(long v);
    @Property(selector = "address")
    public native long getAddress();
    @Property(selector = "setAddress:")
    public native void setAddress(long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "stackFrame")
    protected static native @Pointer long create();
    @Method(selector = "stackFrameWithAddress:")
    protected static native @Pointer long create(@MachineSizedUInt long address);
    @Method(selector = "stackFrameWithSymbol:")
    protected static native @Pointer long create(String symbol);
    /*</methods>*/
}
