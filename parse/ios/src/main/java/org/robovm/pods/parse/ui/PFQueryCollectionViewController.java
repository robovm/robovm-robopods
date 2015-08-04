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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFQueryCollectionViewController/*</name>*/ <T extends PFObject>
    extends /*<extends>*/UICollectionViewController/*</extends>*/ 
    /*<implements>*/implements UICollectionViewDelegateFlowLayout/*</implements>*/ {

    /*<ptr>*/public static class PFQueryCollectionViewControllerPtr extends Ptr<PFQueryCollectionViewController, PFQueryCollectionViewControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFQueryCollectionViewController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PFQueryCollectionViewController(SkipInit skipInit) { super(skipInit); }
    public PFQueryCollectionViewController(String className) { super((SkipInit) null); initObject(init(className)); }
    public PFQueryCollectionViewController(UICollectionViewLayout layout, String className) { super((SkipInit) null); initObject(init(layout, className)); }
    /*</constructors>*/
    public PFQueryCollectionViewController(UICollectionViewLayout layout, Class<T> subclass) {
        super((SkipInit) null);
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        ParseClassName annotation = subclass.getAnnotation(ParseClassName.class);
        initObject(init(layout, annotation.value()));
    }
    public PFQueryCollectionViewController(Class<T> subclass) {
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
    @Method(selector = "initWithClassName:")
    protected native @Pointer long init(String className);
    @Method(selector = "initWithCollectionViewLayout:className:")
    protected native @Pointer long init(UICollectionViewLayout layout, String className);
    @Method(selector = "objectsWillLoad")
    public native void willLoadObjects();
    @Method(selector = "objectsDidLoad:")
    public native void didLoadObjects(NSError error);
    @Method(selector = "objectAtIndexPath:")
    public native T getObject(NSIndexPath indexPath);
    @Method(selector = "removeObjectAtIndexPath:")
    public native void removeObject(NSIndexPath indexPath);
    @Method(selector = "removeObjectsAtIndexPaths:")
    public native void removeObjects(NSArray<NSIndexPath> indexes);
    @Method(selector = "loadObjects")
    public native BFTask<Void> loadObjects();
    @Method(selector = "loadObjects:clear:")
    public native BFTask<Void> loadObjects(@MachineSizedSInt long page, boolean clear);
    @Method(selector = "loadNextPage")
    public native void loadNextPage();
    @Method(selector = "clear")
    public native void clear();
    @Method(selector = "queryForCollection")
    public native PFQuery<T> getQuery();
    @Method(selector = "collectionView:cellForItemAtIndexPath:object:")
    public native PFCollectionViewCell<T> getCellForItem(UICollectionView collectionView, NSIndexPath indexPath, T object);
    @Method(selector = "collectionViewReusableViewForNextPageAction:")
    public native UICollectionReusableView getReusableViewForNextPageAction(UICollectionView collectionView);
    @Method(selector = "collectionView:layout:sizeForItemAtIndexPath:")
    public native @ByVal CGSize getItemSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath);
    @Method(selector = "collectionView:layout:insetForSectionAtIndex:")
    public native @ByVal UIEdgeInsets getSectionInset(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Method(selector = "collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    public native @MachineSizedFloat double getSectionMinimumLineSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Method(selector = "collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    public native @MachineSizedFloat double getSectionMinimumInteritemSpacing(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Method(selector = "collectionView:layout:referenceSizeForHeaderInSection:")
    public native @ByVal CGSize getSectionHeaderReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    @Method(selector = "collectionView:layout:referenceSizeForFooterInSection:")
    public native @ByVal CGSize getSectionFooterReferenceSize(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @MachineSizedSInt long section);
    /*</methods>*/
}
