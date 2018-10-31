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
package org.robovm.pods.google.mobileads;

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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/GADDynamicHeightSearchRequest/*</name>*/ 
    extends /*<extends>*/GADRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class GADDynamicHeightSearchRequestPtr extends Ptr<GADDynamicHeightSearchRequest, GADDynamicHeightSearchRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(GADDynamicHeightSearchRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public GADDynamicHeightSearchRequest() {}
    protected GADDynamicHeightSearchRequest(Handle h, long handle) { super(h, handle); }
    protected GADDynamicHeightSearchRequest(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "query")
    public native String getQuery();
    @Property(selector = "setQuery:")
    public native void setQuery(String v);
    @Property(selector = "adPage")
    public native @MachineSizedSInt long getAdPage();
    @Property(selector = "setAdPage:")
    public native void setAdPage(@MachineSizedSInt long v);
    @Property(selector = "adTestEnabled")
    public native boolean isAdTestEnabled();
    @Property(selector = "setAdTestEnabled:")
    public native void setAdTestEnabled(boolean v);
    @Property(selector = "channel")
    public native String getChannel();
    @Property(selector = "setChannel:")
    public native void setChannel(String v);
    @Property(selector = "hostLanguage")
    public native String getHostLanguage();
    @Property(selector = "setHostLanguage:")
    public native void setHostLanguage(String v);
    @Property(selector = "locationExtensionTextColor")
    public native String getLocationExtensionTextColor();
    @Property(selector = "setLocationExtensionTextColor:")
    public native void setLocationExtensionTextColor(String v);
    @Property(selector = "locationExtensionFontSize")
    public native @MachineSizedFloat double getLocationExtensionFontSize();
    @Property(selector = "setLocationExtensionFontSize:")
    public native void setLocationExtensionFontSize(@MachineSizedFloat double v);
    @Property(selector = "clickToCallExtensionEnabled")
    public native boolean isClickToCallExtensionEnabled();
    @Property(selector = "setClickToCallExtensionEnabled:")
    public native void setClickToCallExtensionEnabled(boolean v);
    @Property(selector = "locationExtensionEnabled")
    public native boolean isLocationExtensionEnabled();
    @Property(selector = "setLocationExtensionEnabled:")
    public native void setLocationExtensionEnabled(boolean v);
    @Property(selector = "plusOnesExtensionEnabled")
    public native boolean isPlusOnesExtensionEnabled();
    @Property(selector = "setPlusOnesExtensionEnabled:")
    public native void setPlusOnesExtensionEnabled(boolean v);
    @Property(selector = "sellerRatingsExtensionEnabled")
    public native boolean isSellerRatingsExtensionEnabled();
    @Property(selector = "setSellerRatingsExtensionEnabled:")
    public native void setSellerRatingsExtensionEnabled(boolean v);
    @Property(selector = "siteLinksExtensionEnabled")
    public native boolean isSiteLinksExtensionEnabled();
    @Property(selector = "setSiteLinksExtensionEnabled:")
    public native void setSiteLinksExtensionEnabled(boolean v);
    @Property(selector = "CSSWidth")
    public native String getCSSWidth();
    @Property(selector = "setCSSWidth:")
    public native void setCSSWidth(String v);
    @Property(selector = "numberOfAds")
    public native @MachineSizedSInt long getNumberOfAds();
    @Property(selector = "setNumberOfAds:")
    public native void setNumberOfAds(@MachineSizedSInt long v);
    @Property(selector = "fontFamily")
    public native String getFontFamily();
    @Property(selector = "setFontFamily:")
    public native void setFontFamily(String v);
    @Property(selector = "attributionFontFamily")
    public native String getAttributionFontFamily();
    @Property(selector = "setAttributionFontFamily:")
    public native void setAttributionFontFamily(String v);
    @Property(selector = "annotationFontSize")
    public native @MachineSizedFloat double getAnnotationFontSize();
    @Property(selector = "setAnnotationFontSize:")
    public native void setAnnotationFontSize(@MachineSizedFloat double v);
    @Property(selector = "attributionFontSize")
    public native @MachineSizedFloat double getAttributionFontSize();
    @Property(selector = "setAttributionFontSize:")
    public native void setAttributionFontSize(@MachineSizedFloat double v);
    @Property(selector = "descriptionFontSize")
    public native @MachineSizedFloat double getDescriptionFontSize();
    @Property(selector = "setDescriptionFontSize:")
    public native void setDescriptionFontSize(@MachineSizedFloat double v);
    @Property(selector = "domainLinkFontSize")
    public native @MachineSizedFloat double getDomainLinkFontSize();
    @Property(selector = "setDomainLinkFontSize:")
    public native void setDomainLinkFontSize(@MachineSizedFloat double v);
    @Property(selector = "titleFontSize")
    public native @MachineSizedFloat double getTitleFontSize();
    @Property(selector = "setTitleFontSize:")
    public native void setTitleFontSize(@MachineSizedFloat double v);
    @Property(selector = "adBorderColor")
    public native String getAdBorderColor();
    @Property(selector = "setAdBorderColor:")
    public native void setAdBorderColor(String v);
    @Property(selector = "adSeparatorColor")
    public native String getAdSeparatorColor();
    @Property(selector = "setAdSeparatorColor:")
    public native void setAdSeparatorColor(String v);
    @Property(selector = "annotationTextColor")
    public native String getAnnotationTextColor();
    @Property(selector = "setAnnotationTextColor:")
    public native void setAnnotationTextColor(String v);
    @Property(selector = "attributionTextColor")
    public native String getAttributionTextColor();
    @Property(selector = "setAttributionTextColor:")
    public native void setAttributionTextColor(String v);
    @Property(selector = "backgroundColor")
    public native String getBackgroundColor();
    @Property(selector = "setBackgroundColor:")
    public native void setBackgroundColor(String v);
    @Property(selector = "borderColor")
    public native String getBorderColor();
    @Property(selector = "setBorderColor:")
    public native void setBorderColor(String v);
    @Property(selector = "domainLinkColor")
    public native String getDomainLinkColor();
    @Property(selector = "setDomainLinkColor:")
    public native void setDomainLinkColor(String v);
    @Property(selector = "textColor")
    public native String getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(String v);
    @Property(selector = "titleLinkColor")
    public native String getTitleLinkColor();
    @Property(selector = "setTitleLinkColor:")
    public native void setTitleLinkColor(String v);
    @Property(selector = "adBorderCSSSelections")
    public native String getAdBorderCSSSelections();
    @Property(selector = "setAdBorderCSSSelections:")
    public native void setAdBorderCSSSelections(String v);
    @Property(selector = "adjustableLineHeight")
    public native @MachineSizedFloat double getAdjustableLineHeight();
    @Property(selector = "setAdjustableLineHeight:")
    public native void setAdjustableLineHeight(@MachineSizedFloat double v);
    @Property(selector = "attributionBottomSpacing")
    public native @MachineSizedFloat double getAttributionBottomSpacing();
    @Property(selector = "setAttributionBottomSpacing:")
    public native void setAttributionBottomSpacing(@MachineSizedFloat double v);
    @Property(selector = "borderCSSSelections")
    public native String getBorderCSSSelections();
    @Property(selector = "setBorderCSSSelections:")
    public native void setBorderCSSSelections(String v);
    @Property(selector = "titleUnderlineHidden")
    public native boolean isTitleUnderlineHidden();
    @Property(selector = "setTitleUnderlineHidden:")
    public native void setTitleUnderlineHidden(boolean v);
    @Property(selector = "boldTitleEnabled")
    public native boolean isBoldTitleEnabled();
    @Property(selector = "setBoldTitleEnabled:")
    public native void setBoldTitleEnabled(boolean v);
    @Property(selector = "verticalSpacing")
    public native @MachineSizedFloat double getVerticalSpacing();
    @Property(selector = "setVerticalSpacing:")
    public native void setVerticalSpacing(@MachineSizedFloat double v);
    @Property(selector = "detailedAttributionExtensionEnabled")
    public native boolean isDetailedAttributionExtensionEnabled();
    @Property(selector = "setDetailedAttributionExtensionEnabled:")
    public native void setDetailedAttributionExtensionEnabled(boolean v);
    @Property(selector = "longerHeadlinesExtensionEnabled")
    public native boolean isLongerHeadlinesExtensionEnabled();
    @Property(selector = "setLongerHeadlinesExtensionEnabled:")
    public native void setLongerHeadlinesExtensionEnabled(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setAdvancedOptionValue:forKey:")
    public native void setAdvancedOption(NSObject value, String key);
    /*</methods>*/
}
