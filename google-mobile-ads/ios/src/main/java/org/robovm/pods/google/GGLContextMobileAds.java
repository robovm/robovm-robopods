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
import org.robovm.pods.google.mobileads.GADBannerView;
import org.robovm.pods.google.mobileads.GADInterstitial;

public class GGLContextMobileAds {
    private static GGLContextMobileAds instance;

    private final GGLContext context;

    private GGLContextMobileAds(GGLContext context) {
        this.context = context;
    }

    public static GGLContextMobileAds getSharedInstance() {
        if (instance == null) {
            instance = new GGLContextMobileAds(GGLContext.getSharedInstance());
        }
        return instance;
    }

    public GGLConfiguration getConfiguration() {
        return context.getConfiguration();
    }

    public void configure() throws NSErrorException {
        context.configure();
    }

    public String getAdUnitIDForBannerTest() {
        return GGLContextAdMobExtensions.getAdUnitIDForBannerTest(context);
    }

    public String getAdUnitIDForInterstitialTest() {
        return GGLContextAdMobExtensions.getAdUnitIDForInterstitialTest(context);
    }

    public GADBannerView getBannerView() {
        return GGLContextAdMobExtensions.getBannerView(context);
    }

    public void setBannerView(GADBannerView v) {
        GGLContextAdMobExtensions.setBannerView(context, v);
    }

    public GADInterstitial getInterstitialView() {
        return GGLContextAdMobExtensions.getInterstitialView(context);
    }

    public void setInterstitialView(GADInterstitial v) {
        GGLContextAdMobExtensions.setInterstitialView(context, v);
    }
}
