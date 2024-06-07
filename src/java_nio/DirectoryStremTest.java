package java_nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStremTest {
    public static void main(String[] args) {
        Path dir = Paths.get(".");

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir)){
            for (Path path : directoryStream){
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
