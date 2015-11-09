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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLQuery/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GTLQueryProtocol/*</implements>*/ {

    /*<ptr>*/public static class GTLQueryPtr extends Ptr<GTLQuery, GTLQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLQuery() {}
    protected GTLQuery(Handle h, long handle) { super(h, handle); }
    protected GTLQuery(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMethodName:")
    public GTLQuery(String method) { super((SkipInit) null); initObject(init(method)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "methodName")
    public native String getMethodName();
    @Property(selector = "JSON")
    public native NSMutableDictionary<?, ?> getJSON();
    @Property(selector = "setJSON:")
    public native void setJSON(NSMutableDictionary<?, ?> v);
    @Property(selector = "bodyObject")
    public native GTLObject getBodyObject();
    @Property(selector = "setBodyObject:")
    public native void setBodyObject(GTLObject v);
    @Property(selector = "requestID")
    public native String getRequestID();
    @Property(selector = "setRequestID:")
    public native void setRequestID(String v);
    @Property(selector = "uploadParameters")
    public native GTLUploadParameters getUploadParameters();
    @Property(selector = "setUploadParameters:")
    public native void setUploadParameters(GTLUploadParameters v);
    @Property(selector = "urlQueryParameters")
    public native NSDictionary<?, ?> getUrlQueryParameters();
    @Property(selector = "setUrlQueryParameters:")
    public native void setUrlQueryParameters(NSDictionary<?, ?> v);
    @Property(selector = "additionalHTTPHeaders")
    public native NSDictionary<?, ?> getAdditionalHTTPHeaders();
    @Property(selector = "setAdditionalHTTPHeaders:")
    public native void setAdditionalHTTPHeaders(NSDictionary<?, ?> v);
    @Property(selector = "expectedObjectClass")
    public native Class<? extends GTLObject> getExpectedObjectClass();
    @Property(selector = "setExpectedObjectClass:", strongRef = true)
    public native void setExpectedObjectClass(Class<? extends GTLObject> v);
    @Property(selector = "shouldSkipAuthorization")
    public native boolean shouldSkipAuthorization();
    @Property(selector = "setShouldSkipAuthorization:")
    public native void setShouldSkipAuthorization(boolean v);
    @Property(selector = "completionBlock")
    public native @Block VoidBlock3<GTLServiceTicket, GTLObject, NSError> getCompletionHandler();
    @Property(selector = "setCompletionBlock:")
    public native void setCompletionHandler(@Block VoidBlock3<GTLServiceTicket, GTLObject, NSError> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setCustomParameter(String key, NSObject obj) {
        setCustomParameter0(obj, key);
    }
    /*<methods>*/
    @Method(selector = "initWithMethodName:")
    protected native @Pointer long init(String method);
    @Method(selector = "setCustomParameter:forKey:")
    private native void setCustomParameter0(NSObject obj, String key);
    @Method(selector = "nextRequestID")
    public static native String getNextRequestID();
    @Method(selector = "parameterNameMap")
    public static native NSDictionary<?, ?> getParameterNameMap();
    @Method(selector = "arrayPropertyToClassMap")
    public static native NSDictionary<?, ?> getArrayPropertyToClassMap();
    @Method(selector = "isBatchQuery")
    public native boolean isBatchQuery();
    @Method(selector = "executionDidStop")
    public native void didStopExecution();
    /*</methods>*/
}
