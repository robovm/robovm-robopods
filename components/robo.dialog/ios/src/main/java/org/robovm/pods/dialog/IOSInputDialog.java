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

import org.robovm.apple.uikit.UIAlertViewStyle;
import org.robovm.apple.uikit.UITextField;

@SuppressWarnings("deprecation")
public class IOSInputDialog extends IOSAlertDialog implements InputDialog {
    private UITextField inputTextField;

    IOSInputDialog(InputDialog.Builder builder) {
        super(builder);
        if (alertView != null) {
            alertView.setAlertViewStyle(builder.inputStyle == InputDialogStyle.Secure ? UIAlertViewStyle.SecureTextInput
                    : UIAlertViewStyle.PlainTextInput);
            inputTextField = alertView.getTextField(0);
            addTextFieldListener(inputTextField, builder.inputChangeListener);
        } else {
            alertController.addTextField((textField) -> {
                inputTextField = textField;
                textField.setSecureTextEntry(builder.inputStyle == InputDialogStyle.Secure);
                addTextFieldListener(inputTextField, builder.inputChangeListener);
            });
        }
    }

    private void addTextFieldListener(UITextField textField, DialogTextInputChangeListener inputChangeListener) {
        if (inputChangeListener != null) {
            textField.addOnEditingChangedListener((control) -> {
                inputChangeListener.onChange(IOSInputDialog.this, getTextInput());
            });
        }
    }

    @Override
    public String getTextInput() {
        return inputTextField.getText();
    }
}
