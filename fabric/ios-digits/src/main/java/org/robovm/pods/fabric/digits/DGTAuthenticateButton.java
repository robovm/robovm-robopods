/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.digits;

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
import org.robovm.apple.addressbook.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.uikit.*;
import org.robovm.pods.fabric.twitter.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTAuthenticateButton/*</name>*/ 
    extends /*<extends>*/UIButton/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTAuthenticateButtonPtr extends Ptr<DGTAuthenticateButton, DGTAuthenticateButtonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTAuthenticateButton.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTAuthenticateButton() {}
    protected DGTAuthenticateButton(Handle h, long handle) { super(h, handle); }
    protected DGTAuthenticateButton(SkipInit skipInit) { super(skipInit); }
    public DGTAuthenticateButton(@Block VoidBlock2<DGTSession, NSError> completion) { super((Handle) null, create(completion)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "digitsAppearance")
    public native DGTAppearance getDigitsAppearance();
    @Property(selector = "setDigitsAppearance:")
    public native void setDigitsAppearance(DGTAppearance v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "buttonWithAuthenticationCompletion:")
    protected static native @Pointer long create(@Block VoidBlock2<DGTSession, NSError> completion);
    /*</methods>*/
}
