package org.robovm.pods.dialog;

import java.util.ArrayList;
import java.util.List;

import org.robovm.pods.Platform;

public interface AlertDialog extends Dialog {
    String getTextInput();

    public static class Builder extends DialogBuilder<Builder, AlertDialog> {
        List<DialogButton> buttons = new ArrayList<>();

        public Builder addButton(DialogButton button) {
            buttons.add(button);
            return this;
        }

        @Override
        public AlertDialog build() {
            return Platform.getPlatform().getInstance(AlertDialog.class, this);
        }
    }
}
