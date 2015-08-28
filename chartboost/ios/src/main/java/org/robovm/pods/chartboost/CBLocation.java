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
package org.robovm.pods.chartboost;

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
import org.robovm.apple.storekit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CBLocation/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CBLocation/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CBLocation/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CBLocation toObject(Class<CBLocation> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CBLocation.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CBLocation o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<CBLocation> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CBLocation> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CBLocation.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CBLocation> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (CBLocation o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CBLocation Startup = new CBLocation("Startup");
    public static final CBLocation HomeScreen = new CBLocation("HomeScreen");
    public static final CBLocation MainMenu = new CBLocation("MainMenu");
    public static final CBLocation GameScreen = new CBLocation("GameScreen");
    public static final CBLocation Achievements = new CBLocation("Achievements");
    public static final CBLocation Quests = new CBLocation("Quests");
    public static final CBLocation Pause = new CBLocation("Pause");
    public static final CBLocation LevelStart = new CBLocation("LevelStart");
    public static final CBLocation LevelComplete = new CBLocation("LevelComplete");
    public static final CBLocation TurnComplete = new CBLocation("TurnComplete");
    public static final CBLocation IAPStore = new CBLocation("IAPStore");
    public static final CBLocation ItemStore = new CBLocation("ItemStore");
    public static final CBLocation GameOver = new CBLocation("GameOver");
    public static final CBLocation LeaderBoard = new CBLocation("LeaderBoard");
    public static final CBLocation Settings = new CBLocation("Settings");
    public static final CBLocation Quit = new CBLocation("Quit");
    public static final CBLocation Default = new CBLocation("Default");
    /*</constants>*/
    
    private static /*<name>*/CBLocation/*</name>*/[] values = new /*<name>*/CBLocation/*</name>*/[] {/*<value_list>*/Startup, HomeScreen, MainMenu, GameScreen, Achievements, Quests, Pause, LevelStart, LevelComplete, TurnComplete, IAPStore, ItemStore, GameOver, LeaderBoard, Settings, Quit, Default/*</value_list>*/};
    
    /*<name>*/CBLocation/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CBLocation/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/CBLocation/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CBLocation/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library(Library.INTERNAL) @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="CBLocationStartup", optional=true)
        public static native NSString Startup();
        @GlobalValue(symbol="CBLocationHomeScreen", optional=true)
        public static native NSString HomeScreen();
        @GlobalValue(symbol="CBLocationMainMenu", optional=true)
        public static native NSString MainMenu();
        @GlobalValue(symbol="CBLocationGameScreen", optional=true)
        public static native NSString GameScreen();
        @GlobalValue(symbol="CBLocationAchievements", optional=true)
        public static native NSString Achievements();
        @GlobalValue(symbol="CBLocationQuests", optional=true)
        public static native NSString Quests();
        @GlobalValue(symbol="CBLocationPause", optional=true)
        public static native NSString Pause();
        @GlobalValue(symbol="CBLocationLevelStart", optional=true)
        public static native NSString LevelStart();
        @GlobalValue(symbol="CBLocationLevelComplete", optional=true)
        public static native NSString LevelComplete();
        @GlobalValue(symbol="CBLocationTurnComplete", optional=true)
        public static native NSString TurnComplete();
        @GlobalValue(symbol="CBLocationIAPStore", optional=true)
        public static native NSString IAPStore();
        @GlobalValue(symbol="CBLocationItemStore", optional=true)
        public static native NSString ItemStore();
        @GlobalValue(symbol="CBLocationGameOver", optional=true)
        public static native NSString GameOver();
        @GlobalValue(symbol="CBLocationLeaderBoard", optional=true)
        public static native NSString LeaderBoard();
        @GlobalValue(symbol="CBLocationSettings", optional=true)
        public static native NSString Settings();
        @GlobalValue(symbol="CBLocationQuit", optional=true)
        public static native NSString Quit();
        @GlobalValue(symbol="CBLocationDefault", optional=true)
        public static native NSString Default();
        /*</values>*/
    }
}
