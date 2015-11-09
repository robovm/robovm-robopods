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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGRealTimeRoom/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGRealTimeRoomPtr extends Ptr<GPGRealTimeRoom, GPGRealTimeRoomPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGRealTimeRoom.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGRealTimeRoom() {}
    protected GPGRealTimeRoom(Handle h, long handle) { super(h, handle); }
    protected GPGRealTimeRoom(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "config")
    public native GPGMultiplayerConfig getConfig();
    @Property(selector = "participants")
    public native NSArray<GPGRealTimeParticipant> getParticipants();
    @Property(selector = "connectedParticipants")
    public native NSArray<GPGRealTimeParticipant> getConnectedParticipants();
    @Property(selector = "localParticipant")
    public native GPGRealTimeParticipant getLocalParticipant();
    @Property(selector = "roomDescription")
    public native String getRoomDescription();
    @Property(selector = "roomID")
    public native String getRoomID();
    @Property(selector = "inConnectedSet")
    public native boolean isInConnectedSet();
    @Property(selector = "creationDetails")
    public native GPGRealTimeRoomModifyDetails getCreationDetails();
    @Property(selector = "status")
    public native GPGRealTimeRoomStatus getStatus();
    @Property(selector = "waitEstimateSeconds")
    public native NSNumber getWaitEstimateSeconds();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGPGRealTimeMinPlayers", optional=true)
    public static native int getMinPlayers();
    @GlobalValue(symbol="kGPGRealTimeMaxPlayers", optional=true)
    public static native int getMaxPlayers();
    @GlobalValue(symbol="kGPGRealTimeInvalidReliableSendId", optional=true)
    public static native int getInvalidReliableSendId();
    
    @Method(selector = "findParticipantById:")
    public native GPGRealTimeParticipant findParticipantById(String participantId);
    @Method(selector = "enumerateParticipantsUsingBlock:")
    public native void enumerateParticipants(@Block GPGRealTimeParticipantIterator iterator);
    @Method(selector = "enumerateOtherParticipantsUsingBlock:")
    public native void enumerateOtherParticipants(@Block GPGRealTimeParticipantIterator iterator);
    @Method(selector = "enumerateConnectedParticipantsUsingBlock:")
    public native void enumerateConnectedParticipants(@Block GPGRealTimeParticipantIterator iterator);
    @Method(selector = "sendReliableData:toParticipants:")
    public native int sendReliableData(NSData data, NSArray<GPGRealTimeParticipant> participants);
    @Method(selector = "sendUnreliableData:toParticipants:")
    public native void sendUnreliableData(NSData data, NSArray<GPGRealTimeParticipant> participants);
    @Method(selector = "sendReliableDataToAll:")
    public native int sendReliableDataToAll(NSData data);
    @Method(selector = "sendUnreliableDataToAll:")
    public native void sendUnreliableDataToAll(NSData data);
    @Method(selector = "sendReliableDataToOthers:")
    public native int sendReliableDataToOthers(NSData data);
    @Method(selector = "sendUnreliableDataToOthers:")
    public native void sendUnreliableDataToOthers(NSData data);
    @Method(selector = "leave")
    public native void leave();
    /*</methods>*/
}
