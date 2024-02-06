package streams;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoubleTest {
        @Test
        void testDoubleOddNumbers_PositiveNumbers() {
            // Test case with positive odd numbers [1, 3, 5]
            ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 6, 10));
            assertEquals(expected, Double.doubleOddNumbers(input));
        }

        @Test
        void testDoubleOddNumbers_NegativeNumbers() {
            // Test case with negative odd numbers [-1, -3, -5]
            ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5));
            ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-2, -6, -10));
            assertEquals(expected, Double.doubleOddNumbers(input));
        }

        @Test
        void testDoubleOddNumbers_EmptyList() {
            // Test case with an empty list
            ArrayList<Integer> input = new ArrayList<>();
            ArrayList<Integer> expected = new ArrayList<>();
            assertEquals(expected, Double.doubleOddNumbers(input));
        }

        @Test
        void testDoubleOddNumbers_NoOddNumbers() {
            // Test case with no odd numbers in the list
            ArrayList<Integer> input = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
            ArrayList<Integer> expected = new ArrayList<>();
            assertEquals(expected, Double.doubleOddNumbers(input));
        }
    }

