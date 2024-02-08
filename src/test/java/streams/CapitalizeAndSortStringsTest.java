package streams;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

public class CapitalizeAndSortStringsTest {

    @Test
    public void testCapitalizeAndSortStrings() {
        String[] inputArray = {"apple", "banana", "orange", "grape", "kiwi"};
        List<String> expected = Arrays.asList("Apple", "Banana", "Grape", "Kiwi", "Orange");
        assertEquals(expected, CapitalizeAndSortStrings.capitalizeAndSortStrings(inputArray));
    }

    @Test
    public void testEmptyInput() {
        String[] inputArray = {};
        List<String> expected = Arrays.asList();
        assertEquals(expected, CapitalizeAndSortStrings.capitalizeAndSortStrings(inputArray));
    }


}
