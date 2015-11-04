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
package org.robovm.pods.heyzap.ads;

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.Method;
import org.robovm.pods.google.mobileads.GADAdSize;
import org.robovm.rt.annotation.StronglyLinked;
import org.robovm.rt.bro.annotation.ByVal;

@CustomClass("HZAdMobBannerSupport")
@StronglyLinked
class HZAdMobBannerSupport extends NSObject {
    @Method(selector = "adSizeNamed:")
    private static @ByVal GADAdSize adSizeNamed(String name) {
        switch (name) {
        case "kGADAdSizeSmartBannerPortrait":
            return GADAdSize.SmartBannerPortrait();
        case "kGADAdSizeSmartBannerLandscape":
            return GADAdSize.SmartBannerLandscape();
        case "kGADAdSizeBanner":
            return GADAdSize.Banner();
        case "kGADAdSizeLargeBanner":
            return GADAdSize.LargeBanner();
        case "kGADAdSizeLeaderboard":
            return GADAdSize.Leaderboard();
        case "kGADAdSizeFullBanner":
            return GADAdSize.FullBanner();
        default:
            System.out
                    .println(String
                            .format("[Heyzap] Unrecognized GADAdSize requested; requested size = %s. This is a bug in the Heyzap SDK; please report it to support@heyzap.com. Defaulting to kGADAdSizeSmartBannerPortrait",
                                    name));
            return GADAdSize.SmartBannerPortrait();
        }
    }
}
