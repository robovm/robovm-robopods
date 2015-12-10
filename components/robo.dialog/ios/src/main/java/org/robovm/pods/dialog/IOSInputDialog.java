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
