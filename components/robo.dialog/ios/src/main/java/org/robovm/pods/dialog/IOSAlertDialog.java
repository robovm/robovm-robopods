package org.robovm.pods.dialog;

import org.robovm.apple.foundation.Foundation;
import org.robovm.apple.uikit.UIAlertAction;
import org.robovm.apple.uikit.UIAlertActionStyle;
import org.robovm.apple.uikit.UIAlertControllerStyle;
import org.robovm.apple.uikit.UIAlertView;
import org.robovm.apple.uikit.UIAlertViewDelegateAdapter;
import org.robovm.objc.LongMap;
import org.robovm.objc.block.VoidBlock1;
import org.robovm.pods.Platform;

@SuppressWarnings("deprecation")
public class IOSAlertDialog implements AlertDialog {
    UIAlertView alertView;
    WindowAlertController alertController;
    LongMap<DialogButton> buttons;

    IOSAlertDialog(AlertDialog.Builder builder) {
        if (Foundation.getMajorSystemVersion() < 8) {
            alertView = new UIAlertView();
            alertView.setTitle(builder.title);
            alertView.setMessage(builder.message);
            buttons = new LongMap<>(builder.buttons.size());
            for (DialogButton button : builder.buttons) {
                long i = alertView.addButton(button.getTitle());
                if (button.getStyle() == DialogButtonStyle.Cancel) {
                    alertView.setCancelButtonIndex(i);
                }
                buttons.put(i, button);
            }
            alertView.setDelegate(new UIAlertViewDelegateAdapter() {
                @Override
                public void clicked(UIAlertView alertView, long buttonIndex) {
                    DialogButton button = buttons.get(buttonIndex);
                    if (button != null) {
                        button.getClickListener().onClick(IOSAlertDialog.this, button);
                    }
                }
            });
        } else {
            alertController = new WindowAlertController(builder.title, builder.message, UIAlertControllerStyle.Alert);
            for (DialogButton button : builder.buttons) {
                alertController.addAction(new UIAlertAction(button.getTitle(),
                        getActionStyleForButtonStyle(button.getStyle()), getActionCallbackForButton(button)));
            }
        }
    }

    private VoidBlock1<UIAlertAction> getActionCallbackForButton(DialogButton button) {
        if (button.getClickListener() == null) {
            return null;
        }
        return (action) -> {
            button.getClickListener().onClick(IOSAlertDialog.this, button);
            alertController.didDismiss();
        };
    }

    private UIAlertActionStyle getActionStyleForButtonStyle(DialogButtonStyle style) {
        switch (style) {
        case Cancel:
            return UIAlertActionStyle.Cancel;
        case Destructive:
            return UIAlertActionStyle.Destructive;
        case Default:
        default:
            return UIAlertActionStyle.Default;
        }
    }

    @Override
    public String getTitle() {
        return alertView != null ? alertView.getTitle() : alertController.getTitle();
    }

    @Override
    public String getMessage() {
        return alertView != null ? alertView.getMessage() : alertController.getMessage();
    }

    @Override
    public void show() {
        Platform.getPlatform().runOnUIThread(() -> {
            if (alertView != null) {
                alertView.show();
            } else {
                alertController.show();
            }
        });
    }

    @Override
    public void hide() {
        Platform.getPlatform().runOnUIThread(() -> {
            if (alertView != null) {
                alertView.dismiss(-1, true);
            } else {
                alertController.dismissViewController(true, null);
            }
        });
    }

    @Override
    public String getTextInput() {
        return null;
    }
}
