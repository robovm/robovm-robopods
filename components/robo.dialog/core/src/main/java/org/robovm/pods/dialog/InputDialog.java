package org.robovm.pods.dialog;

import org.robovm.pods.Platform;

public interface InputDialog extends AlertDialog {
    public static class Builder extends AlertDialog.Builder {
        InputDialogStyle inputStyle;
        DialogTextInputChangeListener inputChangeListener;

        public Builder setInputStyle(InputDialogStyle inputStyle) {
            this.inputStyle = inputStyle;
            return this;
        }

        public Builder setTextInputChangeListener(DialogTextInputChangeListener inputChangeListener) {
            this.inputChangeListener = inputChangeListener;
            return this;
        }

        @Override
        public Builder setTitle(String title) {
            return (Builder) super.setTitle(title);
        }

        @Override
        public Builder setMessage(String message) {
            return (Builder) super.setMessage(message);
        }

        @Override
        public Builder addButton(DialogButton button) {
            return (Builder) super.addButton(button);
        }

        @Override
        public InputDialog build() {
            return Platform.getPlatform().getInstance(InputDialog.class, this);
        }
    }
}
