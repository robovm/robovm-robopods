package org.robovm.pods.dialog;

import org.robovm.pods.Platform;

public interface ProgressDialog extends Dialog {
    ProgressDialogStyle getStyle();

    void setProgress(double progress);

    double getProgress();

    public static class Builder extends DialogBuilder<Builder, ProgressDialog> {
        ProgressDialogStyle style;

        public Builder setProgressStyle(ProgressDialogStyle style) {
            this.style = style;
            return this;
        }

        @Override
        public ProgressDialog build() {
            return Platform.getPlatform().getInstance(ProgressDialog.class, this);
        }
    }
}
