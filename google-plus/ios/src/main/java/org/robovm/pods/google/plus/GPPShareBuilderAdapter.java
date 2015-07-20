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
package org.robovm.pods.google.plus;

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
import org.robovm.pods.google.opensource.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GPPShareBuilderAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements GPPShareBuilder/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("setURLToShare:")
    public GPPShareBuilder setURLToShare(NSURL urlToShare) { return null; }
    @NotImplemented("setPrefillText:")
    public GPPShareBuilder setPrefillText(String prefillText) { return null; }
    @NotImplemented("setTitle:description:thumbnailURL:")
    public GPPShareBuilder setContent(String title, String description, NSURL thumbnailURL) { return null; }
    @NotImplemented("setContentDeepLinkID:")
    public GPPShareBuilder setContentDeepLinkID(String contentDeepLinkID) { return null; }
    @NotImplemented("setCallToActionButtonWithLabel:URL:deepLinkID:")
    public GPPShareBuilder setCallToActionButton(String label, NSURL url, String deepLinkID) { return null; }
    @NotImplemented("open")
    public boolean open() { return false; }
    /*</methods>*/
}
