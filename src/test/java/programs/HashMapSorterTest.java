package programs;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class HashMapSorterTest {

    @Test
    public void testSortHashMapByKey() {
        // Test case to sort a HashMap by keys
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(4, "Apple");
        unsortedMap.put(2, "Banana");
        unsortedMap.put(1, "Orange");
        unsortedMap.put(3, "Grapes");

        Map<Integer, String> sortedMap = HashMapSorter.sortHashMapByKey(unsortedMap);

        // Check if the map is sorted correctly by keys
        assertEquals("{1=Orange, 2=Banana, 3=Grapes, 4=Apple}", sortedMap.toString());
    }

    @Test
    public void testSortEmptyHashMap() {
        // Test case to sort an empty HashMap
        Map<Integer, String> emptyMap = new HashMap<>();
        Map<Integer, String> sortedEmptyMap = HashMapSorter.sortHashMapByKey(emptyMap);

        // Sorting an empty map should still result in an empty map
        assertEquals("{}", sortedEmptyMap.toString());
    }
}
