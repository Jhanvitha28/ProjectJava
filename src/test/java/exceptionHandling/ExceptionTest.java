package exceptionHandling;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionTest {
    @Test
    public void testWithInteger(){
        String s="23";
        int i = Exceptions.convertInteger(s);
        assertSame(i,23);
    }
    @Test
    public void testWithFloat(){
        String s="45.67";
        int i = Exceptions.convertInteger(s);
        assertNotEquals(i,45.67);
    }
    @Test
    public void testWithString(){
        String s="test";
        int i = Exceptions.convertInteger(s);
        assertNotEquals(i,"test");
    }
    @Test
    public void testWithAlphaNumeric(){
        String s="123f";
        int i = Exceptions.convertInteger(s);
        assertNotEquals(i,"123f");

    }

}