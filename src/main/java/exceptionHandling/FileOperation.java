package exceptionHandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileOperation{
    public static boolean readContents(String file) {
        String filePath = "/Users/manidheerajreddy/Desktop/Advanced.docx";


        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                return true;
            }
        } catch (IOException e) {
            System.err.println("File does not exist " + e.getMessage());
        }
        return false;
    }
}