/*
 * Copyright (c) 2015, RoboVM AB. All Rights Reserved.
 *
 * Redistribution and use is subject to the RoboVM Software License terms
 * available at (http://robovm.com)
 *
 * This notice and attribution to RoboVM AB may not be removed.
 */
package org.robovm.pods.parse.ui;

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
import org.robovm.pods.bolts.*;
import org.robovm.pods.parse.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PFSignUpViewAccessibilityIdentifier toObject(Class<PFSignUpViewAccessibilityIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PFSignUpViewAccessibilityIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PFSignUpViewAccessibilityIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PFSignUpViewAccessibilityIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PFSignUpViewAccessibilityIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PFSignUpViewAccessibilityIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PFSignUpViewAccessibilityIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PFSignUpViewAccessibilityIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final PFSignUpViewAccessibilityIdentifier UsernameField = new PFSignUpViewAccessibilityIdentifier("UsernameField");
    public static final PFSignUpViewAccessibilityIdentifier EmailField = new PFSignUpViewAccessibilityIdentifier("EmailField");
    public static final PFSignUpViewAccessibilityIdentifier PasswordField = new PFSignUpViewAccessibilityIdentifier("PasswordField");
    public static final PFSignUpViewAccessibilityIdentifier AdditionalField = new PFSignUpViewAccessibilityIdentifier("AdditionalField");
    public static final PFSignUpViewAccessibilityIdentifier SignUpButton = new PFSignUpViewAccessibilityIdentifier("SignUpButton");
    public static final PFSignUpViewAccessibilityIdentifier DismissButton = new PFSignUpViewAccessibilityIdentifier("DismissButton");
    /*</constants>*/
    
    private static /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/[] values = new /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/[] {/*<value_list>*/UsernameField, EmailField, PasswordField, AdditionalField, SignUpButton, DismissButton/*</value_list>*/};
    
    /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PFSignUpViewAccessibilityIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="PFSignUpViewUsernameFieldAccessibilityIdentifier", optional=true)
        public static native NSString UsernameField();
        @GlobalValue(symbol="PFSignUpViewEmailFieldAccessibilityIdentifier", optional=true)
        public static native NSString EmailField();
        @GlobalValue(symbol="PFSignUpViewPasswordFieldAccessibilityIdentifier", optional=true)
        public static native NSString PasswordField();
        @GlobalValue(symbol="PFSignUpViewAdditionalFieldAccessibilityIdentifier", optional=true)
        public static native NSString AdditionalField();
        @GlobalValue(symbol="PFSignUpViewSignUpButtonAccessibilityIdentifier", optional=true)
        public static native NSString SignUpButton();
        @GlobalValue(symbol="PFSignUpViewDismissButtonAccessibilityIdentifier", optional=true)
        public static native NSString DismissButton();
        /*</values>*/
    }
}
