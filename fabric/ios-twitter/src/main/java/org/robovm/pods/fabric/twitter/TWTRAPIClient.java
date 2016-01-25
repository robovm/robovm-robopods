/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.twitter;

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
import org.robovm.apple.accounts.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.mediaplayer.*;
import org.robovm.apple.social.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRAPIClient/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TWTRAPIClientPtr extends Ptr<TWTRAPIClient, TWTRAPIClientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRAPIClient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRAPIClient() {}
    protected TWTRAPIClient(Handle h, long handle) { super(h, handle); }
    protected TWTRAPIClient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserID:")
    public TWTRAPIClient(String userID) { super((SkipInit) null); initObject(init(userID)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userID")
    public native String getUserID();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserID:")
    protected native @Pointer long init(String userID);
    public NSURLRequest getURLRequest(String method, String URLString, NSDictionary<?, ?> parameters) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSURLRequest result = getURLRequest(method, URLString, parameters, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "URLRequestWithMethod:URL:parameters:error:")
    private native NSURLRequest getURLRequest(String method, String URLString, NSDictionary<?, ?> parameters, NSError.NSErrorPtr error);
    @Method(selector = "sendTwitterRequest:completion:")
    public native void sendTwitterRequest(NSURLRequest request, @Block VoidBlock3<NSURLResponse, NSData, NSError> completion);
    @Method(selector = "loadUserWithID:completion:")
    public native void loadUserWithID(String userID, @Block VoidBlock2<TWTRUser, NSError> completion);
    @Method(selector = "loadTweetWithID:completion:")
    public native void loadTweetWithID(String tweetID, @Block VoidBlock2<TWTRTweet, NSError> completion);
    @Method(selector = "loadTweetsWithIDs:completion:")
    public native void loadTweetsWithIDs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> tweetIDStrings, @Block VoidBlock2<NSArray<TWTRTweet>, NSError> completion);
    /*</methods>*/
}
