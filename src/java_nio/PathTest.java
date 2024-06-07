package java_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("file", "file.txt");
        System.out.println(p1.getFileName());
    }
}
