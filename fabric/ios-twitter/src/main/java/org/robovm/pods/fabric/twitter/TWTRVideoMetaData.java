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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TWTRVideoMetaData/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding, TWTRJSONConvertible/*</implements>*/ {

    /*<ptr>*/public static class TWTRVideoMetaDataPtr extends Ptr<TWTRVideoMetaData, TWTRVideoMetaDataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TWTRVideoMetaData.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TWTRVideoMetaData() {}
    protected TWTRVideoMetaData(SkipInit skipInit) { super(skipInit); }
    public TWTRVideoMetaData(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    public TWTRVideoMetaData(NSDictionary<?, ?> jsonDictionary) { super((SkipInit) null); initObject(init(jsonDictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "videoURL")
    public native NSURL getVideoURL();
    @Property(selector = "variants")
    public native NSArray<?> getVariants();
    @Property(selector = "aspectRatio")
    public native @MachineSizedFloat double getAspectRatio();
    @Property(selector = "duration")
    public native double getDuration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "initWithJSONDictionary:")
    protected native @Pointer long init(NSDictionary<?, ?> jsonDictionary);
    /*</methods>*/
}
