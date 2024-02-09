package exceptionHandling;

import exceptionHandling.FileOperation;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileOperationTest {
    @Test
    public void testWithExsistingFile(){
        String filePath = "/Users/manidheerajreddy/Desktop/Advanced.docx";
        assertTrue(FileOperation.readContents(filePath));
    }
    @Test
    public void testWithNonExsistingFile(){
        String filePath="helloWorld.txt";
        assertFalse(FileOperation.readContents(filePath));
    }
}