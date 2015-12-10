package org.robovm.pods.dialog;

import org.robovm.apple.uikit.UIAlertController;
import org.robovm.apple.uikit.UIAlertControllerStyle;
import org.robovm.apple.uikit.UIScreen;
import org.robovm.apple.uikit.UIViewController;
import org.robovm.apple.uikit.UIWindow;
import org.robovm.apple.uikit.UIWindowLevel;

public class WindowAlertController extends UIAlertController {
    private UIWindow alertWindow;

    public WindowAlertController(String title, String message, UIAlertControllerStyle preferredStyle) {
        super(title, message, preferredStyle);

        alertWindow = new UIWindow(UIScreen.getMainScreen().getBounds());
        alertWindow.setRootViewController(new UIViewController());
        alertWindow.setWindowLevel(UIWindowLevel.Alert + 1);
    }

    public void show() {
        alertWindow.makeKeyAndVisible();
        alertWindow.getRootViewController().presentViewController(this, true, null);
    }

    @Override
    public void dismissViewController(boolean animated, Runnable completion) {
        super.dismissViewController(animated, completion);
        didDismiss();
    }

    void didDismiss() {
        alertWindow.setHidden(true);
    }
}
