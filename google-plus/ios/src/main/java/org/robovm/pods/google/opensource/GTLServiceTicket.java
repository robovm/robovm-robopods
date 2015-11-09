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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLServiceTicket/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLServiceTicketPtr extends Ptr<GTLServiceTicket, GTLServiceTicketPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLServiceTicket.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLServiceTicket() {}
    protected GTLServiceTicket(Handle h, long handle) { super(h, handle); }
    protected GTLServiceTicket(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithService:")
    public GTLServiceTicket(GTLService service) { super((SkipInit) null); initObject(init(service)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "objectFetcher")
    public native GTMHTTPFetcher getObjectFetcher();
    @Property(selector = "setObjectFetcher:")
    public native void setObjectFetcher(GTMHTTPFetcher v);
    @Property(selector = "uploadProgressSelector")
    public native Selector getUploadProgressSelector();
    @Property(selector = "setUploadProgressSelector:", strongRef = true)
    public native void setUploadProgressSelector(Selector v);
    @Property(selector = "APIKey")
    public native String getAPIKey();
    @Property(selector = "setAPIKey:")
    public native void setAPIKey(String v);
    @Property(selector = "properties")
    public native NSDictionary<?, ?> getProperties();
    @Property(selector = "setProperties:")
    public native void setProperties(NSDictionary<?, ?> v);
    @Property(selector = "userData")
    public native NSObject getUserData();
    @Property(selector = "setUserData:")
    public native void setUserData(NSObject v);
    @Property(selector = "postedObject")
    public native GTLObject getPostedObject();
    @Property(selector = "setPostedObject:")
    public native void setPostedObject(GTLObject v);
    @Property(selector = "fetchedObject")
    public native GTLObject getFetchedObject();
    @Property(selector = "setFetchedObject:")
    public native void setFetchedObject(GTLObject v);
    @Property(selector = "executingQuery")
    public native GTLQueryProtocol getExecutingQuery();
    @Property(selector = "setExecutingQuery:")
    public native void setExecutingQuery(GTLQueryProtocol v);
    @Property(selector = "originalQuery")
    public native GTLQueryProtocol getOriginalQuery();
    @Property(selector = "setOriginalQuery:")
    public native void setOriginalQuery(GTLQueryProtocol v);
    @Property(selector = "surrogates")
    public native NSDictionary<?, ?> getSurrogates();
    @Property(selector = "setSurrogates:")
    public native void setSurrogates(NSDictionary<?, ?> v);
    @Property(selector = "isRetryEnabled")
    public native boolean isRetryEnabled();
    @Property(selector = "setRetryEnabled:")
    public native void setRetryEnabled(boolean v);
    @Property(selector = "retrySelector")
    public native Selector getRetrySelector();
    @Property(selector = "setRetrySelector:", strongRef = true)
    public native void setRetrySelector(Selector v);
    @Property(selector = "retryBlock")
    public native @Block GTLServiceRetryCallback getRetryBlock();
    @Property(selector = "setRetryBlock:")
    public native void setRetryBlock(@Block GTLServiceRetryCallback v);
    @Property(selector = "maxRetryInterval")
    public native double getMaxRetryInterval();
    @Property(selector = "setMaxRetryInterval:")
    public native void setMaxRetryInterval(double v);
    @Property(selector = "statusCode")
    public native @MachineSizedSInt long getStatusCode();
    @Property(selector = "fetchError")
    public native NSError getFetchError();
    @Property(selector = "setFetchError:")
    public native void setFetchError(NSError v);
    @Property(selector = "hasCalledCallback")
    public native boolean hasCalledCallback();
    @Property(selector = "setHasCalledCallback:")
    public native void setHasCalledCallback(boolean v);
    @Property(selector = "shouldFetchNextPages")
    public native boolean shouldFetchNextPages();
    @Property(selector = "setShouldFetchNextPages:")
    public native void setShouldFetchNextPages(boolean v);
    @Property(selector = "pagesFetchedCounter")
    public native @MachineSizedUInt long getPagesFetchedCounter();
    @Property(selector = "setPagesFetchedCounter:")
    public native void setPagesFetchedCounter(@MachineSizedUInt long v);
    @Property(selector = "uploadProgressBlock")
    public native @Block GTLServiceUploadProgressHandler getUploadProgressBlock();
    @Property(selector = "setUploadProgressBlock:")
    public native void setUploadProgressBlock(@Block GTLServiceUploadProgressHandler v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setProperty(String key, NSObject obj) {
        setProperty0(obj, key);
    }
    /*<methods>*/
    @Method(selector = "initWithService:")
    protected native @Pointer long init(GTLService service);
    @Method(selector = "service")
    public native GTLService getService();
    @Method(selector = "cancelTicket")
    public native void cancelTicket();
    @Method(selector = "pauseUpload")
    public native void pauseUpload();
    @Method(selector = "resumeUpload")
    public native void resumeUpload();
    @Method(selector = "isUploadPaused")
    public native boolean isUploadPaused();
    @Method(selector = "setProperty:forKey:")
    private native void setProperty0(NSObject obj, String key);
    @Method(selector = "propertyForKey:")
    public native NSObject getProperty(String key);
    @Method(selector = "queryForRequestID:")
    public native GTLQuery getQuery(String requestID);
    /*</methods>*/
}
