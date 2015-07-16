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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/GPGRealTimeRoomDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "didAcceptRealTimeInviteForRoom:")
    void didAcceptRealTimeInvite(GPGRealTimeRoomData roomData);
    @Method(selector = "didDeclineRealTimeInviteForRoom:")
    void didDeclineRealTimeInvite(GPGRealTimeRoomData roomData);
    @Method(selector = "didReceiveRealTimeInviteForRoom:")
    void didReceiveRealTimeInvite(GPGRealTimeRoomData roomData);
    @Method(selector = "room:didChangeStatus:")
    void didChangeStatus(GPGRealTimeRoom room, GPGRealTimeRoomStatus status);
    @Method(selector = "room:didChangeConnectedSet:")
    void didChangeConnectedSet(GPGRealTimeRoom room, boolean connected);
    @Method(selector = "room:participant:didChangeStatus:")
    void didChangeParticipantStatus(GPGRealTimeRoom room, GPGRealTimeParticipant participant, GPGRealTimeParticipantStatus status);
    @Method(selector = "room:didReceiveData:fromParticipant:dataMode:")
    void didReceiveData(GPGRealTimeRoom room, NSData data, GPGRealTimeParticipant participant, GPGRealTimeDataMode dataMode);
    @Method(selector = "room:didSendReliableId:results:")
    void didSendReliableMessage(GPGRealTimeRoom room, int reliableId, NSArray<GPGRealTimeReliableMessageResult> results);
    @Method(selector = "room:didFailWithError:")
    void didFail(GPGRealTimeRoom room, NSError error);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
