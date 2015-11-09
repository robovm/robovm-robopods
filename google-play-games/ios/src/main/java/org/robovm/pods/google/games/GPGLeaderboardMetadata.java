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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGLeaderboardMetadata/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGLeaderboardMetadataPtr extends Ptr<GPGLeaderboardMetadata, GPGLeaderboardMetadataPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGLeaderboardMetadata.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGLeaderboardMetadata() {}
    protected GPGLeaderboardMetadata(Handle h, long handle) { super(h, handle); }
    protected GPGLeaderboardMetadata(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "iconUrl")
    public native NSURL getIconUrl();
    @Property(selector = "leaderboardId")
    public native String getLeaderboardId();
    @Property(selector = "order")
    public native GPGLeaderboardOrder getOrder();
    @Property(selector = "title")
    public native String getTitle();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "allMetadataWithCompletionHandler:")
    public static native void getAllMetadata(@Block GPGLeaderboardMetadataGetAllCallback completionHandler);
    @Method(selector = "allMetadataFromDataSource:completionHandler:")
    public static native void getAllMetadata(GPGDataSource dataSource, @Block GPGLeaderboardMetadataGetAllCallback completionHandler);
    @Method(selector = "metadataForLeaderboardId:completionHandler:")
    public static native void getMetadata(String leaderboardId, @Block GPGLeaderboardMetadataGetCallback completionHandler);
    @Method(selector = "metadataForLeaderboardId:dataSource:completionHandler:")
    public static native void getMetadata(String leaderboardId, GPGDataSource dataSource, @Block GPGLeaderboardMetadataGetCallback completionHandler);
    /*</methods>*/
}
