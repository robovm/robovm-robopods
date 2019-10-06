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
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MGLSymbolStyleLayer/*</name>*/ 
    extends /*<extends>*/MGLVectorStyleLayer/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MGLSymbolStyleLayerPtr extends Ptr<MGLSymbolStyleLayer, MGLSymbolStyleLayerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MGLSymbolStyleLayer.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MGLSymbolStyleLayer() {}
    protected MGLSymbolStyleLayer(Handle h, long handle) { super(h, handle); }
    protected MGLSymbolStyleLayer(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:source:")
    public MGLSymbolStyleLayer(String identifier, MGLSource source) { super((SkipInit) null); initObject(init(identifier, source)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "iconAllowsOverlap")
    public native NSExpression getIconAllowsOverlap();
    @Property(selector = "setIconAllowsOverlap:")
    public native void setIconAllowsOverlap(NSExpression v);
    @Property(selector = "iconAnchor")
    public native NSExpression getIconAnchor();
    @Property(selector = "setIconAnchor:")
    public native void setIconAnchor(NSExpression v);
    @Property(selector = "iconIgnoresPlacement")
    public native NSExpression getIconIgnoresPlacement();
    @Property(selector = "setIconIgnoresPlacement:")
    public native void setIconIgnoresPlacement(NSExpression v);
    @Property(selector = "iconImageName")
    public native NSExpression getIconImageName();
    @Property(selector = "setIconImageName:")
    public native void setIconImageName(NSExpression v);
    @Property(selector = "iconOffset")
    public native NSExpression getIconOffset();
    @Property(selector = "setIconOffset:")
    public native void setIconOffset(NSExpression v);
    @Property(selector = "isIconOptional")
    public native NSExpression getIconOptional();
    @Property(selector = "setIconOptional:")
    public native void setIconOptional(NSExpression v);
    @Property(selector = "iconPadding")
    public native NSExpression getIconPadding();
    @Property(selector = "setIconPadding:")
    public native void setIconPadding(NSExpression v);
    @Property(selector = "iconPitchAlignment")
    public native NSExpression getIconPitchAlignment();
    @Property(selector = "setIconPitchAlignment:")
    public native void setIconPitchAlignment(NSExpression v);
    @Property(selector = "iconRotation")
    public native NSExpression getIconRotation();
    @Property(selector = "setIconRotation:")
    public native void setIconRotation(NSExpression v);
    @Property(selector = "iconRotationAlignment")
    public native NSExpression getIconRotationAlignment();
    @Property(selector = "setIconRotationAlignment:")
    public native void setIconRotationAlignment(NSExpression v);
    @Property(selector = "iconScale")
    public native NSExpression getIconScale();
    @Property(selector = "setIconScale:")
    public native void setIconScale(NSExpression v);
    @Property(selector = "iconTextFit")
    public native NSExpression getIconTextFit();
    @Property(selector = "setIconTextFit:")
    public native void setIconTextFit(NSExpression v);
    @Property(selector = "iconTextFitPadding")
    public native NSExpression getIconTextFitPadding();
    @Property(selector = "setIconTextFitPadding:")
    public native void setIconTextFitPadding(NSExpression v);
    @Property(selector = "keepsIconUpright")
    public native NSExpression getKeepsIconUpright();
    @Property(selector = "setKeepsIconUpright:")
    public native void setKeepsIconUpright(NSExpression v);
    @Property(selector = "keepsTextUpright")
    public native NSExpression getKeepsTextUpright();
    @Property(selector = "setKeepsTextUpright:")
    public native void setKeepsTextUpright(NSExpression v);
    @Property(selector = "maximumTextAngle")
    public native NSExpression getMaximumTextAngle();
    @Property(selector = "setMaximumTextAngle:")
    public native void setMaximumTextAngle(NSExpression v);
    @Property(selector = "maximumTextWidth")
    public native NSExpression getMaximumTextWidth();
    @Property(selector = "setMaximumTextWidth:")
    public native void setMaximumTextWidth(NSExpression v);
    @Property(selector = "symbolAvoidsEdges")
    public native NSExpression getSymbolAvoidsEdges();
    @Property(selector = "setSymbolAvoidsEdges:")
    public native void setSymbolAvoidsEdges(NSExpression v);
    @Property(selector = "symbolPlacement")
    public native NSExpression getSymbolPlacement();
    @Property(selector = "setSymbolPlacement:")
    public native void setSymbolPlacement(NSExpression v);
    @Property(selector = "symbolSortKey")
    public native NSExpression getSymbolSortKey();
    @Property(selector = "setSymbolSortKey:")
    public native void setSymbolSortKey(NSExpression v);
    @Property(selector = "symbolSpacing")
    public native NSExpression getSymbolSpacing();
    @Property(selector = "setSymbolSpacing:")
    public native void setSymbolSpacing(NSExpression v);
    @Property(selector = "symbolZOrder")
    public native NSExpression getSymbolZOrder();
    @Property(selector = "setSymbolZOrder:")
    public native void setSymbolZOrder(NSExpression v);
    @Property(selector = "text")
    public native NSExpression getText();
    @Property(selector = "setText:")
    public native void setText(NSExpression v);
    @Property(selector = "textAllowsOverlap")
    public native NSExpression getTextAllowsOverlap();
    @Property(selector = "setTextAllowsOverlap:")
    public native void setTextAllowsOverlap(NSExpression v);
    @Property(selector = "textAnchor")
    public native NSExpression getTextAnchor();
    @Property(selector = "setTextAnchor:")
    public native void setTextAnchor(NSExpression v);
    @Property(selector = "textFontNames")
    public native NSExpression getTextFontNames();
    @Property(selector = "setTextFontNames:")
    public native void setTextFontNames(NSExpression v);
    @Property(selector = "textFontSize")
    public native NSExpression getTextFontSize();
    @Property(selector = "setTextFontSize:")
    public native void setTextFontSize(NSExpression v);
    @Property(selector = "textIgnoresPlacement")
    public native NSExpression getTextIgnoresPlacement();
    @Property(selector = "setTextIgnoresPlacement:")
    public native void setTextIgnoresPlacement(NSExpression v);
    @Property(selector = "textJustification")
    public native NSExpression getTextJustification();
    @Property(selector = "setTextJustification:")
    public native void setTextJustification(NSExpression v);
    @Property(selector = "textLetterSpacing")
    public native NSExpression getTextLetterSpacing();
    @Property(selector = "setTextLetterSpacing:")
    public native void setTextLetterSpacing(NSExpression v);
    @Property(selector = "textLineHeight")
    public native NSExpression getTextLineHeight();
    @Property(selector = "setTextLineHeight:")
    public native void setTextLineHeight(NSExpression v);
    @Property(selector = "textOffset")
    public native NSExpression getTextOffset();
    @Property(selector = "setTextOffset:")
    public native void setTextOffset(NSExpression v);
    @Property(selector = "isTextOptional")
    public native NSExpression getTextOptional();
    @Property(selector = "setTextOptional:")
    public native void setTextOptional(NSExpression v);
    @Property(selector = "textPadding")
    public native NSExpression getTextPadding();
    @Property(selector = "setTextPadding:")
    public native void setTextPadding(NSExpression v);
    @Property(selector = "textPitchAlignment")
    public native NSExpression getTextPitchAlignment();
    @Property(selector = "setTextPitchAlignment:")
    public native void setTextPitchAlignment(NSExpression v);
    @Property(selector = "textRadialOffset")
    public native NSExpression getTextRadialOffset();
    @Property(selector = "setTextRadialOffset:")
    public native void setTextRadialOffset(NSExpression v);
    @Property(selector = "textRotation")
    public native NSExpression getTextRotation();
    @Property(selector = "setTextRotation:")
    public native void setTextRotation(NSExpression v);
    @Property(selector = "textRotationAlignment")
    public native NSExpression getTextRotationAlignment();
    @Property(selector = "setTextRotationAlignment:")
    public native void setTextRotationAlignment(NSExpression v);
    @Property(selector = "textTransform")
    public native NSExpression getTextTransform();
    @Property(selector = "setTextTransform:")
    public native void setTextTransform(NSExpression v);
    @Property(selector = "textVariableAnchor")
    public native NSExpression getTextVariableAnchor();
    @Property(selector = "setTextVariableAnchor:")
    public native void setTextVariableAnchor(NSExpression v);
    @Property(selector = "iconColor")
    public native NSExpression getIconColor();
    @Property(selector = "setIconColor:")
    public native void setIconColor(NSExpression v);
    @Property(selector = "iconColorTransition")
    public native @ByVal MGLTransition getIconColorTransition();
    @Property(selector = "setIconColorTransition:")
    public native void setIconColorTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloBlur")
    public native NSExpression getIconHaloBlur();
    @Property(selector = "setIconHaloBlur:")
    public native void setIconHaloBlur(NSExpression v);
    @Property(selector = "iconHaloBlurTransition")
    public native @ByVal MGLTransition getIconHaloBlurTransition();
    @Property(selector = "setIconHaloBlurTransition:")
    public native void setIconHaloBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloColor")
    public native NSExpression getIconHaloColor();
    @Property(selector = "setIconHaloColor:")
    public native void setIconHaloColor(NSExpression v);
    @Property(selector = "iconHaloColorTransition")
    public native @ByVal MGLTransition getIconHaloColorTransition();
    @Property(selector = "setIconHaloColorTransition:")
    public native void setIconHaloColorTransition(@ByVal MGLTransition v);
    @Property(selector = "iconHaloWidth")
    public native NSExpression getIconHaloWidth();
    @Property(selector = "setIconHaloWidth:")
    public native void setIconHaloWidth(NSExpression v);
    @Property(selector = "iconHaloWidthTransition")
    public native @ByVal MGLTransition getIconHaloWidthTransition();
    @Property(selector = "setIconHaloWidthTransition:")
    public native void setIconHaloWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "iconOpacity")
    public native NSExpression getIconOpacity();
    @Property(selector = "setIconOpacity:")
    public native void setIconOpacity(NSExpression v);
    @Property(selector = "iconOpacityTransition")
    public native @ByVal MGLTransition getIconOpacityTransition();
    @Property(selector = "setIconOpacityTransition:")
    public native void setIconOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "iconTranslation")
    public native NSExpression getIconTranslation();
    @Property(selector = "setIconTranslation:")
    public native void setIconTranslation(NSExpression v);
    @Property(selector = "iconTranslationTransition")
    public native @ByVal MGLTransition getIconTranslationTransition();
    @Property(selector = "setIconTranslationTransition:")
    public native void setIconTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "iconTranslationAnchor")
    public native NSExpression getIconTranslationAnchor();
    @Property(selector = "setIconTranslationAnchor:")
    public native void setIconTranslationAnchor(NSExpression v);
    @Property(selector = "textColor")
    public native NSExpression getTextColor();
    @Property(selector = "setTextColor:")
    public native void setTextColor(NSExpression v);
    @Property(selector = "textColorTransition")
    public native @ByVal MGLTransition getTextColorTransition();
    @Property(selector = "setTextColorTransition:")
    public native void setTextColorTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloBlur")
    public native NSExpression getTextHaloBlur();
    @Property(selector = "setTextHaloBlur:")
    public native void setTextHaloBlur(NSExpression v);
    @Property(selector = "textHaloBlurTransition")
    public native @ByVal MGLTransition getTextHaloBlurTransition();
    @Property(selector = "setTextHaloBlurTransition:")
    public native void setTextHaloBlurTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloColor")
    public native NSExpression getTextHaloColor();
    @Property(selector = "setTextHaloColor:")
    public native void setTextHaloColor(NSExpression v);
    @Property(selector = "textHaloColorTransition")
    public native @ByVal MGLTransition getTextHaloColorTransition();
    @Property(selector = "setTextHaloColorTransition:")
    public native void setTextHaloColorTransition(@ByVal MGLTransition v);
    @Property(selector = "textHaloWidth")
    public native NSExpression getTextHaloWidth();
    @Property(selector = "setTextHaloWidth:")
    public native void setTextHaloWidth(NSExpression v);
    @Property(selector = "textHaloWidthTransition")
    public native @ByVal MGLTransition getTextHaloWidthTransition();
    @Property(selector = "setTextHaloWidthTransition:")
    public native void setTextHaloWidthTransition(@ByVal MGLTransition v);
    @Property(selector = "textOpacity")
    public native NSExpression getTextOpacity();
    @Property(selector = "setTextOpacity:")
    public native void setTextOpacity(NSExpression v);
    @Property(selector = "textOpacityTransition")
    public native @ByVal MGLTransition getTextOpacityTransition();
    @Property(selector = "setTextOpacityTransition:")
    public native void setTextOpacityTransition(@ByVal MGLTransition v);
    @Property(selector = "textTranslation")
    public native NSExpression getTextTranslation();
    @Property(selector = "setTextTranslation:")
    public native void setTextTranslation(NSExpression v);
    @Property(selector = "textTranslationTransition")
    public native @ByVal MGLTransition getTextTranslationTransition();
    @Property(selector = "setTextTranslationTransition:")
    public native void setTextTranslationTransition(@ByVal MGLTransition v);
    @Property(selector = "textTranslationAnchor")
    public native NSExpression getTextTranslationAnchor();
    @Property(selector = "setTextTranslationAnchor:")
    public native void setTextTranslationAnchor(NSExpression v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:source:")
    protected native @Pointer long init(String identifier, MGLSource source);
    /*</methods>*/
}
