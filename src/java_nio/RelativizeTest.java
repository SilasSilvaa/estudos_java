package java_nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/file/subFile");
        Path file = Paths.get("/file/subFile/subSubFile/file.txt");
        Path relativize = dir.relativize(file);
        System.out.println(relativize);

        Path dir2 = Paths.get("/file/subFile");
        Path dir3 = Paths.get("/usr/local");
        Path dir4 = Paths.get("/file/subFile/subSubFile/file.txt");

        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/temp.2021921");

        System.out.println("1 - " + dir2.relativize(dir4));
        System.out.println("2 - " + dir4.relativize(dir2));
        System.out.println("3 - " + dir2.relativize(dir3));
        System.out.println("4 - " + relative1.relativize(relative2));
//      System.out.println("5 - " + dir2.relativize(relative1));


    }
}
