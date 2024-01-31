package programs;
import static org.junit.Assert.*;
import org.junit.Test;
public class PalindromeCheckerTest {
    @Test
    public void testIsPalindromePositive() {
        assertTrue(PalindromeChecker.isPalindrome(121));
    }
    @Test
    public void testIsPalindromeNegative() {
        assertFalse(PalindromeChecker.isPalindrome(123));
    }
    @Test
    public void testIsPalindromeSingleDigit() {
        assertTrue(PalindromeChecker.isPalindrome(7));
    }
    @Test
    public void testIsPalindromeZero() {
        assertTrue(PalindromeChecker.isPalindrome(0));
    }
    @Test
    public void testIsPalindromeNegativeNumber() {
        assertFalse(PalindromeChecker.isPalindrome(-121));
    }
}