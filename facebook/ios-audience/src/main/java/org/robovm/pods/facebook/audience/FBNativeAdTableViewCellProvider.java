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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBNativeAdTableViewCellProvider/*</name>*/ 
    extends /*<extends>*/FBNativeAdTableViewAdProvider/*</extends>*/ 
    /*<implements>*/implements UITableViewDataSource/*</implements>*/ {

    /*<ptr>*/public static class FBNativeAdTableViewCellProviderPtr extends Ptr<FBNativeAdTableViewCellProvider, FBNativeAdTableViewCellProviderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FBNativeAdTableViewCellProvider.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FBNativeAdTableViewCellProvider() {}
    protected FBNativeAdTableViewCellProvider(Handle h, long handle) { super(h, handle); }
    protected FBNativeAdTableViewCellProvider(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithManager:forType:")
    public FBNativeAdTableViewCellProvider(FBNativeAdsManager manager, FBNativeAdViewType type) { super((SkipInit) null); initObject(init(manager, type)); }
    @Method(selector = "initWithManager:forType:forAttributes:")
    public FBNativeAdTableViewCellProvider(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes) { super((SkipInit) null); initObject(init(manager, type, attributes)); }
    @Method(selector = "initWithManager:")
    public FBNativeAdTableViewCellProvider(FBNativeAdsManager manager) { super(manager); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithManager:forType:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type);
    @Method(selector = "initWithManager:forType:forAttributes:")
    protected native @Pointer long init(FBNativeAdsManager manager, FBNativeAdViewType type, FBNativeAdViewAttributes attributes);
    @Method(selector = "tableView:cellForRowAtIndexPath:")
    public native UITableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:heightForRowAtIndexPath:")
    public native @MachineSizedFloat double getHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:estimatedHeightForRowAtIndexPath:")
    public native @MachineSizedFloat double getEstimatedHeightForRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:numberOfRowsInSection:")
    public native @MachineSizedSInt long getNumberOfRowsInSection(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "numberOfSectionsInTableView:")
    public native @MachineSizedSInt long getNumberOfSections(UITableView tableView);
    @Method(selector = "tableView:titleForHeaderInSection:")
    public native String getTitleForHeader(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:titleForFooterInSection:")
    public native String getTitleForFooter(UITableView tableView, @MachineSizedSInt long section);
    @Method(selector = "tableView:canEditRowAtIndexPath:")
    public native boolean canEditRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "tableView:canMoveRowAtIndexPath:")
    public native boolean canMoveRow(UITableView tableView, NSIndexPath indexPath);
    @Method(selector = "sectionIndexTitlesForTableView:")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getSectionIndexTitles(UITableView tableView);
    @Method(selector = "tableView:sectionForSectionIndexTitle:atIndex:")
    public native @MachineSizedSInt long getSectionForSectionIndexTitle(UITableView tableView, String title, @MachineSizedSInt long index);
    @Method(selector = "tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void commitEditingStyleForRow(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath);
    @Method(selector = "tableView:moveRowAtIndexPath:toIndexPath:")
    public native void moveRow(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
    /*</methods>*/
}
