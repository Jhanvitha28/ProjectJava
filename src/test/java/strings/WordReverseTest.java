package strings;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordReverseTest {

    @Test
    public void testReverseWords() {
        WordReverse wordReverse = new WordReverse();
        String input = "Welcome to GFG";
        String expectedOutput = "emocleW ot GFG";

        String actualOutput = wordReverse.reverseWords(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordsWithEmptyString() {
        WordReverse wordReverse = new WordReverse();
        String input = "";
        String expectedOutput = "";

        String actualOutput = wordReverse.reverseWords(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReverseWordsWithSingleWord() {
        WordReverse wordReverse = new WordReverse();
        String input = "Hello";
        String expectedOutput = "olleH";

        String actualOutput = wordReverse.reverseWords(input);

        assertEquals(expectedOutput, actualOutput);
    }

    // Add more test cases as needed
}
