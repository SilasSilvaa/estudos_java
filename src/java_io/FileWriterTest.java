package java_io;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Writing on file\n");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
