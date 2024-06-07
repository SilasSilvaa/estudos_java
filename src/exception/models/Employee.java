package exception.models;


import java.io.FileNotFoundException;

public class Employee extends Person{
    @Override
    public void save() {
        System.out.println("Saving from Employee");
    }
}
