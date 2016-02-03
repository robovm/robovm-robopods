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

import org.robovm.apple.foundation.Foundation;
import org.robovm.apple.uikit.*;
import org.robovm.objc.LongMap;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.pods.Platform;

@SuppressWarnings("deprecation")
public class IOSAlertDialog implements AlertDialog {
    UIAlertView alertView;
    WindowAlertController alertController;
    LongMap<DialogButton> buttons;

    IOSAlertDialog(AlertDialog.Builder builder) {
        if (Foundation.getMajorSystemVersion() < 8) {
            alertView = new UIAlertView();
            alertView.setTitle(builder.title);
            alertView.setMessage(builder.message);
            buttons = new LongMap<>(builder.buttons.size());
            for (DialogButton button : builder.buttons) {
                long i = alertView.addButton(button.getTitle());
                if (button.getStyle() == DialogButtonStyle.Cancel) {
                    alertView.setCancelButtonIndex(i);
                }
                buttons.put(i, button);
            }
            alertView.setDelegate(new UIAlertViewDelegateAdapter() {
                @Override
                public void clicked(UIAlertView alertView, long buttonIndex) {
                    DialogButton button = buttons.get(buttonIndex);
                    if (button != null) {
                        button.getClickListener().onClick(IOSAlertDialog.this, button);
                    }
                }
            });
        } else {
            alertController = new WindowAlertController(builder.title, builder.message, UIAlertControllerStyle.Alert);
            for (DialogButton button : builder.buttons) {
                alertController.addAction(new UIAlertAction(button.getTitle(),
                        getActionStyleForButtonStyle(button.getStyle()), getActionCallbackForButton(button)));
            }
        }
    }

    private VoidBlock1<UIAlertAction> getActionCallbackForButton(DialogButton button) {
        if (button.getClickListener() == null) {
            return (action) -> alertController.didDismiss();
        }
        return (action) -> {
            button.getClickListener().onClick(IOSAlertDialog.this, button);
            alertController.didDismiss();
        };
    }

    private UIAlertActionStyle getActionStyleForButtonStyle(DialogButtonStyle style) {
        switch (style) {
        case Cancel:
            return UIAlertActionStyle.Cancel;
        case Destructive:
            return UIAlertActionStyle.Destructive;
        case Default:
        default:
            return UIAlertActionStyle.Default;
        }
    }

    @Override
    public String getTitle() {
        return alertView != null ? alertView.getTitle() : alertController.getTitle();
    }

    @Override
    public String getMessage() {
        return alertView != null ? alertView.getMessage() : alertController.getMessage();
    }

    @Override
    public void show() {
        Platform.getPlatform().runOnUIThread(() -> {
            if (alertView != null) {
                alertView.show();
            } else {
                alertController.show();
            }
        });
    }

    @Override
    public void hide() {
        Platform.getPlatform().runOnUIThread(() -> {
            if (alertView != null) {
                alertView.dismiss(-1, true);
            } else {
                alertController.dismissViewController(true, null);
            }
        });
    }

    @Override
    public String getTextInput() {
        return null;
    }
}
