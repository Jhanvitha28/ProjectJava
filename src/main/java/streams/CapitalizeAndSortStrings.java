package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CapitalizeAndSortStrings {

    public static List<String> capitalizeAndSortStrings(String[] inputArray) {
        return Arrays.stream(inputArray)
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .sorted()
                .collect(Collectors.toList());
    }
}
