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
package org.robovm.pods.google.opensource;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusPerson/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusPersonPtr extends Ptr<GTLPlusPerson, GTLPlusPersonPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusPerson.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusPerson() {}
    protected GTLPlusPerson(Handle h, long handle) { super(h, handle); }
    protected GTLPlusPerson(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    
    public boolean isPlusUser() {
        return getIsPlusUser().booleanValue();
    }
    public void setPlusUser(boolean v) {
        setIsPlusUser(NSNumber.valueOf(v));
    }
    /*<properties>*/
    @Property(selector = "aboutMe")
    public native String getAboutMe();
    @Property(selector = "setAboutMe:")
    public native void setAboutMe(String v);
    @Property(selector = "ageRange")
    public native GTLPlusPersonAgeRange getAgeRange();
    @Property(selector = "setAgeRange:")
    public native void setAgeRange(GTLPlusPersonAgeRange v);
    @Property(selector = "birthday")
    public native String getBirthday();
    @Property(selector = "setBirthday:")
    public native void setBirthday(String v);
    @Property(selector = "braggingRights")
    public native String getBraggingRights();
    @Property(selector = "setBraggingRights:")
    public native void setBraggingRights(String v);
    @Property(selector = "circledByCount")
    public native NSNumber getCircledByCount();
    @Property(selector = "setCircledByCount:")
    public native void setCircledByCount(NSNumber v);
    @Property(selector = "cover")
    public native GTLPlusPersonCover getCover();
    @Property(selector = "setCover:")
    public native void setCover(GTLPlusPersonCover v);
    @Property(selector = "currentLocation")
    public native String getCurrentLocation();
    @Property(selector = "setCurrentLocation:")
    public native void setCurrentLocation(String v);
    @Property(selector = "displayName")
    public native String getDisplayName();
    @Property(selector = "setDisplayName:")
    public native void setDisplayName(String v);
    @Property(selector = "domain")
    public native String getDomain();
    @Property(selector = "setDomain:")
    public native void setDomain(String v);
    @Property(selector = "emails")
    public native NSArray<GTLPlusPersonEmailsItem> getEmails();
    @Property(selector = "setEmails:")
    public native void setEmails(NSArray<GTLPlusPersonEmailsItem> v);
    @Property(selector = "ETag")
    public native String getETag();
    @Property(selector = "setETag:")
    public native void setETag(String v);
    @Property(selector = "gender")
    public native String getGender();
    @Property(selector = "setGender:")
    public native void setGender(String v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "image")
    public native GTLPlusPersonImage getImage();
    @Property(selector = "setImage:")
    public native void setImage(GTLPlusPersonImage v);
    @Property(selector = "isPlusUser")
    private native NSNumber getIsPlusUser();
    @Property(selector = "setIsPlusUser:")
    private native void setIsPlusUser(NSNumber v);
    @Property(selector = "kind")
    public native String getKind();
    @Property(selector = "setKind:")
    public native void setKind(String v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "name")
    public native GTLPlusPersonName getName();
    @Property(selector = "setName:")
    public native void setName(GTLPlusPersonName v);
    @Property(selector = "nickname")
    public native String getNickname();
    @Property(selector = "setNickname:")
    public native void setNickname(String v);
    @Property(selector = "objectType")
    public native String getObjectType();
    @Property(selector = "setObjectType:")
    public native void setObjectType(String v);
    @Property(selector = "occupation")
    public native String getOccupation();
    @Property(selector = "setOccupation:")
    public native void setOccupation(String v);
    @Property(selector = "organizations")
    public native NSArray<GTLPlusPersonOrganizationsItem> getOrganizations();
    @Property(selector = "setOrganizations:")
    public native void setOrganizations(NSArray<GTLPlusPersonOrganizationsItem> v);
    @Property(selector = "placesLived")
    public native NSArray<GTLPlusPersonPlacesLivedItem> getPlacesLived();
    @Property(selector = "setPlacesLived:")
    public native void setPlacesLived(NSArray<GTLPlusPersonPlacesLivedItem> v);
    @Property(selector = "plusOneCount")
    public native NSNumber getPlusOneCount();
    @Property(selector = "setPlusOneCount:")
    public native void setPlusOneCount(NSNumber v);
    @Property(selector = "relationshipStatus")
    public native String getRelationshipStatus();
    @Property(selector = "setRelationshipStatus:")
    public native void setRelationshipStatus(String v);
    @Property(selector = "skills")
    public native String getSkills();
    @Property(selector = "setSkills:")
    public native void setSkills(String v);
    @Property(selector = "tagline")
    public native String getTagline();
    @Property(selector = "setTagline:")
    public native void setTagline(String v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "urls")
    public native NSArray<GTLPlusPersonUrlsItem> getUrls();
    @Property(selector = "setUrls:")
    public native void setUrls(NSArray<GTLPlusPersonUrlsItem> v);
    @Property(selector = "verified")
    public native NSNumber getVerified();
    @Property(selector = "setVerified:")
    public native void setVerified(NSNumber v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
