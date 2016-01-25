/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.fabric.mopub;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPClientAdPositioning/*</name>*/ 
    extends /*<extends>*/MPAdPositioning/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPClientAdPositioningPtr extends Ptr<MPClientAdPositioning, MPClientAdPositioningPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPClientAdPositioning.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPClientAdPositioning() {}
    protected MPClientAdPositioning(Handle h, long handle) { super(h, handle); }
    protected MPClientAdPositioning(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addFixedIndexPath:")
    public native void addFixedIndexPath(NSIndexPath indexPath);
    @Method(selector = "enableRepeatingPositionsWithInterval:")
    public native void enableRepeatingPositions(@MachineSizedUInt long interval);
    @Method(selector = "positioning")
    public static native MPClientAdPositioning getPositioning();
    /*</methods>*/
}
