/*
x * Copyright (C) 2013-2015 RoboVM AB
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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFFile/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFFilePtr extends Ptr<PFFile, PFFilePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFFile.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFFile() {}
    protected PFFile(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public PFFile(NSData data) {
        super(create(data));
        retain(getHandle());
    }
    public PFFile(String name, NSData data) {
        super(create(name, data));
        retain(getHandle());
    }
    public PFFile(String name, String path) {
        super(create(name, path));
        retain(getHandle());
    }
    public PFFile(String name, NSData data, String contentType) {
        super(create(name, data, contentType));
        retain(getHandle());
    }
    public PFFile(NSData data, String contentType) {
        super(create(data, contentType));
        retain(getHandle());
    }
    /*<properties>*/
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "isDirty")
    public native boolean isDirty();
    @Property(selector = "isDataAvailable")
    public native boolean isDataAvailable();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
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
    @Method(selector = "saveInBackgroundWithProgressBlock:")
    public native BFTask<Void> saveInBackground(@Block PFProgressCallback progressBlock);
    @Method(selector = "saveInBackgroundWithBlock:")
    public native void saveInBackground(@Block PFSaveCallback block);
    @Method(selector = "saveInBackgroundWithBlock:progressBlock:")
    public native void saveInBackground(@Block PFSaveCallback block, @Block PFProgressCallback progressBlock);
    @Method(selector = "saveInBackgroundWithTarget:selector:")
    public native void saveInBackground(NSObject target, Selector selector);
    public NSData getData() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSData result = getData(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getData:")
    private native NSData getData(NSError.NSErrorPtr error);
    public NSInputStream getDataStream() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSInputStream result = getDataStream(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getDataStream:")
    private native NSInputStream getDataStream(NSError.NSErrorPtr error);
    @Method(selector = "getDataInBackground")
    public native BFTask<NSData> getDataInBackground();
    @Method(selector = "getDataInBackgroundWithProgressBlock:")
    public native BFTask<NSData> getDataInBackground(@Block PFProgressCallback progressBlock);
    @Method(selector = "getDataStreamInBackground")
    public native BFTask<NSInputStream> getDataStreamInBackground();
    @Method(selector = "getDataStreamInBackgroundWithProgressBlock:")
    public native BFTask<NSInputStream> getDataStreamInBackground(@Block PFProgressCallback progressBlock);
    @Method(selector = "getDataInBackgroundWithBlock:")
    public native void getDataInBackground(@Block PFGetDataCallback block);
    @Method(selector = "getDataStreamInBackgroundWithBlock:")
    public native void getDataStreamInBackground(@Block PFGetDataStreamCallback block);
    @Method(selector = "getDataInBackgroundWithBlock:progressBlock:")
    public native void getDataInBackground(@Block PFGetDataCallback resultBlock, @Block PFProgressCallback progressBlock);
    @Method(selector = "getDataStreamInBackgroundWithBlock:progressBlock:")
    public native void getDataStreamInBackground(@Block PFGetDataStreamCallback resultBlock, @Block PFProgressCallback progressBlock);
    @Method(selector = "getDataInBackgroundWithTarget:selector:")
    public native void getDataInBackground(NSObject target, Selector selector);
    @Method(selector = "cancel")
    public native void cancel();
    @Method(selector = "fileWithData:")
    protected static native @Pointer long create(NSData data);
    @Method(selector = "fileWithName:data:")
    protected static native @Pointer long create(String name, NSData data);
    @Method(selector = "fileWithName:contentsAtPath:")
    protected static native @Pointer long create(String name, String path);
    @Method(selector = "fileWithName:data:contentType:")
    protected static native @Pointer long create(String name, NSData data, String contentType);
    @Method(selector = "fileWithData:contentType:")
    protected static native @Pointer long create(NSData data, String contentType);
    /*</methods>*/
}
