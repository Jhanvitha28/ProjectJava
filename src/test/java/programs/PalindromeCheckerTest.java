package programs;


import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class PalindromeCheckerTest {

    @Test
    public void testPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome(121));
        assertTrue(PalindromeChecker.isPalindrome(1221));
        assertTrue(PalindromeChecker.isPalindrome(12321));
        assertFalse(PalindromeChecker.isPalindrome(12345));
        assertFalse(PalindromeChecker.isPalindrome(9876));
    }
}
