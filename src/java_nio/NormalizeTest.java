package java_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest {
    public static void main(String[] args) {
        String path = "file/subFile/subSubFile";
        String filePath = "../../file.txt";

        Path path1 = Paths.get(path, filePath);
        System.out.println(path1.normalize());
    }
}
