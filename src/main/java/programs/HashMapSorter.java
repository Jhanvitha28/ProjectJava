package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapSorter {

    // Method to sort elements in a HashMap by keys
    public static Map<Integer, String> sortHashMapByKey(Map<Integer, String> unsortedMap) {
        // Create a TreeMap to automatically sort the entries based on keys
        Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);
        return sortedMap;
    }

}

