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
package org.robovm.pods.ironsource;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ISSegment/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ISSegmentPtr extends Ptr<ISSegment, ISSegmentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ISSegment.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ISSegment() {}
    protected ISSegment(Handle h, long handle) { super(h, handle); }
    protected ISSegment(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "age")
    public native int getAge();
    @Property(selector = "setAge:")
    public native void setAge(int v);
    @Property(selector = "level")
    public native int getLevel();
    @Property(selector = "setLevel:")
    public native void setLevel(int v);
    @Property(selector = "iapTotal")
    public native double getIapTotal();
    @Property(selector = "setIapTotal:")
    public native void setIapTotal(double v);
    @Property(selector = "paying")
    public native boolean isPaying();
    @Property(selector = "setPaying:")
    public native void setPaying(boolean v);
    @Property(selector = "gender")
    public native ISGender getGender();
    @Property(selector = "setGender:")
    public native void setGender(ISGender v);
    @Property(selector = "userCreationDate")
    public native NSDate getUserCreationDate();
    @Property(selector = "setUserCreationDate:")
    public native void setUserCreationDate(NSDate v);
    @Property(selector = "segmentName")
    public native String getSegmentName();
    @Property(selector = "setSegmentName:")
    public native void setSegmentName(String v);
    @Property(selector = "customKeys")
    public native NSDictionary<?, ?> getCustomKeys();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setCustomValue:forKey:")
    public native void setCustomValueForKey(String value, String key);
    /*</methods>*/
}
