package streams;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void testCountVowels() {
        assertEquals(3, VowelCounter.countVowels("Elephant"));
        assertEquals(1, VowelCounter.countVowels("Dog"));
        assertEquals(1, VowelCounter.countVowels("cat"));
        assertEquals(2, VowelCounter.countVowels("rabbit"));
    }

    @Test
    public void testCountVowelsEmptyString() {
        assertEquals(0, VowelCounter.countVowels(""));
    }

    @Test
    public void testCountVowelsNoVowels() {
        assertEquals(0, VowelCounter.countVowels("xyz"));
    }

    @Test
    public void testCountVowelsMixedCase() {
        assertEquals(3, VowelCounter.countVowels("ELePhAnt"));
    }
}