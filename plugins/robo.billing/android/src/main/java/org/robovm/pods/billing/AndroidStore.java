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
package org.robovm.pods.billing;

import android.app.Activity;
import org.robovm.pods.Util;
import org.robovm.pods.android.ActivityConfigurable;
import org.robovm.pods.android.AndroidConfig;

import java.util.Map;

public class AndroidStore implements Store, ActivityConfigurable {
    public static final int DEFAULT_REQUEST_CODE = 15864252;
    private AndroidStoreImpl androidStore;

    private AndroidStore(Store.Builder builder) {
        boolean useGooglePlayImpl = true;
        for (Map.Entry<StoreType, String> entry : builder.storeKeys.entrySet()) {
            StoreType storeType = entry.getKey();
            if (storeType != StoreType.ANDROID_GOOGLE_PLAY && storeType != StoreType.IOS_APP_STORE
                    && storeType != StoreType.HEADLESS) {
                useGooglePlayImpl = false;
                break;
            }
        }

        if (useGooglePlayImpl) {
            androidStore = new GooglePlayStore(builder);
        } else {
            androidStore = new OpenIabStore(builder);
        }
        setActivity(AndroidConfig.getActivity(this));
    }

    @Override
    public void setActivity(Activity activity) {
        androidStore.setActivity(activity);
    }

    @Override
    public void setup(StoreSetupListener listener) {
        Util.requireNonNull(listener, "listener");
        androidStore.setup(listener);
    }

    @Override
    public ProductCatalog getProductCatalog() {
        return androidStore.getProductCatalog();
    }

    @Override
    public boolean isAvailable() {
        return androidStore.isAvailable();
    }

    @Override
    public void requestProductData() {
        androidStore.requestProductData();
    }

    @Override
    public boolean isRequestingProductData() {
        return androidStore.isRequestingProductData();
    }

    @Override
    public void restoreTransactions() {
        androidStore.restoreTransactions();
    }

    @Override
    public boolean isRestoringTransactions() {
        return androidStore.isRestoringTransactions();
    }

    @Override
    public void purchaseProduct(Product product) {
        Util.requireNonNull(product, "product");
        androidStore.purchaseProduct(product);
    }

    @Override
    public void dispose() {
        androidStore.dispose();
    }

    @Override
    public StoreType getType() {
        return androidStore.getType();
    }
}
