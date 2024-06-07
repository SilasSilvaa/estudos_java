package java_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader reader = new FileReader(file)){

            int i;
            while ((i = reader.read()) != -1){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
