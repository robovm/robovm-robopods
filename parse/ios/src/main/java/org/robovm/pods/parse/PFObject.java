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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFObject/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {
    
    private static final long sel_registerSubclass = Selector.register("registerSubclass").getHandle();
    private static final long sel_object = Selector.register("object").getHandle();
    private static final long sel_objectWithoutDataWithObjectId$ = Selector.register("objectWithoutDataWithObjectId:").getHandle();
    private static final long sel_parseClassName = Selector.register("parseClassName").getHandle();
    private static final long name_PFSubclassing = VM.getStringUTFChars("PFSubclassing");
    private static final long typeEncodings_parseClassName = VM.getStringUTFChars("v@:");
    
    private static final java.lang.reflect.Method cbParseClassName;
    
    static {
        try {
            cbParseClassName = PFObject.class.getDeclaredMethod("parseClassName", ObjCClass.class, Long.TYPE);
        } catch (Throwable e) {
            throw new Error(e);
        }
    }
    
    public static void registerSubclass(Class<? extends PFObject> subclass) {
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        
        long cls = ObjCClass.getByType(subclass).getHandle();
        ObjCRuntime.class_addProtocol(cls, ObjCRuntime.objc_getProtocol(name_PFSubclassing));
        long method = VM.getCallbackMethodImpl(cbParseClassName);
        ObjCRuntime.class_addMethod(ObjCRuntime.object_getClass(cls), sel_parseClassName, method, typeEncodings_parseClassName);
        ObjCRuntime.void_objc_msgSend(cls, sel_registerSubclass);
    }
    
    public static <T extends PFObject> T create(Class<T> subclass) {
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        
        long cls = ObjCClass.getByType(subclass).getHandle();
        long instance = ObjCRuntime.ptr_objc_msgSend(cls, sel_object);
        return ObjCObject.toObjCObject(subclass, instance, 0);
    }
    
    public static <T extends PFObject> T createWithoutData(Class<T> subclass, String objectId) {
        if (subclass == null) {
            throw new NullPointerException("subclass");
        }
        if (objectId == null) {
            throw new NullPointerException("objectId");
        }
        if (!subclass.isAnnotationPresent(ParseClassName.class)) {
            throw new UnsupportedOperationException("Class is missing required @ParseClassName annotation: " + subclass.getSimpleName());
        }
        
        long cls = ObjCClass.getByType(subclass).getHandle();
        long instance = ObjCRuntime.ptr_objc_msgSend_ptr(cls, sel_objectWithoutDataWithObjectId$, new NSString(objectId).getHandle());
        return ObjCObject.toObjCObject(subclass, instance, 0);
    }

    @Callback
    private static String parseClassName(ObjCClass self, @Pointer long selector) {
        Class<?> clazz = self.getType();
        ParseClassName annotation = clazz.getAnnotation(ParseClassName.class);
        return annotation.value();
    }
    
    /*<ptr>*/public static class PFObjectPtr extends Ptr<PFObject, PFObjectPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFObject.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFObject() {}
    protected PFObject(SkipInit skipInit) { super(skipInit); }
    public PFObject(String newClassName) { super((SkipInit) null); initObject(init(newClassName)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "parseClassName")
    public native String getParseClassName();
    @Property(selector = "objectId")
    public native String getObjectId();
    @Property(selector = "setObjectId:")
    public native void setObjectId(String v);
    @Property(selector = "updatedAt")
    public native NSDate getUpdatedAt();
    @Property(selector = "createdAt")
    public native NSDate getCreatedAt();
    @Property(selector = "ACL")
    public native PFACL getACL();
    @Property(selector = "setACL:")
    public native void setACL(PFACL v);
    /*</properties>*/
    /*<members>*//*</members>*/
    public void put(String key, NSObject object) {
        if (object == null) {
            object = NSNull.getNull();
        }
        put0(object, key);
    }
    public void put(String key, String object) {
        put(key, new NSString(object));
    }
    public void put(String key, Number object) {
        put(key, NSNumber.valueOf(object));
    }
    public <T extends PFObject> void put(String key, T object) {
        put0(object, key);
    }
    public void add(String key, NSObject object) {
        if (object == null) {
            object = NSNull.getNull();
        }
        add0(object, key);
    }
    public void add(String key, String object) {
        add(key, new NSString(object));
    }
    public void add(String key, Number object) {
        add(key, NSNumber.valueOf(object));
    }
    public <T extends PFObject> void add(String key, T object) {
        add0(object, key);
    }
    public void addAll(String key, NSArray<?> objects) {
        addAll0(objects, key);
    }
    public void addAll(String key, String...objects) {
        addAll(key, NSArray.fromStrings(objects));
    }
    public void addAll(String key, Number...objects) {
        addAll(key, NSArray.fromNumbers(objects));
    }
    public void addUnique(String key, NSObject object) {
        if (object == null) {
            object = NSNull.getNull();
        }
        addUnique0(object, key);
    }
    public void addUnique(String key, String object) {
        addUnique(key, new NSString(object));
    }
    public void addUnique(String key, Number object) {
        addUnique(key, NSNumber.valueOf(object));
    }
    public <T extends PFObject >void addUnique(String key, T object) {
        addUnique0(object, key);
    }
    public void addAllUnique(String key, NSArray<?> objects) {
        addAllUnique0(objects, key);
    }
    public void addAllUnique(String key, String...objects) {
        addAllUnique(key, NSArray.fromStrings(objects));
    }
    public void addAllUnique(String key, Number...objects) {
        addAllUnique(key, NSArray.fromNumbers(objects));
    }
    public void remove(String key, NSObject object) {
        if (object == null) {
            object = NSNull.getNull();
        }
        remove0(object, key);
    }
    public void remove(String key, String object) {
        remove(key, new NSString(object));
    }
    public void remove(String key, Number object) {
        remove(key, NSNumber.valueOf(object));
    }
    public <T extends PFObject> void remove(String key, T object) {
        remove0(object, key);
    }
    public void removeAll(String key, NSArray<?> objects) {
        removeAll0(objects, key);
    }
    public void removeAll(String key, String...objects) {
        removeAll(key, NSArray.fromStrings(objects));
    }
    public void removeAll(String key, Number...objects) {
        removeAll(key, NSArray.fromNumbers(objects));
    }
    public void increment(String key, Number amount) {
        increment(key, NSNumber.valueOf(amount));
    }
    
    public boolean getBoolean(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.booleanValue();
        }
        return false;
    }
    public int getInt(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.intValue();
        }
        return 0;
    }
    public long getLong(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.longValue();
        }
        return 0;
    }
    public float getFloat(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.floatValue();
        }
        return 0;
    }
    public double getDouble(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.doubleValue();
        }
        return 0;
    }
    public String getString(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSString) {
            NSString val = (NSString)data;
            return val.toString();
        }
        return null;
    }
    public NSDate getDate(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof NSDate) {
            NSDate val = (NSDate)data;
            return val;
        }
        return null;
    }
    public PFFile getParseFile(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof PFFile) {
            PFFile val = (PFFile)data;
            return val;
        }
        return null;
    }
    public PFGeoPoint getParseGeoPoint(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof PFGeoPoint) {
            PFGeoPoint val = (PFGeoPoint)data;
            return val;
        }
        return null;
    }
    public PFObject getParseObject(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof PFObject) {
            PFObject val = (PFObject)data;
            return val;
        }
        return null;
    }
    public PFUser getParseUser(String key) {
        NSObject data = get(key);
        if (data != null && data instanceof PFUser) {
            PFUser val = (PFUser)data;
            return val;
        }
        return null;
    }
    
    public <T extends PFObject> void fetchInBackground(PFGetCallback<T> block) {
        fetchInBackground0((PFGetCallback<PFObject>) block);
    }
    public <T extends PFObject> void fetchIfNeededInBackground(PFGetCallback<T> block) {
        fetchIfNeededInBackground0((PFGetCallback<PFObject>) block);
    }
    public <T extends PFObject> void fetchFromLocalDatastoreInBackground(PFGetCallback<T> block) {
        fetchFromLocalDatastoreInBackground0((PFGetCallback<PFObject>) block);
    }
    
    public static <T extends PFObject> void fetchAllInBackground(NSArray<T> objects, PFFindCallback<T> block) {
        fetchAllInBackground0(objects, (PFFindCallback<PFObject>)block);
    }
    public static <T extends PFObject> void fetchAllIfNeededInBackground(NSArray<T> objects, PFFindCallback<T> block) {
        fetchAllIfNeededInBackground0(objects, (PFFindCallback<PFObject>)block);
    }
    
    /*<methods>*/
    @GlobalValue(symbol="PFObjectDefaultPin", optional=true)
    public static native String getDefaultPin();
    
    @Method(selector = "initWithClassName:")
    protected native @Pointer long init(String newClassName);
    @Method(selector = "allKeys")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> keys();
    @Method(selector = "objectForKey:")
    public native NSObject get(String key);
    @Method(selector = "setObject:forKey:")
    private native void put0(NSObject object, String key);
    @Method(selector = "removeObjectForKey:")
    public native void remove(String key);
    @Method(selector = "relationForKey:")
    public native <T extends PFObject> PFRelation<T> getRelation(String key);
    @Method(selector = "addObject:forKey:")
    private native void add0(NSObject object, String key);
    @Method(selector = "addObjectsFromArray:forKey:")
    private native void addAll0(NSArray<?> objects, String key);
    @Method(selector = "addUniqueObject:forKey:")
    private native void addUnique0(NSObject object, String key);
    @Method(selector = "addUniqueObjectsFromArray:forKey:")
    private native void addAllUnique0(NSArray<?> objects, String key);
    @Method(selector = "removeObject:forKey:")
    private native void remove0(NSObject object, String key);
    @Method(selector = "removeObjectsInArray:forKey:")
    private native void removeAll0(NSArray<?> objects, String key);
    @Method(selector = "incrementKey:")
    public native void increment(String key);
    @Method(selector = "incrementKey:byAmount:")
    public native void increment(String key, NSNumber amount);
    public boolean save() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = save(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "save:")
    private native boolean save(NSError.NSErrorPtr error);
    @Method(selector = "saveInBackground")
    public native BFTask<Void> saveInBackground();
    @Method(selector = "saveInBackgroundWithBlock:")
    public native void saveInBackground(@Block PFSaveCallback block);
    @Method(selector = "saveInBackgroundWithTarget:selector:")
    public native void saveInBackground(NSObject target, Selector selector);
    @Method(selector = "saveEventually")
    public native BFTask<Void> saveEventually();
    @Method(selector = "saveEventually:")
    public native void saveEventually(@Block PFSaveCallback callback);
    @Method(selector = "isDataAvailable")
    public native boolean isDataAvailable();
    public void fetch() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       fetch(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "fetch:")
    private native void fetch(NSError.NSErrorPtr error);
    public <T extends PFObject> T fetchIfNeeded() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       T result = fetchIfNeeded(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "fetchIfNeeded:")
    private native <T extends PFObject> T fetchIfNeeded(NSError.NSErrorPtr error);
    @Method(selector = "fetchInBackground")
    public native <T extends PFObject> BFTask<T> fetchInBackground();
    @Method(selector = "fetchInBackgroundWithBlock:")
    protected native void fetchInBackground0(@Block PFGetCallback<PFObject> block);
    @Method(selector = "fetchInBackgroundWithTarget:selector:")
    public native void fetchInBackground(NSObject target, Selector selector);
    @Method(selector = "fetchIfNeededInBackground")
    public native <T extends PFObject> BFTask<T> fetchIfNeededInBackground();
    @Method(selector = "fetchIfNeededInBackgroundWithBlock:")
    protected native void fetchIfNeededInBackground0(@Block PFGetCallback<PFObject> block);
    @Method(selector = "fetchIfNeededInBackgroundWithTarget:selector:")
    public native void fetchIfNeededInBackground(NSObject target, Selector selector);
    public void fetchFromLocalDatastore() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       fetchFromLocalDatastore(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "fetchFromLocalDatastore:")
    private native void fetchFromLocalDatastore(NSError.NSErrorPtr error);
    @Method(selector = "fetchFromLocalDatastoreInBackground")
    public native <T extends PFObject> BFTask<T> fetchFromLocalDatastoreInBackground();
    @Method(selector = "fetchFromLocalDatastoreInBackgroundWithBlock:")
    protected native void fetchFromLocalDatastoreInBackground0(@Block PFGetCallback<PFObject> block);
    public boolean delete() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = delete(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "delete:")
    private native boolean delete(NSError.NSErrorPtr error);
    @Method(selector = "deleteInBackground")
    public native BFTask<Void> deleteInBackground();
    @Method(selector = "deleteInBackgroundWithBlock:")
    public native void deleteInBackground(@Block PFDeleteCallback block);
    @Method(selector = "deleteInBackgroundWithTarget:selector:")
    public native void deleteInBackground(NSObject target, Selector selector);
    @Method(selector = "deleteEventually")
    public native BFTask<Void> deleteEventually();
    @Method(selector = "isDirty")
    public native boolean isDirty();
    @Method(selector = "isDirtyForKey:")
    public native boolean isDirty(String key);
    public boolean pin() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = pin(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "pin:")
    private native boolean pin(NSError.NSErrorPtr error);
    public boolean pin(String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = pin(name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "pinWithName:error:")
    private native boolean pin(String name, NSError.NSErrorPtr error);
    @Method(selector = "pinInBackground")
    public native BFTask<Void> pinInBackground();
    @Method(selector = "pinInBackgroundWithBlock:")
    public native void pinInBackground(@Block PFSaveCallback block);
    @Method(selector = "pinInBackgroundWithName:")
    public native BFTask<Void> pinInBackground(String name);
    @Method(selector = "pinInBackgroundWithName:block:")
    public native void pinInBackground(String name, @Block PFSaveCallback block);
    public boolean unpin() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpin(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpin:")
    private native boolean unpin(NSError.NSErrorPtr error);
    public boolean unpin(String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpin(name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpinWithName:error:")
    private native boolean unpin(String name, NSError.NSErrorPtr error);
    @Method(selector = "unpinInBackground")
    public native BFTask<Void> unpinInBackground();
    @Method(selector = "unpinInBackgroundWithBlock:")
    public native void unpinInBackground(@Block PFSaveCallback block);
    @Method(selector = "unpinInBackgroundWithName:")
    public native BFTask<Void> unpinInBackground(String name);
    @Method(selector = "unpinInBackgroundWithName:block:")
    public native void unpinInBackground(String name, @Block PFSaveCallback block);
    @Method(selector = "objectWithClassName:")
    public static native PFObject create(String className);
    @Method(selector = "objectWithoutDataWithClassName:objectId:")
    public static native PFObject createWithoutData(String className, String objectId);
    @Method(selector = "objectWithClassName:dictionary:")
    public static native PFObject create(String className, NSDictionary<?, ?> dictionary);
    public static <T extends PFObject> boolean saveAll(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = saveAll(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "saveAll:error:")
    private static native <T extends PFObject> boolean saveAll(NSArray<T> objects, NSError.NSErrorPtr error);
    @Method(selector = "saveAllInBackground:")
    public static native <T extends PFObject> BFTask<Void> saveAllInBackground(NSArray<T> objects);
    @Method(selector = "saveAllInBackground:block:")
    public static native <T extends PFObject> void saveAllInBackground(NSArray<T> objects, @Block PFSaveCallback block);
    @Method(selector = "saveAllInBackground:target:selector:")
    public static native <T extends PFObject> void saveAllInBackground(NSArray<T> objects, NSObject target, Selector selector);
    public static <T extends PFObject> boolean deleteAll(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = deleteAll(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "deleteAll:error:")
    private static native <T extends PFObject> boolean deleteAll(NSArray<T> objects, NSError.NSErrorPtr error);
    @Method(selector = "deleteAllInBackground:")
    public static native <T extends PFObject> BFTask<Void> deleteAllInBackground(NSArray<T> objects);
    @Method(selector = "deleteAllInBackground:block:")
    public static native <T extends PFObject> void deleteAllInBackground(NSArray<?> objects, @Block PFDeleteCallback block);
    @Method(selector = "deleteAllInBackground:target:selector:")
    public static native <T extends PFObject> void deleteAllInBackground(NSArray<T> objects, NSObject target, Selector selector);
    public static <T extends PFObject> void fetchAll(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       fetchAll(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "fetchAll:error:")
    private static native <T extends PFObject> void fetchAll(NSArray<T> objects, NSError.NSErrorPtr error);
    public static <T extends PFObject> void fetchAllIfNeeded(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       fetchAllIfNeeded(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    @Method(selector = "fetchAllIfNeeded:error:")
    private static native <T extends PFObject> void fetchAllIfNeeded(NSArray<T> objects, NSError.NSErrorPtr error);
    @Method(selector = "fetchAllInBackground:")
    public static native <T extends PFObject> BFTask<NSArray<T>> fetchAllInBackground(NSArray<T> objects);
    @Method(selector = "fetchAllInBackground:block:")
    protected static native <T extends PFObject> void fetchAllInBackground0(NSArray<T> objects, @Block PFFindCallback<PFObject> block);
    @Method(selector = "fetchAllInBackground:target:selector:")
    public static native <T extends PFObject> void fetchAllInBackground(NSArray<T> objects, NSObject target, Selector selector);
    @Method(selector = "fetchAllIfNeededInBackground:")
    public static native <T extends PFObject> BFTask<NSArray<T>> fetchAllIfNeededInBackground(NSArray<T> objects);
    @Method(selector = "fetchAllIfNeededInBackground:block:")
    protected static native <T extends PFObject> void fetchAllIfNeededInBackground0(NSArray<T> objects, @Block PFFindCallback<PFObject> block);
    @Method(selector = "fetchAllIfNeededInBackground:target:selector:")
    public static native <T extends PFObject> void fetchAllIfNeededInBackground(NSArray<T> objects, NSObject target, Selector selector);
    public static <T extends PFObject> boolean pinAll(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = pinAll(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "pinAll:error:")
    private static native <T extends PFObject> boolean pinAll(NSArray<T> objects, NSError.NSErrorPtr error);
    public static <T extends PFObject> boolean pinAll(NSArray<T> objects, String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = pinAll(objects, name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "pinAll:withName:error:")
    private static native <T extends PFObject> boolean pinAll(NSArray<T> objects, String name, NSError.NSErrorPtr error);
    @Method(selector = "pinAllInBackground:")
    public static native <T extends PFObject> BFTask<Void> pinAllInBackground(NSArray<T> objects);
    @Method(selector = "pinAllInBackground:block:")
    public static native <T extends PFObject> void pinAllInBackground(NSArray<T> objects, @Block PFSaveCallback block);
    @Method(selector = "pinAllInBackground:withName:")
    public static native <T extends PFObject> void pinAllInBackground(NSArray<T> objects, String name);
    @Method(selector = "pinAllInBackground:withName:block:")
    public static native <T extends PFObject> void pinAllInBackground(NSArray<T> objects, String name, @Block PFSaveCallback block);
    public static boolean unpinAll() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpinAll(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpinAllObjects:")
    private static native boolean unpinAll(NSError.NSErrorPtr error);
    public static boolean unpinAll(String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpinAll(name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpinAllObjectsWithName:error:")
    private static native boolean unpinAll(String name, NSError.NSErrorPtr error);
    @Method(selector = "unpinAllObjectsInBackground")
    public static native BFTask<Void> unpinAllInBackground();
    @Method(selector = "unpinAllObjectsInBackgroundWithBlock:")
    public static native void unpinAllInBackground(@Block PFSaveCallback block);
    @Method(selector = "unpinAllObjectsInBackgroundWithName:")
    public static native BFTask<Void> unpinAllInBackground(String name);
    @Method(selector = "unpinAllObjectsInBackgroundWithName:block:")
    public static native void unpinAllInBackground(String name, @Block PFSaveCallback block);
    public static <T extends PFObject> boolean unpinAll(NSArray<T> objects) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpinAll(objects, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpinAll:error:")
    private static native <T extends PFObject> boolean unpinAll(NSArray<T> objects, NSError.NSErrorPtr error);
    public static <T extends PFObject> boolean unpinAll(NSArray<T> objects, String name) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unpinAll(objects, name, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unpinAll:withName:error:")
    private static native <T extends PFObject> boolean unpinAll(NSArray<T> objects, String name, NSError.NSErrorPtr error);
    @Method(selector = "unpinAllInBackground:")
    public static native <T extends PFObject> BFTask<Void> unpinAllInBackground(NSArray<T> objects);
    @Method(selector = "unpinAllInBackground:block:")
    public static native <T extends PFObject> void unpinAllInBackground(NSArray<T> objects, @Block PFSaveCallback block);
    @Method(selector = "unpinAllInBackground:withName:")
    public static native <T extends PFObject> BFTask<Void> unpinAllInBackground(NSArray<T> objects, String name);
    @Method(selector = "unpinAllInBackground:withName:block:")
    public static native <T extends PFObject> void unpinAllInBackground(NSArray<T> objects, String name, @Block PFSaveCallback block);
    /*</methods>*/
}
