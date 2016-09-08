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
package org.robovm.pods.fabric.answers;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/Answers/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AnswersPtr extends Ptr<Answers, AnswersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(Answers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public Answers() {}
    protected Answers(Handle h, long handle) { super(h, handle); }
    protected Answers(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    private static void checkEventNotNull(AnswersEvent<?> event) {
        if (event == null) {
            throw new NullPointerException("event must not be null");
        }
    }
    
    public static void logSignUp(SignUpEvent event) {
        checkEventNotNull(event);
        logSignUp0(event.signUpMethod, event.signUpSucceeded, event.customAttributes);
    }
    public static void logLogin(LoginEvent event) {
        checkEventNotNull(event);
        logLogin0(event.loginMethod, event.loginSucceeded, event.customAttributes);
    }
    public static void logShare(ShareEvent event) {
        checkEventNotNull(event);
        logShare0(event.shareMethod, event.contentName, event.contentType, event.contentId, event.customAttributes);
    }
    public static void logInvite(InviteEvent event) {
        checkEventNotNull(event);
        logInvite0(event.inviteMethod, event.customAttributes);
    }
    public static void logPurchase(PurchaseEvent event) {
        checkEventNotNull(event);
        logPurchase0(event.itemPrice, event.currency, event.purchaseSucceeded, event.itemName, event.itemType, event.itemId, event.customAttributes);
    }
    public static void logLevelStart(LevelStartEvent event) {
        checkEventNotNull(event);
        logLevelStart0(event.levelName, event.customAttributes);
    }
    public static void logLevelEnd(LevelEndEvent event) {
        checkEventNotNull(event);
        logLevelEnd0(event.levelName, event.score, event.levelCompletedSuccesfully, event.customAttributes);
    }
    public static void logAddToCart(AddToCartEvent event) {
        checkEventNotNull(event);
        logAddToCart0(event.itemPrice, event.currency, event.itemName, event.itemType, event.itemId, event.customAttributes);
    }
    public static void logStartCheckout(StartCheckoutEvent event) {
        checkEventNotNull(event);
        logStartCheckout0(event.totalPrice, event.currency, event.itemCount, event.customAttributes);
    }
    public static void logRating(RatingEvent event) {
        checkEventNotNull(event);
        logRating0(event.rating, event.contentName, event.contentType, event.contentId, event.customAttributes);
    }
    public static void logContentView(ContentViewEvent event) {
        checkEventNotNull(event);
        logContentView0(event.contentName, event.contentType, event.contentId, event.customAttributes);
    }
    public static void logSearch(SearchEvent event) {
        checkEventNotNull(event);
        logSearch0(event.query, event.customAttributes);
    }
    public static void logCustom(CustomEvent event) {
        checkEventNotNull(event);
        logCustomEvent0(event.eventName, event.customAttributes);
    }
    /*<methods>*/
    @Method(selector = "logSignUpWithMethod:success:customAttributes:")
    private static native void logSignUp0(String signUpMethodOrNil, NSNumber signUpSucceededOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logLoginWithMethod:success:customAttributes:")
    private static native void logLogin0(String loginMethodOrNil, NSNumber loginSucceededOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logShareWithMethod:contentName:contentType:contentId:customAttributes:")
    private static native void logShare0(String shareMethodOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logInviteWithMethod:customAttributes:")
    private static native void logInvite0(String inviteMethodOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logPurchaseWithPrice:currency:success:itemName:itemType:itemId:customAttributes:")
    private static native void logPurchase0(NSDecimalNumber itemPriceOrNil, String currencyOrNil, NSNumber purchaseSucceededOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logLevelStart:customAttributes:")
    private static native void logLevelStart0(String levelNameOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logLevelEnd:score:success:customAttributes:")
    private static native void logLevelEnd0(String levelNameOrNil, NSNumber scoreOrNil, NSNumber levelCompletedSuccesfullyOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logAddToCartWithPrice:currency:itemName:itemType:itemId:customAttributes:")
    private static native void logAddToCart0(NSDecimalNumber itemPriceOrNil, String currencyOrNil, String itemNameOrNil, String itemTypeOrNil, String itemIdOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logStartCheckoutWithPrice:currency:itemCount:customAttributes:")
    private static native void logStartCheckout0(NSDecimalNumber totalPriceOrNil, String currencyOrNil, NSNumber itemCountOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logRating:contentName:contentType:contentId:customAttributes:")
    private static native void logRating0(NSNumber ratingOrNil, String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logContentViewWithName:contentType:contentId:customAttributes:")
    private static native void logContentView0(String contentNameOrNil, String contentTypeOrNil, String contentIdOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logSearchWithQuery:customAttributes:")
    private static native void logSearch0(String queryOrNil, NSDictionary<?, ?> customAttributesOrNil);
    @Method(selector = "logCustomEventWithName:customAttributes:")
    private static native void logCustomEvent0(String eventName, NSDictionary<?, ?> customAttributesOrNil);
    /*</methods>*/
}
