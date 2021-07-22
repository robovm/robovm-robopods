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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKShareLinkContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKSharingContent/*</implements>*/ {

    /*<ptr>*/public static class FBSDKShareLinkContentPtr extends Ptr<FBSDKShareLinkContent, FBSDKShareLinkContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKShareLinkContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKShareLinkContent() {}
    protected FBSDKShareLinkContent(Handle h, long handle) { super(h, handle); }
    protected FBSDKShareLinkContent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public FBSDKShareLinkContent(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "contentDescription")
    public native String getContentDescription();
    @Property(selector = "contentTitle")
    public native String getContentTitle();
    @Property(selector = "imageURL")
    public native NSURL getImageURL();
    @Property(selector = "quote")
    public native String getQuote();
    @Property(selector = "setQuote:")
    public native void setQuote(String v);
    @Property(selector = "contentURL")
    public native NSURL getContentURL();
    @Property(selector = "setContentURL:")
    public native void setContentURL(NSURL v);
    @Property(selector = "hashtag")
    public native FBSDKHashtag getHashtag();
    @Property(selector = "setHashtag:")
    public native void setHashtag(FBSDKHashtag v);
    @Property(selector = "peopleIDs")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getPeopleIDs();
    @Property(selector = "setPeopleIDs:")
    public native void setPeopleIDs(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "placeID")
    public native String getPlaceID();
    @Property(selector = "setPlaceID:")
    public native void setPlaceID(String v);
    @Property(selector = "ref")
    public native String getRef();
    @Property(selector = "setRef:")
    public native void setRef(String v);
    @Property(selector = "pageID")
    public native String getPageID();
    @Property(selector = "setPageID:")
    public native void setPageID(String v);
    @Property(selector = "shareUUID")
    public native String getShareUUID();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToShareLinkContent:")
    public native boolean equalsTo(FBSDKShareLinkContent content);
    @Method(selector = "addParameters:bridgeOptions:")
    public native NSDictionary<NSString, ?> addParameters(NSDictionary<NSString, ?> existingParameters, FBSDKShareBridgeOptions bridgeOptions);
    @Method(selector = "addToParameters:bridgeOptions:")
    public native void addToParameters(NSMutableDictionary<NSString, ?> parameters, FBSDKShareBridgeOptions bridgeOptions);
    @Method(selector = "validateWithOptions:error:")
    public native boolean validate(FBSDKShareBridgeOptions bridgeOptions, NSError.NSErrorPtr errorRef);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
