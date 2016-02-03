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

import java.util.ArrayList;
import java.util.List;

public interface AlertDialog extends Dialog {
    String getTextInput();

    class Builder extends DialogBuilder<Builder, AlertDialog> {
        List<DialogButton> buttons = new ArrayList<>();

        public Builder() {}

        public Builder(String title, String message, String button) {
            this(title, message, button, null);
        }

        public Builder(String title, String message, String button, DialogButtonClickListener buttonListener) {
            super(title, message);
            if (button != null) {
                addButton(new DialogButton(button, buttonListener));
            }
        }

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
