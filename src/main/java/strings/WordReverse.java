package strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordReverse {

    public String reverseWords(String input) {
        return Arrays.asList(input.split(" "))
                .stream()
                .map(s -> new StringBuilder(s).reverse())
                .collect(Collectors.joining(" "));
    }
}
