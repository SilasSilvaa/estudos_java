package java_nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes

        //Old
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        File file = new File("path/new.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());

        // new
        Path path = Paths.get("path/new2.txt");
        Files.createFile(path);
        FileTime fileTime = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path,fileTime);
    }
}
