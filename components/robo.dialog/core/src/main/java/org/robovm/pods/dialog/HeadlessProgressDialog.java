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

public class HeadlessProgressDialog implements ProgressDialog {
    private final String title;
    private final String message;
    private final ProgressDialogStyle style;
    private double progress;

    HeadlessProgressDialog(ProgressDialog.Builder builder) {
        this.title = builder.title;
        this.message = builder.message;
        this.style = builder.style;
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
    public void show() {}

    @Override
    public void hide() {}

    @Override
    public ProgressDialogStyle getStyle() {
        return style;
    }

    @Override
    public void setProgress(double progress) {
        this.progress = progress;
    }

    @Override
    public double getProgress() {
        return progress;
    }
}
