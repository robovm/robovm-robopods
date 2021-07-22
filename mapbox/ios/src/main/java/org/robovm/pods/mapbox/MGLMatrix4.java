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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLMatrix4/*</name>*/ 
    extends /*<extends>*/Struct<MGLMatrix4>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLMatrix4Ptr extends Ptr<MGLMatrix4, MGLMatrix4Ptr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MGLMatrix4() {}
    public MGLMatrix4(double m00, double m01, double m02, double m03, double m10, double m11, double m12, double m13, double m20, double m21, double m22, double m23, double m30, double m31, double m32, double m33) {
        this.setM00(m00);
        this.setM01(m01);
        this.setM02(m02);
        this.setM03(m03);
        this.setM10(m10);
        this.setM11(m11);
        this.setM12(m12);
        this.setM13(m13);
        this.setM20(m20);
        this.setM21(m21);
        this.setM22(m22);
        this.setM23(m23);
        this.setM30(m30);
        this.setM31(m31);
        this.setM32(m32);
        this.setM33(m33);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native double getM00();
    @StructMember(0) public native MGLMatrix4 setM00(double m00);
    @StructMember(1) public native double getM01();
    @StructMember(1) public native MGLMatrix4 setM01(double m01);
    @StructMember(2) public native double getM02();
    @StructMember(2) public native MGLMatrix4 setM02(double m02);
    @StructMember(3) public native double getM03();
    @StructMember(3) public native MGLMatrix4 setM03(double m03);
    @StructMember(4) public native double getM10();
    @StructMember(4) public native MGLMatrix4 setM10(double m10);
    @StructMember(5) public native double getM11();
    @StructMember(5) public native MGLMatrix4 setM11(double m11);
    @StructMember(6) public native double getM12();
    @StructMember(6) public native MGLMatrix4 setM12(double m12);
    @StructMember(7) public native double getM13();
    @StructMember(7) public native MGLMatrix4 setM13(double m13);
    @StructMember(8) public native double getM20();
    @StructMember(8) public native MGLMatrix4 setM20(double m20);
    @StructMember(9) public native double getM21();
    @StructMember(9) public native MGLMatrix4 setM21(double m21);
    @StructMember(10) public native double getM22();
    @StructMember(10) public native MGLMatrix4 setM22(double m22);
    @StructMember(11) public native double getM23();
    @StructMember(11) public native MGLMatrix4 setM23(double m23);
    @StructMember(12) public native double getM30();
    @StructMember(12) public native MGLMatrix4 setM30(double m30);
    @StructMember(13) public native double getM31();
    @StructMember(13) public native MGLMatrix4 setM31(double m31);
    @StructMember(14) public native double getM32();
    @StructMember(14) public native MGLMatrix4 setM32(double m32);
    @StructMember(15) public native double getM33();
    @StructMember(15) public native MGLMatrix4 setM33(double m33);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
