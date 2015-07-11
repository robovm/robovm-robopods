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

import org.robovm.pods.google.mobileads.GADBannerView;
import org.robovm.pods.google.mobileads.GADInterstitial;

public class GGLContextMobileAds extends GGLContext {
    private static GGLContextMobileAds instance;

    private GGLContextMobileAds(GGLContext context) {
        setHandle(context.getHandle());
    }

    public static GGLContextMobileAds getSharedInstance() {
        if (instance == null) {
            instance = new GGLContextMobileAds(GGLContext.getSharedInstance());
        }
        return instance;
    }

    public String getAdUnitIDForBannerTest() {
        return GGLContextAdMobExtensions.getAdUnitIDForBannerTest(this);
    }

    public String getAdUnitIDForInterstitialTest() {
        return GGLContextAdMobExtensions.getAdUnitIDForInterstitialTest(this);
    }

    public GADBannerView getBannerView() {
        return GGLContextAdMobExtensions.getBannerView(this);
    }

    public void setBannerView(GADBannerView v) {
        GGLContextAdMobExtensions.setBannerView(this, v);
    }

    public GADInterstitial getInterstitialView() {
        return GGLContextAdMobExtensions.getInterstitialView(this);
    }

    public void setInterstitialView(GADInterstitial v) {
        GGLContextAdMobExtensions.setInterstitialView(this, v);
    }
}
