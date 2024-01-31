package programs;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListReversalTest {

    @Test
    public void testReverseArrayList() {
        // Test case to reverse an ArrayList
        ArrayList<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayListReversal.reverseArrayList(originalList);

        // Check if the list is reversed correctly
        assertEquals(Arrays.asList(4, 3, 2, 1), originalList);
    }

    @Test
    public void testReverseEmptyArrayList() {
        // Test case to reverse an empty ArrayList
        ArrayList<Integer> emptyList = new ArrayList<>();
        ArrayListReversal.reverseArrayList(emptyList);

        // Reversing an empty list should still result in an empty list
        assertEquals(new ArrayList<>(), emptyList);
    }
}

