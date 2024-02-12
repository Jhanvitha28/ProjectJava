package streams;


import java.util.Arrays;
import java.util.List;

public class VowelCounter {
    public static void main(String[] args) {
        String[] input = {"Elephant", "Dog", "cat", "rabbit"};

        Arrays.stream(input)
                .filter(str -> str.toLowerCase().matches(".*[aeiou].*"))
                .forEach(str -> System.out.println("String:"+str+", Vowel Count: " + countVowels(str)));

    }
    public static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }

}
