package programs;


import org.junit.Test;
import strings.StringRotation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringRotationTest {

    @Test
    public void testAreRotations_successful() {
        assertTrue(strings.StringRotation.isRotation("abcde", "cdeab"));
    }

    @Test
    public void testAreRotations_nullInput() {
        assertFalse(strings.StringRotation.isRotation(null, "test"));
        assertFalse(strings.StringRotation.isRotation("test", null));
        assertFalse(strings.StringRotation.isRotation(null, null));
    }

    @Test
    public void testAreRotations_differentLength() {
        assertFalse(strings.StringRotation.isRotation("hello", "world"));
    }

    @Test
    public void testAreRotations_notRotations() {
        assertFalse(strings.StringRotation.isRotation("hello", "holla"));
    }

    @Test
    public void testAreRotations_zeroInput() {
        assertTrue(StringRotation.isRotation("", ""));
    }
}
