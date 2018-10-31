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
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLOfflinePackProgress/*</name>*/ 
    extends /*<extends>*/Struct<MGLOfflinePackProgress>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLOfflinePackProgressPtr extends Ptr<MGLOfflinePackProgress, MGLOfflinePackProgressPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLOfflinePackProgress() {}
    public MGLOfflinePackProgress(long countOfResourcesCompleted, long countOfBytesCompleted, long countOfTilesCompleted, long countOfTileBytesCompleted, long countOfResourcesExpected, long maximumResourcesExpected) {
        this.setCountOfResourcesCompleted(countOfResourcesCompleted);
        this.setCountOfBytesCompleted(countOfBytesCompleted);
        this.setCountOfTilesCompleted(countOfTilesCompleted);
        this.setCountOfTileBytesCompleted(countOfTileBytesCompleted);
        this.setCountOfResourcesExpected(countOfResourcesExpected);
        this.setMaximumResourcesExpected(maximumResourcesExpected);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native long getCountOfResourcesCompleted();
    @StructMember(0) public native MGLOfflinePackProgress setCountOfResourcesCompleted(long countOfResourcesCompleted);
    @StructMember(1) public native long getCountOfBytesCompleted();
    @StructMember(1) public native MGLOfflinePackProgress setCountOfBytesCompleted(long countOfBytesCompleted);
    @StructMember(2) public native long getCountOfTilesCompleted();
    @StructMember(2) public native MGLOfflinePackProgress setCountOfTilesCompleted(long countOfTilesCompleted);
    @StructMember(3) public native long getCountOfTileBytesCompleted();
    @StructMember(3) public native MGLOfflinePackProgress setCountOfTileBytesCompleted(long countOfTileBytesCompleted);
    @StructMember(4) public native long getCountOfResourcesExpected();
    @StructMember(4) public native MGLOfflinePackProgress setCountOfResourcesExpected(long countOfResourcesExpected);
    @StructMember(5) public native long getMaximumResourcesExpected();
    @StructMember(5) public native MGLOfflinePackProgress setMaximumResourcesExpected(long maximumResourcesExpected);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
