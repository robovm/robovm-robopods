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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ParseClientConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class ParseClientConfigurationPtr extends Ptr<ParseClientConfiguration, ParseClientConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(ParseClientConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public ParseClientConfiguration() {}
    protected ParseClientConfiguration(Handle h, long handle) { super(h, handle); }
    protected ParseClientConfiguration(SkipInit skipInit) { super(skipInit); }
    public ParseClientConfiguration(@Block VoidBlock1<ParseMutableClientConfiguration> configurationBlock) { super((Handle) null, create(configurationBlock)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "applicationId")
    public native String getApplicationId();
    @Property(selector = "clientKey")
    public native String getClientKey();
    @Property(selector = "server")
    public native String getServer();
    @Property(selector = "isLocalDatastoreEnabled")
    public native boolean isLocalDatastoreEnabled();
    @Property(selector = "applicationGroupIdentifier")
    public native String getApplicationGroupIdentifier();
    @Property(selector = "containingApplicationBundleIdentifier")
    public native String getContainingApplicationBundleIdentifier();
    @Property(selector = "networkRetryAttempts")
    public native @MachineSizedUInt long getNetworkRetryAttempts();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "configurationWithBlock:")
    protected static native @Pointer long create(@Block VoidBlock1<ParseMutableClientConfiguration> configurationBlock);
    /*</methods>*/
}
