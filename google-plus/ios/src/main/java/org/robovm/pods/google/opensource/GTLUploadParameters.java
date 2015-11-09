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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLUploadParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLUploadParametersPtr extends Ptr<GTLUploadParameters, GTLUploadParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLUploadParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLUploadParameters() {}
    protected GTLUploadParameters(Handle h, long handle) { super(h, handle); }
    protected GTLUploadParameters(SkipInit skipInit) { super(skipInit); }
    public GTLUploadParameters(NSData data, String mimeType) { super((Handle) null, create(data, mimeType)); retain(getHandle()); }
    public GTLUploadParameters(NSFileHandle fileHandle, String mimeType) { super((Handle) null, create(fileHandle, mimeType)); retain(getHandle()); }
    public GTLUploadParameters(NSURL fileHandle, String mimeType) { super((Handle) null, create(fileHandle, mimeType)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "MIMEType")
    public native String getMIMEType();
    @Property(selector = "setMIMEType:")
    public native void setMIMEType(String v);
    @Property(selector = "data")
    public native NSData getData();
    @Property(selector = "setData:")
    public native void setData(NSData v);
    @Property(selector = "fileHandle")
    public native NSFileHandle getFileHandle();
    @Property(selector = "setFileHandle:")
    public native void setFileHandle(NSFileHandle v);
    @Property(selector = "fileURL")
    public native NSURL getFileURL();
    @Property(selector = "setFileURL:")
    public native void setFileURL(NSURL v);
    @Property(selector = "uploadLocationURL")
    public native NSURL getUploadLocationURL();
    @Property(selector = "setUploadLocationURL:")
    public native void setUploadLocationURL(NSURL v);
    @Property(selector = "slug")
    public native String getSlug();
    @Property(selector = "setSlug:")
    public native void setSlug(String v);
    @Property(selector = "shouldSendUploadOnly")
    public native boolean shouldSendUploadOnly();
    @Property(selector = "setShouldSendUploadOnly:")
    public native void setShouldSendUploadOnly(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "uploadParametersWithData:MIMEType:")
    protected static native @Pointer long create(NSData data, String mimeType);
    @Method(selector = "uploadParametersWithFileHandle:MIMEType:")
    protected static native @Pointer long create(NSFileHandle fileHandle, String mimeType);
    @Method(selector = "uploadParametersWithFileURL:MIMEType:")
    protected static native @Pointer long create(NSURL fileHandle, String mimeType);
    /*</methods>*/
}
