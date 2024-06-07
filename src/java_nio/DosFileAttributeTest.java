package java_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file/file.txt");

        if(Files.notExists(path)){
            Files.createFile(path);
        }

        Files.setAttribute(path, "dos:hidden", true);
        Files.setAttribute(path, "dos:readonly", true);

        DosFileAttributes fileAttributes = Files.readAttributes(path, DosFileAttributes.class);

        System.out.println(fileAttributes.isHidden());
        System.out.println(fileAttributes.isReadOnly());

        DosFileAttributeView attributeView = Files.getFileAttributeView(path, DosFileAttributeView.class);
        attributeView.setReadOnly(false);
        System.out.println(attributeView.readAttributes().isReadOnly());
    }
}
