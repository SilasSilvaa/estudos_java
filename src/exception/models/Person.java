package exception.models;

import java.io.FileNotFoundException;

public class Person {

    public void save() throws InvalidLoginException, FileNotFoundException {
        System.out.println("Saving");
    }
}
