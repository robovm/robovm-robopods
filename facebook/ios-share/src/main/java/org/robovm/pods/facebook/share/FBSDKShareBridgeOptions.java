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
package org.robovm.pods.facebook.share;

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
import org.robovm.apple.photos.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/FBSDKShareBridgeOptions/*</name>*/ extends Bits</*<name>*/FBSDKShareBridgeOptions/*</name>*/> {
    /*<values>*/
    public static final FBSDKShareBridgeOptions None = new FBSDKShareBridgeOptions(0L);
    public static final FBSDKShareBridgeOptions Default = new FBSDKShareBridgeOptions(0L);
    public static final FBSDKShareBridgeOptions PhotoAsset = new FBSDKShareBridgeOptions(1L);
    public static final FBSDKShareBridgeOptions PhotoImageURL = new FBSDKShareBridgeOptions(2L);
    public static final FBSDKShareBridgeOptions VideoAsset = new FBSDKShareBridgeOptions(4L);
    public static final FBSDKShareBridgeOptions VideoData = new FBSDKShareBridgeOptions(8L);
    public static final FBSDKShareBridgeOptions WebHashtag = new FBSDKShareBridgeOptions(16L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/FBSDKShareBridgeOptions/*</name>*/[] values = _values(/*<name>*/FBSDKShareBridgeOptions/*</name>*/.class);

    public /*<name>*/FBSDKShareBridgeOptions/*</name>*/(long value) { super(value); }
    private /*<name>*/FBSDKShareBridgeOptions/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/FBSDKShareBridgeOptions/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/FBSDKShareBridgeOptions/*</name>*/(value, mask);
    }
    protected /*<name>*/FBSDKShareBridgeOptions/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/FBSDKShareBridgeOptions/*</name>*/[] values() {
        return values.clone();
    }
}
