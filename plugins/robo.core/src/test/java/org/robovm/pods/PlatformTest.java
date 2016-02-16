package org.robovm.pods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlatformTest {
    @Test
    public void testGettingInstanceForCurrentPlatform() throws Exception {
        InterfaceTest1 impl = Platform.getPlatform().getInstance(InterfaceTest1.class);
        assertNotNull(impl);
        assertEquals("org.robovm.pods.HeadlessInterfaceTest1", impl.getClass().getName());
    }

    @Test
    public void testGettingGlobalInstanceForAllPlatforms() throws Exception {
        InterfaceTest2 impl = Platform.getPlatform().getInstance(InterfaceTest2.class);
        assertNotNull(impl);
        assertEquals("org.robovm.pods.ImplementationTest2", impl.getClass().getName());
    }

    @Test
    public void testGettingSpecificImplementation() throws Exception {
        InterfaceTest3 impl = Platform.getPlatform().getInstance("implB", InterfaceTest3.class);
        assertNotNull(impl);
        assertEquals("org.robovm.pods.SpecialImplBTest3", impl.getClass().getName());
    }

    @Test
    public void testGetDefaultImplOnHeadless() throws Exception {
        InterfaceTest4 impl = Platform.getPlatform().getInstance(InterfaceTest4.class);
        assertNotNull(impl);
    }
}
