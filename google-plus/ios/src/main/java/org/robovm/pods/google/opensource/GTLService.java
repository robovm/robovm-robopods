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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLService/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLServicePtr extends Ptr<GTLService, GTLServicePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLService.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLService() {}
    protected GTLService(Handle h, long handle) { super(h, handle); }
    protected GTLService(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "shouldFetchNextPages")
    public native boolean shouldFetchNextPages();
    @Property(selector = "setShouldFetchNextPages:")
    public native void setShouldFetchNextPages(boolean v);
    @Property(selector = "isRetryEnabled")
    public native boolean isRetryEnabled();
    @Property(selector = "setRetryEnabled:")
    public native void setRetryEnabled(boolean v);
    @Property(selector = "APIKey")
    public native String getAPIKey();
    @Property(selector = "setAPIKey:")
    public native void setAPIKey(String v);
    @Property(selector = "authorizer")
    public native GTMFetcherAuthorizationProtocol getAuthorizer();
    @Property(selector = "setAuthorizer:")
    public native void setAuthorizer(GTMFetcherAuthorizationProtocol v);
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
    @Property(selector = "serviceProperties")
    public native NSDictionary<?, ?> getServiceProperties();
    @Property(selector = "setServiceProperties:")
    public native void setServiceProperties(NSDictionary<?, ?> v);
    @Property(selector = "serviceUserData")
    public native NSObject getServiceUserData();
    @Property(selector = "setServiceUserData:")
    public native void setServiceUserData(NSObject v);
    @Property(selector = "surrogates")
    public native NSDictionary<?, ?> getSurrogates();
    @Property(selector = "setSurrogates:")
    public native void setSurrogates(NSDictionary<?, ?> v);
    @Property(selector = "shouldFetchInBackground")
    public native boolean shouldFetchInBackground();
    @Property(selector = "setShouldFetchInBackground:")
    public native void setShouldFetchInBackground(boolean v);
    @Property(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @Property(selector = "setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue v);
    @Property(selector = "runLoopModes")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getRunLoopModes();
    @Property(selector = "setRunLoopModes:")
    public native void setRunLoopModes(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "allowInsecureQueries")
    public native boolean allowsInsecureQueries();
    @Property(selector = "setAllowInsecureQueries:")
    public native void setAllowsInsecureQueries(boolean v);
    @Property(selector = "userAgentAddition")
    public native String getUserAgentAddition();
    @Property(selector = "setUserAgentAddition:")
    public native void setUserAgentAddition(String v);
    @Property(selector = "userAgent")
    public native String getUserAgent();
    @Property(selector = "setUserAgent:")
    public native void setUserAgent(String v);
    @Property(selector = "requestUserAgent")
    public native String getRequestUserAgent();
    @Property(selector = "parseQueue")
    public native NSOperationQueue getParseQueue();
    @Property(selector = "setParseQueue:")
    public native void setParseQueue(NSOperationQueue v);
    @Property(selector = "fetcherService")
    public native GTMHTTPFetcherService getFetcherService();
    @Property(selector = "setFetcherService:")
    public native void setFetcherService(GTMHTTPFetcherService v);
    @Property(selector = "cookieStorageMethod")
    public native @MachineSizedSInt long getCookieStorageMethod();
    @Property(selector = "setCookieStorageMethod:")
    public native void setCookieStorageMethod(@MachineSizedSInt long v);
    @Property(selector = "isRESTDataWrapperRequired")
    public native boolean isRESTDataWrapperRequired();
    @Property(selector = "setIsRESTDataWrapperRequired:")
    public native void setRESTDataWrapperRequired(boolean v);
    @Property(selector = "urlQueryParameters")
    public native NSDictionary<?, ?> getUrlQueryParameters();
    @Property(selector = "setUrlQueryParameters:")
    public native void setUrlQueryParameters(NSDictionary<?, ?> v);
    @Property(selector = "additionalHTTPHeaders")
    public native NSDictionary<?, ?> getAdditionalHTTPHeaders();
    @Property(selector = "setAdditionalHTTPHeaders:")
    public native void setAdditionalHTTPHeaders(NSDictionary<?, ?> v);
    @Property(selector = "apiVersion")
    public native String getApiVersion();
    @Property(selector = "setApiVersion:")
    public native void setApiVersion(String v);
    @Property(selector = "rpcURL")
    public native NSURL getRpcURL();
    @Property(selector = "setRpcURL:")
    public native void setRpcURL(NSURL v);
    @Property(selector = "rpcUploadURL")
    public native NSURL getRpcUploadURL();
    @Property(selector = "setRpcUploadURL:")
    public native void setRpcUploadURL(NSURL v);
    @Property(selector = "serviceUploadChunkSize")
    public native @MachineSizedUInt long getServiceUploadChunkSize();
    @Property(selector = "setServiceUploadChunkSize:")
    public native void setServiceUploadChunkSize(@MachineSizedUInt long v);
    @Property(selector = "uploadProgressSelector")
    public native Selector getUploadProgressSelector();
    @Property(selector = "setUploadProgressSelector:", strongRef = true)
    public native void setUploadProgressSelector(Selector v);
    @Property(selector = "uploadProgressBlock")
    public native @Block GTLServiceUploadProgressHandler getUploadProgressBlock();
    @Property(selector = "setUploadProgressBlock:")
    public native void setUploadProgressBlock(@Block GTLServiceUploadProgressHandler v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void setServiceProperty(String key, NSObject obj) {
        setServiceProperty0(obj, key);
    }
    public GTLObject waitForTicket(GTLServiceTicket ticket, double timeoutInSeconds) throws NSErrorException {
        GTLObject.GTLObjectPtr resultPtr = new GTLObject.GTLObjectPtr();
        NSError.NSErrorPtr err = new NSError.NSErrorPtr();
        waitForTicket(ticket, timeoutInSeconds, resultPtr, err);
        if (err.get() != null) {
            throw new NSErrorException(err.get());
        }
        return resultPtr.get();
    }
    /*<methods>*/
    @Method(selector = "executeQuery:delegate:didFinishSelector:")
    public native GTLServiceTicket executeQuery(GTLQueryProtocol query, NSObject delegate, Selector finishedSelector);
    @Method(selector = "executeQuery:completionHandler:")
    public native GTLServiceTicket executeQuery(GTLQueryProtocol query, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectWithMethodNamed:parameters:objectClass:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, NSDictionary<?, ?> parameters, Class<T> objectClass, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectWithMethodNamed:insertingObject:objectClass:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, GTLObject bodyObject, Class<T> objectClass, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectWithMethodNamed:parameters:insertingObject:objectClass:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, NSDictionary<?, ?> parameters, GTLObject bodyObject, Class<T> objectClass, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectWithMethodNamed:parameters:objectClass:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, NSDictionary<?, ?> parameters, Class<T> objectClass, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectWithMethodNamed:insertingObject:objectClass:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, GTLObject bodyObject, Class<T> objectClass, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectWithMethodNamed:parameters:insertingObject:objectClass:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(String methodName, NSDictionary<?, ?> parameters, GTLObject bodyObject, Class<T> objectClass, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectWithURL:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(NSURL objectURL, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectWithURL:objectClass:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(NSURL objectURL, Class<T> objectClass, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchPublicObjectWithURL:objectClass:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchPublicObject(NSURL objectURL, Class<T> objectClass, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectByInsertingObject:forURL:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObjectByInserting(GTLObject bodyToPut, NSURL destinationURL, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectByUpdatingObject:forURL:delegate:didFinishSelector:")
    public native <T extends GTLObject> GTLServiceTicket fetchObjectByUpdating(GTLObject bodyToPut, NSURL destinationURL, NSObject delegate, Selector finishedSelector);
    @Method(selector = "deleteResourceURL:ETag:delegate:didFinishSelector:")
    public native GTLServiceTicket deleteResourceURL(NSURL destinationURL, String etagOrNil, NSObject delegate, Selector finishedSelector);
    @Method(selector = "fetchObjectWithURL:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObject(NSURL objectURL, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectByInsertingObject:forURL:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObjectByInserting(GTLObject bodyToPut, NSURL destinationURL, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "fetchObjectByUpdatingObject:forURL:completionHandler:")
    public native <T extends GTLObject> GTLServiceTicket fetchObjectByUpdating(GTLObject bodyToPut, NSURL destinationURL, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "deleteResourceURL:ETag:completionHandler:")
    public native GTLServiceTicket deleteResourceURL(NSURL destinationURL, String etagOrNil, @Block GTLServiceCompletionHandler handler);
    @Method(selector = "setServiceProperty:forKey:")
    private native void setServiceProperty0(NSObject obj, String key);
    @Method(selector = "servicePropertyForKey:")
    public native NSObject getServiceProperty(String key);
    @Method(selector = "requestForURL:ETag:httpMethod:")
    public native NSMutableURLRequest getRequest(NSURL url, String etagOrNil, String httpMethodOrNil);
    @Method(selector = "objectRequestForURL:object:ETag:httpMethod:isREST:additionalHeaders:ticket:")
    public native NSMutableURLRequest getObjectRequest(NSURL url, GTLObject object, String etag, String httpMethod, boolean isREST, NSDictionary<?, ?> additionalHeaders, GTLServiceTicket ticket);
    @Method(selector = "waitForTicket:timeout:fetchedObject:error:")
    protected native boolean waitForTicket(GTLServiceTicket ticket, double timeoutInSeconds, GTLObject.GTLObjectPtr outObjectOrNil, NSError.NSErrorPtr outErrorOrNil);
    @Method(selector = "defaultServiceUploadChunkSize")
    public static native @MachineSizedUInt long getDefaultServiceUploadChunkSize();
    /*</methods>*/
}
