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

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;
import org.robovm.pods.Platform;
import org.robovm.pods.android.ActivityConfigurable;
import org.robovm.pods.android.AndroidConfig;

import java.util.Collections;
import java.util.List;

public class AndroidAlertDialog implements org.robovm.pods.dialog.AlertDialog, ActivityConfigurable {
    Activity activity;
    AlertDialog alert;
    final org.robovm.pods.dialog.AlertDialog.Builder builder;

    AndroidAlertDialog(org.robovm.pods.dialog.AlertDialog.Builder builder) {
        this.builder = builder;

        setActivity(AndroidConfig.getActivity(this));
    }

    AlertDialog.Builder setupAlert() {
        List<DialogButton> buttons = builder.buttons;

        AlertDialog.Builder b = new AlertDialog.Builder(activity)
                .setTitle(builder.title)
                .setMessage(builder.message);

        Collections.sort(buttons);

        if (buttons.size() > 3) {
            throw new UnsupportedOperationException("Android alert dialogs can only have up to 3 buttons!");
        } else {
            if (buttons.size() > 0) {
                b.setPositiveButton(buttons.get(0).getTitle(),
                        getClickListenerForButton(buttons.get(0)));
            }
            if (buttons.size() > 1) {
                b.setNegativeButton(buttons.get(1).getTitle(),
                        getClickListenerForButton(buttons.get(1)));
            }
            if (buttons.size() > 2) {
                b.setNeutralButton(buttons.get(2).getTitle(),
                        getClickListenerForButton(buttons.get(2)));
            }
        }
        return b;
    }

    private OnClickListener getClickListenerForButton(DialogButton button) {
        if (button.getClickListener() == null) {
            return null;
        }
        return (dialog, which) -> button.getClickListener().onClick(AndroidAlertDialog.this, button);
    }

    @Override
    public String getTitle() {
        return builder.title;
    }

    @Override
    public String getMessage() {
        return builder.message;
    }

    @Override
    public void show() {
        Platform.getPlatform().runOnUIThread(alert::show);
    }

    @Override
    public void hide() {
        alert.cancel();
    }

    @Override
    public String getTextInput() {
        return null;
    }

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
        AlertDialog.Builder b = setupAlert();
        alert = b.create();
    }
}
