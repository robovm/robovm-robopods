/*
 * Copyright (C) 2013-2016 RoboVM AB
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
