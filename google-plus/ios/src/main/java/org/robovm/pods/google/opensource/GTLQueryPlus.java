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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GTLQueryPlus/*</name>*/ 
    extends /*<extends>*/GTLQuery/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GTLQueryPlusPtr extends Ptr<GTLQueryPlus, GTLQueryPlusPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GTLQueryPlus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GTLQueryPlus() {}
    protected GTLQueryPlus(Handle h, long handle) { super(h, handle); }
    protected GTLQueryPlus(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "fields")
    public native String getFields();
    @Property(selector = "setFields:")
    public native void setFields(String v);
    @Property(selector = "activityId")
    public native String getActivityId();
    @Property(selector = "setActivityId:")
    public native void setActivityId(String v);
    @Property(selector = "collection")
    public native String getCollection();
    @Property(selector = "setCollection:")
    public native void setCollection(String v);
    @Property(selector = "commentId")
    public native String getCommentId();
    @Property(selector = "setCommentId:")
    public native void setCommentId(String v);
    @Property(selector = "debug")
    public native boolean isDebug();
    @Property(selector = "setDebug:")
    public native void setDebug(boolean v);
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "setIdentifier:")
    public native void setIdentifier(String v);
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "setLanguage:")
    public native void setLanguage(String v);
    @Property(selector = "maxResults")
    public native @MachineSizedUInt long getMaxResults();
    @Property(selector = "setMaxResults:")
    public native void setMaxResults(@MachineSizedUInt long v);
    @Property(selector = "orderBy")
    public native String getOrderBy();
    @Property(selector = "setOrderBy:")
    public native void setOrderBy(String v);
    @Property(selector = "pageToken")
    public native String getPageToken();
    @Property(selector = "setPageToken:")
    public native void setPageToken(String v);
    @Property(selector = "query")
    public native String getQuery();
    @Property(selector = "setQuery:")
    public native void setQuery(String v);
    @Property(selector = "sortOrder")
    public native String getSortOrder();
    @Property(selector = "setSortOrder:")
    public native void setSortOrder(String v);
    @Property(selector = "targetUrl")
    public native String getTargetUrl();
    @Property(selector = "setTargetUrl:")
    public native void setTargetUrl(String v);
    @Property(selector = "type")
    public native String getType();
    @Property(selector = "setType:")
    public native void setType(String v);
    @Property(selector = "userId")
    public native String getUserId();
    @Property(selector = "setUserId:")
    public native void setUserId(String v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "queryForActivitiesGetWithActivityId:")
    public static native GTLQueryPlus getActivities(String activityId);
    @Method(selector = "queryForActivitiesListWithUserId:collection:")
    public static native GTLQueryPlus listActivities(String userId, String collection);
    @Method(selector = "queryForActivitiesSearchWithQuery:")
    public static native GTLQueryPlus searchActivities(String query);
    @Method(selector = "queryForCommentsGetWithCommentId:")
    public static native GTLQueryPlus getComments(String commentId);
    @Method(selector = "queryForCommentsListWithActivityId:")
    public static native GTLQueryPlus listComments(String activityId);
    @Method(selector = "queryForMomentsInsertWithObject:userId:collection:")
    public static native GTLQueryPlus insertMoments(GTLPlusMoment object, String userId, String collection);
    @Method(selector = "queryForMomentsListWithUserId:collection:")
    public static native GTLQueryPlus listMoments(String userId, String collection);
    @Method(selector = "queryForMomentsRemoveWithIdentifier:")
    public static native GTLQueryPlus removeMoments(String identifier);
    @Method(selector = "queryForPeopleGetWithUserId:")
    public static native GTLQueryPlus getPeople(String userId);
    @Method(selector = "queryForPeopleListWithUserId:collection:")
    public static native GTLQueryPlus listPeople(String userId, String collection);
    @Method(selector = "queryForPeopleListByActivityWithActivityId:collection:")
    public static native GTLQueryPlus listPeopleByActivity(String activityId, String collection);
    @Method(selector = "queryForPeopleSearchWithQuery:")
    public static native GTLQueryPlus searchPeople(String query);
    /*</methods>*/
}
