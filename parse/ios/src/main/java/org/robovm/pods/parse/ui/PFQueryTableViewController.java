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
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFQueryTableViewController/*</name>*/ <T extends PFObject>
    extends /*<extends>*/UITableViewController/*</extends>*/ 
    /*<implements>*/implements UITableViewDataSource, UITableViewDelegate/*</implements>*/ {

    /*<ptr>*/public static class PFQueryTableViewControllerPtr extends Ptr<PFQueryTableViewController, PFQueryTableViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFQueryTableViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PFQueryTableViewController(SkipInit skipInit) { super(skipInit); }
    public PFQueryTableViewController(UITableViewStyle style, String className) { super((SkipInit) null); initObject(init(style, className)); }
    public PFQueryTableViewController(String className) { super((SkipInit) null); initObject(init(className)); }
    /*</constructors>*/
    public PFQueryTableViewController(UITableViewStyle style, Class<T> subclass) {
        super((SkipInit) null);
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        ParseClassName annotation = subclass.getAnnotation(ParseClassName.class);
        initObject(init(style, annotation.value()));
    }
    public PFQueryTableViewController(Class<T> subclass) {
        super((SkipInit) null);
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        ParseClassName annotation = subclass.getAnnotation(ParseClassName.class);
        initObject(init(annotation.value()));
    }
    /*<properties>*/
    @Property(selector = "parseClassName")
    public native String getParseClassName();
    @Property(selector = "textKey")
    public native String getTextKey();
    @Property(selector = "setTextKey:")
    public native void setTextKey(String v);
    @Property(selector = "imageKey")
    public native String getImageKey();
    @Property(selector = "setImageKey:")
    public native void setImageKey(String v);
    @Property(selector = "placeholderImage")
    public native UIImage getPlaceholderImage();
    @Property(selector = "setPlaceholderImage:")
    public native void setPlaceholderImage(UIImage v);
    @Property(selector = "loadingViewEnabled")
    public native boolean isLoadingViewEnabled();
    @Property(selector = "setLoadingViewEnabled:")
    public native void setLoadingViewEnabled(boolean v);
    @Property(selector = "pullToRefreshEnabled")
    public native boolean isPullToRefreshEnabled();
    @Property(selector = "setPullToRefreshEnabled:")
    public native void setPullToRefreshEnabled(boolean v);
    @Property(selector = "paginationEnabled")
    public native boolean isPaginationEnabled();
    @Property(selector = "setPaginationEnabled:")
    public native void setPaginationEnabled(boolean v);
    @Property(selector = "objectsPerPage")
    public native @MachineSizedUInt long getObjectsPerPage();
    @Property(selector = "setObjectsPerPage:")
    public native void setObjectsPerPage(@MachineSizedUInt long v);
    @Property(selector = "isLoading")
    public native boolean isLoading();
    @Property(selector = "setLoading:")
    public native void setLoading(boolean v);
    @Property(selector = "objects")
    public native NSArray<T> getObjects();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStyle:className:")
    protected native @Pointer long init(UITableViewStyle style, String className);
    @Method(selector = "initWithClassName:")
    protected native @Pointer long init(String className);
    @Method(selector = "objectsWillLoad")
    public native void willLoadObjects();
    @Method(selector = "objectsDidLoad:")
    public native void didLoadObjects(NSError error);
    @Method(selector = "objectAtIndexPath:")
    public native T getObject(NSIndexPath indexPath);
    @Method(selector = "removeObjectAtIndexPath:")
    public native void removeObject(NSIndexPath indexPath);
    @Method(selector = "removeObjectAtIndexPath:animated:")
    public native void removeObject(NSIndexPath indexPath, boolean animated);
    @Method(selector = "removeObjectsAtIndexPaths:")
    public native void removeObjects(NSArray<NSIndexPath> indexes);
    @Method(selector = "removeObjectsAtIndexPaths:animated:")
    public native void removeObjects(NSArray<NSIndexPath> indexes, boolean animated);
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "loadObjects")
    public native BFTask<Void> loadObjects();
    @Method(selector = "loadObjects:clear:")
    public native BFTask<Void> loadObjects(@MachineSizedSInt long page, boolean clear);
    @Method(selector = "loadNextPage")
    public native void loadNextPage();
    @Method(selector = "queryForTable")
    public native PFQuery<T> getQuery();
    @Method(selector = "tableView:cellForRowAtIndexPath:object:")
    public native PFTableViewCell getCellForRow(UITableView tableView, NSIndexPath indexPath, T object);
    @Method(selector = "tableView:cellForNextPageAtIndexPath:")
    public native PFTableViewCell getCellForNextPage(UITableView tableView, NSIndexPath indexPath);
    /*</methods>*/
}
