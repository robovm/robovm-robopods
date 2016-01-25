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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/DGTContacts/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class DGTContactsPtr extends Ptr<DGTContacts, DGTContactsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(DGTContacts.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public DGTContacts() {}
    protected DGTContacts(Handle h, long handle) { super(h, handle); }
    protected DGTContacts(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithUserSession:")
    public DGTContacts(DGTSession userSession) { super((SkipInit) null); initObject(init(userSession)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithUserSession:")
    protected native @Pointer long init(DGTSession userSession);
    @Method(selector = "startContactsUploadWithCompletion:")
    public native void startContactsUpload(@Block VoidBlock2<DGTContactsUploadResult, NSError> completion);
    @Method(selector = "startContactsUploadWithTitle:completion:")
    public native void startContactsUpload(String title, @Block VoidBlock2<DGTContactsUploadResult, NSError> completion);
    @Method(selector = "startContactsUploadWithPresenterViewController:title:completion:")
    public native void startContactsUpload(UIViewController presenterViewController, String title, @Block VoidBlock2<DGTContactsUploadResult, NSError> completion);
    @Method(selector = "startContactsUploadWithDigitsAppearance:presenterViewController:title:completion:")
    public native void startContactsUpload(DGTAppearance appearance, UIViewController presenterViewController, String title, @Block VoidBlock2<DGTContactsUploadResult, NSError> completion);
    @Method(selector = "lookupContactMatchesWithCursor:completion:")
    public native void lookupContactMatches(String cursor, @Block VoidBlock3<NSArray<DGTUser>, String, NSError> completion);
    @Method(selector = "deleteAllUploadedContactsWithCompletion:")
    public native void deleteAllUploadedContacts(@Block VoidBlock1<NSError> completion);
    @Method(selector = "contactsAccessAuthorizationStatus")
    public static native DGTContactAccessAuthorizationStatus getContactsAccessAuthorizationStatus();
    /*</methods>*/
}
