package java_nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,txt}");
//    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/file.{java,txt}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

//        if(file.getFileName().toString().endsWith(".java") || matcher.matches(file)){
//            System.out.println(file.getFileName());
//        }

        if(matcher.matches(file)){
            System.out.println(file.getFileName());
        }


        return FileVisitResult.CONTINUE;
    }
}

public class PathMatcherTest2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("file/subfile/file.txt");
        Path path2 = Paths.get("file/subfile/file.java");
        Path path3 = Paths.get("file/subfile/file.bkp");
        Path path4 = Paths.get(".");

        matches(path2, "glob:*.java");
        matches(path2, "glob:**/*.java");

        matches(path1, "glob:**/*.{java,txt,bkp}");
        matches(path2, "glob:**/*.{java,txt,bkp}");
        matches(path3, "glob:**/*.{java,txt,bkp}");

        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");

        matches(path3, "glob:**/file.???");
        System.out.println("-----------");

        Files.walkFileTree(path4, new ListFiles());
    }

    public static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));
    }
}