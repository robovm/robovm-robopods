/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.parse;

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
import org.robovm.apple.corelocation.*;
import org.robovm.apple.storekit.*;
import org.robovm.pods.bolts.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/ParseMutableClientConfiguration/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "applicationId")
    String getApplicationId();
    @Property(selector = "setApplicationId:")
    void setApplicationId(String v);
    @Property(selector = "clientKey")
    String getClientKey();
    @Property(selector = "setClientKey:")
    void setClientKey(String v);
    @Property(selector = "server")
    String getServer();
    @Property(selector = "setServer:")
    void setServer(String v);
    @Availability({ @PlatformVersion(platform = Platform.iOS), @PlatformVersion(platform = Platform.watchOS) })
    @Property(selector = "isLocalDatastoreEnabled")
    boolean isLocalDatastoreEnabled();
    @Availability({ @PlatformVersion(platform = Platform.iOS), @PlatformVersion(platform = Platform.watchOS) })
    @Property(selector = "setLocalDatastoreEnabled:")
    void setLocalDatastoreEnabled(boolean v);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Property(selector = "applicationGroupIdentifier")
    String getApplicationGroupIdentifier();
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Property(selector = "setApplicationGroupIdentifier:")
    void setApplicationGroupIdentifier(String v);
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Property(selector = "containingApplicationBundleIdentifier")
    String getContainingApplicationBundleIdentifier();
    @Availability({ @PlatformVersion(platform = Platform.iOS) })
    @Property(selector = "setContainingApplicationBundleIdentifier:")
    void setContainingApplicationBundleIdentifier(String v);
    @Property(selector = "networkRetryAttempts")
    @MachineSizedUInt long getNetworkRetryAttempts();
    @Property(selector = "setNetworkRetryAttempts:")
    void setNetworkRetryAttempts(@MachineSizedUInt long v);
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
