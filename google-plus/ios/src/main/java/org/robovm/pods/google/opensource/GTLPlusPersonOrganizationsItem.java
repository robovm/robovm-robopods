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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusPersonOrganizationsItem/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusPersonOrganizationsItemPtr extends Ptr<GTLPlusPersonOrganizationsItem, GTLPlusPersonOrganizationsItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusPersonOrganizationsItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusPersonOrganizationsItem() {}
    protected GTLPlusPersonOrganizationsItem(Handle h, long handle) { super(h, handle); }
    protected GTLPlusPersonOrganizationsItem(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    
    public boolean isPrimary() {
        return getPrimary().booleanValue();
    }
    public void setPrimary(boolean v) {
        setPrimary(NSNumber.valueOf(v));
    }
    /*<properties>*/
    @Property(selector = "department")
    public native String getDepartment();
    @Property(selector = "setDepartment:")
    public native void setDepartment(String v);
    @Property(selector = "descriptionProperty")
    public native String getDescriptionProperty();
    @Property(selector = "setDescriptionProperty:")
    public native void setDescriptionProperty(String v);
    @Property(selector = "endDate")
    public native String getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(String v);
    @Property(selector = "location")
    public native String getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(String v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "primary")
    private native NSNumber getPrimary();
    @Property(selector = "setPrimary:")
    private native void setPrimary(NSNumber v);
    @Property(selector = "startDate")
    public native String getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(String v);
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
