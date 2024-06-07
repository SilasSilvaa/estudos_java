package java_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file");
        if(Files.notExists(path)){
            Path pathDirectory = Files.createDirectory(path);
        }
        Path subFilePath = Paths.get(path + "/subFile/subSubFile");
        Path subFileDirectory = Files.createDirectories(subFilePath);
        Path filePath = Paths.get(subFileDirectory.toString(), "file.txt");

        if(Files.notExists(filePath)){
            Files.createFile(filePath);
        }

        Path source = filePath;
        Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(source, target);
    }
}
