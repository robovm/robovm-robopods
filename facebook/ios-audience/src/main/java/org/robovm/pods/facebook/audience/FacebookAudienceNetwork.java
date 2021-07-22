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
package org.robovm.pods.facebook.audience;

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
import org.robovm.apple.coremedia.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FacebookAudienceNetwork/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FacebookAudienceNetwork.class); }/*</bind>*/
    /*<constants>*/
    public static final String Constant__FB_AD_SDK_VERSION = "5.1.0";
    /*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBAdExtraHintKeywordAccessories", optional=true)
    public static native String Value__FBAdExtraHintKeywordAccessories();
    @GlobalValue(symbol="FBAdExtraHintKeywordArtHistory", optional=true)
    public static native String Value__FBAdExtraHintKeywordArtHistory();
    @GlobalValue(symbol="FBAdExtraHintKeywordAutomotive", optional=true)
    public static native String Value__FBAdExtraHintKeywordAutomotive();
    @GlobalValue(symbol="FBAdExtraHintKeywordBeauty", optional=true)
    public static native String Value__FBAdExtraHintKeywordBeauty();
    @GlobalValue(symbol="FBAdExtraHintKeywordBiology", optional=true)
    public static native String Value__FBAdExtraHintKeywordBiology();
    @GlobalValue(symbol="FBAdExtraHintKeywordBoardGames", optional=true)
    public static native String Value__FBAdExtraHintKeywordBoardGames();
    @GlobalValue(symbol="FBAdExtraHintKeywordBusinessSoftware", optional=true)
    public static native String Value__FBAdExtraHintKeywordBusinessSoftware();
    @GlobalValue(symbol="FBAdExtraHintKeywordBuyingSellingHomes", optional=true)
    public static native String Value__FBAdExtraHintKeywordBuyingSellingHomes();
    @GlobalValue(symbol="FBAdExtraHintKeywordCats", optional=true)
    public static native String Value__FBAdExtraHintKeywordCats();
    @GlobalValue(symbol="FBAdExtraHintKeywordCelebrities", optional=true)
    public static native String Value__FBAdExtraHintKeywordCelebrities();
    @GlobalValue(symbol="FBAdExtraHintKeywordClothing", optional=true)
    public static native String Value__FBAdExtraHintKeywordClothing();
    @GlobalValue(symbol="FBAdExtraHintKeywordComicBooks", optional=true)
    public static native String Value__FBAdExtraHintKeywordComicBooks();
    @GlobalValue(symbol="FBAdExtraHintKeywordDesktopVideo", optional=true)
    public static native String Value__FBAdExtraHintKeywordDesktopVideo();
    @GlobalValue(symbol="FBAdExtraHintKeywordDogs", optional=true)
    public static native String Value__FBAdExtraHintKeywordDogs();
    @GlobalValue(symbol="FBAdExtraHintKeywordEducation", optional=true)
    public static native String Value__FBAdExtraHintKeywordEducation();
    @GlobalValue(symbol="FBAdExtraHintKeywordEmail", optional=true)
    public static native String Value__FBAdExtraHintKeywordEmail();
    @GlobalValue(symbol="FBAdExtraHintKeywordEntertainment", optional=true)
    public static native String Value__FBAdExtraHintKeywordEntertainment();
    @GlobalValue(symbol="FBAdExtraHintKeywordFamilyParenting", optional=true)
    public static native String Value__FBAdExtraHintKeywordFamilyParenting();
    @GlobalValue(symbol="FBAdExtraHintKeywordFashion", optional=true)
    public static native String Value__FBAdExtraHintKeywordFashion();
    @GlobalValue(symbol="FBAdExtraHintKeywordFineArt", optional=true)
    public static native String Value__FBAdExtraHintKeywordFineArt();
    @GlobalValue(symbol="FBAdExtraHintKeywordFoodDrink", optional=true)
    public static native String Value__FBAdExtraHintKeywordFoodDrink();
    @GlobalValue(symbol="FBAdExtraHintKeywordFrenchCuisine", optional=true)
    public static native String Value__FBAdExtraHintKeywordFrenchCuisine();
    @GlobalValue(symbol="FBAdExtraHintKeywordGovernment", optional=true)
    public static native String Value__FBAdExtraHintKeywordGovernment();
    @GlobalValue(symbol="FBAdExtraHintKeywordHealthFitness", optional=true)
    public static native String Value__FBAdExtraHintKeywordHealthFitness();
    @GlobalValue(symbol="FBAdExtraHintKeywordHobbies", optional=true)
    public static native String Value__FBAdExtraHintKeywordHobbies();
    @GlobalValue(symbol="FBAdExtraHintKeywordHomeGarden", optional=true)
    public static native String Value__FBAdExtraHintKeywordHomeGarden();
    @GlobalValue(symbol="FBAdExtraHintKeywordHumor", optional=true)
    public static native String Value__FBAdExtraHintKeywordHumor();
    @GlobalValue(symbol="FBAdExtraHintKeywordInternetTechnology", optional=true)
    public static native String Value__FBAdExtraHintKeywordInternetTechnology();
    @GlobalValue(symbol="FBAdExtraHintKeywordLargeAnimals", optional=true)
    public static native String Value__FBAdExtraHintKeywordLargeAnimals();
    @GlobalValue(symbol="FBAdExtraHintKeywordLaw", optional=true)
    public static native String Value__FBAdExtraHintKeywordLaw();
    @GlobalValue(symbol="FBAdExtraHintKeywordLegalIssues", optional=true)
    public static native String Value__FBAdExtraHintKeywordLegalIssues();
    @GlobalValue(symbol="FBAdExtraHintKeywordLiterature", optional=true)
    public static native String Value__FBAdExtraHintKeywordLiterature();
    @GlobalValue(symbol="FBAdExtraHintKeywordMarketing", optional=true)
    public static native String Value__FBAdExtraHintKeywordMarketing();
    @GlobalValue(symbol="FBAdExtraHintKeywordMovies", optional=true)
    public static native String Value__FBAdExtraHintKeywordMovies();
    @GlobalValue(symbol="FBAdExtraHintKeywordMusic", optional=true)
    public static native String Value__FBAdExtraHintKeywordMusic();
    @GlobalValue(symbol="FBAdExtraHintKeywordNews", optional=true)
    public static native String Value__FBAdExtraHintKeywordNews();
    @GlobalValue(symbol="FBAdExtraHintKeywordPersonalFinance", optional=true)
    public static native String Value__FBAdExtraHintKeywordPersonalFinance();
    @GlobalValue(symbol="FBAdExtraHintKeywordPets", optional=true)
    public static native String Value__FBAdExtraHintKeywordPets();
    @GlobalValue(symbol="FBAdExtraHintKeywordPhotography", optional=true)
    public static native String Value__FBAdExtraHintKeywordPhotography();
    @GlobalValue(symbol="FBAdExtraHintKeywordPolitics", optional=true)
    public static native String Value__FBAdExtraHintKeywordPolitics();
    @GlobalValue(symbol="FBAdExtraHintKeywordRealEstate", optional=true)
    public static native String Value__FBAdExtraHintKeywordRealEstate();
    @GlobalValue(symbol="FBAdExtraHintKeywordRoleplayingGames", optional=true)
    public static native String Value__FBAdExtraHintKeywordRoleplayingGames();
    @GlobalValue(symbol="FBAdExtraHintKeywordScience", optional=true)
    public static native String Value__FBAdExtraHintKeywordScience();
    @GlobalValue(symbol="FBAdExtraHintKeywordShopping", optional=true)
    public static native String Value__FBAdExtraHintKeywordShopping();
    @GlobalValue(symbol="FBAdExtraHintKeywordSociety", optional=true)
    public static native String Value__FBAdExtraHintKeywordSociety();
    @GlobalValue(symbol="FBAdExtraHintKeywordSports", optional=true)
    public static native String Value__FBAdExtraHintKeywordSports();
    @GlobalValue(symbol="FBAdExtraHintKeywordTechnology", optional=true)
    public static native String Value__FBAdExtraHintKeywordTechnology();
    @GlobalValue(symbol="FBAdExtraHintKeywordTelevision", optional=true)
    public static native String Value__FBAdExtraHintKeywordTelevision();
    @GlobalValue(symbol="FBAdExtraHintKeywordTravel", optional=true)
    public static native String Value__FBAdExtraHintKeywordTravel();
    @GlobalValue(symbol="FBAdExtraHintKeywordVideoComputerGames", optional=true)
    public static native String Value__FBAdExtraHintKeywordVideoComputerGames();
    @GlobalValue(symbol="FBAdOptionsViewWidth", optional=true)
    public static native @MachineSizedFloat double Value__FBAdOptionsViewWidth();
    @GlobalValue(symbol="FBAdOptionsViewHeight", optional=true)
    public static native @MachineSizedFloat double Value__FBAdOptionsViewHeight();
    @GlobalValue(symbol="FBAudienceNetworkMediaViewErrorDomain", optional=true)
    public static native String Value__FBAudienceNetworkMediaViewErrorDomain();
    /*</methods>*/
}
