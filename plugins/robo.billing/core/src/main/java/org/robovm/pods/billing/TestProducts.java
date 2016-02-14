package org.robovm.pods.billing;

import java.lang.reflect.Field;

public final class TestProducts {
    public static final Product ANDROID_TEST_PURCHASED = new Product("android.test.purchased");
    public static final Product ANDROID_TEST_CANCELED = new Product("android.test.canceled");
    public static final Product ANDROID_TEST_REFUNDED = new Product("android.test.refunded");
    public static final Product ANDROID_TEST_ITEM_UNAVAILABLE = new Product("android.test.item_unavailable");

    public static boolean isTestProduct(Product product) {
        Field[] fields = TestProducts.class.getDeclaredFields();
        try {
            for (Field field : fields) {
                if (field.get(null) == product) {
                    return true;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return false;
    }
}
