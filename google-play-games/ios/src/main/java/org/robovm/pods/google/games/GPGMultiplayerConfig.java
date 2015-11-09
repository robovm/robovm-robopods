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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPGMultiplayerConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GPGMultiplayerConfigPtr extends Ptr<GPGMultiplayerConfig, GPGMultiplayerConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GPGMultiplayerConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GPGMultiplayerConfig() {}
    protected GPGMultiplayerConfig(Handle h, long handle) { super(h, handle); }
    protected GPGMultiplayerConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "exclusiveBitMask")
    public native long getExclusiveBitMask();
    @Property(selector = "setExclusiveBitMask:")
    public native void setExclusiveBitMask(long v);
    @Property(selector = "invitedPlayerIds")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getInvitedPlayerIds();
    @Property(selector = "setInvitedPlayerIds:")
    public native void setInvitedPlayerIds(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "maxAutoMatchingPlayers")
    public native int getMaxAutoMatchingPlayers();
    @Property(selector = "setMaxAutoMatchingPlayers:")
    public native void setMaxAutoMatchingPlayers(int v);
    @Property(selector = "minAutoMatchingPlayers")
    public native int getMinAutoMatchingPlayers();
    @Property(selector = "setMinAutoMatchingPlayers:")
    public native void setMinAutoMatchingPlayers(int v);
    @Property(selector = "variant")
    public native int getVariant();
    @Property(selector = "setVariant:")
    public native void setVariant(int v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="kGPGMultiplayerVariantDefault", optional=true)
    public static native int getDefault();
    @GlobalValue(symbol="kGPGMultiplayerVariantMin", optional=true)
    public static native int getMin();
    
    
    /*</methods>*/
}
