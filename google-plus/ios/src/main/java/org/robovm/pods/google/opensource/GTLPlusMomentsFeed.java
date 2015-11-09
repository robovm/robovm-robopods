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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusMomentsFeed/*</name>*/ 
    extends /*<extends>*/GTLCollectionObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusMomentsFeedPtr extends Ptr<GTLPlusMomentsFeed, GTLPlusMomentsFeedPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusMomentsFeed.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusMomentsFeed() {}
    protected GTLPlusMomentsFeed(Handle h, long handle) { super(h, handle); }
    protected GTLPlusMomentsFeed(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "ETag")
    public native String getETag();
    @Property(selector = "setETag:")
    public native void setETag(String v);
    @Property(selector = "items")
    public native NSArray<?> getItems();
    @Property(selector = "setItems:")
    public native void setItems(NSArray<?> v);
    @Property(selector = "kind")
    public native String getKind();
    @Property(selector = "setKind:")
    public native void setKind(String v);
    @Property(selector = "nextLink")
    public native String getNextLink();
    @Property(selector = "setNextLink:")
    public native void setNextLink(String v);
    @Property(selector = "nextPageToken")
    public native String getNextPageToken();
    @Property(selector = "setNextPageToken:")
    public native void setNextPageToken(String v);
    @Property(selector = "selfLink")
    public native String getSelfLink();
    @Property(selector = "setSelfLink:")
    public native void setSelfLink(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "updated")
    public native GTLDateTime getUpdated();
    @Property(selector = "setUpdated:")
    public native void setUpdated(GTLDateTime v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
