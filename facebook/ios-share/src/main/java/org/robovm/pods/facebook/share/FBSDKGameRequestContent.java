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

import java.util.List;

import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.*;
import org.robovm.pods.facebook.core.FBSDKCopying;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKGameRequestContent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements FBSDKCopying/*</implements>*/ {

    /*<ptr>*/public static class FBSDKGameRequestContentPtr extends Ptr<FBSDKGameRequestContent, FBSDKGameRequestContentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKGameRequestContent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKGameRequestContent() {}
    protected FBSDKGameRequestContent(long handle) { super(handle); }
    protected FBSDKGameRequestContent(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "actionType")
    public native FBSDKGameRequestActionType getActionType();
    @Property(selector = "setActionType:")
    public native void setActionType(FBSDKGameRequestActionType v);
    @Property(selector = "data")
    public native String getData();
    @Property(selector = "setData:")
    public native void setData(String v);
    @Property(selector = "filters")
    public native FBSDKGameRequestFilter getFilters();
    @Property(selector = "setFilters:")
    public native void setFilters(FBSDKGameRequestFilter v);
    @Property(selector = "message")
    public native String getMessage();
    @Property(selector = "setMessage:")
    public native void setMessage(String v);
    @Property(selector = "objectID")
    public native String getObjectID();
    @Property(selector = "setObjectID:")
    public native void setObjectID(String v);
    @Property(selector = "recipients")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getRecipients();
    @Property(selector = "setRecipients:")
    public native void setRecipients(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "recipientSuggestions")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getRecipientSuggestions();
    @Property(selector = "setRecipientSuggestions:")
    public native void setRecipientSuggestions(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEqualToGameRequestContent:")
    public native boolean equalsTo(FBSDKGameRequestContent content);
    @Method(selector = "copy")
    public native NSObject copy();
    /*</methods>*/
}
