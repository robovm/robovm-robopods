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
package org.robovm.pods.google.games;

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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGSnapshotMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGSnapshotMetadataPtr extends Ptr<GPGSnapshotMetadata, GPGSnapshotMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGSnapshotMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGSnapshotMetadata() {}
    protected GPGSnapshotMetadata(Handle h, long handle) { super(h, handle); }
    protected GPGSnapshotMetadata(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fileName")
    public native String getFileName();
    @Property(selector = "snapshotDescription")
    public native String getSnapshotDescription();
    @Property(selector = "lastModifiedTimestamp")
    public native long getLastModifiedTimestamp();
    @Property(selector = "playedTime")
    public native long getPlayedTime();
    @Property(selector = "progressValue")
    public native long getProgressValue();
    @Property(selector = "coverImageUrl")
    public native NSURL getCoverImageUrl();
    @Property(selector = "isOpen")
    public native boolean isOpen();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "commitWithMetadataChange:data:completionHandler:")
    public native void commit(GPGSnapshotMetadataChange metadataChange, NSData data, @Block GPGSnapshotMetadataCommitCallback completionHandler);
    @Method(selector = "resolveWithMetadataChange:conflictId:data:completionHandler:")
    public native void resolve(GPGSnapshotMetadataChange metadataChange, String conflictId, NSData data, @Block GPGSnapshotMetadataCommitCallback completionHandler);
    @Method(selector = "readWithCompletionHandler:")
    public native void read(@Block GPGSnapshotMetadataReadCallback completionHandler);
    @Method(selector = "deleteWithCompletionHandler:")
    public native void delete(@Block GPGSnapshotMetadataDeleteCallback completionHandler);
    @Method(selector = "listWithCompletionHandler:")
    public static native void getAll(@Block GPGSnapshotMetadataGetAllCallback completionHandler);
    @Method(selector = "openWithFileName:conflictPolicy:completionHandler:")
    public static native void open(String fileName, GPGSnapshotConflictPolicy conflictPolicy, @Block GPGSnapshotMetadataOpenCallback completionHandler);
    /*</methods>*/
}
