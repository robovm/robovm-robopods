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
    AlertDialog.Builder setupAlert(org.robovm.pods.dialog.AlertDialog.Builder builder) {
        AlertDialog.Builder b = super.setupAlert(builder);
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
