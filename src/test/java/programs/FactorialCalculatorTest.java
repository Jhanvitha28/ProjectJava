package programs;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.Test;
public class FactorialCalculatorTest {

        @Test
        public void testFactorialforPositive() {
            long x = 5;
            assertEquals(120, FactorialCalculator.factorial(x));
        }
        @Test
        public void testFactorialforZero() {
            long x = 0;
            assertEquals(1, FactorialCalculator.factorial(x));
        }

        @Test
        public void testFactorialforOne() {
            long x = 1;
            assertEquals(1, FactorialCalculator.factorial(x));
        }

        @Test
        public void testFactorialforNegative() {
            long x = -5;
            FactorialCalculator.factorial(x);
        }
    }