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

import android.app.Activity;
import android.app.ProgressDialog;
import org.robovm.pods.android.ActivityConfigurable;
import org.robovm.pods.android.AndroidConfig;

public class AndroidProgressDialog implements org.robovm.pods.dialog.ProgressDialog, ActivityConfigurable {
    Activity activity;
    ProgressDialog progressDialog;
    final org.robovm.pods.dialog.ProgressDialog.Builder builder;

    double progress;

    AndroidProgressDialog(org.robovm.pods.dialog.ProgressDialog.Builder builder) {
        this.builder = builder;

        setActivity(AndroidConfig.getActivity(this));
    }

    ProgressDialog setupDialog() {
        ProgressDialog progressDialog = new ProgressDialog(activity);
        progressDialog.setTitle(builder.title);
        progressDialog.setMessage(builder.message);
        progressDialog.setIndeterminate(builder.style != ProgressDialogStyle.Determinate);
        progressDialog.setMax(100);
        progressDialog
                .setProgressStyle(builder.style == ProgressDialogStyle.Determinate ? ProgressDialog.STYLE_HORIZONTAL
                        : ProgressDialog.STYLE_SPINNER);
        // TODO support text style

        return progressDialog;
    }

    @Override
    public String getTitle() {
        return builder.title;
    }

    @Override
    public String getMessage() {
        return builder.message;
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
        return builder.style;
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

    @Override
    public void setActivity(Activity activity) {
        this.activity = activity;
        progressDialog = setupDialog();
    }
}
