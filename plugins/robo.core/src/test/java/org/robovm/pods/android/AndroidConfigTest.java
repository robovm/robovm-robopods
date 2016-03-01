package org.robovm.pods.android;

import android.app.Activity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AndroidConfigTest {
    @Test
    public void testGetRegisteredActivities() throws Exception {
        Activity l = new Activity();
        Activity a1 = new Activity();
        Activity a2 = new Activity();

        AndroidConfig.setLaunchActivity(l);
        AndroidConfig.registerActivity("a1", a1);
        AndroidConfig.registerActivity("a2", a2);

        AndroidConfig.setActivity("a1", AndroidConfigTestInterface.class);

        assertEquals(l, AndroidConfig.getLaunchActivity());
        assertEquals(a1, AndroidConfig.getActivity("a1"));
        assertEquals(a1, AndroidConfig.getActivity(AndroidConfigTestInterface.class));
        assertEquals(a1, AndroidConfig.getActivity(AndroidConfigTestObject1.class));

        AndroidConfig.setActivity("a2", AndroidConfigTestObject1.class);

        assertEquals(a2, AndroidConfig.getActivity(AndroidConfigTestObject1.class));

        AndroidConfigTestInterface interfaceImpl = new AndroidConfigTestInterface() {};
        AndroidConfigTestObject2 object2 = new AndroidConfigTestObject2();

        AndroidConfig.setActivity("a2", interfaceImpl);
        AndroidConfig.setActivity("a2", object2);

        assertEquals(a2, AndroidConfig.getActivity(interfaceImpl));
        assertEquals(a2, AndroidConfig.getActivity(object2));
        assertEquals(a1, AndroidConfig.getActivity(AndroidConfigTestInterface.class));
    }
}
