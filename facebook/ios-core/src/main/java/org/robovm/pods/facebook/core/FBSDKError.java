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
package org.robovm.pods.facebook.core;

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
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKError/*</name>*/ 
    extends /*<extends>*/NSError/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    protected FBSDKError(SkipInit skipInit) {
        super(skipInit);
    }
    
    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    private NSErrorUserInfo userInfo;
    
    /* Convenience methods */
    private NSErrorUserInfo getCachedUserInfo() {
        if (userInfo == null) {
            userInfo = getUserInfo();
        }
        return userInfo;
    }
    
    @Override
    public FBSDKErrorCode getErrorCode() {
        FBSDKErrorCode code = null;
        try {
            code = FBSDKErrorCode.valueOf(getCode());
        } catch (IllegalArgumentException e) {
            // ignore
        }
        return code;
    }
    
    public String getDeveloperMessage() {
        if (getCachedUserInfo().has(FBSDKErrorUserInfoKey.DeveloperMessage)) {
            NSString val = (NSString) getCachedUserInfo().get(FBSDKErrorUserInfoKey.DeveloperMessage);
            return val.toString();
        }
        return null;
    }
    
    @Override
    public String getLocalizedDescription() {
        if (getCachedUserInfo().has(FBSDKErrorUserInfoKey.LocalizedDescription)) {
            NSString val = (NSString) getCachedUserInfo().get(FBSDKErrorUserInfoKey.LocalizedDescription);
            return val.toString();
        }
        return super.getLocalizedDescription();
    }
    
    public String getLocalizedTitle() {
        if (getCachedUserInfo().has(FBSDKErrorUserInfoKey.LocalizedTitle)) {
            NSString val = (NSString) getCachedUserInfo().get(FBSDKErrorUserInfoKey.LocalizedTitle);
            return val.toString();
        }
        return null;
    }
    
    public FBSDKGraphRequestErrorCategory getGraphErrorCategory() {
        if (getCachedUserInfo().has(FBSDKGraphRequestErrorUserInfoKey.Category)) {
            NSNumber val = (NSNumber) getCachedUserInfo().get(FBSDKGraphRequestErrorUserInfoKey.Category);
            return FBSDKGraphRequestErrorCategory.valueOf(val.intValue());
        }
        return null;
    }
    
    public int getGraphErrorCode() {
        if (getCachedUserInfo().has(FBSDKGraphRequestErrorUserInfoKey.GraphErrorCode)) {
            NSNumber val = (NSNumber) getCachedUserInfo().get(FBSDKGraphRequestErrorUserInfoKey.GraphErrorCode);
            return val.intValue();
        }
        return 0;
    }
    
    public int getGraphErrorSubcode() {
        if (getCachedUserInfo().has(FBSDKGraphRequestErrorUserInfoKey.GraphErrorSubcode)) {
            NSNumber val = (NSNumber) getCachedUserInfo().get(FBSDKGraphRequestErrorUserInfoKey.GraphErrorSubcode);
            return val.intValue();
        }
        return 0;
    }
    
    public int getGraphRequestHTTPStatusCode() {
        if (getCachedUserInfo().has(FBSDKGraphRequestErrorUserInfoKey.HTTPStatusCode)) {
            NSNumber val = (NSNumber) getCachedUserInfo().get(FBSDKGraphRequestErrorUserInfoKey.HTTPStatusCode);
            return val.intValue();
        }
        return 0;
    }

    public NSDictionary<?, ?> getGraphRequestParsedJSONResponse() {
        if (getCachedUserInfo().has(FBSDKGraphRequestErrorUserInfoKey.ParsedJSONResponse)) {
            NSDictionary<?, ?> val = (NSDictionary<?, ?>) getCachedUserInfo().get(FBSDKGraphRequestErrorUserInfoKey.ParsedJSONResponse);
            return val;
        }
        return null;
    }
    /*<methods>*/
    @GlobalValue(symbol="FBSDKErrorDomain", optional=true)
    public static native String getClassDomain();
    /*</methods>*/
}
