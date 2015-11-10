/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.pods.google;

import org.robovm.apple.foundation.NSErrorException;
import org.robovm.pods.google.analytics.GAITracker;

public class GGLContextAnalytics {
    private static GGLContextAnalytics instance;

    private final GGLContext context;

    private GGLContextAnalytics(GGLContext context) {
        this.context = context;
    }

    public static GGLContextAnalytics getSharedInstance() {
        if (instance == null) {
            instance = new GGLContextAnalytics(GGLContext.getSharedInstance());
        }
        return instance;
    }

    public GGLConfiguration getConfiguration() {
        return context.getConfiguration();
    }

    public void configure() throws NSErrorException {
        context.configure();
    }

    public GAITracker getTracker() {
        return GGLContextAnalyticsExtensions.getTracker(context);
    }
}
