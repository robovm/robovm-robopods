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

import org.robovm.apple.coregraphics.CGContext;
import org.robovm.apple.coregraphics.CGRect;
import org.robovm.apple.uikit.UIColor;
import org.robovm.apple.uikit.UIGraphics;
import org.robovm.apple.uikit.UIView;

public class ProgressBarView extends UIView {
    private double progress;

    private UIColor lineColor = UIColor.white();
    private UIColor progressColor = UIColor.white();
    private UIColor progressRemainingColor = UIColor.clear();

    public ProgressBarView() {
        this(new CGRect(0, 0, 120, 20));
    }

    public ProgressBarView(CGRect frame) {
        super(frame);

        setOpaque(false);
        setBackgroundColor(UIColor.clear());
    }

    @Override
    public void draw(CGRect rect) {
        CGContext context = UIGraphics.getCurrentContext();

        context.setLineWidth(2);
        context.setStrokeColor(lineColor.getCGColor());
        context.setFillColor(progressRemainingColor.getCGColor());

        // Draw background
        double radius = (rect.getHeight() / 2) - 2;
        context.moveToPoint(2, rect.getHeight() / 2);
        context.addArcToPoint(2, 2, radius + 2, 2, radius);
        context.addLineToPoint(rect.getWidth() - radius - 2, 2);
        context.addArcToPoint(rect.getWidth() - 2, 2, rect.getWidth() - 2, rect.getHeight() / 2, radius);
        context.addArcToPoint(rect.getWidth() - 2, rect.getHeight() - 2, rect.getWidth() - radius - 2,
                rect.getHeight() - 2, radius);
        context.addLineToPoint(radius + 2, rect.getHeight() - 2);
        context.addArcToPoint(2, rect.getHeight() - 2, 2, rect.getHeight() / 2, radius);
        context.fillPath();

        // Draw border
        context.moveToPoint(2, rect.getHeight() / 2);
        context.addArcToPoint(2, 2, radius + 2, 2, radius);
        context.addLineToPoint(rect.getWidth() - radius - 2, 2);
        context.addArcToPoint(rect.getWidth() - 2, 2, rect.getWidth() - 2, rect.getHeight() / 2, radius);
        context.addArcToPoint(rect.getWidth() - 2, rect.getHeight() - 2, rect.getWidth() - radius - 2,
                rect.getHeight() - 2, radius);
        context.addLineToPoint(radius + 2, rect.getHeight() - 2);
        context.addArcToPoint(2, rect.getHeight() - 2, 2, rect.getHeight() / 2, radius);
        context.strokePath();

        context.setFillColor(progressColor.getCGColor());
        radius = radius - 2;
        double amount = progress * rect.getWidth();

        // Progress in the middle area
        if (amount >= radius + 4 && amount <= (rect.getWidth() - radius - 4)) {
            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, 4, radius + 4, 4, radius);
            context.addLineToPoint(amount, 4);
            context.addLineToPoint(amount, radius + 4);

            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, rect.getHeight() - 4, radius + 4, rect.getHeight() - 4, radius);
            context.addLineToPoint(amount, rect.getHeight() - 4);
            context.addLineToPoint(amount, radius + 4);

            context.fillPath();
        }
        // Progress in the right arc
        else if (amount > radius + 4) {
            double x = amount - (rect.getWidth() - radius - 4);

            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, 4, radius + 4, 4, radius);
            context.addLineToPoint(rect.getWidth() - radius - 4, 4);
            double angle = -Math.acos(x / radius);
            if (Double.isNaN(angle))
                angle = 0;
            context.addArc(rect.getWidth() - radius - 4, rect.getHeight() / 2, radius, Math.PI, angle, false);
            context.addLineToPoint(amount, rect.getHeight() / 2);

            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, rect.getHeight() - 4, radius + 4, rect.getHeight() - 4, radius);
            context.addLineToPoint(rect.getWidth() - radius - 4, rect.getHeight() - 4);
            angle = Math.acos(x / radius);
            if (Double.isNaN(angle))
                angle = 0;
            context.addArc(rect.getWidth() - radius - 4, rect.getHeight() / 2, radius, -Math.PI, angle, true);
            context.addLineToPoint(amount, rect.getHeight() / 2);

            context.fillPath();
        }
        // Progress is in the left arc
        else if (amount < radius + 4 && amount > 0) {
            // TODO draw correct progress depending on amount
            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, 4, radius + 4, 4, radius);
            context.addLineToPoint(radius + 4, rect.getHeight() / 2);

            context.moveToPoint(4, rect.getHeight() / 2);
            context.addArcToPoint(4, rect.getHeight() - 4, radius + 4, rect.getHeight() - 4, radius);
            context.addLineToPoint(radius + 4, rect.getHeight() / 2);

            context.fillPath();
        }
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
        setNeedsDisplay();
    }
}
