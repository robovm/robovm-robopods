/*
 * Copyright (C) 2016 RoboVM AB
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
package org.robovm.pods.dialog;

import org.robovm.apple.coregraphics.*;
import org.robovm.apple.foundation.NSString;
import org.robovm.apple.uikit.*;
import org.robovm.pods.Platform;

public class IOSProgressDialog extends UIView implements ProgressDialog {
    private UIWindow alertWindow;

    private ProgressDialogStyle style;
    private UILabel title;
    private UILabel message;
    private UIView indicator;
    private CGSize minSize = CGSize.Zero();
    private CGSize size;

    private boolean isShown;
    private boolean dimsBackground;
    private UIColor color;

    private double progress;

    IOSProgressDialog(ProgressDialog.Builder builder) {
        super(UIScreen.getMainScreen().getBounds());

        this.style = builder.style;

        setupLabels(builder);
        setupIndicators();

        alertWindow = new UIWindow(UIScreen.getMainScreen().getBounds());
        alertWindow.setRootViewController(new UIViewController());
        alertWindow.setWindowLevel(UIWindowLevel.Alert + 1);

        setContentMode(UIViewContentMode.Center);
        setAutoresizingMask(
                UIViewAutoresizing.with(UIViewAutoresizing.FlexibleTopMargin, UIViewAutoresizing.FlexibleBottomMargin,
                        UIViewAutoresizing.FlexibleLeftMargin, UIViewAutoresizing.FlexibleRightMargin));

        // Transparent background
        setOpaque(false);
        setBackgroundColor(UIColor.clear());
        setAlpha(0);
    }

    private void setupLabels(ProgressDialog.Builder builder) {
        title = new UILabel(getBounds());
        title.setAdjustsFontSizeToFitWidth(false);
        title.setTextAlignment(NSTextAlignment.Center);
        title.setOpaque(false);
        title.setBackgroundColor(UIColor.clear());
        title.setTextColor(UIColor.white());
        title.setFont(UIFont.getBoldSystemFont(16));
        title.setText(builder.title);
        addSubview(title);

        message = new UILabel(getBounds());
        message.setAdjustsFontSizeToFitWidth(false);
        message.setTextAlignment(NSTextAlignment.Center);
        message.setOpaque(false);
        message.setBackgroundColor(UIColor.clear());
        message.setTextColor(UIColor.white());
        message.setNumberOfLines(0);
        message.setFont(UIFont.getBoldSystemFont(12));
        message.setText(builder.message);
        addSubview(message);
    }

    private void setupIndicators() {
        switch (style) {
        case Indeterminate:
            indicator = new UIActivityIndicatorView(UIActivityIndicatorViewStyle.WhiteLarge);
            ((UIActivityIndicatorView) indicator).startAnimating();
            addSubview(indicator);
            break;
        case Determinate:
            indicator = new ProgressBarView();
            addSubview(indicator);
            break;
        case Text:
            indicator = new UILabel(new CGRect(0, 0, 120, 20));
            ((UILabel) indicator).setAdjustsFontSizeToFitWidth(false);
            ((UILabel) indicator).setTextAlignment(NSTextAlignment.Center);
            indicator.setOpaque(false);
            indicator.setBackgroundColor(UIColor.clear());
            ((UILabel) indicator).setTextColor(UIColor.white());
            ((UILabel) indicator).setNumberOfLines(0);
            ((UILabel) indicator).setFont(UIFont.getBoldSystemFont(20));
            ((UILabel) indicator).setText("0%");
            addSubview(indicator);
            break;
        default:
            break;
        }
    }

    @Override
    public void layoutSubviews() {
        super.layoutSubviews();

        // Entirely cover the parent view
        UIView parent = getSuperview();
        if (parent != null) {
            setFrame(parent.getBounds());
        }
        CGRect bounds = getBounds();

        final double margin = 20;
        final double padding = 4;

        // Determine the total widt and height needed
        double maxWidth = bounds.getSize().getWidth() - 4 * margin;
        CGSize totalSize = new CGSize();

        CGRect indicatorF = indicator.getBounds();
        indicatorF.getSize().setWidth(Math.min(indicatorF.getSize().getWidth(), maxWidth));
        totalSize.setWidth(Math.max(totalSize.getWidth(), indicatorF.getSize().getWidth()));
        totalSize.setHeight(totalSize.getHeight() + indicatorF.getSize().getHeight());

        String titleText = title.getText() != null ? title.getText() : "";

        CGSize titleLabelSize = titleText.length() > 0
                ? NSString.getSize(titleText, new NSAttributedStringAttributes().setFont(title.getFont()))
                : new CGSize();
        titleLabelSize.setWidth(Math.min(titleLabelSize.getWidth(), maxWidth));
        totalSize.setWidth(Math.max(totalSize.getWidth(), titleLabelSize.getWidth()));
        totalSize.setHeight(totalSize.getHeight() + titleLabelSize.getHeight());

        if (titleLabelSize.getHandle() > 0 && indicatorF.getSize().getHeight() > 0) {
            totalSize.setHeight(totalSize.getHeight() + padding);
        }

        double remainingHeight = bounds.getSize().getHeight() - totalSize.getHeight() - padding - 4 * margin;

        String messageText = message.getText() != null ? message.getText() : "";

        CGSize maxSize = new CGSize(maxWidth, remainingHeight);
        CGSize messageLabelSize = messageText.length() > 0
                ? NSString.getBoundingRect(messageText, maxSize, NSStringDrawingOptions.UsesLineFragmentOrigin,
                new NSAttributedStringAttributes().setFont(message.getFont()), null).getSize()
                : new CGSize();

        totalSize.setWidth(Math.max(totalSize.getWidth(), messageLabelSize.getWidth()));
        totalSize.setHeight(totalSize.getHeight() + messageLabelSize.getHeight());

        if (messageLabelSize.getHeight() > 0
                && (indicatorF.getSize().getHeight() > 0 || titleLabelSize.getHeight() > 0)) {
            totalSize.setHeight(totalSize.getHeight() + padding);
        }

        totalSize.setWidth(totalSize.getWidth() + 2 * margin);
        totalSize.setHeight(totalSize.getHeight() + 2 * margin);

        // Position elements
        double yPos = Math.round(((bounds.getSize().getHeight() - totalSize.getHeight()) / 2) + margin);
        double xPos = 0;

        indicatorF.setY(yPos);
        indicatorF.setX(Math.round((bounds.getSize().getWidth() - indicatorF.getSize().getWidth()) / 2) + xPos);

        indicator.setFrame(indicatorF);
        yPos += indicatorF.getSize().getHeight();

        if (titleLabelSize.getHeight() > 0 && indicatorF.getSize().getHeight() > 0) {
            yPos += padding;
        }

        CGRect labelF = new CGRect();
        labelF.setY(yPos);
        labelF.setX(Math.round((bounds.getSize().getWidth() - titleLabelSize.getWidth()) / 2) + xPos);
        labelF.setSize(titleLabelSize);
        title.setFrame(labelF);
        yPos += labelF.getSize().getHeight();

        if (messageLabelSize.getHeight() > 0
                && (indicatorF.getSize().getHeight() > 0 || titleLabelSize.getHeight() > 0)) {
            yPos += padding;
        }

        CGRect detailsLabelF = new CGRect();
        detailsLabelF.setY(yPos);
        detailsLabelF.setX(Math.round((bounds.getSize().getWidth() - messageLabelSize.getWidth()) / 2) + xPos);
        detailsLabelF.setSize(messageLabelSize);
        message.setFrame(detailsLabelF);

        if (totalSize.getWidth() < minSize.getWidth()) {
            totalSize.setWidth(minSize.getWidth());
        }
        if (totalSize.getHeight() < minSize.getHeight()) {
            totalSize.setHeight(minSize.getHeight());
        }

        size = totalSize;
    }

    @Override
    public void draw(CGRect rect) {
        CGContext context = UIGraphics.getCurrentContext();
        UIGraphics.pushContext(context);

        if (dimsBackground) {
            CGColorSpace colorSpace = CGColorSpace.deviceRGB();
            CGGradient gradient = new CGGradient(colorSpace, new double[] { 0, 1 },
                    new double[] { 0, 0, 0, 0, 0, 0, 0, 0.75 });
            CGPoint gradCenter = new CGPoint(getBounds().getWidth() / 2, getBounds().getHeight() / 2);
            double gradRadius = Math.min(getBounds().getWidth(), getBounds().getHeight());

            context.drawRadialGradient(gradient, gradCenter, 0, gradCenter, gradRadius,
                    CGGradientDrawingOptions.AfterEndLocation);

        }

        // Set background rect color
        if (color != null) {
            context.setFillColor(color.getCGColor());
        } else {
            context.setGrayFillColor(0, 0.8);
        }

        // Center HUD
        CGRect allRect = getBounds();
        // Draw rounded HUD backgroud rect
        CGRect boxRect = new CGRect(Math.round((allRect.getSize().getWidth() - size.getWidth()) / 2),
                Math.round((allRect.getSize().getHeight() - size.getHeight()) / 2), size.getWidth(), size.getHeight());

        float radius = 10;
        context.beginPath();
        context.moveToPoint(boxRect.getMinX() + radius, boxRect.getMinY());
        context.addArc(boxRect.getMaxX() - radius, boxRect.getMinY() + radius, radius, 3 * Math.PI / 2, 0, false);
        context.addArc(boxRect.getMaxX() - radius, boxRect.getMaxY() - radius, radius, 0, Math.PI / 2, false);
        context.addArc(boxRect.getMinX() + radius, boxRect.getMaxY() - radius, radius, Math.PI / 2, Math.PI, false);
        context.addArc(boxRect.getMinX() + radius, boxRect.getMinY() + radius, radius, Math.PI, 3 * Math.PI / 2, false);
        context.closePath();
        context.fillPath();

        UIGraphics.popContext();
    }

    @Override
    public String getTitle() {
        return title.getText();
    }

    @Override
    public String getMessage() {
        return message.getText();
    }

    @Override
    public void show() {
        alertWindow.makeKeyAndVisible();
        alertWindow.getRootViewController().getView().addSubview(this);
        Platform.getPlatform().runOnUIThread(() -> {
            setTransform(CGAffineTransform.Identity().concat(CGAffineTransform.createScale(0.5, 0.5)));

            isShown = true;
            UIView.animate(0.3, () -> {
                setAlpha(1);
                setTransform(CGAffineTransform.Identity());
            });
        });
    }

    @Override
    public void hide() {
        Platform.getPlatform().runOnUIThread(() -> {
            if (isShown) {
                UIView.animate(0.3, () -> {
                    setTransform(CGAffineTransform.Identity().concat(CGAffineTransform.createScale(1.5, 1.5)));
                    setAlpha(0.02);
                }, (complete) -> {
                    setAlpha(0);
                    removeFromSuperview();
                    alertWindow.setHidden(true);
                });
            }
        });
    }

    @Override
    public ProgressDialogStyle getStyle() {
        return style;
    }

    @Override
    public void setProgress(double progress) {
        this.progress = progress;

        Platform.getPlatform().runOnUIThread(() -> {
            switch (style) {
            case Determinate:
                ((ProgressBarView) indicator).setProgress(progress);
                break;
            case Text:
                ((UILabel) indicator).setText(String.format("%d%%", (int) (progress * 100)));
                break;
            default:
                break;
            }
        });
    }

    @Override
    public double getProgress() {
        return progress;
    }
}
