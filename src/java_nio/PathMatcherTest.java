package java_nio;

import java.io.IOException;
import java.nio.file.*;

public class PathMatcherTest {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("file/subfile/file.txt");
        Path path2 = Paths.get("file/subfile/file.java");
        Path path3 = Paths.get("file/subfile/file.bkp");

        matches(path2, "glob:*.java");
        matches(path2, "glob:**/*.java");

        matches(path1, "glob:**/*.{java,txt,bkp}");
        matches(path2, "glob:**/*.{java,txt,bkp}");
        matches(path3, "glob:**/*.{java,txt,bkp}");

        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

        matches(path3, "glob:**/file.???");

    }

    public static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}