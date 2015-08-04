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
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFQuery/*</name>*/ <T extends PFObject>
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFQueryPtr extends Ptr<PFQuery, PFQueryPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFQuery.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFQuery() {}
    protected PFQuery(SkipInit skipInit) { super(skipInit); }
    public PFQuery(String newClassName) { super((SkipInit) null); initObject(init(newClassName)); }
    /*</constructors>*/
    
    private static final long sel_query = Selector.register("query").getHandle();
    private static final long sel_queryWithPredicate$ = Selector.register("queryWithPredicate:").getHandle();
    
    @SuppressWarnings("unchecked")
    public static <T extends PFObject> PFQuery<T> getQuery(Class<T> subclass, NSPredicate predicate) {
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (predicate == null) {
            throw new NullPointerException("predicate");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        
        long cls = ObjCClass.getByType(subclass).getHandle();
        long instance = ObjCRuntime.ptr_objc_msgSend_ptr(cls, sel_queryWithPredicate$, predicate.getHandle());
        return ObjCObject.toObjCObject(PFQuery.class, instance, 0);
    }
    
    @SuppressWarnings("unchecked")
    public static <T extends PFObject> PFQuery<T> getQuery(Class<T> subclass) {
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        
        long cls = ObjCClass.getByType(subclass).getHandle();
        long instance = ObjCRuntime.ptr_objc_msgSend(cls, sel_query);
        return ObjCObject.toObjCObject(PFQuery.class, instance, 0);
    }
    
    /*<properties>*/
    @Property(selector = "parseClassName")
    public native String getParseClassName();
    @Property(selector = "setParseClassName:")
    public native void setParseClassName(String v);
    @Property(selector = "limit")
    public native @MachineSizedSInt long getLimit();
    @Property(selector = "setLimit:")
    public native void setLimit(@MachineSizedSInt long v);
    @Property(selector = "skip")
    public native @MachineSizedSInt long getSkip();
    @Property(selector = "setSkip:")
    public native void setSkip(@MachineSizedSInt long v);
    @Property(selector = "cachePolicy")
    public native PFCachePolicy getCachePolicy();
    @Property(selector = "setCachePolicy:")
    public native void setCachePolicy(PFCachePolicy v);
    @Property(selector = "maxCacheAge")
    public native double getMaxCacheAge();
    @Property(selector = "setMaxCacheAge:")
    public native void setMaxCacheAge(double v);
    @Property(selector = "trace")
    public native boolean isTrace();
    @Property(selector = "setTrace:")
    public native void setTrace(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public PFQuery<T> whereEqualTo(String key, String object) {
        return whereEqualTo(key, new NSString(object));
    }
    public PFQuery<T> whereEqualTo(String key, Number object) {
        return whereEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereEqualTo(String key, boolean object) {
        return whereEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereEqualTo(String key, T object) {
        return whereEqualTo(key, object);
    }
    public PFQuery<T> whereLessThan(String key, String object) {
        return whereLessThan(key, new NSString(object));
    }
    public PFQuery<T> whereLessThan(String key, Number object) {
        return whereLessThan(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereLessThan(String key, T object) {
        return whereLessThan(key, object);
    }
    public PFQuery<T> whereLessThanOrEqualTo(String key, String object) {
        return whereLessThanOrEqualTo(key, new NSString(object));
    }
    public PFQuery<T> whereLessThanOrEqualTo(String key, Number object) {
        return whereLessThanOrEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereLessThanOrEqualTo(String key, T object) {
        return whereLessThanOrEqualTo(key, object);
    }
    public PFQuery<T> whereGreaterThan(String key, String object) {
        return whereGreaterThan(key, new NSString(object));
    }
    public PFQuery<T> whereGreaterThan(String key, Number object) {
        return whereGreaterThan(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereGreaterThan(String key, T object) {
        return whereGreaterThan(key, object);
    }
    public PFQuery<T> whereGreaterThanOrEqualTo(String key, String object) {
        return whereGreaterThanOrEqualTo(key, new NSString(object));
    }
    public PFQuery<T> whereGreaterThanOrEqualTo(String key, Number object) {
        return whereGreaterThanOrEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereGreaterThanOrEqualTo(String key, T object) {
        return whereGreaterThanOrEqualTo(key, object);
    }
    public PFQuery<T> whereNotEqualTo(String key, String object) {
        return whereNotEqualTo(key, new NSString(object));
    }
    public PFQuery<T> whereNotEqualTo(String key, Number object) {
        return whereNotEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereNotEqualTo(String key, boolean object) {
        return whereNotEqualTo(key, NSNumber.valueOf(object));
    }
    public PFQuery<T> whereNotEqualTo(String key, T object) {
        return whereNotEqualTo(key, object);
    }
    public PFQuery<T> whereContainedIn(String key, List<String> array) {
        return whereContainedIn(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereContainedIn(String key, String...array) {
        return whereContainedIn(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereContainedIn(String key, Number...array) {
        return whereContainedIn(key, NSArray.fromNumbers(array));
    }
    public PFQuery<T> whereNotContainedIn(String key, List<String> array) {
        return whereNotContainedIn(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereNotContainedIn(String key, String...array) {
        return whereNotContainedIn(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereNotContainedIn(String key, Number...array) {
        return whereNotContainedIn(key, NSArray.fromNumbers(array));
    }
    public PFQuery<T> whereContainsAll(String key, List<String> array) {
        return whereContainsAll(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereContainsAll(String key, String...array) {
        return whereContainsAll(key, NSArray.fromStrings(array));
    }
    public PFQuery<T> whereContainsAll(String key, Number...array) {
        return whereContainsAll(key, NSArray.fromNumbers(array));
    }
    
    public void getInBackground(String objectId, PFGetCallback<T> block) {
        getInBackground0(objectId, (PFGetCallback<PFObject>) block);
    }
    public void findInBackground(PFFindCallback<T> block) {
        findInBackground0((PFFindCallback<PFObject>) block);
    }
    public void getFirstInBackground(PFGetCallback<T> block) {
        getFirstInBackground0((PFGetCallback<PFObject>) block);
    }
    /*<methods>*/
    @Method(selector = "initWithClassName:")
    protected native @Pointer long init(String newClassName);
    @Method(selector = "includeKey:")
    public native PFQuery<T> include(String key);
    @Method(selector = "selectKeys:")
    public native PFQuery<T> selectKeys(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> keys);
    @Method(selector = "whereKeyExists:")
    public native PFQuery<T> whereExists(String key);
    @Method(selector = "whereKeyDoesNotExist:")
    public native PFQuery<T> whereDoesNotExist(String key);
    @Method(selector = "whereKey:equalTo:")
    public native PFQuery<T> whereEqualTo(String key, NSObject object);
    @Method(selector = "whereKey:lessThan:")
    public native PFQuery<T> whereLessThan(String key, NSObject object);
    @Method(selector = "whereKey:lessThanOrEqualTo:")
    public native PFQuery<T> whereLessThanOrEqualTo(String key, NSObject object);
    @Method(selector = "whereKey:greaterThan:")
    public native PFQuery<T> whereGreaterThan(String key, NSObject object);
    @Method(selector = "whereKey:greaterThanOrEqualTo:")
    public native PFQuery<T> whereGreaterThanOrEqualTo(String key, NSObject object);
    @Method(selector = "whereKey:notEqualTo:")
    public native PFQuery<T> whereNotEqualTo(String key, NSObject object);
    @Method(selector = "whereKey:containedIn:")
    public native PFQuery<T> whereContainedIn(String key, NSArray<?> array);
    @Method(selector = "whereKey:notContainedIn:")
    public native PFQuery<T> whereNotContainedIn(String key, NSArray<?> array);
    @Method(selector = "whereKey:containsAllObjectsInArray:")
    public native PFQuery<T> whereContainsAll(String key, NSArray<?> array);
    @Method(selector = "whereKey:nearGeoPoint:")
    public native PFQuery<T> whereNear(String key, PFGeoPoint geopoint);
    @Method(selector = "whereKey:nearGeoPoint:withinMiles:")
    public native PFQuery<T> whereWithinMiles(String key, PFGeoPoint geopoint, double maxDistance);
    @Method(selector = "whereKey:nearGeoPoint:withinKilometers:")
    public native PFQuery<T> whereWithinKilometers(String key, PFGeoPoint geopoint, double maxDistance);
    @Method(selector = "whereKey:nearGeoPoint:withinRadians:")
    public native PFQuery<T> whereWithinRadians(String key, PFGeoPoint geopoint, double maxDistance);
    @Method(selector = "whereKey:withinGeoBoxFromSouthwest:toNortheast:")
    public native PFQuery<T> whereWithinGeoBox(String key, PFGeoPoint southwest, PFGeoPoint northeast);
    @Method(selector = "whereKey:matchesRegex:")
    public native PFQuery<T> whereMatches(String key, String regex);
    @Method(selector = "whereKey:matchesRegex:modifiers:")
    public native PFQuery<T> whereMatches(String key, String regex, String modifiers);
    @Method(selector = "whereKey:containsString:")
    public native PFQuery<T> whereContains(String key, String substring);
    @Method(selector = "whereKey:hasPrefix:")
    public native PFQuery<T> whereStartsWith(String key, String prefix);
    @Method(selector = "whereKey:hasSuffix:")
    public native PFQuery<T> whereEndsWith(String key, String suffix);
    @Method(selector = "whereKey:matchesKey:inQuery:")
    public native PFQuery<T> whereMatchesKeyInQuery(String key, String otherKey, PFQuery<?> query);
    @Method(selector = "whereKey:doesNotMatchKey:inQuery:")
    public native PFQuery<T> whereDoesNotMatchKeyInQuery(String key, String otherKey, PFQuery<?> query);
    @Method(selector = "whereKey:matchesQuery:")
    public native PFQuery<T> whereMatchesQuery(String key, PFQuery<?> query);
    @Method(selector = "whereKey:doesNotMatchQuery:")
    public native PFQuery<T> whereDoesNotMatchQuery(String key, PFQuery<?> query);
    @Method(selector = "orderByAscending:")
    public native PFQuery<T> orderByAscending(String key);
    @Method(selector = "addAscendingOrder:")
    public native PFQuery<T> addAscendingOrder(String key);
    @Method(selector = "orderByDescending:")
    public native PFQuery<T> orderByDescending(String key);
    @Method(selector = "addDescendingOrder:")
    public native PFQuery<T> addDescendingOrder(String key);
    @Method(selector = "orderBySortDescriptor:")
    public native PFQuery<T> orderBySortDescriptor(NSSortDescriptor sortDescriptor);
    @Method(selector = "orderBySortDescriptors:")
    public native PFQuery<T> orderBySortDescriptors(NSArray<NSSortDescriptor> sortDescriptors);
    public T get(String objectId) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       T result = get(objectId, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getObjectWithId:error:")
    private native T get(String objectId, NSError.NSErrorPtr error);
    @Method(selector = "getObjectInBackgroundWithId:")
    public native BFTask<T> getInBackground(String objectId);
    @Method(selector = "getObjectInBackgroundWithId:block:")
    protected native void getInBackground0(String objectId, @Block PFGetCallback<PFObject> block);
    @Method(selector = "getObjectInBackgroundWithId:target:selector:")
    public native void getInBackground(String objectId, NSObject target, Selector selector);
    public NSArray<T> find() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<T> result = find(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "findObjects:")
    private native NSArray<T> find(NSError.NSErrorPtr error);
    @Method(selector = "findObjectsInBackground")
    public native BFTask<NSArray<T>> findInBackground();
    @Method(selector = "findObjectsInBackgroundWithBlock:")
    protected native void findInBackground0(@Block PFFindCallback<PFObject> block);
    @Method(selector = "findObjectsInBackgroundWithTarget:selector:")
    public native void findInBackground(NSObject target, Selector selector);
    public T getFirst() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       T result = getFirst(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getFirstObject:")
    private native T getFirst(NSError.NSErrorPtr error);
    @Method(selector = "getFirstObjectInBackground")
    public native BFTask<T> getFirstInBackground();
    @Method(selector = "getFirstObjectInBackgroundWithBlock:")
    protected native void getFirstInBackground0(@Block PFGetCallback<PFObject> block);
    @Method(selector = "getFirstObjectInBackgroundWithTarget:selector:")
    public native void getFirstInBackground(NSObject target, Selector selector);
    public @MachineSizedSInt long count() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       long result = count(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "countObjects:")
    private native @MachineSizedSInt long count(NSError.NSErrorPtr error);
    @Method(selector = "countObjectsInBackground")
    public native BFTask<NSNumber> countInBackground();
    @Method(selector = "countObjectsInBackgroundWithBlock:")
    public native void countInBackground(@Block PFCountCallback block);
    @Method(selector = "countObjectsInBackgroundWithTarget:selector:")
    public native void countInBackground(NSObject target, Selector selector);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "hasCachedResult")
    public native boolean hasCachedResult();
    @Method(selector = "clearCachedResult")
    public native void clearCachedResult();
    @Method(selector = "fromLocalDatastore")
    public native PFQuery<T> fromLocalDatastore();
    @Method(selector = "fromPin")
    public native PFQuery<T> fromPin();
    @Method(selector = "fromPinWithName:")
    public native PFQuery<T> fromPin(String name);
    @Method(selector = "ignoreACLs")
    public native PFQuery<T> ignoreACLs();
    @Method(selector = "queryWithClassName:")
    public static native <T extends PFObject> PFQuery<T> getQuery(String className);
    @Method(selector = "queryWithClassName:predicate:")
    public static native <T extends PFObject> PFQuery<T> getQuery(String className, NSPredicate predicate);
    @Method(selector = "orQueryWithSubqueries:")
    public static native <T extends PFObject> PFQuery<T> or(NSArray<PFQuery<?>> queries);
    public static <T extends PFObject> T get(String objectClass, String objectId) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       T result = get(objectClass, objectId, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getObjectOfClass:objectId:error:")
    private static native <T extends PFObject> T get(String objectClass, String objectId, NSError.NSErrorPtr error);
    public static PFUser getUser(String objectId) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       PFUser result = getUser(objectId, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getUserObjectWithId:error:")
    private static native PFUser getUser(String objectId, NSError.NSErrorPtr error);
    @Method(selector = "clearAllCachedResults")
    public static native void clearAllCachedResults();
    /*</methods>*/
}
