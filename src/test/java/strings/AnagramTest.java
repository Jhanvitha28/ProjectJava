package strings;



import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void testAreAnagrams_successful() {
        assertTrue(Anagram.findAnagram("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_nullInput() {
        assertFalse(Anagram.findAnagram(null, "test"));
        assertFalse(Anagram.findAnagram("test", null));
        assertFalse(Anagram.findAnagram(null, null));
    }

    @Test
    public void testAreAnagrams_differentLength() {
        assertFalse(Anagram.findAnagram("hello", "world"));
    }

    @Test
    public void testAreAnagrams_notAnagrams() {
        assertFalse(Anagram.findAnagram("hello", "holla"));
    }

    @Test
    public void testAreAnagrams_zeroInput() {
        assertTrue(Anagram.findAnagram("", ""));
    }
}
