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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLPlusItemScope/*</name>*/ 
    extends /*<extends>*/GTLObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLPlusItemScopePtr extends Ptr<GTLPlusItemScope, GTLPlusItemScopePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLPlusItemScope.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLPlusItemScope() {}
    protected GTLPlusItemScope(Handle h, long handle) { super(h, handle); }
    protected GTLPlusItemScope(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "about")
    public native GTLPlusItemScope getAbout();
    @Property(selector = "setAbout:")
    public native void setAbout(GTLPlusItemScope v);
    @Property(selector = "additionalName")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> getAdditionalName();
    @Property(selector = "setAdditionalName:")
    public native void setAdditionalName(@org.robovm.rt.bro.annotation.Marshaler(NSArray.AsStringListMarshaler.class) List<String> v);
    @Property(selector = "address")
    public native GTLPlusItemScope getAddress();
    @Property(selector = "setAddress:")
    public native void setAddress(GTLPlusItemScope v);
    @Property(selector = "addressCountry")
    public native String getAddressCountry();
    @Property(selector = "setAddressCountry:")
    public native void setAddressCountry(String v);
    @Property(selector = "addressLocality")
    public native String getAddressLocality();
    @Property(selector = "setAddressLocality:")
    public native void setAddressLocality(String v);
    @Property(selector = "addressRegion")
    public native String getAddressRegion();
    @Property(selector = "setAddressRegion:")
    public native void setAddressRegion(String v);
    @Property(selector = "associatedMedia")
    public native NSArray<GTLPlusItemScope> getAssociatedMedia();
    @Property(selector = "setAssociatedMedia:")
    public native void setAssociatedMedia(NSArray<GTLPlusItemScope> v);
    @Property(selector = "attendeeCount")
    public native NSNumber getAttendeeCount();
    @Property(selector = "setAttendeeCount:")
    public native void setAttendeeCount(NSNumber v);
    @Property(selector = "attendees")
    public native NSArray<GTLPlusItemScope> getAttendees();
    @Property(selector = "setAttendees:")
    public native void setAttendees(NSArray<GTLPlusItemScope> v);
    @Property(selector = "audio")
    public native GTLPlusItemScope getAudio();
    @Property(selector = "setAudio:")
    public native void setAudio(GTLPlusItemScope v);
    @Property(selector = "author")
    public native NSArray<GTLPlusItemScope> getAuthor();
    @Property(selector = "setAuthor:")
    public native void setAuthor(NSArray<GTLPlusItemScope> v);
    @Property(selector = "bestRating")
    public native String getBestRating();
    @Property(selector = "setBestRating:")
    public native void setBestRating(String v);
    @Property(selector = "birthDate")
    public native String getBirthDate();
    @Property(selector = "setBirthDate:")
    public native void setBirthDate(String v);
    @Property(selector = "byArtist")
    public native GTLPlusItemScope getByArtist();
    @Property(selector = "setByArtist:")
    public native void setByArtist(GTLPlusItemScope v);
    @Property(selector = "caption")
    public native String getCaption();
    @Property(selector = "setCaption:")
    public native void setCaption(String v);
    @Property(selector = "contentSize")
    public native String getContentSize();
    @Property(selector = "setContentSize:")
    public native void setContentSize(String v);
    @Property(selector = "contentUrl")
    public native String getContentUrl();
    @Property(selector = "setContentUrl:")
    public native void setContentUrl(String v);
    @Property(selector = "contributor")
    public native NSArray<GTLPlusItemScope> getContributor();
    @Property(selector = "setContributor:")
    public native void setContributor(NSArray<GTLPlusItemScope> v);
    @Property(selector = "dateCreated")
    public native String getDateCreated();
    @Property(selector = "setDateCreated:")
    public native void setDateCreated(String v);
    @Property(selector = "dateModified")
    public native String getDateModified();
    @Property(selector = "setDateModified:")
    public native void setDateModified(String v);
    @Property(selector = "datePublished")
    public native String getDatePublished();
    @Property(selector = "setDatePublished:")
    public native void setDatePublished(String v);
    @Property(selector = "descriptionProperty")
    public native String getDescriptionProperty();
    @Property(selector = "setDescriptionProperty:")
    public native void setDescriptionProperty(String v);
    @Property(selector = "duration")
    public native String getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(String v);
    @Property(selector = "embedUrl")
    public native String getEmbedUrl();
    @Property(selector = "setEmbedUrl:")
    public native void setEmbedUrl(String v);
    @Property(selector = "endDate")
    public native String getEndDate();
    @Property(selector = "setEndDate:")
    public native void setEndDate(String v);
    @Property(selector = "familyName")
    public native String getFamilyName();
    @Property(selector = "setFamilyName:")
    public native void setFamilyName(String v);
    @Property(selector = "gender")
    public native String getGender();
    @Property(selector = "setGender:")
    public native void setGender(String v);
    @Property(selector = "geo")
    public native GTLPlusItemScope getGeo();
    @Property(selector = "setGeo:")
    public native void setGeo(GTLPlusItemScope v);
    @Property(selector = "givenName")
    public native String getGivenName();
    @Property(selector = "setGivenName:")
    public native void setGivenName(String v);
    @Property(selector = "height")
    public native String getHeight();
    @Property(selector = "setHeight:")
    public native void setHeight(String v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "image")
    public native String getImage();
    @Property(selector = "setImage:")
    public native void setImage(String v);
    @Property(selector = "inAlbum")
    public native GTLPlusItemScope getInAlbum();
    @Property(selector = "setInAlbum:")
    public native void setInAlbum(GTLPlusItemScope v);
    @Property(selector = "kind")
    public native String getKind();
    @Property(selector = "setKind:")
    public native void setKind(String v);
    @Property(selector = "latitude")
    public native NSNumber getLatitude();
    @Property(selector = "setLatitude:")
    public native void setLatitude(NSNumber v);
    @Property(selector = "location")
    public native GTLPlusItemScope getLocation();
    @Property(selector = "setLocation:")
    public native void setLocation(GTLPlusItemScope v);
    @Property(selector = "longitude")
    public native NSNumber getLongitude();
    @Property(selector = "setLongitude:")
    public native void setLongitude(NSNumber v);
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "partOfTVSeries")
    public native GTLPlusItemScope getPartOfTVSeries();
    @Property(selector = "setPartOfTVSeries:")
    public native void setPartOfTVSeries(GTLPlusItemScope v);
    @Property(selector = "performers")
    public native NSArray<GTLPlusItemScope> getPerformers();
    @Property(selector = "setPerformers:")
    public native void setPerformers(NSArray<GTLPlusItemScope> v);
    @Property(selector = "playerType")
    public native String getPlayerType();
    @Property(selector = "setPlayerType:")
    public native void setPlayerType(String v);
    @Property(selector = "postalCode")
    public native String getPostalCode();
    @Property(selector = "setPostalCode:")
    public native void setPostalCode(String v);
    @Property(selector = "postOfficeBoxNumber")
    public native String getPostOfficeBoxNumber();
    @Property(selector = "setPostOfficeBoxNumber:")
    public native void setPostOfficeBoxNumber(String v);
    @Property(selector = "ratingValue")
    public native String getRatingValue();
    @Property(selector = "setRatingValue:")
    public native void setRatingValue(String v);
    @Property(selector = "reviewRating")
    public native GTLPlusItemScope getReviewRating();
    @Property(selector = "setReviewRating:")
    public native void setReviewRating(GTLPlusItemScope v);
    @Property(selector = "startDate")
    public native String getStartDate();
    @Property(selector = "setStartDate:")
    public native void setStartDate(String v);
    @Property(selector = "streetAddress")
    public native String getStreetAddress();
    @Property(selector = "setStreetAddress:")
    public native void setStreetAddress(String v);
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "thumbnail")
    public native GTLPlusItemScope getThumbnail();
    @Property(selector = "setThumbnail:")
    public native void setThumbnail(GTLPlusItemScope v);
    @Property(selector = "thumbnailUrl")
    public native String getThumbnailUrl();
    @Property(selector = "setThumbnailUrl:")
    public native void setThumbnailUrl(String v);
    @Property(selector = "tickerSymbol")
    public native String getTickerSymbol();
    @Property(selector = "setTickerSymbol:")
    public native void setTickerSymbol(String v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "url")
    public native String getUrl();
    @Property(selector = "setUrl:")
    public native void setUrl(String v);
    @Property(selector = "width")
    public native String getWidth();
    @Property(selector = "setWidth:")
    public native void setWidth(String v);
    @Property(selector = "worstRating")
    public native String getWorstRating();
    @Property(selector = "setWorstRating:")
    public native void setWorstRating(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
