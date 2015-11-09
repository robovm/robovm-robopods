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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGSnapshotMetadataChange/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGSnapshotMetadataChangePtr extends Ptr<GPGSnapshotMetadataChange, GPGSnapshotMetadataChangePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGSnapshotMetadataChange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGSnapshotMetadataChange() {}
    protected GPGSnapshotMetadataChange(Handle h, long handle) { super(h, handle); }
    protected GPGSnapshotMetadataChange(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "snapshotDescription")
    public native String getSnapshotDescription();
    @Property(selector = "setSnapshotDescription:")
    public native void setSnapshotDescription(String v);
    @Property(selector = "playedTime")
    public native long getPlayedTime();
    @Property(selector = "setPlayedTime:")
    public native void setPlayedTime(long v);
    @Property(selector = "progressValue")
    public native long getProgressValue();
    @Property(selector = "setProgressValue:")
    public native void setProgressValue(long v);
    @Property(selector = "coverImage")
    public native GPGSnapshotMetadataChangeCoverImage getCoverImage();
    @Property(selector = "setCoverImage:")
    public native void setCoverImage(GPGSnapshotMetadataChangeCoverImage v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
