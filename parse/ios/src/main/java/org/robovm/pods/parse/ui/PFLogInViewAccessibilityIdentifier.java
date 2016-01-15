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
@Marshaler(/*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static PFLogInViewAccessibilityIdentifier toObject(Class<PFLogInViewAccessibilityIdentifier> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return PFLogInViewAccessibilityIdentifier.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(PFLogInViewAccessibilityIdentifier o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<PFLogInViewAccessibilityIdentifier> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<PFLogInViewAccessibilityIdentifier> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(PFLogInViewAccessibilityIdentifier.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<PFLogInViewAccessibilityIdentifier> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (PFLogInViewAccessibilityIdentifier o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final PFLogInViewAccessibilityIdentifier UsernameField = new PFLogInViewAccessibilityIdentifier("UsernameField");
    public static final PFLogInViewAccessibilityIdentifier PasswordField = new PFLogInViewAccessibilityIdentifier("PasswordField");
    public static final PFLogInViewAccessibilityIdentifier LogInButton = new PFLogInViewAccessibilityIdentifier("LogInButton");
    public static final PFLogInViewAccessibilityIdentifier SignUpButton = new PFLogInViewAccessibilityIdentifier("SignUpButton");
    public static final PFLogInViewAccessibilityIdentifier PasswordForgottenButton = new PFLogInViewAccessibilityIdentifier("PasswordForgottenButton");
    public static final PFLogInViewAccessibilityIdentifier TwitterButton = new PFLogInViewAccessibilityIdentifier("TwitterButton");
    public static final PFLogInViewAccessibilityIdentifier FacebookButton = new PFLogInViewAccessibilityIdentifier("FacebookButton");
    public static final PFLogInViewAccessibilityIdentifier DismissButton = new PFLogInViewAccessibilityIdentifier("DismissButton");
    /*</constants>*/
    
    private static /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/[] values = new /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/[] {/*<value_list>*/UsernameField, PasswordField, LogInButton, SignUpButton, PasswordForgottenButton, TwitterButton, FacebookButton, DismissButton/*</value_list>*/};
    
    /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/PFLogInViewAccessibilityIdentifier/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="PFLogInViewUsernameFieldAccessibilityIdentifier", optional=true)
        public static native NSString UsernameField();
        @GlobalValue(symbol="PFLogInViewPasswordFieldAccessibilityIdentifier", optional=true)
        public static native NSString PasswordField();
        @GlobalValue(symbol="PFLogInViewLogInButtonAccessibilityIdentifier", optional=true)
        public static native NSString LogInButton();
        @GlobalValue(symbol="PFLogInViewSignUpButtonAccessibilityIdentifier", optional=true)
        public static native NSString SignUpButton();
        @GlobalValue(symbol="PFLogInViewPasswordForgottenButtonAccessibilityIdentifier", optional=true)
        public static native NSString PasswordForgottenButton();
        @GlobalValue(symbol="PFLogInViewTwitterButtonAccessibilityIdentifier", optional=true)
        public static native NSString TwitterButton();
        @GlobalValue(symbol="PFLogInViewFacebookButtonAccessibilityIdentifier", optional=true)
        public static native NSString FacebookButton();
        @GlobalValue(symbol="PFLogInViewDismissButtonAccessibilityIdentifier", optional=true)
        public static native NSString DismissButton();
        /*</values>*/
    }
}
