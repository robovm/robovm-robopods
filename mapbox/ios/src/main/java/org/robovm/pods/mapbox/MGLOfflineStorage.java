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
package org.robovm.pods.mapbox;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLOfflineStorage/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLOfflineStoragePtr extends Ptr<MGLOfflineStorage, MGLOfflineStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLOfflineStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLOfflineStorage() {}
    protected MGLOfflineStorage(Handle h, long handle) { super(h, handle); }
    protected MGLOfflineStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "sharedOfflineStorage")
    public static native MGLOfflineStorage getSharedOfflineStorage();
    @Property(selector = "delegate")
    public native MGLOfflineStorageDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(MGLOfflineStorageDelegate v);
    @Property(selector = "packs")
    public native NSArray<MGLOfflinePack> getPacks();
    @Property(selector = "countOfBytesCompleted")
    public native long getCountOfBytesCompleted();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="MGLOfflinePackUserInfoKeyState", optional=true)
    public static native String UserInfoKeyState();
    @GlobalValue(symbol="MGLOfflinePackUserInfoKeyProgress", optional=true)
    public static native String UserInfoKeyProgress();
    @GlobalValue(symbol="MGLOfflinePackUserInfoKeyError", optional=true)
    public static native String UserInfoKeyError();
    @GlobalValue(symbol="MGLOfflinePackUserInfoKeyMaximumCount", optional=true)
    public static native String UserInfoKeyMaximumCount();
    
    @Method(selector = "addContentsOfFile:withCompletionHandler:")
    public native void addContents(String filePath, @Block VoidBlock3<NSURL, NSArray<MGLOfflinePack>, NSError> completion);
    @Method(selector = "addContentsOfURL:withCompletionHandler:")
    public native void addContents(NSURL fileURL, @Block VoidBlock3<NSURL, NSArray<MGLOfflinePack>, NSError> completion);
    @Method(selector = "addPackForRegion:withContext:completionHandler:")
    public native void addPack(MGLOfflineRegion region, NSData context, @Block VoidBlock2<MGLOfflinePack, NSError> completion);
    @Method(selector = "removePack:withCompletionHandler:")
    public native void removePack(MGLOfflinePack pack, @Block VoidBlock1<NSError> completion);
    @Method(selector = "invalidatePack:withCompletionHandler:")
    public native void invalidatePack(MGLOfflinePack pack, @Block VoidBlock1<NSError> completion);
    @Method(selector = "reloadPacks")
    public native void reloadPacks();
    @Method(selector = "setMaximumAllowedMapboxTiles:")
    public native void setMaximumAllowedMapboxTiles(long maximumCount);
    @Method(selector = "setMaximumAmbientCacheSize:withCompletionHandler:")
    public native void setMaximumAmbientCacheSize(@MachineSizedUInt long cacheSize, @Block VoidBlock1<NSError> completion);
    @Method(selector = "invalidateAmbientCacheWithCompletionHandler:")
    public native void invalidateAmbientCacheWithCompletionHandler(@Block VoidBlock1<NSError> completion);
    @Method(selector = "clearAmbientCacheWithCompletionHandler:")
    public native void clearAmbientCacheWithCompletionHandler(@Block VoidBlock1<NSError> completion);
    @Method(selector = "resetDatabaseWithCompletionHandler:")
    public native void resetDatabaseWithCompletionHandler(@Block VoidBlock1<NSError> completion);
    @Method(selector = "preloadData:forURL:modificationDate:expirationDate:eTag:mustRevalidate:")
    public native void preloadData(NSData data, NSURL url, NSDate modified, NSDate expires, String eTag, boolean mustRevalidate);
    /**
     * @deprecated Use `-preloadData:forURL:modificationDate:expirationDate:eTag:mustRevalidate:` instead
     */
    @Deprecated
    @Method(selector = "putResourceWithUrl:data:modified:expires:etag:mustRevalidate:")
    public native void putResource(NSURL url, NSData data, NSDate modified, NSDate expires, String etag, boolean mustRevalidate);
    /*</methods>*/
}
