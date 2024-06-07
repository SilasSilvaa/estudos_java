package exception;

import exception.models.Employee;
import exception.models.InvalidLoginException;
import exception.models.Person;

import java.util.Scanner;

public class MyException {
    public static void main(String[] args) {

//        try {
//            logIn();
//        } catch (InvalidLoginException e) {
//            e.printStackTrace();
//        }
//        Person person = new Person();
//        person.save();

        Employee employee = new Employee();
        employee.save();
    }

//    public static void logIn() throws InvalidLoginException {
//        Scanner scanner = new Scanner(System.in);
//        String loginDB = "Silas";
//        String passwordDB = "123";
//
//        System.out.println("Type your login");
//        String loginScanner = scanner.nextLine();
//
//        System.out.println("Type your password");
//        String passwordScanner = scanner.nextLine();
//
//        if(!loginScanner.equals(loginDB) || !passwordScanner.equals(passwordDB)){
//            throw new InvalidLoginException("Login or password incorrect");
//        }
//
//        System.out.println("Login successful");
//    }
}
