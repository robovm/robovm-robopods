package org.robovm.pods.dialog;

import org.robovm.pods.Platform;
import org.robovm.pods.Platform.AndroidPlatform;

import android.app.Activity;
import android.app.ProgressDialog;

public class AndroidProgressDialog implements org.robovm.pods.dialog.ProgressDialog {
    private ProgressDialog progressDialog;
    private String title;
    private String message;
    private ProgressDialogStyle style;

    private double progress;

    AndroidProgressDialog(org.robovm.pods.dialog.ProgressDialog.Builder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.style = builder.style;

        Activity activity = ((AndroidPlatform) Platform.getPlatform()).getLaunchActivity();

        progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(title);
        progressDialog.setMessage(message);
        progressDialog.setIndeterminate(style != ProgressDialogStyle.Determinate);
        progressDialog.setMax(100);
        progressDialog.setProgressStyle(style == ProgressDialogStyle.Determinate ? ProgressDialog.STYLE_HORIZONTAL
                : ProgressDialog.STYLE_SPINNER);
        // TODO support text style
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void show() {
        progressDialog.show();
    }

    @Override
    public void hide() {
        progressDialog.cancel();
    }

    @Override
    public ProgressDialogStyle getStyle() {
        return style;
    }

    @Override
    public void setProgress(double progress) {
        this.progress = progress;
        progressDialog.setProgress((int) (progress * 100));
    }

    @Override
    public double getProgress() {
        return progress;
    }
}
