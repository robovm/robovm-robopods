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

import org.robovm.pods.Platform;

public interface InputDialog extends AlertDialog {
    class Builder extends AlertDialog.Builder {
        InputDialogStyle inputStyle;
        DialogTextInputChangeListener inputChangeListener;

        public Builder() {}

        public Builder(String title, String message, String button) {
            super(title, message, button);
        }

        public Builder(String title, String message, String button, DialogButtonClickListener buttonListener) {
            super(title, message, button, buttonListener);
        }

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
