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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGRealTimeRoomMaker/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGRealTimeRoomMakerPtr extends Ptr<GPGRealTimeRoomMaker, GPGRealTimeRoomMakerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGRealTimeRoomMaker.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGRealTimeRoomMaker() {}
    protected GPGRealTimeRoomMaker(Handle h, long handle) { super(h, handle); }
    protected GPGRealTimeRoomMaker(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public static GPGRealTimeRoomCreationHandle createRoomWithHandle(GPGMultiplayerConfig config) {
        GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr ptr = new GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr();
        GPGRealTimeRoomCreationResult result = createRoom0(config, ptr);
        GPGRealTimeRoomCreationHandle r = ptr.get();
        r.setResult(result);
        return r;
    }
    public static GPGRealTimeRoomCreationHandle joinRoomWithHandle(GPGRealTimeRoomData data) {
        GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr ptr = new GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr();
        GPGRealTimeRoomCreationResult result = joinRoom0(data, ptr);
        GPGRealTimeRoomCreationHandle r = ptr.get();
        r.setResult(result);
        return r;
    }
    /*<methods>*/
    @Method(selector = "createRoomFromConfig:")
    public static native GPGRealTimeRoomCreationResult createRoom(GPGMultiplayerConfig config);
    @Method(selector = "createRoomFromConfig:operationHandle:")
    protected static native GPGRealTimeRoomCreationResult createRoom0(GPGMultiplayerConfig config, GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr handle);
    @Method(selector = "joinRoomFromData:")
    public static native GPGRealTimeRoomCreationResult joinRoom(GPGRealTimeRoomData data);
    @Method(selector = "joinRoomFromData:operationHandle:")
    protected static native GPGRealTimeRoomCreationResult joinRoom0(GPGRealTimeRoomData data, GPGRealTimeRoomCreationHandle.GPGRealTimeRoomCreationHandlePtr handle);
    @Method(selector = "listRoomsWithMaxResults:completionHandler:")
    public static native void getAllRooms(int maxResults, @Block GPGRoomGetAllCallback completionHandler);
    @Method(selector = "getRoomWithId:completionHandler:")
    public static native void getRoom(String roomId, @Block GPGRoomRequestCallback completionHandler);
    @Method(selector = "getRoomFromData:completionHandler:")
    public static native void getRoom(GPGRealTimeRoomData roomData, @Block GPGRoomRequestCallback completionHandler);
    @Method(selector = "declineRoomFromData:completionHandler:")
    public static native void declineRoom(GPGRealTimeRoomData data, @Block GPGRoomRequestCallback completionHandler);
    @Method(selector = "dismissRoomFromData:completionHandler:")
    public static native void dismissRoom(GPGRealTimeRoomData data, @Block GPGRoomDismissCallback completionHandler);
    @Method(selector = "activeRoom")
    public static native GPGRealTimeRoom getActiveRoom();
    /*</methods>*/
}
