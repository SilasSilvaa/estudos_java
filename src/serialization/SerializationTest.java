package serialization;

import serialization.models.Group;
import serialization.models.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest {
    public static void main(String[] args) {
        Student student = new Student(1L, "Silas", "12345678");

        Group group = new Group("Group A");
        student.setGroup(group);

        serializationObj(student);
        deserializationObj();
    }

    private static void serializationObj(Student student) {
        Path path = Paths.get("file/objects.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(student);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializationObj() {
        Path path = Paths.get("file/objects.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Student student = (Student)objectInputStream.readObject();
            System.out.println(student);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
