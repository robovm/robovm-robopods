package org.robovm.pods.dialog;

import java.util.Collections;
import java.util.List;

import org.robovm.pods.Platform;
import org.robovm.pods.Platform.AndroidPlatform;

import android.app.AlertDialog;
import android.content.DialogInterface.OnClickListener;

public class AndroidAlertDialog implements org.robovm.pods.dialog.AlertDialog {
    private final AlertDialog alert;
    private final String title;
    private final String message;

    AndroidAlertDialog(org.robovm.pods.dialog.AlertDialog.Builder builder) {
        this.title = builder.title;
        this.message = builder.message;

        AlertDialog.Builder b = setupAlert(builder);
        alert = b.create();
    }

    AlertDialog.Builder setupAlert(org.robovm.pods.dialog.AlertDialog.Builder builder) {
        List<DialogButton> buttons = builder.buttons;

        AlertDialog.Builder b = new AlertDialog.Builder(((AndroidPlatform) Platform.getPlatform()).getLaunchActivity())
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
        return (dialog, which) -> {
            button.getClickListener().onClick(AndroidAlertDialog.this, button);
        };
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getMessage() {
        return message;
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
}
