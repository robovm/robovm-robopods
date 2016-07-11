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
package org.robovm.pods.facebook.messenger;

import org.robovm.apple.foundation.NSObject;
import org.robovm.apple.foundation.NSURL;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKMessengerShareOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBSDKMessengerShareOptionsPtr extends Ptr<FBSDKMessengerShareOptions, FBSDKMessengerShareOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBSDKMessengerShareOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBSDKMessengerShareOptions() {}
    protected FBSDKMessengerShareOptions(long handle) { super(handle); }
    protected FBSDKMessengerShareOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "metadata")
    public native String getMetadata();
    @Property(selector = "setMetadata:")
    public native void setMetadata(String v);
    @Property(selector = "sourceURL")
    public native NSURL getSourceURL();
    @Property(selector = "setSourceURL:")
    public native void setSourceURL(NSURL v);
    @Property(selector = "renderAsSticker")
    public native boolean isRenderAsSticker();
    @Property(selector = "setRenderAsSticker:")
    public native void setRenderAsSticker(boolean v);
    @Property(selector = "contextOverride")
    public native FBSDKMessengerContext getContextOverride();
    @Property(selector = "setContextOverride:")
    public native void setContextOverride(FBSDKMessengerContext v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
