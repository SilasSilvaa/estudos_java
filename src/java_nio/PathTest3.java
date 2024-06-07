package java_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest3 {
    public static void main(String[] args) {
        Path dir = Paths.get("file/subFile");
        Path file = Paths.get("subSubFile/file.txt");
        Path resolve = dir.resolve(file);

        System.out.println(resolve);
    }
}
