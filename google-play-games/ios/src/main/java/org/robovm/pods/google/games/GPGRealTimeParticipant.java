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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGRealTimeParticipant/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGRealTimeParticipantPtr extends Ptr<GPGRealTimeParticipant, GPGRealTimeParticipantPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGRealTimeParticipant.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGRealTimeParticipant() {}
    protected GPGRealTimeParticipant(Handle h, long handle) { super(h, handle); }
    protected GPGRealTimeParticipant(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canCommunicate")
    public native boolean canCommunicate();
    @Property(selector = "avatarUrl")
    public native NSURL getAvatarUrl();
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "participantId")
    public native String getParticipantId();
    @Property(selector = "isAutoMatchedPlayer")
    public native boolean isAutoMatchedPlayer();
    @Property(selector = "isLocalParticipant")
    public native boolean isLocalParticipant();
    @Property(selector = "status")
    public native GPGRealTimeParticipantStatus getStatus();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "sendReliableData:")
    public native int sendReliableData(NSData data);
    @Method(selector = "sendUnreliableData:")
    public native void sendUnreliableData(NSData data);
    /*</methods>*/
}
