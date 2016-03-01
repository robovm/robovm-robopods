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

import android.app.AlertDialog;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.widget.EditText;

public class AndroidInputDialog extends AndroidAlertDialog implements InputDialog {
    private EditText inputTextField;

    AndroidInputDialog(InputDialog.Builder builder) {
        super(builder);
    }

    @Override
    AlertDialog.Builder setupAlert() {
        AlertDialog.Builder b = super.setupAlert();
        inputTextField = new EditText(b.getContext());
        InputDialog.Builder ib = (InputDialog.Builder) builder;
        if (ib.inputStyle == InputDialogStyle.Secure) {
            inputTextField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        b.setView(inputTextField);
        if (ib.inputChangeListener != null) {
            inputTextField.addTextChangedListener(new TextWatcher() {
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    ib.inputChangeListener.onChange(AndroidInputDialog.this, s);
                }

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

                @Override
                public void afterTextChanged(Editable s) {}
            });
        }

        return b;
    }

    @Override
    public String getTextInput() {
        return inputTextField.getText().toString();
    }
}
