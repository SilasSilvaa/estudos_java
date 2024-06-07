package java_io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        File fileDirectory = new File("file");
        boolean isCreated = fileDirectory.mkdir();
        System.out.println(isCreated);
        File file = new File(fileDirectory, "file.txt");

        try {
            boolean newFileCreated = file.createNewFile();
            System.out.println(newFileCreated);

            File fileRenamed = new File(fileDirectory, "file_renamed.txt");
            boolean renamed = file.renameTo(fileRenamed);

            System.out.println(renamed);

            File directoryRenamed = new File("file2");
            boolean newDirectory = fileDirectory.renameTo(directoryRenamed);
            System.out.println(newDirectory);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
