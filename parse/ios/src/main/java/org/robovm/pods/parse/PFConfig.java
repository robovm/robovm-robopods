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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PFConfig/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PFConfigPtr extends Ptr<PFConfig, PFConfigPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PFConfig.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PFConfig() {}
    protected PFConfig(Handle h, long handle) { super(h, handle); }
    protected PFConfig(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    public String getString(String key) {
        return getString(key, null);
    }
    public String getString(String key, String defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSString) {
            NSString val = (NSString)data;
            return val.toString();
        }
        return defaultValue;
    } 
    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }
    public boolean getBoolean(String key, boolean defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.booleanValue();
        }
        return defaultValue;
    }
    public NSDate getDate(String key) {
        return getDate(key, null);
    }
    public NSDate getDate(String key, NSDate defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSDate) {
            NSDate val = (NSDate)data;
            return val;
        }
        return defaultValue;
    }
    public int getInt(String key) {
        return getInt(key, 0);
    }
    public int getInt(String key, int defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.intValue();
        }
        return defaultValue;
    }
    public long getLong(String key) {
        return getLong(key, 0);
    }
    public long getLong(String key, long defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.longValue();
        }
        return defaultValue;
    }
    public float getFloat(String key) {
        return getFloat(key, 0);
    }
    public float getFloat(String key, float defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.floatValue();
        }
        return defaultValue;
    }
    public double getDouble(String key) {
        return getDouble(key, 0);
    }
    public double getDouble(String key, double defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof NSNumber) {
            NSNumber val = (NSNumber)data;
            return val.doubleValue();
        }
        return defaultValue;
    }
    public PFFile getParseFile(String key) {
        return getParseFile(key, null);
    }
    public PFFile getParseFile(String key, PFFile defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof PFFile) {
            PFFile val = (PFFile)data;
            return val;
        }
        return defaultValue;
    }
    public PFGeoPoint getParseGeoPoint(String key) {
        return getParseGeoPoint(key, null);
    }
    public PFGeoPoint getParseGeoPoint(String key, PFGeoPoint defaultValue) {
        NSObject data = get(key);
        if (data != null && data instanceof PFGeoPoint) {
            PFGeoPoint val = (PFGeoPoint)data;
            return val;
        }
        return defaultValue;
    }
    /*<methods>*/
    @Method(selector = "objectForKey:")
    public native NSObject get(String key);
    @Method(selector = "currentConfig")
    public static native PFConfig getCurrentConfig();
    @Method(selector = "getConfigInBackground")
    public static native BFTask<PFConfig> getInBackground();
    @Method(selector = "getConfigInBackgroundWithBlock:")
    public static native void getInBackground(@Block PFConfigCallback block);
    public static PFConfig get() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       PFConfig result = get(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "getConfig:")
    private static native PFConfig get(NSError.NSErrorPtr error);
    /*</methods>*/
}
