package maps;

import maps.CharacterCount;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterCountTest {

    @Test
    public void testPrintCharacterCounts() {
        String inputString = "test string";
        String expectedOutput = "t-3, e-1, s-2,  -1, r-1, i-1, n-1, g-1, ";
        CharacterCount.printCharacterCounts(inputString);
        System.out.println();
//        assertEquals(expectedOutput, System.out.toString());
    }

    @Test
    public void testPrintCharacterCountsEmptyString() {
        String inputString = "";
        String expectedOutput = "";
        System.out.println("Expected Output: " + expectedOutput);
        System.out.print("Actual Output: ");
        CharacterCount.printCharacterCounts(inputString);
        System.out.println();
        //assertEquals(expectedOutput, System.out.toString());
    }
}
