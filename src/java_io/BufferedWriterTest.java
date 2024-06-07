package java_io;

import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fw)){

            bufferedWriter.write("Writing on file");
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
