/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.mopub;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPAdConversionTracker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSURLConnectionDataDelegate/*</implements>*/ {

    /*<ptr>*/public static class MPAdConversionTrackerPtr extends Ptr<MPAdConversionTracker, MPAdConversionTrackerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPAdConversionTracker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPAdConversionTracker() {}
    protected MPAdConversionTracker(Handle h, long handle) { super(h, handle); }
    protected MPAdConversionTracker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "reportApplicationOpenForApplicationID:")
    public native void reportApplicationOpen(String appID);
    @Method(selector = "sharedConversionTracker")
    public static native MPAdConversionTracker getSharedConversionTracker();
    @Method(selector = "connection:willSendRequest:redirectResponse:")
    public native NSURLRequest willSendRequest(NSURLConnection connection, NSURLRequest request, NSURLResponse response);
    @Method(selector = "connection:didReceiveResponse:")
    public native void didReceiveResponse(NSURLConnection connection, NSURLResponse response);
    @Method(selector = "connection:didReceiveData:")
    public native void didReceiveData(NSURLConnection connection, NSData data);
    @Method(selector = "connection:needNewBodyStream:")
    public native NSInputStream needNewBodyStream(NSURLConnection connection, NSURLRequest request);
    @Method(selector = "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    public native void didSendBodyData(NSURLConnection connection, @MachineSizedSInt long bytesWritten, @MachineSizedSInt long totalBytesWritten, @MachineSizedSInt long totalBytesExpectedToWrite);
    @Method(selector = "connection:willCacheResponse:")
    public native NSCachedURLResponse willCacheResponse(NSURLConnection connection, NSCachedURLResponse cachedResponse);
    @Method(selector = "connectionDidFinishLoading:")
    public native void didFinishLoading(NSURLConnection connection);
    @Method(selector = "connection:didFailWithError:")
    public native void didFail(NSURLConnection connection, NSError error);
    @Method(selector = "connectionShouldUseCredentialStorage:")
    public native boolean shouldUseCredentialStorage(NSURLConnection connection);
    @Method(selector = "connection:willSendRequestForAuthenticationChallenge:")
    public native void willSendRequestForAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available since iOS 3.0.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "3.0", maxVersion = "8.0") })
    @Method(selector = "connection:canAuthenticateAgainstProtectionSpace:")
    public native boolean canAuthenticateAgainstProtectionSpace(NSURLConnection connection, NSURLProtectionSpace protectionSpace);
    /**
     * @since Available since iOS 2.0.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "2.0", maxVersion = "8.0") })
    @Method(selector = "connection:didReceiveAuthenticationChallenge:")
    public native void didReceiveAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /**
     * @since Available since iOS 2.0.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Availability({ @PlatformVersion(platform = Platform.iOS, minVersion = "2.0", maxVersion = "8.0") })
    @Method(selector = "connection:didCancelAuthenticationChallenge:")
    public native void didCancelAuthenticationChallenge(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
    /*</methods>*/
}
