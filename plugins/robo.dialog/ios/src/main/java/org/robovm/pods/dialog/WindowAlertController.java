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

import org.robovm.apple.uikit.UIAlertController;
import org.robovm.apple.uikit.UIAlertControllerStyle;
import org.robovm.apple.uikit.UIScreen;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.apple.uikit.UIWindowLevel;

public class WindowAlertController extends UIAlertController {
    private UIWindow alertWindow;

    public WindowAlertController(String title, String message, UIAlertControllerStyle preferredStyle) {
        super(title, message, preferredStyle);

        alertWindow = new UIWindow(UIScreen.getMainScreen().getBounds());
        alertWindow.setRootViewController(new UIViewController());
        alertWindow.setWindowLevel(UIWindowLevel.Alert + 1);
    }

    public void show() {
        alertWindow.makeKeyAndVisible();
        alertWindow.getRootViewController().presentViewController(this, true, null);
    }

    @Override
    public void dismissViewController(boolean animated, Runnable completion) {
        super.dismissViewController(animated, completion);
        didDismiss();
    }

    void didDismiss() {
        alertWindow.setHidden(true);
    }
}
