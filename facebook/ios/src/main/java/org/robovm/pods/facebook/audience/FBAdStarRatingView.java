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
package org.robovm.pods.facebook.audience;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBAdStarRatingView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FBAdStarRatingViewPtr extends Ptr<FBAdStarRatingView, FBAdStarRatingViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBAdStarRatingView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBAdStarRatingView() {}
    protected FBAdStarRatingView(Handle h, long handle) { super(h, handle); }
    protected FBAdStarRatingView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:withStarRating:")
    public FBAdStarRatingView(@ByVal CGRect frame, @ByVal FBAdStarRating starRating) { super((SkipInit) null); initObject(init(frame, starRating)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "rating")
    public native @ByVal FBAdStarRating getRating();
    @Property(selector = "setRating:")
    public native void setRating(@ByVal FBAdStarRating v);
    @Property(selector = "primaryColor")
    public native UIColor getPrimaryColor();
    @Property(selector = "setPrimaryColor:")
    public native void setPrimaryColor(UIColor v);
    @Property(selector = "secondaryColor")
    public native UIColor getSecondaryColor();
    @Property(selector = "setSecondaryColor:")
    public native void setSecondaryColor(UIColor v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithFrame:withStarRating:")
    protected native @Pointer long init(@ByVal CGRect frame, @ByVal FBAdStarRating starRating);
    /*</methods>*/
}
